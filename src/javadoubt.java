class Student{
    String name;
}
class University{
    void admitstud(Student ref) {
        ref.name = "Guest";
    }
}
class Passing{
    public static void main(String[] args) {
        Student std=new Student();
        std.name="Ashra";
        System.out.println(std.name);
        University sust=new University();
        sust.admitstud(std);
        System.out.println(std.name);
    }
}