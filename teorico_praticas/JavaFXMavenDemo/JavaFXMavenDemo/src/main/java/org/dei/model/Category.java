package org.dei.model;

import java.util.Objects;

public class Category {

    private String id;
    private String description;

    public Category(String id, String description) {
        setId(id);
        setDescription(description);
    }
    
    public Category(Category otherCategory){
        this.id = otherCategory.id;
        this.description = otherCategory.description;
    }

    public String getId() {
        return this.id;
    }

    public String getDescription() {
        return description;
    }
    
    private void setId(String id){
        if(id==null || id.isEmpty())
            throw new IllegalArgumentException("Invalid id!");
        this.id = id;
    }
    
    private void setDescription(String description){
        if(description==null || description.isEmpty())
            throw new IllegalArgumentException("Invalid description!");
        this.description = description;
    }
    
    @Override
    public String toString() {
        return String.format("ID: %s  Description: %s", this.id, this.description);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final Category otherCategory = (Category) otherObject;
        return Objects.equals(this.id, otherCategory.id);
    }
    
}
