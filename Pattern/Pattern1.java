
public class Pattern1 {
    public static void main(String[] args) {
        /* using for and while loop print the following pattern

         *
         * *
         * * *
         * * * *
         * * * * *

        */


        //By using for loops:
        System.out.println("\nThis is print by using for loops:\n");
        for (int i=1;i<=5;i++){
          for (int j=1;j<=i;j++){
            System.out.print("* ");
          }
          System.out.println("");
        }
        
        
        //By using while loops:
        System.out.println("\nThis is print by using while loops:\n");
        int i=1;
        int j=1;
        while(i<=5){
          while(j<=i){
            System.out.print("* ");
            j+=1;
          }
          System.out.println("");
          i+=1;
          j=1;
        }
        
    }
    
}
