package org.dei.controller;

import org.dei.model.Category;
import org.dei.model.Company;

public class SpecifyCategoryController {
    
    private final ApplicationEM applicationEM;
    private final Company company;
    private Category category;

    public SpecifyCategoryController() {
        this.applicationEM = ApplicationEM.getInstance();
        this.company = applicationEM.getCompany();
        this.category = null;
    }
    
    public String getCategory() {
        return this.category!=null?this.category.toString():null;
    }
    
    public String getCategoryId() {
        return this.category!=null?this.category.getId():null;
    }
    
    public String getCategoryDescription() {
        return this.category!=null?this.category.getDescription():null;
    }
    

    public boolean newCategory(String id, String description){
        this.category=this.company.getRegisterCategories().newCategory(id, description);
        return true;
    }
    
    public boolean registerCategory(){
        if(this.company.getRegisterCategories().validCategory(this.category))
            return this.company.getRegisterCategories().addCategory(this.category);
        return false;
    }
    
}
