package majozi.njabs;

import javax.swing.text.Position;
import java.util.List;

public class Player {

    public String username;
    public int level;
    public  boolean online;
    public Stats stats;
    public List<Inventory> inventory;
    public Position position;

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
}
