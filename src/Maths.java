
class Maths {
    static double x  = 31;
    static double p = 6;
    static double m = 0;
    static double gesamtBetrag = 0;
    static int[] a = new int[10];
    public static double auf1(){
        if (x / p == 1 || x < p) {
            m += 1;
            return 1;
        } else {
            m = Math.ceil(x / p);
            return m;
        }
    }

    public static double auf1b(){
        double s = Math.floor(x/ p);
        return  x-(p *s);
    }

    public static boolean auf2(int x, int y){
        return y % x == 0;
    }



    public static void auf4(){
        double betrag = 1000;
        for(int i = 1; i <= 10; i++){
            gesamtBetrag = (0.025 * betrag) + betrag;
            betrag = gesamtBetrag;
        }
        System.out.println("your Balance is:" +  gesamtBetrag);
    }
    public static void auf5(){
        int[] b = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i <= 9; i++){
            for(int j = 0; j <= 9; j++){
                a[i] = b[j] * b[i];
                System.out.print( " " + a[i]);
            }
            System.out.println("\n");

        }
    }

    public static int auf6(int a){
        for(int bitLaenge = 31; bitLaenge >= 0; bitLaenge--){
            int result = a >> bitLaenge;
            if((result & 1) !=  0) {
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
        }
        System.out.println("\n");
        return  0;
    }


    public static void main(String[] args) {
        double res = auf1();
        double rem = auf1b();
        System.out.println("Number of classes: " + res);
        System.out.println("Number of PC in last class: " + rem);
        System.out.println(auf2(3, 7));
        auf4();
        auf5();
        System.out.println(auf6(8));

    }
}