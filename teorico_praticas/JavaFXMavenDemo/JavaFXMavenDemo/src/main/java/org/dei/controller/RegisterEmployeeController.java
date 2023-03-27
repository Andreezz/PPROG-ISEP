package org.dei.controller;

import org.dei.model.Category;
import org.dei.model.Company;
import org.dei.model.Employee;
import java.util.Set;

public class RegisterEmployeeController {

    private final ApplicationEM applicationEM;
    private final Company company;
    private Employee employee;

    public RegisterEmployeeController() {
        this.applicationEM = ApplicationEM.getInstance();
        this.company = applicationEM.getCompany();
        this.employee = null;
    }

    public String getEmployee() {
        return employee != null ? employee.toString() : null;
    }

    public String getNumber() {
        return employee != null ? String.valueOf(employee.getNumber()) : null;
    }
    
    public String getName() {
        return employee != null ? employee.getName() : null;
    }
    
    public String getCategory() {
        return employee != null ? employee.getCategory().toString() : null;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee newEmployee(int number, String name, Category category) {
        this.employee = company.getRegisterEmployees().newEmployee(number, name, category);
        return this.employee;
    }

    public Employee newEmployee(int number, String name, String category) {
        Category categoryReference = company.getRegisterCategories().getCategoryByStringValue(category);

        this.employee = company.getRegisterEmployees().newEmployee(number, name, categoryReference);
        return this.employee;
    }

    public boolean registerEmployee() {
        if (company.getRegisterEmployees().validEmployee(this.employee)) {
            return company.getRegisterEmployees().addEmployee(this.employee);
        }
        return false;
    }

    public Set<Category> getCategories() {
        return company.getRegisterCategories().getCategories();
    }

    public Set<String> getCategoriesAsStringSet() {
        return company.getRegisterCategories().getCategoriesAsStringSet();
    }

}
