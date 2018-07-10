package SpringbootAngular;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CORSFilter implements Filter {

    private static  final org.slf4j.Logger _LOGGER = LoggerFactory.getLogger(CORSFilter.class);

    private static  final List<String> _ALLOWORIGINS = new ArrayList<String>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        _LOGGER.info("Init CORS Filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        _ALLOWORIGINS.add("http://localhost:4200");

        HttpServletRequest requestToUse = (HttpServletRequest)servletRequest;

        HttpServletResponse responseToUse = (HttpServletResponse)servletResponse;

        String incomingOrigin = requestToUse.getHeader("Origin");

        if(_ALLOWORIGINS.contains(incomingOrigin)){

            responseToUse.setHeader("Access-Control-Allow-Origin",incomingOrigin);
        }

        filterChain.doFilter(requestToUse, responseToUse);
    }

    @Override
    public void destroy() {

    }
}
