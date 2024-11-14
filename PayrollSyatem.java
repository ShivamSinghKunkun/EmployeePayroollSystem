package EmployeePayroollSystem;

import java.util.ArrayList;

class PayrollSyatem{
    private ArrayList<Employee> employeeList;

    public PayrollSyatem(){
        employeeList=new ArrayList<>();
    }
    public  void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id){
        Employee employeeToRemove=null;
        for (Employee employee: employeeList){
            if(employee.getId()==id){
                employeeToRemove=employee;
                break;
            }
        }
        if(employeeToRemove !=null){
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployee(){
        for (Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}