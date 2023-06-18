import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NPC1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Afton extends Player
{
    public int timer = 0;
    boolean saidFirstLine = false;
    boolean saidSecondLine = false;
    boolean saidThirdLine = false;
    boolean saidFourthLine = false;
    boolean saidFifthLine = false;
    boolean saidSixthLine = false;
    boolean saidSeventhLine = false;
    boolean saidEighthLine = false;
    boolean saidNinthLine = false;
    boolean said10Line = false;
    boolean said11Line = false;
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
        //dialogue
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
        if(isTouching(Player.class) && saidFifthLine == false && timer == 450){
           say("I've been waiting for you to show up.");
        }
        if(isTouching(Player.class) && saidSixthLine == false && timer == 500){
           say("One of my creations has gone rogue, I need you to dismantle him.");
        }
        if(isTouching(Player.class) && saidSeventhLine == false && timer == 600){
           say("Keep whatever falls off of him, I just need him gone.");
        }
        if(isTouching(Player.class) && saidEighthLine == false && timer == 700){
           say("Here, this may be useful on your journey.");
           saidEighthLine = true;
        }
        if(isTouching(Player.class) && saidNinthLine == false && timer == 750){
           say("YOU HAVE AQUIRED A SCREWDRIVER!!");
           saidNinthLine = true;
           //hasScrewdriver = true;
        }
        if(isTouching(Player.class) && said10Line == false && timer == 850){
           say("He should be in the space above me, go get him.");
        }
        if(isTouching(Player.class) && said11Line == false && timer == 950){
           say("I'm counting on you, good luck!");
        }
    }
    public void say(String s){
        System.out.println(s);
    }
}
