public class Main {
    public static void main(String[] args) {

        System.out.println("Single Player Snake & Ladder Game");
        SinglePlayer sp = new SinglePlayer();
        sp.startGame();

        System.out.println("\nTwo Player Snake & Ladder Game");
        TwoPlayer tp = new TwoPlayer();
        tp.startGame();
    }
}
