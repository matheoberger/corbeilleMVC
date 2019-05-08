import java.awt.Image;
import java.awt.Point;

public interface IMobile {
    Dimension getDimension();

    Direction getDirection();

    int getHeight();

    Image getImage();

    Point getPosition();

    int getSpeed();

    int getWidth();

    boolean hit();

    boolean isPlayer(int player);

    boolean isWeapon();

    void move();

    void placeInArea(IArea area);

    void setDirection(Direction direction);

    void setDogFlightModel(IDogFlightModel dogFlightModel);
}
