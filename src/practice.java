class base{
    base()
    {
        System.out.println("I am a constructor");
    }
    int x;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
class derived extends base{
    derived()
    {
        System.out.println("I am a derived class of constructor");
    }
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
class child extends  derived{
    child()
    {
        System.out.println(" I am a child of derived class of constructor");
    }
}
public class practice {
    public static void main(String[] args)
    {
        //base b= new base();
        //b.setX(4);
        //System.out.println(b.getX());

        //derived d=new derived();
        //System.out.println(d.getX());
       // d.setX(6);
       //System.out.println(d.getX());
        //d.setY(5);
        //System.out.println(d.getY());
    }
}
