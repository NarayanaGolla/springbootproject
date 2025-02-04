package com.core.oops.inheritance;

//parent
public class Employee extends AbstractEmployee {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void message() {

    }
}
