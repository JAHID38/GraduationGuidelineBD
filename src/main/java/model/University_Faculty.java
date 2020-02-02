package model;

public class University_Faculty {

    private String universityList;
    private String faculty;
    private String dean;
    private Integer uniID;

    public University_Faculty() {
    }

    public String getUniversityList() {
        return universityList;
    }

    public void setUniversityList(String universityList) {
        this.universityList = universityList;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDean() {
        return dean;
    }

    public void setDean(String dean) {
        this.dean = dean;
    }

    public Integer getUniID() {
        return uniID;
    }

    public void setUniID(Integer uniID) {
        this.uniID = uniID;
    }
}
