public class Account {
    private int num;
    private double amount;
    public Account(int num, double amount){
        this.num = num;
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }
    public void deposite(double amount){
        this.amount += amount;
    }
    public void withdraw(double amount){
        this.amount -= amount;
    }
    public String toString(){
        String s1 = "Das Konto mit dem Nummer " ;
        String s2 = " hat einen Betrag von ";
        return s1 + this.num + s2 + this.amount%2f + "Euro";
    }

    public static void main(String[] args){
        Account a = new Account(23,566);
        System.out.println(a.toString());
    }
}
