class bankaaccount {
    private double balance;
    public bankaaccount deposit(double amount)
    {
        System.out.println(amount +" has benn deposited.");
        this.balance+=amount;
        return this;
    }
    public bankaaccount withdraw(double amount)
    {
        if(amount>this.balance)
        {
            System.out.println("Not enough balance.");
        }
        else{
            System.out.println(amount+ " has been withdrawn.");
            this.balance-=amount;
        }
        return this;
    }
    public void getbalance()
    {
        System.out.println("Your current balance is "+this.balance);
    }
    public static void main(String[] args) {
        bankaaccount Acc=new bankaaccount();
        Acc.getbalance();
        Acc.deposit(2000);
        Acc.withdraw(3000);
        Acc.getbalance();
        Acc.withdraw(500);
        Acc.getbalance();
        Acc.deposit(200).withdraw(100).getbalance();
    }
}
