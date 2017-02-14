
package com.spadestep.burngame.spaceships;

public abstract class Spaceship
{
    private int velocity;
    private int xPosition;
    private int yPosition;
    
    public int getXPostition()
    {
        return xPosition;
    }
    
    public int getYPosition()
    {
        return yPosition;
    }
    
    public int getVelocity()
    {
        return velocity;
    }
    
    abstract void rotate();
    
    abstract void move();
}
