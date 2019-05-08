
public class Cloud extends Mobile {
    private static final String IMAGE = "cloud";
    private static final int SPEED = 1;
    private static final int WIDTH = 300;
    private static final int HEIGHT = 150;

    private static final int X_DEFAULT_POSITION = 0;
    private static final int Y_DEFAULT_POSITION = 0;
    private static final int XMAX_DEFAULT = 100;
    private static final int YMAX_DEFAULT = 100;

    Cloud(final Direction direction, final Dimension dimension) {
        super(direction, new Position(X_DEFAULT_POSITION, Y_DEFAULT_POSITION, XMAX_DEFAULT, YMAX_DEFAULT), dimension,
                SPEED, IMAGE);
    }
}
