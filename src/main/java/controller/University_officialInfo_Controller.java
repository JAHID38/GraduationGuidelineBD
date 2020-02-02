package controller;
import model.University_OfficialInfo;

import javax.faces.bean.ManagedBean;
import java.sql.*;

@ManagedBean (name = "universityOfficialInfoController")

public class University_officialInfo_Controller {

University_OfficialInfo university_officialInfo = new University_OfficialInfo();

    public University_OfficialInfo getUniversity_officialInfo() {
        return university_officialInfo;
    }

    public void setUniversity_officialInfo(University_OfficialInfo university_officialInfo) {
        this.university_officialInfo = university_officialInfo;
    }

    public String UniversityOfficialInfo(){

        Connection conn = databaseConnection.DBConnection();
        PreparedStatement ps = null;
        String sql;

        try {


            sql = "INSERT INTO UniversityOfficialInfo(UNI_FULL_NAME, UNI_SHORT_NAME," +
                    "UNI_TYPE, UNI_CATEGORY, UNI_ESTABLISHED_DATE, UNI_LOCATION," +
                    "UNI_DIVISION, UNI_MOTTO, UNI_CHANCELLOR, UNI_VC, UNI_CAMPUS," +
                    "UNI_REGISTER, UNI_WEBSITE) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, university_officialInfo.getFullName().toUpperCase());
            ps.setString(2, university_officialInfo.getShortName().toUpperCase());
            ps.setString(3, university_officialInfo.getType());
            ps.setString(4, university_officialInfo.getCategory());
            ps.setString(5, university_officialInfo.getEstablishedDate());
            ps.setString(6, university_officialInfo.getLocation());
            ps.setString(7, university_officialInfo.getDivision());
            ps.setString(8, university_officialInfo.getMotto());
            ps.setString(9, university_officialInfo.getChancellor().toUpperCase());
            ps.setString(10, university_officialInfo.getVC().toUpperCase());
            ps.setString(11, university_officialInfo.getCampus());
            ps.setString(12, university_officialInfo.getRegister());
            ps.setString(13, university_officialInfo.getWebsite().toLowerCase());
            

            ps.executeUpdate();

        }

        catch (Exception e){
            e.printStackTrace();
        }

        return "Okay";
    }
}
