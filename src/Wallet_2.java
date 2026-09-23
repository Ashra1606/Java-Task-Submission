public class Wallet_2 {
    private double balance;
    public Wallet_2()
    {
        this.balance=0;
    }
    public Wallet_2(double amount)
    {
        this.balance=amount;
    }
    public double deposit(int amount)
    {
        this.balance+=amount;
        return this.balance;
    }
    public double withdraw(int amount)
    {
        if(amount>this.balance)
        {
            System.out.println("Not Sufficient Balance");
        }
        this.balance-=amount;
        return this.balance;
    }

    public double getBalance() {
        return balance;
    }
}
class WalletApp{
   public static void main(String[] args) {
       Wallet_2 wallet2 = new Wallet_2();
       wallet2.deposit(5000);
       wallet2.withdraw(300);
       System.out.println(wallet2.getBalance());
       Wallet_2 wallet=new Wallet_2(500);
       System.out.println(wallet.getBalance());

   }
}