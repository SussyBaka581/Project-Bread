import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baller extends Boss
{
    int counter;
    public Baller(int h, int a, CombatPlayer plr) {
        super(h,a,"Baller", " ",plr);
        counter = 0;
    }
    
    @Override
    public Attack Attack() {
        Attack bullet;
        if(shouldAttack == "Bullet") {
            bullet = new Attack("Bullet", Color.WHITE, 0, 500, 10, playa);
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
        if (counter%60 == 0) {
            shouldAttack = "Bullet";
        }
    }
}
