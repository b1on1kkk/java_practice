public class App {
    public static void main(String[] args) throws Exception {

        Player[] players = new Player[6];

        for (int i = 0; i < 6; i++) {
            players[i] = new Player();
        }
        players[0].run();

        System.out.println("Количество игроков на поле: " + Player.countPlayers);
    }
}
