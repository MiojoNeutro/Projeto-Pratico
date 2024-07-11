public class Main {
    public static void main(String[] args) {
        //Write a Java program to swap two variables.

        int a = 8, b = 32, cache;

        cache = a;
        a = b;
        b = cache;

        System.out.println(a+" "+b);
    }
}