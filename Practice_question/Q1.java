import java.util.ArrayList;

/*
Given an unsorterd array A of size N that contains only non-negative integers,
find a continuous sub-array which adds to a given numbers S.

In case of multiple subarrays, return the subarray which comes first on moving
from left to right.

Example:

    Input:
    N = 5;  S = 12;
    A[] = {1,2,3,7,5}

    Output: 2 4

    Explanation: The sum of elements from
    2nd position to 4th position is 12.


    
*/

class ContinousSubArray{
    ArrayList<Integer> subArray(int a[],int n,int s){
        ArrayList<Integer> ls = new ArrayList<>();
        int sum=0;
        boolean get=false;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){   
                sum= sum+a[j];
                if(sum<s){
                    continue;
                }
                else if(sum==s){
                    get = true;
                    ls.add(i+1);
                    ls.add(j+1);
                }
                else{
                    break;
                }
            }
            sum=0;
            if(get){
                break;
            }
        }
        
        return ls;
    }
}

public class Q1 {
    public static void main(String[] args) {
        ContinousSubArray ob = new ContinousSubArray();
        int [] A = {1,2,3,7,5};
        int N = A.length;
        int S = 12;

        System.out.println(ob.subArray(A, N, S));
    }
}
