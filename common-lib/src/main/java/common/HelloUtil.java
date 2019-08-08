package common;

public class HelloUtil {
    
    public static void main (String[] args) {
     System.out.println(hello(args[0]));   
    }

    public static String hello(String hello) {
        return String.format("Hello %s", hello);
    }

}