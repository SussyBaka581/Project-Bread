import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack extends Actor
{
    private String t = "bullet";
    private greenfoot.Color c = Color.WHITE;
    private int d = 0;
    private int w = 5;
    private int l = 800;
    private double x = 0;
    private double y = 0;
    private int rot = 0;
    private CombatPlayer playa;
    private int counter = 0;
    private int damageCD = 100;
    public boolean doesDamage;
    private int delayCounter = 0;

    public Attack(String type, Color color, int delay, int length, int width, CombatPlayer plr) {
        t = type;
        c = color;
        d = delay;
        w = width;
        l = length;
        playa = plr;
        rot = Greenfoot.getRandomNumber(360);
        x = plr.getX();
        y = plr.getY();
        if (t == "Bullet"){
            x -= (Math.cos(rot * (Math.PI / 180)) * length / 2);
            y -= (Math.sin(rot * (Math.PI / 180)) * length / 2);
            doesDamage = true;
        } else {
            doesDamage = false;
        }
    }
    /**
     * Act - do whatever the Attack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (damageCD != 100) {
            damageCD++; 
           } else if (isTouching(CombatPlayer.class) && damageCD >= 100 && doesDamage == true){
            CombatPlayer.health -= 1;   
            getWorld().removeObject(this);
            damageCD = 0;
            }
        if (CombatModule.isAttacking == true) {
            update();
            if (t == "Bullet") {
                x += Math.cos((rot) * (Math.PI / 180))*2;
                y += Math.sin((rot) * (Math.PI / 180))*2;
            }
            setLocation((int) x,(int) y);
            setRotation(rot);
            
            if (counter  != 270) {
               counter++;
             } else if (counter == 270){
               getWorld().removeObject(this);
            }
        } 
        delayCounter++;
        if (delayCounter >= d) {
            doesDamage = true;
        }
    }
    public void update(){
        if (t == "Beam") {
            setImage(new GreenfootImage(l+1,w+1));       
        } else if (t == "Bullet") {
            setImage(new GreenfootImage(w+1,w+1));
        }
        GreenfootImage img = getImage();
        if (doesDamage == true) {
            img.setColor(c); 
        } else {
            img.setColor(Color.GRAY);
        }
        if (t == "Beam") {
            img.fillRect(0,0, l, w);
        } else if (t == "Bullet") {
            img.fillRect(0,0, w, w);
        }
    }
}
