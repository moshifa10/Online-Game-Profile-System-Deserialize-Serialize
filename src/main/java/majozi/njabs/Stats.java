package majozi.njabs;

public class Stats {
    private int health;
    private int energy;
    private int experience;

    public Stats(int health, int energy, int experience){
        this.energy = energy;
        this.health = health;
        this.experience = experience;
    }

    public int getEnergy() {
        return energy;
    }

    public int getExperience() {
        return experience;
    }

    public int getHealth() {
        return health;
    }
}
