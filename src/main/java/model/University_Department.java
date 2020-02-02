package model;

public class University_Department {

    private String universityList;
    private String facultyList;
    private String dept_name;
    private String dept_head;
    private String degree;
    private Integer duration;
    private Integer semester;
    private Integer cost;
    private String contact;
    private Integer uniID;
    private Integer facID;

    public University_Department() {
    }

    public String getUniversityList() {
        return universityList;
    }

    public void setUniversityList(String universityList) {
        this.universityList = universityList;
    }

    public String getFacultyList() {
        return facultyList;
    }

    public void setFacultyList(String facultyList) {
        this.facultyList = facultyList;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_head() {
        return dept_head;
    }

    public void setDept_head(String dept_head) {
        this.dept_head = dept_head;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getUniID() {
        return uniID;
    }

    public void setUniID(Integer uniID) {
        this.uniID = uniID;
    }

    public Integer getFacID() {
        return facID;
    }

    public void setFacID(Integer facID) {
        this.facID = facID;
    }
}
