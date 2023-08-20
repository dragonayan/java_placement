public class Fibonacci {
    public static int func(int number) {
        if (number == 0)
            return 0;
        if (number == 1)
            return 1;
            
        return func(number - 1) + func(number - 2);
    }

    public static void main(String[] args) {
        int number = 7;
        for(int i=0;i<7;i++){
            System.out.print(func(i)+" ");
        }
    }
}
