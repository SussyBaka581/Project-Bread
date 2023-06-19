import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Herobrine extends Boss
{
    int counter;
    public Herobrine(int h, int a, CombatPlayer plr) {
        super(h,a,"Herobrine"," ",plr);
        counter = 0;
    }
    
    @Override
    public Attack Attack() {
        Attack bullet;
        if (shouldAttack == "Beam"){
            bullet = new Attack("Beam", Color.WHITE, 40, 500, 15, playa);
        } else {
            bullet = new Attack("Beam", Color.WHITE, 40, 500, 15, playa);
        }
        shouldAttack = "";
        return bullet;
    }
    
    /**
     * Act - do whatever the Baller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void Update()
    {
        counter++;
        if (counter%70 == 0) {
            shouldAttack = "Beam";
        }
    }
}
