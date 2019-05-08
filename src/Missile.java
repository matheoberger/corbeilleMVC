
public class Missile extends Mobile {
    private static final int SPEED = 4;

    private static final int WIDTH = 30;

    private static final int HEIGHT = 10;
    private static final int MAX_DISTANCE_TRAVELED = 1400;
    private static final String IMAGE = "missile";
    private static final int X_DEFAULT_POSITION = 0;
    private static final int Y_DEFAULT_POSITION = 0;
    private static final int XMAX_DEFAULT = 100;
    private static final int YMAX_DEFAULT = 100;

    public static int getHeightWithADirection(final Direction direction) {
        return 0;
    }

    public static int getWidthWithADirection(final Direction direction) {
        return 0;
    }

    private final int distanceTraveled = 0;

    Missile(final Direction direction, final Dimension dimension) {
        super(direction, new Position(X_DEFAULT_POSITION, Y_DEFAULT_POSITION, XMAX_DEFAULT, YMAX_DEFAULT), dimension,
                SPEED, IMAGE);
    }

    @Override
    public boolean isWeapon() {
        return false;
    }

    @Override
    public void move() {

    }
}
