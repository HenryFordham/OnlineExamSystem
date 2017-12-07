package beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by henry_fordham on 2017/11/25.
 */
public class Student {
    String StuNo;
    String StuName;
    int StuGender;
    int StuAge;
    String StuGrade;
    LoginInfo loginInfo;
    Set<Courses> courses=new HashSet<Courses>();
    Set<Exam> exams=new HashSet<Exam>();
    /**
     * @author Henry Fordham
     * @return
     */


    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }



    public Set<Courses> getCourses() {
        return courses;
    }

    public void setCourses(Set<Courses> courses) {
        this.courses = courses;
    }


    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }

    public int getStuGender() {
        return StuGender;
    }

    public void setStuGender(int stuGender) {
        StuGender = stuGender;
    }

    public String getStuNo() {
        return StuNo;
    }

    public void setStuNo(String stuNo) {
        StuNo = stuNo;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public int getStuAge() {
        return StuAge;
    }

    public void setStuAge(int stuAge) {
        StuAge = stuAge;
    }

    public String getStuGrade() {
        return StuGrade;
    }

    public void setStuGrade(String stuGrade) {
        StuGrade = stuGrade;
    }



}
