
package treasurehunt;

import java.util.*;

public class TreasureHunt {

    
    public static void main(String[] args) {
        
           String [][] board = new String[10][8];
           
           for (int i = 0; i < 10; i++){
        for (int j = 0; j<8; j++){
            board[i][j] = "[  ]";
            System.out.print(board[i][j]);
        }
        System.out.println("");
    }
          System.out.println("");
          Scanner input = new Scanner(System.in);
          Random rand = new Random();
          System.out.println("How many pieces of treasure would you like?");
          int treasuresquares = input.nextInt();
          System.out.println("How many monsters would you like?");
          int monsters = input.nextInt();
          for (int b = 0; b<treasuresquares; b++){
          int xcoord = rand.nextInt(8);
          int ycoord = rand.nextInt(10);
          int treasuremin = 10;
          int treasuremax = 99;
          int treasure = rand.nextInt((treasuremax-treasuremin)+1)+treasuremin;
          if(board [ycoord][xcoord].equals("[  ]")){
          board [ycoord][xcoord] = "[" + treasure + "]";
          }else{
              b--;
          }
          }
          for (int b = 0; b<monsters; b++){
          int xcoord = rand.nextInt(8);
          int ycoord = rand.nextInt(10);
          if(board [ycoord][xcoord].equals("[  ]")){
           board [ycoord][xcoord] = "[xx]";
          }else{
              b--;
          } 
          }
    for (int i = 0; i < 10; i++){
        for (int j = 0; j<8; j++){
            System.out.print(board[i][j]);
        }
        System.out.println("");
    }
    System.out.println("How many turns do you want to have?");
    int NumberOfTurns = input.nextInt();
    int UserTotal = 0;
    for (int t=0; t<NumberOfTurns; t++){
    System.out.println("Please enter the x coordinate you would like to check.");
    int UserGuessX = input.nextInt();
    System.out.println("Please enter the y coordinate you would like to check.");
    int UserGuessY = input.nextInt();
    if (board [UserGuessY][UserGuessX].equals("[  ]")){
        System.out.println("Sorry, sorry nothing here.");
    }else
    if (board [UserGuessY][UserGuessX].equals("[xx]")){
        System.out.println("Unlucky, you found a monster. It stole all your " + UserTotal + " gold!");
    }else{ 
        System.out.println("You found treasure!");
        
    }
    
    
    
    }
    }
    
}
