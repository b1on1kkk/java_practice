import java.util.Random;

public class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    protected static int countPlayers;
    private int stamina;

    public Player() {
        if(Player.countPlayers != 6){
            countPlayers++;
            this.stamina = Player.generateRandomInt(50, 100);
        }
    }

    public int getStamina(){
        return this.stamina;
    }

    public void run(){
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }
    }

    public String info(){
        if(Player.countPlayers < 6) return "Teams are not completed";

        return "Teams are full";
    }

    private static int generateRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
