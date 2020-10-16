package base;

public class Frog {
    private String name;
    private int xPos;
    private int yPos;

    public Frog(String n,int x, int y)		// constructor
    {
        name = n;
        xPos=x;
        yPos=y;
        System.out.println(name);
    }
    public void setPos(int x, int y)	// accessor methods
    {
        xPos = x;
        yPos = y;
    }
    public int getXPos()
    {
        return xPos;
    }
    public int getYPos()
    {
        return yPos;
    }
    public void moveWest()		// change the pos of the frog
    {
        xPos = xPos-1;
    }
    public void moveEast()
    {
        xPos = xPos + 1;
    }
    public void moveNorth()
    {
        yPos=yPos+1;
    }
    //TODO jump method move up and to the right
    //This method should take an integer argument.  This argument controls how many spaces
    // the frog will move both up and right.  Returns no value.

    public void jump(int length)
    {
        xPos += length;
        yPos += length;
    }

    //TODO visit method moves frog to the location of the friend frog
    // This method will take an argument of type base.Frog.  It will find the position of the
    // frog and move to this position.  Returns no value.

    public void visit(Frog otherFrog){
        this.xPos = otherFrog.getXPos();
        this.yPos = otherFrog.getYPos();
    }

    public void eatFly()
    {
        System.out.println("Yum");
    }
    public String toString()
    {
        String s = "Hi I am "+ name +" the frog and I live at "+ xPos + " " + yPos;
        return s;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Frog f1 = new Frog("Freddy",3,4);	// create an instance of base.Frog
        f1.eatFly();						// call base.Frog methods
        f1.moveNorth();
        System.out.println(f1);

        Frog f2 = new Frog("Francine", -2,0);
        f2.eatFly();
        // TODO uncomment these to test new code.
        f2.jump(2);
        f1.visit(f2);
        System.out.println(f1);
        System.out.println(f2);

        //Create a new frog named Frank. Give him a location. Have him jump twice. Print him and then
        //have him go visit Freddy. Print him again to show his updated location.

        Frog frank = new Frog("Frank", 7, -3);
        frank.jump(5);
        frank.jump(-2);
        System.out.println(frank);
        frank.visit(f1);
        System.out.println(frank);

    }

}

/*  Output
Freddy
Yum
Hi I am Freddy the frog and I live at 3 5
Francine
Yum
Hi I am Freddy the frog and I live at 0 2
Hi I am Francine the frog and I live at 0 2
*/
