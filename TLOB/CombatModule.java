import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Collection;

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
    public Label Name = new Label("bink");
    public CombatPlayer P = new CombatPlayer();
    public PlayerHP PlayerBar = new PlayerHP(100, 20);
    public BossHP BossBar = new BossHP(500, 50);
    public static boolean isAttacking = false;
    public static boolean inActMenu = false;
    public static boolean inItemMenu = false;
    public static boolean inMercyMenu = false;
    public static Boss currentBoss;
    public static int fightCounter;
    public static int fightDuration = 1000;
    public GreenfootSound music = new GreenfootSound("Toaster.mp3");
    // change music file name to boss name
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CombatModule(/*Boss boss, String songName*/)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        addObject(F, 205, 710);
        addObject(A, 392, 710);
        addObject(I, 581, 710);
        addObject(M, 770, 710);
        addObject(P, 148, 713);
        addObject(PlayerBar, 484, 643);
        addObject(BossBar, 500, 50);
        addObject(Name, 144, 635);
        currentBoss = new Toaster(10,1, P); // change new name to current boss name
        setPaintOrder(CombatPlayer.class);
        addObject(currentBoss, 500, 225);
    }
    public void act() {
        music.play();
        music.setVolume(20);
        if (isAttacking == true) {
            addObject(PlayerBar, 512, 760);
            addObject(BossBar, 500, 50);
            addObject(currentBoss, 500, 225);
            currentBoss.Update();
            if (currentBoss.shouldAttack != "") {
                Attack a = currentBoss.Attack();
                addObject(a, 1, 1);
            }
            fightCounter++;
            if (fightCounter >= fightDuration) {
                Collection objects = getObjects(null);
                objects.remove(P);
                removeObjects(objects);
                isAttacking = false;
                CombatPlayer.inMenu = true;
                addObject(F, 205, 710);
                addObject(A, 392, 710);
                addObject(I, 581, 710);
                addObject(M, 770, 710);
                addObject(PlayerBar, 484, 643);
                addObject(BossBar, 500, 50);
                addObject(Name, 144, 635);
                addObject(currentBoss, 500, 225);
                setBackground("BlackDrop.jpg");
                P.movePlr(148, 713);
            }
        }
        if (inActMenu == true) {
            inActMenu = false;
        }
        if (inItemMenu == true) {
            inItemMenu = false;
        }
        if (inMercyMenu == true) {
            Label label = new Label("You got away safely!");
            addObject(label, 415, 545);
            inMercyMenu = false;
        }
        if (P.health <= 0) {
            //add in death world
        }
    }
}
