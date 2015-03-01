package org.anonyme.model;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

/**
 * Created by antoine on 2/28/2015.
 */

@Entity
@Table(name = "shops")
public class Shop {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @Column(name = "employees_number")
    private Integer emplNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmplNumber() {
        return emplNumber;
    }

    public void setEmplNumber(Integer emplNumber) {
        this.emplNumber = emplNumber;
    }
}

