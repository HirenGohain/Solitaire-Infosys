import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f, g, h, i, j;
        System.out.println("Enter 10th numbers:");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d =  sc.nextInt();
        e = sc.nextInt();
        f =  sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();
        i = sc.nextInt();
        j = sc.nextInt();

        System.out.println("Your numbers are:\n"+a+","+b+","+c+","+d+","+e+","+f+","+g+","+h+","+i+","+j);
        System.out.println("The greatest number is:");

        if(a>=b&&a>=c&&a>=d&&a>=e&&a>=f&&a>=g&&a>=h&&a>=i&&a>=j){
            System.out.println(a);
        }
        else if(b>=a&&b>=c&&b>=d&&b>=e&&b>=f&&b>=g&&b>=h&&b>=i&&b>=j){
            System.out.println(b);
        }
        else if(c>=b&&c>=a&&c>=d&&c>=e&&c>=f&&c>=g&&c>=h&&c>=i&&c>=j){
            System.out.println(c);
        }
        else if(d>=b&&d>=c&&d>=a&&d>=e&&d>=f&&d>=g&&d>=h&&d>=i&&d>=j){
            System.out.println(d);
        }
        else if(e>=b&&e>=c&&e>=d&&e>=a&&e>=f&&e>=g&&e>=h&&e>=i&&e>=j){
            System.out.println(e);
        }
        else if(f>=b&&f>=c&&f>=d&&f>=e&&f>=a&&f>=g&&f>=h&&f>=i&&f>=j){
            System.out.println(f);
        }
        else if(g>=b&&g>=c&&g>=d&&g>=e&&g>=f&&g>=a&&g>=h&&g>=i&&g>=j){
            System.out.println(g);
        }
        else if(h>=b&&h>=c&&h>=d&&h>=e&&h>=f&&h>=g&&h>=a&&h>=i&&h>=j){
            System.out.println(h);
        }
        else if(i>=b&&i>=c&&i>=d&&i>=e&&i>=f&&i>=g&&i>=h&&i>=a&&i>=j){
            System.out.println(i);
        }
        else {
            System.out.println(j);
        }
        
    }
    
}
