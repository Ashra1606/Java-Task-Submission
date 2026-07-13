import  java.util.Scanner;

public class gradeAward {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double grade= scanner.nextDouble();
        if(grade>=3.75)
        {
            System.out.println("You have completed this semester and got a letter grade!");
        }
        else if(grade>=3.5)
        {
            System.out.println("You have completed this semester and got a letter grade!");
        }
        else{
            System.out.println("You have completed this semester but didn't get a letter grade.");
        }
    }
}