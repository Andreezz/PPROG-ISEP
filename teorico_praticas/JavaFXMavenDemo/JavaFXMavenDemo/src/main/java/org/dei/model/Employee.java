package org.dei.model;

public class Employee {

    private int number;
    private String name;
    private Category category;

    public Employee(int number, String name, Category category) {
        setNumber(number);
        setName(name);
        setCategory(category);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }
    
    private void setName(String name) {
        if(name==null || name.isEmpty())
            throw new IllegalArgumentException("Invalid name!");
        this.name = name;
    }

    private void setNumber(int number) {
        if(number<1)
            throw new IllegalArgumentException("Invalid number!");
        this.number = number;
    }

    private void setCategory(Category category) {
        if(category==null)
            throw new IllegalArgumentException("Invalid category!");
        this.category = category;
    }
    
    @Override
    public String toString() {
        return String.format("Number: %d%nName: %s%nCategory: %s", 
                this.number, this.name, this.category);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.number;
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
        final Employee otherEmployee = (Employee) otherObject;
        return this.number == otherEmployee.number;
    }
    
}
