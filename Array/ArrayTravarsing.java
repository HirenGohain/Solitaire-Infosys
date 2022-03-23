public class ArrayTravarsing {


    static void smaller(int a[]){
        int small=Integer.MAX_VALUE;
        for(int element:a){
            if(small>element){
                small=element;
            }
        }
        System.out.println("the smallest element of array is: "+small);
    }

     void greater(int a[]){
        int greater=a[0];
        for(int element:a){
            if(greater<element){
                greater=element;
            }
        }
        System.out.println("the greatest element of array is: "+greater);
    }
    
    public static void main(String[] args) {
        int []arr={23,45,67,45,32,98,16,85};
        smaller(arr);
        ArrayTravarsing obj = new ArrayTravarsing();
        obj.greater(arr);

    }

}
