public class wallet3 {
    public final int id;
    int balance;
    wallet3(int id)
    {
        this.id=id;
        this.balance=0;
    }
    wallet3(int id,int amount)
    {
        this.id=id;
        this.balance=amount;
    }
    int deposit(int amount)
    {
        this.balance+=amount;
        return this.balance;
    }
    int withdraw(int amount)
    {
        if(balance<amount)
        {
            System.out.println("Insufficient Balance");
            return this.balance;
        }
        this.balance-=amount;
        return this.balance;
    }
}
class wallet{
    static void main(String[] args) {
        wallet3 wallet=new wallet3(1001);
        wallet.deposit(100);
        wallet.withdraw(200);
        System.out.println(wallet.balance);
    }
}

