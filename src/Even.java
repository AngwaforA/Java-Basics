import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Even {
    int m = 1;
    int n ;
    int i ;
    int[] b = {1,3,4,2,7,8};
    int[] a = new int[b.length];
    static Even even;
    public  int[] algo(){
        int[] b = {1,3,4,2,7,8};
        if(m <= 5) {
            if (b[m] < 2 || b[m] % 2 != 0) {
                a[m] = 0;
            }
            else {
                a[m] = b[m];
            }
            m++;
            return algo();
        }
        return a;
    }
    public int calc(int[] a, int i){
        if(i == 0 && a[i]%2 == 0){
            n = 2*n + a[0];
            return n;
        }
        else{
            if(i < a.length ){
                if(a[i]%2 == 0){
                    n = 2*n + a[i];
                }
                i++;
            }
        }
        return calc(a,i) ;
    }
    public String toString(){
        String s = "";
        return s + Arrays.toString(algo());
    }


    public static void main(String[] args) {
        Even even = new Even();
        System.out.println(Arrays.toString(even.algo()));
        System.out.println(even.calc(even.algo(), 0));
    }
}
