import java.util.*;

class Solve{
    ArrayList<Integer> arrayConcadination(){
        ArrayList<Integer> arr = new ArrayList();
        ArrayList<Integer> ls = new ArrayList();
        Set<Integer> s = new HashSet<>();
        s.add(8);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        ls.add(6);
        ls.add(7);
        arr.addAll(ls);
        arr.addAll(s);

        return arr;
    }
}

public class TryFor {
    public static void main(String[] args) {
        Solve s = new Solve();
        System.out.println(s.arrayConcadination());
    }
    
    
}
