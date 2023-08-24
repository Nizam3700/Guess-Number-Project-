import java.util.*;

class guesser
{
    int gusserNum;
    public int TakeNumberGuess()
    {   
        System.out.println("Guesser guess a Number");
        Scanner sc = new Scanner(System.in);
        int gusserNum = sc.nextInt();

        return  gusserNum;
    }
}

class player
{   
    int playerNum;
    public int TakeNumberPlay()
    {   
        System.out.println("Player guess a Number ");
        Scanner sc = new Scanner(System.in);
        int playerNum = sc.nextInt();

        return  playerNum;
    }
}

class umpire
{
    int NumFormGuesser;
    int NumFormplayers1;
    int NumFormplayers2;
    int NumFormplayers3;

    public void collectGuess()
    {
        guesser g = new guesser();
        NumFormGuesser = g.TakeNumberGuess(); 
    }

    void collectplayers()
    {
        player  p1 = new player();
        NumFormplayers1 = p1.TakeNumberPlay();

        player  p2 = new player();
        NumFormplayers2 = p1.TakeNumberPlay();

        player  p3 = new player();
        NumFormplayers3 = p1.TakeNumberPlay();

    }

    void compare()
    {
        // First condition 
        if(NumFormplayers1 == NumFormGuesser)
        {
            if(NumFormplayers2 == NumFormGuesser && NumFormplayers3 == NumFormGuesser)
            {
                System.out.println("All players WON the game");
            }
            else if(NumFormplayers2 == NumFormGuesser)
            {
                System.out.println("Only Player1 & Player2 WON the game");
            }
            else if(NumFormplayers3 == NumFormGuesser)
            {
                System.out.println("Only Player1 & Player3 WON the game");
            }
            else
            {
                System.out.println("Only Player1 WON the game");
            }
            // second condition 
        }
        else if(NumFormplayers2 == NumFormGuesser)
            {
                if(NumFormplayers3 == NumFormGuesser)
                {
                    System.out.println("Only Player2 & Player3 WON the game");
                }
                else 
                {
                    System.out.println("Only Player  2 WON the game");
                }
            }
        else if(NumFormplayers3 == NumFormGuesser)
            {
                System.out.println("Only Player3 WON the game");
            }
        else
        {
            System.out.println("No Player WON the Game");
        }
    }
}

class game
{
    public static void main(String[] args) 
    {
        umpire u = new umpire();
        u.collectGuess();
        u.collectplayers();
        u.compare();
    }
}