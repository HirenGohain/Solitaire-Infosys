import java.util.ArrayList;

/*  ArrayList is a part of collection framework; it provide us a dynamic in java.

    add(element):
                this methods is used to add an element in ArrayList
                example:
                    ArrayList<Integer> obj = new ArrayList<Integer>();
                    obj.add(78);
                    
    add(index,element):
                this methods is used to add an element in a particular index of ArrayList
                example:
                    ArrayList<Integer> obj = new ArrayList<Integer>();
                    obj.add(2,78);

    remove(index):
                this methods is used to remove an element from a particular index
                example:
                    obj.remove(2);  // where 2 is the index position of the element

    clear():
                this methods is used to remove all elements from ArrayList
                example:
                    obj.clear();

    get(index):
                this methods is used to get the element of a particular index.

*/



public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<Integer>();       // creating an object of Integer type ArrayList
        ls.add(23);
        ls.add(24);                                             // add value to ArrayList using add methods
        ls.add(34);
        System.out.println(ls);                                 // printing the list

        ls.add(1, 45);                                          // add element to ArrayList in index[1]
        System.out.println(ls);

        ls.remove(2);                                           // remove element from index[2]
        System.out.println(ls);

        // ls.clear();                                          // remove all elements from list
        // System.out.println(ls);

        System.out.println(ls.isEmpty());
        System.out.println(ls.size());
        System.out.println(ls.get(2));

    }
    
}
