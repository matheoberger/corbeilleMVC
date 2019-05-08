
public class Position {
    private double x;
    private double y;
    private double maxX;
    private double maxY;

    public Position(final double x, final double y, final double maxX, final double maxY) {
        this.setX(x);
        this.setY(y);
        this.setMaxX(maxX);
        this.setMaxY(maxY);
    }

    public Position(final Position position) {
        this.setX(position.getX());
        this.setY(position.getY());
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    protected void setMaxX(final double maxX) {
        this.maxX = maxX;
    }

    protected void setMaxY(final double maxY) {
        this.maxY = maxY;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public void setY(final double y) {
        this.y = y;
    }
}
