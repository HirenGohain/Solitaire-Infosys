
public class Pattern4 {
    public static void main(String[] args) {
        /*  Write a program to print the following program
                        *
                       * * 
                      * * *
                     * * * *
                    * * * * *
                     * * * *
                      * * * 
                       * * 
                        *
        */
        
        // By using for loops:
        System.out.println("By  using for loops:\n");
        for ( int i=1;i<=5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<5;j++){
                System.out.print(" *");
            }
            System.out.println("");
        }


        // By using while loops:
        System.out.println("By  using while loops:\n");
        int i=1, j=0;
        while(i<=5){
            while(j<5){
                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println("");
            j=i;
            i++;
        }
        i=1;
        j=0;
        while(i<5){
            while(j<=i){
                System.out.print(" ");
                j++;
            }
            // j=1;
            while(j<=5){
                System.out.print("* ");
                j++;
            }
            System.out.println("");
            j=0;
            i++;
        }
    }
    
}
