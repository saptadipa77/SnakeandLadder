import java.util.Random;

public class GameRules {
    private Random rand = new Random();

    // 0 = No Play, 1 = Ladder, 2 = Snake
    public int getOption() {
        return rand.nextInt(3);
    }
}

