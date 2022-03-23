import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        float a = sc.nextFloat();
        System.out.println("Enter operation to Perform(+,-,*,/,%)");
        char c = sc.next().charAt(0);
        System.out.println("Enter num2:");
        float b = sc.nextFloat();
        System.out.print("result: ");
        switch(c){
            case '+':
            float sum = a+b;
            System.out.println(sum);
            break;

            case '-':
            float dif = a-b;
            System.out.println(dif);
            break;

            case '*':
            float mul = a*b;
            System.out.println(mul);
            break;

            case '/':
            float div = a/b;
            System.out.println(div);
            break;
            
            case '%':
            float rem = a%b;
            System.out.println(rem);
            break;

            default:
            System.out.println("Invelid input");
        }
    }
    
}
