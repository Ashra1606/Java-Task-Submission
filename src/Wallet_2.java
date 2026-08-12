public class Wallet_2 {
    String last_withdraw="None";
    private static int counter=0;
    private final int id=counter++;
    private  int balance;
    public Wallet_2(int balance)
    {
        this.balance=balance;
    }
    public Wallet_2()
    {
        this.balance=0;
    }
    public void deposit(int amount)
    {
        this.balance+=amount;
    }
    public void withdraw(int amount)
    {
        if(amount>this.balance)
        {
            System.out.println("Insufficient Balance");
        }
        else{
            this.balance-=amount;
            this.last_withdraw="Normal";
        }
    }
    public void withdraw( int amount, String mode)
    {
        if (amount > this.balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            this.balance -= amount;
            this.last_withdraw = mode;
        }
    }
    public double getBalance()
    {
        return balance;
    }
    public int getId(){
        return id;
    }
    public void display()
    {
        System.out.println("Id: "+ this.id + " Balance :"+this.balance+ " Mode: "+this.last_withdraw);
    }
}
class WalletApp{
   public static void main(String[] args) {
        Wallet_2 wallet1=new Wallet_2(1000);
        Wallet_2 wallet2=new Wallet_2(500);
        Wallet_2 wallet3 =new Wallet_2();

        wallet1.deposit(300);
        wallet2.withdraw(10,"ATM");
        wallet1.display();
        wallet2.display();
        wallet3.display();
    }
}