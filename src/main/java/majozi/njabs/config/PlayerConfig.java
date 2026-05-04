package majozi.njabs.config;
import com.google.gson.Gson;
import majozi.njabs.Inventory;
import majozi.njabs.Player;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class PlayerConfig {

    public static void main(String[] args){
        PlayerConfig.deserialization();
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


}
