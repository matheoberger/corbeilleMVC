
public class Plane {
    private static final int SPEED = 2;
    private static final int WIDTH = 100;
    private static final int HEIGHT = 30;
    private final int player;

    Plane(final int player, final Direction direction, final Position position, final String image) {
        this.player = player;
    }

    public boolean hit() {
        return false;
    }

    boolean isPlayer(final int player) {
        return false;
    }
}
