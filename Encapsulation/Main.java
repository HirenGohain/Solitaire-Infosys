/* This program is not support in V.S Code cause if we run the program then VS code run only the public class but in this program
main methods in another class. To run this code we have to write the following code in vs code terminals;
    java Dout;
*/

public class Main {
    void message(){
        System.out.println("hello");
    }
}

class Dout{
    public static void main(String[] args) {
        Main ob = new Main();
        ob.message();
    }
}
