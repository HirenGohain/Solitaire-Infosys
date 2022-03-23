class Solution{
    int [] arrayReverce(int arr[]){
        int [] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = temp[temp.length-i-1];
        }
        return arr;
    }
}


public class ReverseAnArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int myArray[] = {1,2,3,4,5,6,7,8,9};

        System.out.println("Array element before reversing");
        for(int e:myArray){
            System.out.print(e+" ");
        }

        s.arrayReverce(myArray);

        System.out.println("\nArray element after reversing");
        for(int e:myArray){
            System.out.print(e+" ");
        }
    }
    
}
