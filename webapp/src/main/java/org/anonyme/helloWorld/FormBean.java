package org.anonyme.helloWorld;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by antoine on 11/28/2014.
 */
public class FormBean {
    @NotEmpty
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
