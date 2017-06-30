package com;

/**
 * Created by frosales on 30/06/2017.
 */
public class Person {
    private String name;
    private Integer bornYear;

    public Person(String name, Integer bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBornYear() {
        return bornYear;
    }

    public void setBornYear(Integer bornYear) {
        this.bornYear = bornYear;
    }
}
