import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Boss extends Actor
{
    public int health;
    public int attack;
    public String name;
    public String desc;
    public CombatPlayer playa;
    public boolean shouldAttack;
    public int maxHealth;
    
    public Boss(int h, int a, String n, String d, CombatPlayer plr) {
        health = h;
        attack = a;
        name = n;
        desc = d;
        playa = plr;
        maxHealth = h;
        shouldAttack = false;
    }
    
    public void TakeDamage(){
        health -= 1;
    }
    
    protected abstract Attack Attack();
    
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected abstract void Update();
}
