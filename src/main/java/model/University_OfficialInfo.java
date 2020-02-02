package model;

public class University_OfficialInfo {

    /*
    UNI_ID                                    NOT NULL NUMBER(38)
    FULL_NAME                                          VARCHAR2(100)
    SHORT_NAME                                         VARCHAR2(10)
    UNI_TYPE                                           VARCHAR2(10)
    UNI_CATEGORY                                       VARCHAR2(30)
    ESTABLISHED_DATE                                   VARCHAR2(13)
    UNI_LOCATION                                       VARCHAR2(40)
    DIVISION                                           VARCHAR2(15)
    MOTTO                                              VARCHAR2(50)
    CHANCELLOR                                         VARCHAR2(30)
    VICE_CHANCELLOR                                    VARCHAR2(40)
    CAMPUS_AREA                                        NUMBER(38)
    AUDITORIUM                                         VARCHAR2(20)
    REGISTER_OFFICE                                    VARCHAR2(30)
    CONTACT                                            VARCHAR2(14)
    WEBSITE                                            VARCHAR2(30)
    */

    private String fullName;
    private String shortName;
    private String type;
    private String category;
    private String establishedDate;
    private String location;
    private String division;
    private String motto;
    private String chancellor;
    private String VC;
    private String campus;
    private String register;
    private String website;

    public University_OfficialInfo() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(String establishedDate) {
        this.establishedDate = establishedDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getChancellor() {
        return chancellor;
    }

    public void setChancellor(String chancellor) {
        this.chancellor = chancellor;
    }

    public String getVC() {
        return VC;
    }

    public void setVC(String VC) {
        this.VC = VC;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
