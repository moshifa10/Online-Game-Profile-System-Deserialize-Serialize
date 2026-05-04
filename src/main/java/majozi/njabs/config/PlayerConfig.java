package majozi.njabs.config;
import com.google.gson.Gson;
import majozi.njabs.Inventory;
import majozi.njabs.Player;
import majozi.njabs.Position;
import majozi.njabs.Stats;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PlayerConfig {

    public static void main(String[] args){
//        PlayerConfig.deserialization();
        PlayerConfig.serialization();
    }

    private static void deserialization(){
        Gson gson = new Gson();
        try {
            FileReader read = new FileReader("player.json");
            Player player = gson.fromJson(read, Player.class);
            System.out.println("Username: " + player.getUsername() + "\nLevel: " + player.getLevel() +"\nOnline: " + player.isOnline());
            System.out.println("Health: " + player.getStats().getHealth() + "\nEnergy: " + player.getStats().getEnergy()+ "\nExperience: " + player.getStats().getExperience());

            for (Inventory inventory: player.getInventory()){
                System.out.println(inventory.getName());
                System.out.println(inventory.getType());
                System.out.println( inventory.getEffect());
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void serialization(){
        Gson gson = new Gson();
        Stats stats = new Stats(85, 60, 34);
        Inventory inventory = new Inventory();
        inventory.setHeal(5);
        inventory.setName("scissor");
        inventory.setType("stationary");

        Inventory inventory2 = new Inventory();
        inventory.setHeal(21);
        inventory.setName("das");
        inventory.setType("dasguku");

        List<Inventory> list = new ArrayList<>();
        list.add(inventory); list.add(inventory2);

        Position position = new Position(5,76, "East");
        Player player = new Player("Njabs", 7, true, stats, list, position);

        String json = gson.toJson(player);
        System.out.println(json);

    }


}
