package controller;
import model.University_Department;

import javax.faces.bean.ManagedBean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@ManagedBean (name = "uniDeptController")

public class University_Dept_Controller {

    Connection conn = databaseConnection.DBConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql;
    Integer uni_id = null;
    Integer fac_id = null;

    University_Department uniDept = new University_Department();

    public University_Department getUniDept() {
        return uniDept;
    }

    public void setUniDept(University_Department uniDept) {
        this.uniDept = uniDept;
    }



    public List<String> getUniversity(){

        University_Faculty_Controller uF = new University_Faculty_Controller();

        return uF.getUniversity();
    }

    public Integer getUniID(){

        try{
            sql = "SELECT UNI_ID FROM UniversityOfficialInfo WHERE UNI_FULL_NAME = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, uniDept.getUniversityList());
            rs = ps.executeQuery();
            while (rs.next()) {

                uni_id = rs.getInt("UNI_ID");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return uni_id;
    }
    private List<String> faculty = new ArrayList<String>();
    public List<String> getFaculty(){
        try{

            uniDept.setUniID(uni_id);

            sql = "SELECT FACULTY_NAME FROM UniversityFaculty WHERE UNI_ID = ? ORDER BY FACULTY_NAME";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, uni_id);
            rs = ps.executeQuery();
            while (rs.next()){
                faculty.add(rs.getString("FACULTY_NAME"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return faculty;
    }



    public String UniversityDept(){
        try{


            sql = "SELECT FACULTY_ID FROM UniversityFaculty WHERE FACULTY_NAME = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,uniDept.getFacultyList());
            rs = ps.executeQuery();
            while(rs.next()){
                fac_id = rs.getInt("FACULTY_ID");
            }

            uniDept.setFacID(fac_id);

            sql = "INSERT INTO UniversityDepartment(DEPT_NAME, DEPT_HEAD, DEGREE, COURSE_DURATION" +
                    "SEMESTER, EXPENDITURE, CONTACT, FACULTY_ID) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            ps = conn.prepareStatement(sql);

            ps.setString(1, uniDept.getDept_name().toUpperCase());
            ps.setString(2, uniDept.getDept_head().toUpperCase());
            ps.setString(3, uniDept.getDegree().toUpperCase());
            ps.setInt(4, uniDept.getDuration());
            ps.setInt(5, uniDept.getSemester());
            ps.setInt(6, uniDept.getCost());
            ps.setString(7, uniDept.getContact());
            ps.setInt(8, fac_id);

            ps.executeUpdate();

        }
        catch(Exception e){
            e.printStackTrace();
        }

        return "department";
    }
}
