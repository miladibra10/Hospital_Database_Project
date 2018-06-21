package model;

public class Attendent {
    String national_id;
    String fname;

    public String getNational_id() {
        return national_id;
    }

    public void setNational_id(String national_id) {
        this.national_id = national_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getSick_id() {
        return sick_id;
    }

    public void setSick_id(int sick_id) {
        this.sick_id = sick_id;
    }

    String lname;
    int sick_id;
}
