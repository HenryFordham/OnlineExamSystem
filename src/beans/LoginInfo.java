package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by henry_fordham on 2017/11/30.
 */
@ManagedBean(name="login")
@RequestScoped
public class LoginInfo {
    public String LoginNo;
    public String LoginPass;
    public Integer type;//0 represents the students, while 1 represents the administrator;
    public int Q1;
    public String A1;
    public int Q2;
    public String A2;
    public int Q3;
    public String A3;
    public String Tel;
    public String Email;
    public Student student;
    public Admin admin;
    /**
     * @author Henry Fordham
     * @return
     */

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public int getQ1() {
        return Q1;
    }

    public void setQ1(int q1) {
        Q1 = q1;
    }

    public String getA1() {
        return A1;
    }

    public void setA1(String a1) {
        A1 = a1;
    }

    public int getQ2() {
        return Q2;
    }

    public void setQ2(int q2) {
        Q2 = q2;
    }

    public String getA2() {
        return A2;
    }

    public void setA2(String a2) {
        A2 = a2;
    }

    public int getQ3() {
        return Q3;
    }

    public void setQ3(int q3) {
        Q3 = q3;
    }

    public String getA3() {
        return A3;
    }

    public void setA3(String a3) {
        A3 = a3;
    }

}
