import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {
      boolean player1Turn = true; 
      boolean gameOver = false;
      boolean valid = false;
      int userInput = 0;
      String x, o = "";
      Scanner sc = new Scanner(System.in);
      String one = "1";
      String two = "2";
      String three = "3";
      String four = "4";
      String five = "5";
      String six = "6";
      String seven = "7";
      String eight = "8";
      String nine = "9"; 
      System.out.println("Player 1 is X");
      System.out.println("Player 2 is O");
      System.out.println();
      System.out.println("Type the number that corresponds to your chosen place"); 

      do{
      if(player1Turn == true){

      features.drawBoard(one, two, three, four, five, six, seven, eight, nine);

      System.out.println();

      while(true){

      System.out.print("Player 1's turn. Where do you want to put X: ");
      userInput = sc.nextInt(); 
      x = String.valueOf(userInput);  
      if(x.equals("1")){
        valid = features.checkBlock(one);
        if(valid == true){
            one = "X";
            break;
        }
      } else if( x.equals("2")){
        valid = features.checkBlock(two);
        if(valid == true){
            two = "X";
            break;
        }
      } else if( x.equals("3")){
        valid = features.checkBlock(three);
        if(valid == true){
            three = "X";
            break;
        }
      } else if( x.equals("4")){
        valid = features.checkBlock(four);
        if(valid == true){
            four = "X";
            break;
        }
      } else if( x.equals("5")){
        valid = features.checkBlock(five);
        if(valid == true){
            five = "X";
            break;
        }
      } else if( x.equals("6")){
        valid = features.checkBlock(six);
        if(valid == true){
            six = "X";
            break;
        }
      } else if( x.equals("7")){
        valid = features.checkBlock(seven);
        if(valid == true){
            seven = "X";
            break;
        }
      } else if( x.equals("8")){
        valid = features.checkBlock(eight);
        if(valid == true){
            eight = "X";
            break;
        }
      } else if( x.equals("9")){
        valid = features.checkBlock(nine);
        if(valid == true){
            nine = "X";
            break;
        }
      }
      }
      
        features.checkWinner(one, two, three, four, five, six, seven, eight, nine, "X", "1");
      
      player1Turn = false;
     }  
     if(player1Turn == false){
      features.drawBoard(one, two, three, four, five, six, seven, eight, nine);
      System.out.println();
      while(true){
        System.out.print("Player 2's turn. Where do you want to put O: ");
        userInput = sc.nextInt(); 
        o = String.valueOf(userInput);  
        if(o.equals("1")){
          valid = features.checkBlock(one);
          if(valid == true){
              one = "O";
              break;
          }
        } else if( o.equals("2")){
            valid = features.checkBlock(two);
          if(valid == true){
              two = "O";
              break;
          }
        } else if( o.equals("3")){
            valid = features.checkBlock(three);
          if(valid == true){
              three = "O";
              break;
          }
        } else if( o.equals("4")){
            valid = features.checkBlock(four);
          if(valid == true){
              four = "O";
              break;
          }
        } else if( o.equals("5")){
            valid = features.checkBlock(five);;
          if(valid == true){
              five = "O";
              break;
          }
        } else if( o.equals("6")){
            valid = features.checkBlock(six);
          if(valid == true){
              six = "O";
              break;
          }
        } else if( o.equals("7")){
            valid = features.checkBlock(seven);
          if(valid == true){
              seven = "O";
              break;
          }
        } else if( o.equals("8")){
            valid = features.checkBlock(eight);
          if(valid == true){
              eight = "O";
              break;
          }
        } else if( o.equals("9")){
            valid = features.checkBlock(nine);
          if(valid == true){
              nine = "O";
              break;
          }
        }
        }

        features.checkWinner(one, two, three, four, five, six, seven, eight, nine, "O", "2");
      
      player1Turn = true;
     }
    } while(gameOver == false);
      sc.close();
    }

}