import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bar extends Actor
{
    public int xPos;
    public int yPos;
    public int Width;
    public int Height;
    public double BarPercent;
    public Color barColor;
    public Color outlineColor;
    public Bar(int w, int h, Color bc, Color oc) {
        Width = w;
        Height = h;
        BarPercent = 1;
        barColor = bc;
        outlineColor = oc;
    }
    /**
     * Act - do whatever the Bar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        RenderBar();
    }
    public void RenderBar(){
        setImage(new GreenfootImage(Width,Height));
        GreenfootImage img = getImage();
        img.setColor(outlineColor);
        img.fillRect(0,0, Width, Height);
        img.setColor(barColor);
        img.fillRect(0,0, (int) (Width*BarPercent), Height);
    }
    public void setPercentage(double p){
        BarPercent = p;
    }
}
