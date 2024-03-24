public class features {
    public static void drawBoard(String one, String two, String three, String four, String five, String six, String seven, String eight, String nine){
      System.out.println();  
      System.out.println(" " + one + " | " + two + " | " + three + " ");
      System.out.println("---|---|---");
      System.out.println(" " + four + " | " + five + " | " + six + " ");
      System.out.println("---|---|---");
      System.out.println(" " + seven + " | " + eight + " | " + nine + " ");
    }

    public static boolean checkBlock(String block){
        if(block.equals("X") || block.equals("O")){
            System.out.println("That block is already taken. Re-enter number: ");
            return false;
        } else{
            return true;
        }
    }

    public static void checkWinner(String one, String two, String three, String four, String five, String six, String seven, String eight, String nine, String symbol, String player){
        if((one.equals(symbol) && two.equals(symbol) && three.equals(symbol)) || 
         (four.equals(symbol) && five.equals(symbol) && six.equals(symbol)) || 
         (seven.equals(symbol) && eight.equals(symbol) && nine.equals(symbol)) || 
         (one.equals(symbol) && five.equals(symbol) && nine.equals(symbol)) || 
         (three.equals(symbol) && five.equals(symbol) && seven.equals(symbol)) ||
         (two.equals(symbol) && five.equals(symbol) && eight.equals(symbol)) ||
         (one.equals(symbol) && four.equals(symbol) && seven.equals(symbol)) ||
         (three.equals(symbol) && six.equals(symbol) && nine.equals(symbol))){
         System.out.println();  
         drawBoard(one, two, three, four, five, six, seven, eight, nine);
         System.out.println();  
         System.out.println("Player " + player + " wins!");
         System.exit(0);
      } else if((one.equals("X") || one.equals("O")) &&
        (two.equals("X") || two.equals("O")) &&
        (three.equals("X") || three.equals("O")) &&
        (four.equals("X") || four.equals("O")) &&
        (five.equals("X") || five.equals("O")) &&
        (six.equals("X") || six.equals("O")) &&
        (seven.equals("X") || seven.equals("O")) &&
        (eight.equals("X") || eight.equals("O")) &&
        (nine.equals("X") || nine.equals("O"))){
        System.out.println();  
        drawBoard(one, two, three, four, five, six, seven, eight, nine);
        System.out.println();
        System.out.println("It's a tie");
        System.exit(0);
      }
    }
}
