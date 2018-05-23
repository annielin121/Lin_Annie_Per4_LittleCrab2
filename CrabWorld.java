import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1); 
        populateWorld(); 
    }
    /**
     * Objects that populate the world
     */
    public void populateWorld() 
    {
        addObject( new Crab(), 150, 100 );
        addObject( new Lobster(), 120, 400); 
        addObject( new Lobster(), 100, 220); 
        addObject( new Lobster(), 300, 80); 
        addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560)); 
        addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
        addObject( new Worm(), Greenfoot.getRandomNumber(560), Greenfoot.getRandomNumber(560));
    }
} 