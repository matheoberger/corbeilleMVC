import java.util.ArrayList;

public interface IDogFlightModel {
    public void addMobile(final IMobile mobile);

    public void buildArea(final Dimension dimension);

    public IArea getArea();

    public IMobile getMobileByPlayer(final int player);

    public ArrayList<IMobile> getMobiles();

    public void removeMobile(final IMobile mobile);

    public void setMobilesHaveMoved();

}
