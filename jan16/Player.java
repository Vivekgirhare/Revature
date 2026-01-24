package jan16;

import java.util.Scanner;

public class Player {

    int playerId;
    String playerName;
    String sport;

    public Player() {}

    public Player(int id, String name, String sport) {
        this.playerId = id;
        this.playerName = name;
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", sport='" + sport + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int size = sc.nextInt();

        Player[] playerList = new Player[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details for Player " + (i + 1));

            System.out.print("Player ID: ");
            int id = sc.nextInt();

            System.out.print("Player Name: ");
            String name = sc.next();

            System.out.print("Sport: ");
            String sport = sc.next();

            playerList[i] = new Player(id, name, sport);
        }
        System.out.println("\nPlayer Details:");
        for (int i = 0; i < size; i++) {
            System.out.println(playerList[i]);
        }

        sc.close();
    }
}
