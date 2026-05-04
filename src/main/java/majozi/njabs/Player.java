package majozi.njabs;
import java.util.List;

public class Player {

    private String username;
    private int level;
    private   boolean online;
    private Stats stats;
    private List<Inventory> inventory;
    private Position position;

    public Player(String username, int level, boolean online, Stats stats, List<Inventory> inventory, Position position){
        this.username = username;
        this.online = online;
        this.stats = stats;
        this.inventory = inventory;
        this.level = level;
    }


    public int getLevel() {
        return level;
    }

    public String getUsername() {
        return username;
    }

    public boolean isOnline() {
        return online;
    }

    public List<Inventory> getInventory() {
        return inventory;
    }

    public Stats getStats() {
        return stats;
    }

    public Position getPosition() {
        return position;
    }

}
