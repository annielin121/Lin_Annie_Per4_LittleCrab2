import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Animal
{
      private GreenfootImage image1;
      private GreenfootImage image2; 
      private int wormsEaten;
      int counter;
    /**
     * Create a crab and initialize its two images.
     */
    public Crab() 
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png"); 
    } 
    /**
     * Act - do whatever the crab wants to do.
     */
    public void act()
    { 
       checkKeypress();
       move();
       lookForWorm();   
       counter = counter + 1;
       if (counter == 3)
       { 
       switchImage();
       counter = 0;
       } 
    }
    /**
     * Switches image of the crab according to the condition evaluated
     */
    public void switchImage() 
    {
        if ( getImage() == image1 )
        {
            setImage(image2);
        }
        else 
        {
            setImage(image1);
        }
    }
    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeypress()
    { 
       if (Greenfoot.isKeyDown("right"))
       { 
           turn(4);
       }
       if (Greenfoot.isKeyDown("left"))
       {
           turn(-4); 
       }
    }
    /**
     * Check whether we have stumbled upon a worm. 
     * If we have, eat it. If not, do nothing.
     * eaten eight worms, we win.
     */
    public void lookForWorm() 
    {
       if (canSee(Worm.class) ) 
       { 
           eat(Worm.class);
           Greenfoot.playSound("slurp.wav"); 
           
           wormsEaten = wormsEaten + 1;
           if (wormsEaten == 8)
           {
               Greenfoot.playSound("fanfare.wav");
               Greenfoot.stop();
           }
       }
    }    
}

