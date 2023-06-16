import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    public int health;
    public int attack;
    public String name;
    public String desc;
    
    public Boss(int h, int a, String n, String d) {
        health = h;
        attack = a;
        name = n;
        desc = d;
    }
    public void TakeDamage(){
        health -= 1;
    }
    //public abstract void Attack();
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
