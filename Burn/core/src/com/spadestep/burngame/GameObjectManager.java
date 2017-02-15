
package com.spadestep.burngame;

import java.util.ArrayList;

public class GameObjectManager 
{
    private static ArrayList<VisualGameObject> manager;
    
    public GameObjectManager()
    {
        manager = new ArrayList();
    }
    
    public static void add(VisualGameObject object)
    {
        manager.add(object);
    }
    
    public static void render()
    {
        for(int i = 0; i < manager.size(); i++)
            manager.get(i).render();
    }
    
}
