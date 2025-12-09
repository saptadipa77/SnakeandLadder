public class SinglePlayer{

    private Player player = new Player();
    private Dice dice = new Dice();
    private GameRules rules = new GameRules();
    private int diceCount = 0;



    private void playTurn() {
        int roll = dice.roll();
        diceCount++;

        int option = rules.getOption();

        switch (option) {
            case 0: // No Play
                break;

            case 1: // Ladder
                player.updatePosition(roll);
                break;

            case 2: // Snake
                player.updatePosition(-roll);
                break;
        }


        System.out.println("Dice: " + roll + " | Option: " + option +
                " | Position: " + player.getPosition());
    }
}

