package org.DataBase;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String firstname;
    String lastname;
    Integer id;
    Integer number;
    List<String> activities = new ArrayList<>();

    public Employee(String firstname, String lastname, Integer id, Integer number, List<String> activities) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.number = number;
        this.activities = activities;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                ", number=" + number +
                ", activities=" + activities +
                '}';
    }
}

