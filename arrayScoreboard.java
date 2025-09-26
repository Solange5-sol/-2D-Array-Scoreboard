import java.util.Random;
public class arrayScoreboard {
    static int[][] players;
    public static void main(String[] args) {
        int row = 4;
        int col = 5;
        players = new int[row][col];
        Random rand = new Random();

        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < players[i].length; j++) {
                players[i][j] = rand.nextInt(101); // 0-100
            }
        }
        display();
        int total = 0;
        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < players[i].length; j++) {
                total += players[i][j];
            }
            System.out.println("Player " + (i + 1) + " total: " + total);
        }
        System.out.println("     ");
    }
    public static void display() {
        System.out.println("Scoreboard (Players × Games):");
        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < players[i].length; j++) {
                System.out.print(players[i][j] + " ");
            }
            System.out.println(); // move to next row
        }
        System.out.println("     ");
    }
}