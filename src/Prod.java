import javax.swing.table.TableRowSorter;

public class Prod {
    Prod prod;
    int[] a = {1,2,4,5};
    int p = 1;
    int i ;
    int x = 5;
    public  boolean product(){
        if(x == a[0]){return true;}
        for(i = 1; i <= a.length-1; i++){
            p = p*a[i];
            if(p == x){
                return true;
            }
        }
        return p == x;
    }
    public static void main(String[] args){
        Prod prod = new Prod();
        System.out.println(prod.product());
    }
}
