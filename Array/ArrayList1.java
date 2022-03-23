import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hiren");
        list.add("ranjit");
        list.add("manjit");


        System.out.println(list);


        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(23);
        num.add(45);
        num.add(98);

        System.out.println(num);

        ArrayList<Character> c= new ArrayList<Character>();
        c.add('c');
        c.add('d');
        c.add('e');

        System.out.println(c);
    }
    
}
