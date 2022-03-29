import java.util.StringTokenizer;


public class Example {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("java");
        System.out.println(sb.append("Wellcome"));
        for(int i=0;i<10000;i++){
            sb.append("point");
        }
        System.out.println("Time taken by StringBuffer. "+(System.currentTimeMillis()-startTime)+"ms");
        
        
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("java");
        System.out.println(sb2.append("Wellcome"));
        for(int i=0;i<10000;i++){
            sb2.append("point");
        }
        System.out.println("Time taken by StringBuilder "+(System.currentTimeMillis()-startTime)+"ms");

        StringTokenizer st = new StringTokenizer("this is a class");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        String z = "Wellcome to the class";
        System.out.println("length of the string "+z.length());
        System.out.println("Substring "+z.substring(4, 7));
        String so[] = z.split("\\s");
        
        for(String d: so){
            System.out.println(d);
        }

        System.out.println("Replaced String "+z.replace("class", "company"));

    }
    
}
