class Employee{
    public String name;
    public int id;
    public  String department;
    public int salary;
    public int calculatePay()
    {
        return salary;
    }
}
class FullTimeEmployee extends Employee{
    public int extra;
    public double calculatePay(int extra)
    {
        return salary+extra;
    }
}
class PartTimeEmployee extends Employee{
    public double hourlyRate;
    public int hoursWorked;
    public double calculatePay(double hourlyrate,int hoursWorked)
    {
        return salary+(hourlyrate*hoursWorked);
    }
}
class ContractEmployee extends Employee{
    public String projectName;
    public double contractAmount;
    public int calculatePay(int contractAmount)
    {
        return salary+contractAmount;
    }
}
public class PracticeProblem8a {
    static void main() {
        ContractEmployee Aa= new ContractEmployee();
        Aa.salary=10000;
        System.out.println(Aa.calculatePay(5000));
    }
}
