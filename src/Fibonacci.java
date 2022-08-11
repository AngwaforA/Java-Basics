public class Fibonacci {
    static int fib = 0;
    static int b = 1;
    static int f1, f2,f;
    public static int fib(int n)
    {
        if(n <= 2) return 1;
        return fib(n-1) + fib(n-2);
    }

    public static int fibIt(int n){
        if(n <= 2) return 1;
        for(int i = 0; i < n; i++){
            int temp = fib;
            fib = fib + b;
            b = temp;
        }
        return fib;
    }

    public static int fibInt2(int n){
        if(n<=2)return 1;
        int i = 3;
        f1 = 1;
        f2= 1;
        while(i <= n){
            f = f1 + f2;
            f1 = f2;
            f2 = f;
            i++;
        }
        return f2;
    }
    public static void main(String[] args){
        System.out.println(fib(5));
        System.out.println(fibIt(8));
        System.out.println(fibInt2(5));
    }
}

