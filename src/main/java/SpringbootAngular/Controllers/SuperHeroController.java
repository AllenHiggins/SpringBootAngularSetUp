package SpringbootAngular.Controllers;

import SpringbootAngular.Models.SuperHero;
import SpringbootAngular.Services.SuperheroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/superheros")
public class SuperHeroController {

    SuperheroService superheroService = new SuperheroService();

    @RequestMapping("")
    public List<SuperHero> getSuperHeroes(){
       return superheroService.getSuperHeros();
    }

    @RequestMapping("/batman")
    public SuperHero getBatman(){
        return superheroService.getBatman();
    }

}