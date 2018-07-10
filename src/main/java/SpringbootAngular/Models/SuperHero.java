package SpringbootAngular.Models;

public class SuperHero {

    private String name;
    private String power;
    private String world;

    public SuperHero(String name, String power, String world){
        this.name = name;
        this.power = power;
        this.world = world;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
}
