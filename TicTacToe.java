//Aziz Makda
//Programming Project Tic Tac Toe



import java.util.Scanner;
public class TicTacToe
{

   public static char[][] board={{'1','2','3',},{'4','5','6'},{'7','8','9'}};
   
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
     
      int n;
      char player = 'O';
      int count = 0;
      
      printBoard();
      
      do
      {
         
         count++;
         // change player
         if(player == 'X')
            player = 'O';
         else
           player = 'X';
         
         do
         {
            System.out.print(player + " - Which square? [1-9] ");
            n=kb.nextInt();
            
          // While n is not 1-9 or position is not avalible
         }while(!checKboard(n));

         if(player == 'X')
            placeX(n);
         else
            placeO(n);
         
         printBoard();
            
     }while(!isOver(count, player));

   }//end main
     
      public static boolean isOver(int count, char player)
      {
         // Horizonal win  
         if (player == board[0][0] && player ==board[0][1] && player == board[0][2])
         {
            System.out.println(player +" wins!");
            return true;
         }
         
         if (player == board[1][0] && player ==board[1][1] && player == board[1][2])
         {
            System.out.println(player +" wins!");
            return true;
         }
         
         if (player == board[2][0] && player ==board[2][1] && player == board[2][2])
         {
            System.out.println(player +" wins!");
            return true;
         }
         // Vertical win
         if (player == board[0][0] && player ==board[1][0] && player == board[2][0])
         {
            System.out.println(player +" wins!");
            return true;
         }
            
         if (player == board[0][1] && player ==board[1][1] && player == board[2][1])
         {
            System.out.println(player +" wins!");
            return true;
         }
         
         if (player == board[0][2] && player ==board[1][2] && player == board[2][2])
         {
            System.out.println(player +" wins!");
            return true;
         }
               //diagonal win
         if (player == board[0][0] && player ==board[1][1] && player == board[2][2])
         {
            System.out.println(player +" wins!");
            return true;
         }
         
         if (player == board[0][2] && player ==board[1][1] && player == board[2][0])
         {
            System.out.println(player +" wins!");
            return true;
         }
         
         // no winner
         
         
         if (count==9)
         {  
              // all positions occupied
            System.out.println("Cat Game!");
            return true;
         
         }
         
         // no winner, keep playing
         return false;
      
      }
      
    
    // checking if n is not occupied & n is 1-9
    // return true
    public static boolean checKboard(int n)
    {
      if(n==1)
      {       
        return isOccupied(0,0);
      }  
      else if(n==2)
      {
        return isOccupied(0,1);
      }
                     
      else if(n==3)
      {
        return isOccupied(0,2);
      }  
                  
      if(n==4)
      {
        return isOccupied(1,0);
      }
       
      else if(n==5)
      {
          return isOccupied(1,1);
      }
                              
      else if(n==6)
      {
        return isOccupied(1,2);
      }
                  
      if(n==7)
      {
         return isOccupied(2,0);
      }
               
      else if(n==8)
      {
        return isOccupied(2,1);
      }  
                              
      else if(n==9)
      {
       return isOccupied(2,2);
      }
      System.out.println("Invalid input");   
      return false;                            
       
   }
   
   // checking 
   public static boolean isOccupied(int i, int j)
   {
      if(board[i][j]== 'X' || board[i][j]== 'O')
       {
         System.out.println("Space occupied");
       
         return false;
       }
       else
       {
         return true;
       }
   }
   
   
    public static void placeX(int a)
    {
      if (a==1)
         board[0][0]= 'X';
         
     else if(a==2) 
     board[0][1]= 'X';
     
     else if(a==3)
     board[0][2]= 'X';
     
     else if (a==4)
     board[1][0] = 'X';
     
     else if (a==5)
     board[1][1] = 'X';
     
     else if (a==6)
     board[1][2] = 'X';
     
     else if(a==7)
     board[2][0] = 'X';
     
     else if (a==8)
     board[2][1]= 'X';
     
     else
     board[2][2] = 'X';      
    } 
    
    
    public static void placeO(int b)
    {
      if (b==1)
         board[0][0]= 'O';
         
     else if(b==2) 
     board[0][1]= 'O';
     
     else if(b==3)
     board[0][2]= 'O';
     
     else if (b==4)
     board[1][0] = 'O';
     
     else if (b==5)
     board[1][1] = 'O';
     
     else if (b==6)
     board[1][2] = 'O';
     
     else if(b==7)
     board[2][0] = 'O';
     
     else if (b==8)
     board[2][1]= 'O';
     
     else
     board[2][2] =  'O';  
         
    } 

         public static void printBoard()
    {
     
      int i;
     
      for(i=0; i < 3;i++)
      {
               
          System.out.println("  |   | ");
          System.out.println(board[i][0] +" | " + board[i][1]+ " |  " + board[i][2] );
          System.out.println("  |   | ");
       
          if(i < 2)
          System.out.println("-----------");
      }   
          System.out.println();
      
   }
                    
              
}       



   
   
   
    
