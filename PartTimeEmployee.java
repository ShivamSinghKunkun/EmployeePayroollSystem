package EmployeePayroollSystem;

class PartTimeEmployee extends  Employee{
    private  int hoursWork;
    private double hoursRate;

    PartTimeEmployee(String name, int id, int hoursWork, double hoursRate){
        super(name, id);
        this.hoursRate=hoursRate;
        this.hoursWork=hoursWork;
    }

    @Override
    public double calculateSalary(){
        return hoursWork*hoursRate;
    }
}