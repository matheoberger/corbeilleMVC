import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile {
    private final int speed;
    private Direction direction;
    private final Position position;
    private final Dimension dimension;
    private final String image;

    Mobile(final Direction direction, final Position position, final Dimension dimension, final int speed,
            final String image) {
        this.setDirection(direction);
        this.position = position;
        this.dimension = dimension;
        this.speed = speed;
        this.image = image;
    }

    public Color getColor() {
        return null;
    }

    @Override
    public Dimension getDimension() {
        return this.dimension;
    }

    @Override
    public Direction getDirection() {
        return this.direction;
    }

    public IDogFlightModel getDogFlightModel() {
        return null;
    }

    @Override
    public int getHeight() {
        return this.dimension.getHeight();
    }

    @Override
    public Image getImage() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Point getPosition() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int getWidth() {
        return this.dimension.getWidth();
    }

    @Override
    public boolean hit() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isPlayer(final int player) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isWeapon() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void move() {

    }

    private void moveDown() {

    }

    private void moveLeft() {

    }

    private void moveRight() {

    }

    private void moveUp() {

    }

    @Override
    public void placeInArea(final IArea area) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setDirection(final Direction direction) {
        this.direction = direction;
    }

    public void setDogFlightModel(final IDogFlightModel dogFlightModel) {
        // TODO Auto-generated method stub

    }

}
