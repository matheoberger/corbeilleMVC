
public class Plane extends Mobile {
    private static final int SPEED = 2;
    private static final int WIDTH = 100;
    private static final int HEIGHT = 30;
    private final int player;

    Plane(final int player, final Direction direction, final Position position, final String image) {
        super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
        this.player = player;
    }

    @Override
    public boolean hit() {
        return false;
    }

    @Override
    public boolean isPlayer(final int player) {
        return false;
    }
}
