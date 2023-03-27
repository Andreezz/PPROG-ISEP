package org.dei.controller;

import org.dei.model.Company;

public class ShowEmployeesController {

    private final ApplicationEM applicationEM;
    private final Company company;

    public ShowEmployeesController() {
        this.applicationEM = ApplicationEM.getInstance();
        this.company = applicationEM.getCompany();
    }

    public String getEmployees() {
        return company.getRegisterEmployees().getEmployeesAsString();
    }
}
