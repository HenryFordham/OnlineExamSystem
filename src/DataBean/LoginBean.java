package DataBean;

import beans.Courses;
import beans.LoginInfo;
import beans.Student;
import service.LoginService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

/**
 * Created by henry_fordham on 2017/12/2.
 */
@ManagedBean(name = "LoginBean")
@SessionScoped
public class LoginBean {
    public String LoginNo;
    public String LoginPass;
    public String LoginType;
    public Student student;
    public String stuNo;
    public ArrayList<Courses> courses;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getStuNo() {
        return stuNo;
    }
    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getLoginType() {
        return LoginType;
    }

    public void setLoginType(String loginType) {
        LoginType = loginType;
    }


    public String getLoginNo() {
        return LoginNo;
    }

    public void setLoginNo(String loginNo) {
        LoginNo = loginNo;
    }

    public String getLoginPass() {
        return LoginPass;
    }

    public void setLoginPass(String loginPass) {
        LoginPass = loginPass;
    }

    public ArrayList<Courses> getCourses() {
        LoginService loginService=new LoginService();
        student=loginService.GetStudent(LoginNo);
        courses=new ArrayList<Courses>(student.getCourses());
        return courses;
    }

    public void setCourses(ArrayList<Courses> courses) {
        this.courses = courses;
    }

    public String Judge(){
        LoginService loginService=new LoginService();
        student=loginService.GetStudent(LoginNo);
        courses=new ArrayList<Courses>(student.getCourses());
        return loginService.JudgeStudentByNo(LoginNo,LoginPass,LoginType);
    }

    public String GetCourse(){
        LoginService loginService=new LoginService();
        student=loginService.GetStudent(LoginNo);
        courses=new ArrayList<Courses>(student.getCourses());
        return "CouOK";
    }

    public void GetCourse2(){
        LoginService loginService=new LoginService();
        student=loginService.GetStudent(LoginNo);
        courses=new ArrayList<Courses>(student.getCourses());
    }
}
