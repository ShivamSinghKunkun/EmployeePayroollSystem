package EmployeePayroollSystem;

public class Main {
    public static void main(String[] args) {
        PayrollSyatem payrollSyatem=new PayrollSyatem();
        FullTimeEmployee emp1= new FullTimeEmployee("vikash", 1, 70000);
        PartTimeEmployee emp2=new PartTimeEmployee("Alexander", 2, 40, 100);

        payrollSyatem.addEmployee(emp1);
        payrollSyatem.addEmployee(emp2);

        System.out.println("Initial Employee Detalis :");
        payrollSyatem.displayEmployee();
        System.out.println("Remove Employee");
        payrollSyatem.removeEmployee(2);
        System.out.println("Remaining Employee Details");
        payrollSyatem.displayEmployee();
    }
}
