package org.dei.model;

import java.util.Objects;

public class Company {

    private final String name;
    private final RegisterEmployees registerEmployees;
    private final RegisterCategories registerCategories;

    public Company(String name) {
        this.name = name;
        this.registerEmployees = new RegisterEmployees();
        this.registerCategories = new RegisterCategories();
    }

    public String getName() {
        return this.name;
    }

    public RegisterCategories getRegisterCategories() {
        return this.registerCategories;
    }

    public RegisterEmployees getRegisterEmployees() {
        return this.registerEmployees;
    }
    
    @Override
    public String toString() {
        return "Name:" + this.name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }
        final Company otherCompany = (Company) otherObject;
        return Objects.equals(this.name, otherCompany.name);
    }
    
}
