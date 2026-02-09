/**
 * This is a picture of two people walking through the park in the daylight.
 * 
 * @author  Zachary Robinson
 * @version 2023.02.09
 */
public class Picture
{
    private Square ground;
    private Square wall;
    private Triangle hat;
    private Circle sun;
    private Circle bush1;
    private Circle bush2;
    private Circle bush3;
    private Circle bush4;
    private Circle bush5;
    private Circle bush6;
    private Circle bush7;
    private Circle bush8;
    private Triangle treeBase;
    private Square treeTrunk;
    private Person human1;
    private Person human2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        ground = new Square();
        wall = new Square();
        bush1 = new Circle();
        bush2 = new Circle();
        bush3 = new Circle();
        bush4 = new Circle();
        bush5 = new Circle();
        bush6 = new Circle();
        bush7 = new Circle();
        bush8 = new Circle();
        treeBase = new Triangle();
        treeTrunk = new Square();
        hat = new Triangle();  
        sun = new Circle();
        human1 = new Person();
        human2 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            bush1.changeColor("forestGreen");
            bush1.moveHorizontal(-250);
            bush1.moveVertical(96);
            bush1.makeVisible();
            
            bush2.changeColor("forestGreen");
            bush2.moveHorizontal(-200);
            bush2.moveVertical(96);
            bush2.makeVisible();
            
            bush3.changeColor("forestGreen");
            bush3.moveHorizontal(-120);
            bush3.moveVertical(96);
            bush3.makeVisible();
            
            bush4.changeColor("forestGreen");
            bush4.moveHorizontal(-90);
            bush4.moveVertical(96);
            bush4.makeVisible();
            
            bush5.changeColor("forestGreen");
            bush5.moveHorizontal(-50);
            bush5.moveVertical(96);
            bush5.makeVisible();
            
            bush6.changeColor("forestGreen");
            bush6.moveHorizontal(50);
            bush6.moveVertical(96);
            bush6.makeVisible();
            
            bush7.changeColor("forestGreen");
            bush7.moveHorizontal(90);
            bush7.moveVertical(96);
            bush7.makeVisible();
            
            bush8.changeColor("forestGreen");
            bush8.moveHorizontal(145);
            bush8.moveVertical(96);
            bush8.makeVisible();
            
            ground.changeColor("brown");
            ground.changeSize(5000);
            ground.moveHorizontal(-500);
            ground.moveVertical(100);
            ground.changeSize(5000);
            ground.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            human1.changeColor("black");
            human1.moveHorizontal(-150);
            human1.moveVertical(10);
            human1.makeVisible();
            
            human2.changeColor("black");
            human2.moveHorizontal(150);
            human2.moveVertical(10);
            human2.makeVisible();
            
            hat.changeColor("black");
            hat.changeSize(25,-35);
            hat.moveHorizontal(-80);
            hat.moveVertical(50);
            hat.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        hat.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        ground.changeColor("brown");
        bush1.changeColor("forestGreen");
        bush2.changeColor("forestGreen");
        bush3.changeColor("forestGreen");
        bush4.changeColor("forestGreen");
        bush5.changeColor("forestGreen");
        bush6.changeColor("forestGreen");
        bush7.changeColor("forestGreen");
        bush8.changeColor("forestGreen");
        wall.changeColor("green");
        hat.changeColor("black");
        sun.changeColor("yellow");
    }
}
