package org.dei.controller;

import org.dei.model.Company;
import org.dei.model.Constantes;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicationEM {
    
    private final Company company;
    
    private ApplicationEM()
    {
        Properties props = getProperties();
        this.company = new Company(props.getProperty(Constantes.PARAMS_COMPANY_NAME));
    }

    public Company getCompany() {
        return this.company;
    }
    
    private Properties getProperties()
    {
        Properties props = new Properties();
        
        // Read properties  
        try {
            InputStream in = new FileInputStream(Constantes.PARAMS_FILE);
            props.load(in);
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(ApplicationEM.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return props;
    }

    private static ApplicationEM singleton = null;
    public static ApplicationEM getInstance() 
    {
        if(singleton == null) 
        {
            synchronized(ApplicationEM.class) 
            { 
                singleton = new ApplicationEM();
            }
        }
        return singleton;
    }
}
