public class ExceptionExample {
    /* there are five keyword in exception handling
        try
        catch
        throw 
        throws
        finally

    */


    void print(){
        System.out.println("this is a method");
    }

    {
        System.out.println("hello java");
    }

    


    public static void main(String[] args) {
        ExceptionExample obj = new ExceptionExample();
        ExceptionExample ob = new ExceptionExample();
        int a = 7;
        try {
            System.out.println(7/0);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("hello");
        }

        // System.out.println(a/0);

        System.out.println("program execute");
        obj.print();
    }
    
}
