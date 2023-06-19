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
    public static CombatPlayer P = new CombatPlayer();
    public PlayerHP PlayerBar = new PlayerHP(100, 20);
    public BossHP BossBar = new BossHP(500, 50);
    public static boolean isAttacking = false;
    public static boolean inActMenu = false;
    public static boolean inItemMenu = false;
    public static boolean inMercyMenu = false;
    public static Boss currentBoss;
    public static int fightCounter;
    public static int fightDuration = 700;
    public static GreenfootSound music;
    // change music file name to boss name
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CombatModule(String bossName, String songName)
    {    
        super(1000, 800, 1); 
        addObject(F, 205, 710);
        addObject(A, 392, 710);
        addObject(I, 581, 710);
        addObject(M, 770, 710);
        addObject(P, 148, 713);
        addObject(PlayerBar, 484, 643);
        addObject(BossBar, 500, 50);
        addObject(Name, 144, 635);
        
        switch(bossName) {
           case "Baller":
               currentBoss = new Baller(10,1, P);
               break;
           case "Amogus":
               currentBoss = new Amogus(10,1, P);
               break;
           case "FrebbyBear":
               currentBoss = new FrebbyBear(10,1, P);
               break;
           case "Herobrine":
               currentBoss = new Herobrine(10,1, P);
               break;
           case "Toaster":
               currentBoss = new Toaster(10,1, P);
               break;
        } 
        
        setPaintOrder(CombatPlayer.class);
        addObject(currentBoss, 500, 225);
        music = new GreenfootSound(songName);
    }
    public void act() {
        music.play();
        music.setVolume(20);
        if (isAttacking == true) {
            if (currentBoss.health <= 0) {
                bossBeaten();
            }
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
            inMercyMenu = false;
        }
    }
    
    public void bossBeaten() {
        switch(currentBoss.name) {
            case "Baller":
                Player.BKilled = true;
                break;
            case "Amogus":
                Player.AKilled = true;
                break;
            case "Herobrine":
                Player.HKilled = true;
                break;
            case "FrebbyBear":
                Player.FKilled = true;
                break;
            case "Toaster":
                Player.TKilled = true;
                break;
        }
        tpBack();
    }
    public static void tpBack() {
        P.health = 10;
        music.stop();
        isAttacking = false;
        CombatPlayer.inMenu = true;
        greenfoot.World world;
        switch(currentBoss.name) {
            case "Baller":
                world = (new Frame1());
                break;
            case "Amogus":
                world = (new Frame7());
                break;
            case "Herobrine":
                world = (new Frame3());
                break;
            case "FrebbyBear":
                world = (new Frame9());
                break;
            case "Toaster":
                world = (new CastleWorld());
                break;
            default:
                world = (new Frame1());
        }
        world.addObject(ControlWorld.player, 500, 400);
        Greenfoot.setWorld(world);
    }
}
