import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    public Label(String content) {
        GreenfootImage img = new GreenfootImage(content.length()*30,50);

        Font font = new Font("Cambria", 40);
        img.setFont(font);
        
        img.setColor(new Color(255,255,255));
        img.drawString (content, 40, 40);
        setImage (img);
    }
    /**
     * Act - do whatever the TextBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
