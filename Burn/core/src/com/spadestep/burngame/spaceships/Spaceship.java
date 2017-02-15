
package com.spadestep.burngame.spaceships;

import com.spadestep.burngame.VisualGameObject;

public abstract class Spaceship extends VisualGameObject 
{
    private int velocity;
    
    public int getVelocity()
    {
        return velocity;
    }
    
    abstract void rotate();
    
    abstract void move();
}
