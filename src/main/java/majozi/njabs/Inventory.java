package majozi.njabs;

public class Inventory {
    private String name;
    private String type;
    private Integer damage;
    private Integer heal;

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

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public void setHeal(Integer heal) {
        this.heal = heal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}