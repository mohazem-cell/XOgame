package backend;

import java.util.Scanner;

public class testBackend {
    public static void main(String[] args) {
        GameEngin g = new GameEngin();
        ObserverGame o=new ObserverGame();
        while (!g.gameOver()) {
            Scanner s = new Scanner(System.in);
            // System.out.println("efefef");
            int row = s.nextInt();
            int col = s.nextInt();
            GamePostion pos = new GamePostion(row, col);
            g.setPlace(pos);
            o.registerObserver(g);
        }
    }
}
