public class DeleteArray {
    public static void main(String[] args) {
        char [] arr = new char[3];
        arr[0]='h';
        arr[1]='w';

        for(char a:arr){
            System.out.println(a);
        }

        float [] f= new float[3];
        f[0]=34.5f;
        f[2]=45;

        for(float i:f){
            System.out.println(i);
        }
    }
}
