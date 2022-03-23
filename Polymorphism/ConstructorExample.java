
class Example{

    int age;
    Example(){
        System.out.println("hello");
    }

    Example(int a){
        this.age = a;
        System.out.println("hello"+a);
    }

    Example(Example name){                  // copy constructor take input as object of other construstor;
        System.out.println("copy constructor");
        age=name.age;
        System.out.println(age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Example bj = new Example();
        Example ob = new Example(1);
        Example o = new Example(ob);
        
    }
    
}
