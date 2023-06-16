import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CombatModule extends World
{
    public FightBtn F = new FightBtn();
    public ActBtn A = new ActBtn();
    public ItemBtn I = new ItemBtn();
    public MercyBtn M = new MercyBtn();
    public CombatPlayer P = new CombatPlayer();
    public static boolean isAttacking = false;
    public static boolean inActMenu = false;
    public static boolean inItemMenu = false;
    public static boolean inMercyMenu = false;
    public static Boss currentBoss;
    //----------- finish the rest of the buttons for this pls
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CombatModule()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        addObject(F, 205, 710);
        addObject(A, 392, 710);
        addObject(I, 581, 710);
        addObject(M, 770, 710);
        addObject(P, 148, 713);
        currentBoss = new Baller(10,1,"Baller","He throw", P);
    }
    public void act() {
        if (isAttacking == true) {
            currentBoss.Update();
            if (currentBoss.shouldAttack == true) {
                Attack a = currentBoss.Attack();
                addObject(a, 1, 1);
            }
        }
        if (inActMenu == true) {
            addObject(P, 120, 550);
            inActMenu = false;
        }
        if (inItemMenu == true) {
            inItemMenu = false;
        }
        if (inMercyMenu == true) {
            Label label = new Label("You got away safely!");
            addObject(P, 120, 550);
            addObject(label, 320, 800);
            inMercyMenu = false;
        }
    }
}
