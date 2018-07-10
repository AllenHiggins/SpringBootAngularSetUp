package SpringbootAngular.Services;

import SpringbootAngular.Models.SuperHero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SuperheroService {

    private List<SuperHero> herosList = new ArrayList<SuperHero>();

    public SuperheroService(){
        herosList.add(new SuperHero("Batman", "Rich", "Gothom City"));
        herosList.add(new SuperHero("Superman", "The Sun", "Metropolis"));
        herosList.add(new SuperHero("Wolverine", "Stubborn", "What's it to you?!"));
    }


    public List<SuperHero> getSuperHeros(){

        return herosList;
    }

    public SuperHero getBatman(){

        return herosList.get(0);
    }
}
