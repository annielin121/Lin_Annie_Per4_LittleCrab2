import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class defines a lobster. Lobsters live on the beach.
 */
public class Lobster extends Animal
{
    /**
     * Act - do whatever the lobster wants to do.
     */
    public void act()
    {  
       if ( canSee(Crab.class) )
       { 
           eat(Crab.class);
       }
       turnAtEdge();
       randomTurn(); 
       move();
       lookForCrab(); 
    }  
    /**
     * Check whether we have stumbled upon a crab. 
     * If we have, eat it. If not, do nothing.
     */
    public void lookForCrab() 
    {
       if (canSee(Crab.class) ) 
       { 
           eat(Crab.class);
           Greenfoot.playSound("au.wav"); 
           Greenfoot.stop();
       }
    }   
    /** 
     * Random turn: 10% of the time, it will select a ramdom number from -45 to 45.
     */
    public void randomTurn() 
    { 
        if ( Greenfoot.getRandomNumber(100) < 10 ) 
       {
           turn(Greenfoot.getRandomNumber(90)-45);
       }
    }
    /** 
     * Turn at edge will make the animal turn when it eaches an edge of the world.
     */
    public void turnAtEdge()
    {
        if ( atWorldEdge() ) 
        {
           turn(17);
        } 
    }
}
