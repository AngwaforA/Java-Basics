import java.util.Arrays;

public class Laeti {
    static int[] a = {2,6,1,0,6,8,17,9,5};
    public static int[] so(){
        int[] b = new int[a.length];
        for(int i = 0; i < a.length; i++){
            for(int j= i; j< a.length; ++j) {
                if(a[i] >= a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                b[i] = a[i];
            }

        }
        return b;

    }
    public String toString(){
        String s = "";
        return s + Arrays.toString(so());

    }
    public static void main(String[] args){
        Laeti laeti = new Laeti();
        System.out.println(Arrays.toString(so()));

    }
}
