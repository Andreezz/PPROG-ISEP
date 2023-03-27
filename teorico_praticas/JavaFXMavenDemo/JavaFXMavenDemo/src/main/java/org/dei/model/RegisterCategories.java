package org.dei.model;

import java.util.HashSet;
import java.util.Set;

public class RegisterCategories {

    private final Set<Category> setCategories;

    public RegisterCategories() {
        setCategories = new HashSet<>();
    }

    public Set<Category> getCategories() {
        return setCategories;
    }
    
    public Set<String> getCategoriesAsStringSet() {
        Set<String> setCategoriesAsString = new HashSet<>();
        
        for (Category category : setCategories) {
            setCategoriesAsString.add(category.toString());
        }
        
        return setCategoriesAsString;
    }

    public Category newCategory(String id, String description) {
        return new Category(id, description);
    }
    
    public boolean validCategory(Category category){
        return !setCategories.contains(category);
    }
    
    public boolean addCategory(Category category){
        return setCategories.add(category);
    }    

    public Category getCategoryById(String categoryId) {
        for (Category category : setCategories) {
            if (category.getId().equalsIgnoreCase(categoryId)) {
                return category;
            }
        }
        throw new IllegalArgumentException("Invalid " + categoryId + "!");
    }
    
    public Category getCategoryByStringValue(String categoryString) {
        for (Category category : setCategories) {
            if(category.toString().equals(categoryString)) {
                return category;
            }
        }
        
        throw new IllegalArgumentException("Invalid " + categoryString);
    }

}
