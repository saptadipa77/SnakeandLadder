public class Player {
    private int position = 0;

    public int getPosition() {
        return position;
    }

    public void updatePosition(int move) {
        position += move;
        if (position < 0) position = 0;
    }

    public void setPosition(int newPos) {
        this.position = newPos;
    }
}

