public class Test {
    Test t;
    int[] a = {1,14,3,12,6,7,9};
    int s = 0;
    int m = 0;
    public int mul() {
        if (m == 0 && a[m]%2 == 0) {
            return a[m];
        }
        m++;
        if (a[m] % 2 == 0) {
            s = 2 * s + a[m];
            return s;
        }
        m++;
        return mul();
    }
    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t.mul());

    }
}
