/**
 * This class draws a simple picture of a black dessert with a Pyramid, a person, 
 * a cloud and a sun.
 *
 * @author  James Sepanak
 * @version 2017.09.18
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle pyramid;
    private Circle sun;
    private Square sky;
    private Person guy;
    private Triangle behind;
    private Triangle something;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-310);
        wall.moveVertical(100);
        wall.changeSize(500);
        wall.makeVisible();
        
        sky = new Square();
        sky.changeColor("blue");
        sky.moveHorizontal(-310);
        sky.moveVertical(-400);
        sky.changeSize(500);
        sky.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(10);
        window.makeVisible();

        pyramid = new Triangle();
        pyramid.changeColor("yellow");
        pyramid.changeSize(200, 250);
        pyramid.moveHorizontal(20);
        pyramid.moveVertical(-60);
        pyramid.makeVisible();

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(215);
        sun.moveVertical(-115);
        sun.changeSize(80);
        sun.makeVisible();
        
        guy = new Person();
        guy.moveHorizontal(100);
        guy.moveVertical(30);
        guy.changeColor("green");
        guy.makeVisible();
        
        behind = new Triangle();
        behind.changeColor("yellow");
        behind.moveHorizontal(-135);
        behind.moveVertical(0);
        behind.changeSize(100, 110);
        behind.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("white");
            window.changeColor("white");
            sky.changeColor("white");
            pyramid.changeColor("black");
            behind.changeColor("black");
            sun.changeColor("black");
            guy.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("black");
            sky.changeColor("blue");
            pyramid.changeColor("yellow");
            behind.changeColor("yellow");
            sun.changeColor("red");
            guy.changeColor("green");
        }
    }
}
