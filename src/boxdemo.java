public class  boxdemo {
        int height;
        int widht;
        int depth;
        int volume=height*widht*depth;

        boxdemo(int h,int w,int d)
        {
            height=h;
            widht=w;
            depth=d;
        }
   public static void main(String[] args) {
        boxdemo box1=new boxdemo(10,5,15);

        int volume= box1.height * box1.widht* box1.depth;
       System.out.println(volume);
    }
}
