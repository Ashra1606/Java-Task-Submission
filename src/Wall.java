public class Wall {
    public static int balance;

    static {
        balance = 100;
        System.out.println("Static balance " + balance);
    }

    {
        balance = 900;
        System.out.println("Instance balance " + balance);
    }

    Wall() {
        balance = 50;
        System.out.println("Constructor balance " + balance);
    }

    {
        balance = 700;
        System.out.println("Instance 2 " + balance);
    }

    public static void main(String[] args) {
        Wall w1 = new Wall();
    }
}