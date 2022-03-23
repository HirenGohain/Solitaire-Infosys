public class Pattern2 {
    public static void main(String[] args) {

        /* Print the following Pattern
                      *
                    * *
                  * * *
                * * * *
              * * * * *
        */

        // By using for loops:
        System.out.println("\nBy using for loops:");

        for (int i=1;i<=5;i++){
          for (int j=1;j<=5;j++){
            if(j<=5-i){
              System.out.print(" ");
            }
            else
            System.out.print("*");
          }
          System.out.println("");
        }

        // Alternat
        for (int i=1;i<=5;i++){
          for (int j=5-1;j>=i;j--){
            System.out.print(" ");
          }
          for(int j = 1;j<=i;j++){
            System.out.print("*");
          }
          System.out.println("");
        }
        
        // By using while loops:
        System.out.println("\nBy using while loops:");

        int i=1;
        int j=1;
        while(i<=5){
          while(j<=5){
            if(j<=5-i){
              System.out.print(" ");
            }
            else{
              System.out.print("*");
            }
            j+=1;
          }
          System.out.println("");
          i++;
          j=1;
        }
    }
    
}
