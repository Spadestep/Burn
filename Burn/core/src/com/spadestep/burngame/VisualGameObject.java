package com.spadestep.burngame;

import com.badlogic.gdx.graphics.Pixmap;

public abstract class VisualGameObject 
{
    protected int xPosition;
    protected int yPosition;
    
    protected Pixmap pixmap;
    
    public int getXPosition()
    {
        return xPosition;
    }
    
    public int getYPosition()
    {
        return yPosition;
    }
    
    public abstract void render();
}
