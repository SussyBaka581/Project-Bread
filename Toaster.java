import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toaster extends Boss
{
    int counter;
    public Toaster(int h, int a, CombatPlayer plr) {
        super(h,a,"Toaster"," ",plr);
        counter = 0;
    }
    
    @Override
    public Attack Attack() {
        Attack bullet;
        if (shouldAttack == "Beam"){
            bullet = new Attack("Beam", Color.WHITE, 60, 500, 5, playa);
        } else if (shouldAttack == "Bullet"){
            bullet = new Attack("Bullet", Color.WHITE, 0, 500, 20, playa);
        } else if (shouldAttack == "Toast"){
            bullet = new Attack("Toast", Color.WHITE, 50, 250, 10, playa);
        } else {
            bullet = new Attack("Toast", Color.WHITE, 50, 250, 10, playa);
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
        if (counter%150 == 0) {
            shouldAttack = "Beam";
        }
        if (counter%100 == 0) {
            shouldAttack = "Bullet";
        }
        if (counter%60 == 0) {
            shouldAttack = "Toast";
        }
    }
}
