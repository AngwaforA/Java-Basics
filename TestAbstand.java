public class TestAbstand {
    //Überprüfung vom Abstand zwischen benachbarten Zahlen in einem Array.
    static public boolean auf2(int[] a){
        int i = 0;
        while(i < a.length-1){
            int b = Math.abs(a[i] - a[i+1]);
            i++;
            if(b < 100 )return false;
        }
        return true;
    }

    //Summe von den ersten n Zahlen in einem Array.
    static public int auf3(int n){
        if(n == 1)return 1;
        return auf3(n-1) + n;
    }

    //Die Summe und Anzahl von Geraden Zahlen in einem Array.
    static public int auf3(int[] a){
        int s = 0;
        int count = 0;
        for(int j = 0; j < a.length; j++){
            if(a[j]%2 == 0) {
                s += a[j];
                count ++;
            }
        }
        System.out.println("Anzahl von geraden Zahlen :" + count);
        return s;
    }
   /* static public int auf4(int[] a, int higherbound){
        int lowerBound = 0;
        int s = a[lowerBound];
        if(lowerBound > higherbound) {
            return s;
        }
        lowerBound += 1;
        return s + auf4(a, higherbound);
    } */

    public static void main(String[] args){
        System.out.println(auf3(10));
        System.out.println(auf2(new int[]{-200,300,200,30,400,10}));
        System.out.println(auf3(new int[]{1,2,3,4,5,6}));
        //System.out.println(auf4(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
    }
}

