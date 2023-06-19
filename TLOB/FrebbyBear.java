import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrebbyBear extends Boss
{
    int counter;
    public FrebbyBear(int h, int a, CombatPlayer plr) {
        super(h,a,"FrebbyBear", " ",plr);
        counter = 0;
    }
    
    @Override
    public Attack Attack() {
        Attack bullet;
        if(shouldAttack == "Bullet") {
            bullet = new Attack("Bullet", Color.WHITE, 0, 500, 10, playa);
        } else if (shouldAttack == "Beam"){
            bullet = new Attack("Beam", Color.WHITE, 50, 500, 30, playa);
        } else {
            bullet = new Attack("Bullet", Color.WHITE, 0, 500, 10, playa);
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
        if (counter%100 == 0) {
            shouldAttack = "Bullet";
        } else if (counter%101 == 0) {
            shouldAttack = "Beam";
        }
    }
}
