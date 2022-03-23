public class Arr{
    public static void main(String[] args) {
        System.out.println("Traversing of 5D Array");
int [][][][][] arr = {{{{{23}}},{{{1,32,54,23}}}}, {{{{45,76,98,56,43}}}}, {{{{2,5,8,90,45,23,56,56,}}}}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    for(int l=0;l<arr[i][j][k].length;l++){
                        for(int m=0;m<arr[i][j][k][l].length;m++){
                            System.out.println("arr["+i+"]["+j+"]["+k+"]["+l+"]["+m+"] = "+arr[i][j][k][l][m]);
                        }
                    }
                }
            }
            System.out.println("");
        }

        // for(int i[][][][]:arr){
        //     for(int j[][][]:i){
        //         for(int k[][]:j){
        //             for(int l[]:k){
        //                 for(int m:l){
        //                     System.out.print(m+" ");
        //                 }
        //             }
        //         }
        //     }
        //     System.out.println("");
        // }
    }
}