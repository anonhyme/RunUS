package org.anonymus.sandbox;

import org.hibernate.validator.constraints.NotEmpty;

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
