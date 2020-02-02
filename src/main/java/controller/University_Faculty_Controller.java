package controller;
import controller.databaseConnection;
import model.University_Faculty;

import javax.faces.bean.ManagedBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ManagedBean (name = "universityFacultyController")

public class University_Faculty_Controller {

    University_Faculty uniFac = new University_Faculty();

    Connection conn = databaseConnection.DBConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql;
    Integer id = null;

    public University_Faculty getUniFac() {
        return uniFac;
    }

    public void setUniFac(University_Faculty uniFac) {
        this.uniFac = uniFac;
    }

    public List<String> getGetFaculty() {
        return getFaculty;
    }

    public void setGetFaculty(List<String> getFaculty) {
        this.getFaculty = getFaculty;
    }

    private List<String> getFaculty = new ArrayList<String>();

    public List<String> getUniversity(){

        try{

            sql = "SELECT UNI_FULL_NAME FROM UniversityOfficialInfo ORDER BY UNI_FULL_NAME";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                getFaculty.add(rs.getString("UNI_FULL_NAME"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return getFaculty;
    }

    public String UniversityFaculty(){

        String varisty;
        varisty = uniFac.getUniversityList();

        try{

            sql = "SELECT UNI_ID FROM UniversityOfficialInfo WHERE UNI_FULL_NAME = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, varisty);
            rs = ps.executeQuery();
            while (rs.next()) {

                id = rs.getInt("UNI_ID");
            }

            uniFac.setUniID(id);

            sql = "INSERT INTO UniversityFaculty(FACULTY_NAME, FACULTY_DEAN, UNI_ID) " +
                    "VALUES (?, ?, ?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, uniFac.getFaculty().toUpperCase());
            ps.setString(2, uniFac.getDean().toUpperCase());
            ps.setInt(3, id);

            ps.executeUpdate();

        }

        catch (Exception e){
            e.printStackTrace();
        }


        return "faculty";
    }

}
