package DataBean;

import service.RegisterService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

/**
 * Created by henry_fordham on 2017/12/7.
 */
@ManagedBean(name = "RegisterBean")//create a bean which has a name as data
@RequestScoped
public class RegisterBean {
    String LoginNo;
    String LoginPass;
    String LoginPass2;
    String type;
    String Q1;
    String Q2;
    String Q3;
    String A1;

    public String getQ1() {
        return Q1;
    }

    public void setQ1(String q1) {
        Q1 = q1;
    }

    public String getQ2() {
        return Q2;
    }

    public void setQ2(String q2) {
        Q2 = q2;
    }

    public String getQ3() {
        return Q3;
    }

    public void setQ3(String q3) {
        Q3 = q3;
    }

    String A2;
    String A3;
    String Tel;
    String Email;

    public String getLoginPass2() {
        return LoginPass2;
    }

    public void setLoginPass2(String loginPass2) {
        LoginPass2 = loginPass2;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getA1() {
        return A1;
    }

    public void setA1(String a1) {
        A1 = a1;
    }

    public String getA2() {
        return A2;
    }

    public void setA2(String a2) {
        A2 = a2;
    }

    public String getA3() {
        return A3;
    }

    public void setA3(String a3) {
        A3 = a3;
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

    public String Judge(){
        RegisterService registerService=new RegisterService();
        String Result=registerService.JudgeLoginInfo(LoginNo,LoginPass,LoginPass2,Tel,Email);
        if (Result.equals("InfoCorrect")) {
            registerService.insertUserLoginMessage(LoginNo,LoginPass,A1,A2,A3,Tel,Email,Q1,Q2,Q3);
            return "InfoCorrect";
        }
        return "InfoNotCorrect";
    }
}
