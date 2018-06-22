package model.entity;

public class TestPres {
    String national_id;
    String sickfName;
    String sicklName;
    String testName;
    int lab_id;
    String doc_id;
    String labName;

    public String getSickfName() {
        return sickfName;
    }

    public void setSickfName(String sickfName) {
        this.sickfName = sickfName;
    }

    public String getSicklName() {
        return sicklName;
    }

    public void setSicklName(String sicklName) {
        this.sicklName = sicklName;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getNational_id() {
        return national_id;
    }

    public void setNational_id(String national_id) {
        this.national_id = national_id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public int getLab_id() {
        return lab_id;
    }

    public void setLab_id(int lab_id) {
        this.lab_id = lab_id;
    }

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }
}
