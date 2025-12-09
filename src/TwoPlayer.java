public class TwoPlayer {

    private Player p1 = new Player();
    private Player p2 = new Player();
    private Dice dice = new Dice();
    private GameRules rules = new GameRules();

    public void startGame() {

        boolean turnOfP1 = true;

        while (p1.getPosition() != Constants.WINNING_POSITION &&
                p2.getPosition() != Constants.WINNING_POSITION) {

            if (turnOfP1) {
                turnOfP1 = playTurn("Player 1", p1);
            } else {
                turnOfP1 = !playTurn("Player 2", p2);
            }
        }

        if (p1.getPosition() == Constants.WINNING_POSITION)
            System.out.println("Player 1 Wins!");
        else
            System.out.println("Player 2 Wins!");
    }

    private boolean playTurn(String name, Player player) {
        int roll = dice.roll();
        int option = rules.getOption();

        switch (option) {
            case 0: break;
            case 1: player.updatePosition(roll); break;
            case 2: player.updatePosition(-roll); break;
        }

        if (player.getPosition() > Constants.WINNING_POSITION)
            player.updatePosition(-roll);

        System.out.println(name + " | Dice: " + roll +
                " | Option: " + option +
                " | Pos: " + player.getPosition());
        return option == 1;
    }
}

