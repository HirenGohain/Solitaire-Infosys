import java.util.StringTokenizer;

/*
-> this class present in java.util package
-> used to break a String into tokens
    token are nothing but substring of String. For example let take a example of a String "abc xyz"
    here "abc" and "xyz" are two token separate by delimiters " ".

Constructor:
    * StringTokenizer(String str)
    * StringTokenizer(String str,String delim)
    * StringTokenizer(String str,String delim,boolean returnvalue)

Methods:
    * boolean hasMoreTokens()                       // check the availability of tokens.
    * String nextToken()                            // return the next token.
    * String nextToken(String delim)                // return the next token based on delimiter.
    * boolean hasMoreElements()                     // same as hasMoreTokens() methods.
    * Object nextElemant()                          // same as nextToken() but its return types is Object.
    * int countTokens()                             // count the total number of tokens.






*/


public class StringTokenizerExample {
    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("My name is Hiren Buragohain");

        System.out.println(str.countTokens());                  // it give output 5s

        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }

        System.out.println(str.countTokens());                  // it give output 0

    }
    
}
