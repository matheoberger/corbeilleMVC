
public class Dimension {
    private int width;
    private int height;

    Dimension(final Dimension dimension) {
        this.setHeight(dimension.getHeight());
        this.setWidth(dimension.getWidth());
    }

    Dimension(final int width, final int height) {
        this.setHeight(height);
        this.setWidth(width);
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public void setWidth(final int width) {
        this.width = width;
    }
}
