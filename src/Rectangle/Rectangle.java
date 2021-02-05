package Rectangle;

/**
 *
 * @author Polis
 */
public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    
    public int getPerimeter () {
        return width*height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    //output
    @Override
    public String toString() {
        return ("Rectangle: Height= "+height+"; Width= "+width+";"
                +"Perimeter= "+getPerimeter()+".");
    }
}
