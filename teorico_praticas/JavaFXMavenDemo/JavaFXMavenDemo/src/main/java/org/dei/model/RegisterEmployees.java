package org.dei.model;

import java.util.HashSet;
import java.util.Set;

public class RegisterEmployees {
    
    private final Set<Employee> setEmployees;

    public RegisterEmployees() {
        setEmployees = new HashSet<>();
    }

    public Set<Employee> getEmployees() {
        return setEmployees;
    }
    
    public String getEmployeesAsString() {
        StringBuilder employees = new StringBuilder();
        
        for (Employee employee : setEmployees) {
            employees.append(employee);
            employees.append("\n");
        }
        
        employees.deleteCharAt(employees.length()-1);
        
        return employees.toString();
    }
    
    public Employee newEmployee(int number, String name, Category category) {
        return new Employee(number, name, category);
    }

    public boolean validEmployee(Employee employee){
        return !setEmployees.contains(employee);
    }
    
    public boolean addEmployee(Employee employee){
        return setEmployees.add(employee);
    }
    
    public Employee getEmployeeByNumber(int number) {
        for (Employee employee : setEmployees) {
            if (employee.getNumber()==number) {
                return employee;
            }
        }
        throw new IllegalArgumentException("Invalid number!");
    }

}
