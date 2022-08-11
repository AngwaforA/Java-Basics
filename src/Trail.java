import java.util.Arrays;

public class Trail {
    static int m = 0;
    int i;
    int n = 0;
    static int[] b =  new int[] {1,4,7,2,8,9};
    public static int[] algo(){
        if(m <= 5){
            if(b[m] < 2 || b[m]% 2 != 0){
                b[m] = 0;
            }
            m++;
            return algo();
        }
        return b;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(algo()));
    }
}
