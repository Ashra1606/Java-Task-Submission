public class Wallet_5 {
    public final int id;
    int balance;
    String lastWithdrawMode;
    Wallet_5 (int id)
    {
        this.id=id;
        this.balance=0;
    }
    Wallet_5 (int id,int amount)
    {
        this.id=id;
        this.balance=amount;
    }
    int addBonus(int amount)
    {
        this.balance+=amount;
        return this.balance;
    }
    public static void swap(Wallet_5 w1, Wallet_5 w2) {
        int tempBalance = w1.balance;
        w1.balance = w2.balance;
        w2.balance = tempBalance;
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
        this.lastWithdrawMode="Normal";
        return this.balance;
    }
    int withdraw(int amount,String mode)
    {
        if(balance<amount)
        {
            System.out.println("Insufficient Balance");
            return this.balance;
        }
        this.balance-=amount;
        this.lastWithdrawMode=mode;
        return this.balance;
    }
}
class Wallet{
    static void main(String[] args) {
        Wallet_5 wallet1 = new Wallet_5(1001, 5000);
        Wallet_5 wallet2 = new Wallet_5(1002, 3000);
        wallet1.withdraw(500);
        System.out.println("Wallet 1 Last Mode: " + wallet1.lastWithdrawMode);

        wallet2.withdraw(200, "ATM");
        System.out.println("Wallet 2 Last Mode: " + wallet2.lastWithdrawMode);
        Wallet_5.swap(wallet1, wallet2);
        wallet1.withdraw(100, "ONLINE");
        System.out.println("Wallet 1 Last Mode: " + wallet1.lastWithdrawMode);
    }
}