import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NPC1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Afton extends Actor
{
    public int timer = 0;
    boolean saidFirstLine = false;
    boolean saidSecondLine = false;
    boolean saidThirdLine = false;
    boolean saidFourthLine = false;
    /**
     * Act - do whatever the NPC1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //timer for dialogue
        if(isTouching(Player.class)){
            timer++;
        }
        //test dialogue(WIP)
        if(isTouching(Player.class) && saidFirstLine == false){
           say("Micheal, is that you?"); 
           saidFirstLine = true;
        }
        if(isTouching(Player.class) && saidSecondLine == false && timer == 100){
           say("Oh, nevermind... thought you were someone else");
        }
        if(isTouching(Player.class) && saidThirdLine == false && timer == 200){
           say("Who are you?");
        }
        if(isTouching(Player.class) && saidFourthLine == false && timer == 375){
           say("Wait! You're Bink!");
        }
    }
    public void say(String s){
        System.out.println(s);
    }
}
