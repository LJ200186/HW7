
package treasurehunt;

import java.util.*;

public class TreasureHunt {

    
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner Input = new Scanner(System.in);
        
        int Total = 0;
        
        System.out.println("Loading game...");
        
        Integer [][] board = new Integer[10][10];
        
        for (int i = 0; i <10; i++){
            
            for (int j = 0; j < 10; j++){
                int Treasure = random.nextInt(4);
                if(Treasure > 1){
                    board[i][j] = random.nextInt(200)+1;
                }else{
                    board[i][j] = 0;
                }
            }
        }
        for (int i = 0; i<(10); i++){
            
            System.out.println("Enter a coordinate (EG: C5)");
            String Coordinate = Input.next();
            char x = Character.toLowerCase((Coordinate.substring(0,1)).charAt(0));
            int y = Integer.parseInt(Coordinate.substring(1)) -1 ;
            
            
            if (x > 'j' || y>10){
                
                System.out.println("Invalid coordinate.");
            }else{
                
                int firstpos = 9 + (Character.compare(x, 'j'));
                
                int Treasure = board[firstpos][y];
            
                if (Treasure != 0){
                
                    Total = Total + Treasure;
                    System.out.println("You found "+ Integer.toString(Treasure)+" coins! Your total is now "+Total+" coins");
                }else{
                    System.out.println("You didnt find any coins in that spot.");
                
                }           
            }
   
        }
        
        System.out.println("End of game! You ended with "+ Total +" coins!" );
    }   
}
