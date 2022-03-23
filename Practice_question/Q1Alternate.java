import java.util.*;


class SubArr{


    ArrayList<Integer> subArray(int arr[],int l,int s){
        ArrayList<Integer> ls = new ArrayList();
        int sum = 0;
        int fIndex = 0;

        for(int i=0;i<l;i++){
            if(sum<s){
                sum=sum+arr[i];
                System.out.println("small");
            }
            else if(s==sum){
                System.out.println("equal");
                ls.add(fIndex);
                ls.add(i);
                break;
            }                  // 1, 2, 3, 7, 5
            else{
                System.out.println("gerater");
                sum=sum-arr[fIndex];
                fIndex++;
                System.out.println(sum);
            }

        }

        return ls;
    }
    

}


public class Q1Alternate {

    public static void main(String[] args) {
        SubArr ob = new SubArr();
       int [] Ar = {1,2,3,7,5};
       int L = Ar.length;
       int S = 12;


       System.out.println(ob.subArray(Ar, L, S));
    }
    
}
