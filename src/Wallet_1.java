public class Wallet_1 {
     static int deposit(int balance,int amount)
    {
        return balance+amount;
    }
    static int withdraw(int balance,int amount)
    {
        if(amount>balance)
        {
            System.out.println("Insufficient Balance!");
            return balance;
        }
        return balance-amount;
    }

    static void main(String[] args) {
        int balance_1=1500;
        int balance_2=500;
        balance_1=deposit(balance_1,100);
        System.out.println(balance_1);
        balance_2=withdraw(balance_2,200);
        System.out.println(balance_2);

    }
}
