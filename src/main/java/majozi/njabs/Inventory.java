package majozi.njabs;

public class Inventory {
    private String name;
    private String type;
    private Integer damage;
    private Integer heal;

    // Default constructor (important for Gson)
    public Inventory() {}

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Integer getDamage() {
        return damage;
    }

    public Integer getHeal() {
        return heal;
    }

    // Helper method (optional, but useful)
    public String getEffect() {
        if (damage != null) {
            return "Damage: " + damage;
        }
        if (heal != null) {
            return "Heal: " + heal;
        }
        return "No effect";
    }
}