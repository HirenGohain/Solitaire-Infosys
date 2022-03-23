public class Pattern3 {
    public static void main(String[] argu) {
        /* Print the following Pattern:
                  *
                 * *
                * * *
               * * * *
              * * * * *
        */

        // By using for loops:
        for (int i=0;i<=5;i++){                 // loop for print numbers of rows;
            for(int j=5;j>=i;j--){              // loop for printing blank space;
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){             // loop for printing * ;
                System.out.print("* ");         // "* " or " *" to make the pattern like Pyramid
            }
            System.out.println("");             // for making a line break;
        }

        // Alternative way:
        for ( int i=0;i<=5;i++){                // loop for print numbers of rows;
            for (int j=1;j<=5;j++){             // loop for prin numbers of coloms;
                if(j<=5-i){                     // statement for printing blank space;
                    System.out.print(" ");
                }
                else{                           // statement for printing *;
                    System.out.print("* ");
                }
            }
            System.out.println("");             // for making a line break;
        }
    }
    
}
