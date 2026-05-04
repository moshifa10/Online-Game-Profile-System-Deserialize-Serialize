package majozi.njabs;

public class Inventory {
    private String name;
    private String type;
    private int damageHeal;

    public Inventory(String name, String type, int damageHeal){
        this.damageHeal = damageHeal;
        this.name = name;
        this.type = type;
    }

    public int getDamageHeal() {
        return damageHeal;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
