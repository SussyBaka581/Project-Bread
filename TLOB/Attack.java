import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Attack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Attack extends Actor
{
    public static String type = "bullet";
    public static greenfoot.Color colorValue = Color.WHITE;
    public static int delay = 0;
    public static int width = 5;
    public static int height = 800;

    public Attack(String t, Color c, int d, int w, int h ) {
        if (t.equals("Bullet")) {
          GreenfootImage img = new GreenfootImage(w,h);
          img.setColor(c);
          System.out.println(c);
          img.fillRect (500, 400, w, h);
          setImage (img);
        }
        else if (t.equals("Beam")) {
          GreenfootImage img = new GreenfootImage(w,h);
          img.setColor(c);
          System.out.println(c);
          img.fillRect (500, 400, w, h);
          setImage (img);
        }
        // copy paste above and change the name and variables to add new attacks
    }
    /**
     * Act - do whatever the Attack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
}
