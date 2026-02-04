public class Inc_Decrement {
    public static void main(String args[]) {
        int a = 5;
       int  b=++a + a++;
        System.out.println("Value of (b=++a +a++) when a=5, after pre and post increment operations: " + b);
        

        int x=10;
        int y=--x - x--;
        System.out.println("Value of (y=--x - x--) when x=10, after pre and post decrement operations: " + y);
    }}
