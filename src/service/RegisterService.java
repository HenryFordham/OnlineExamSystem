package service;

import beans.LoginInfo;
import beans.Student;
import dao.RegisterDao;
/**
 * Created by henry_fordham on 2017/12/7.
 */
public class RegisterService {
    public static RegisterDao registerDao=new RegisterDao();
    public static String JudgeLoginInfo(String LoginNo,String LoginPass,String LoginPass2,String Tel,String Email){
        if (!LoginPass.equals(LoginPass2)) return "PassNotMatch";
        if (registerDao.getUserInfoNo(LoginNo)!=null) return "NoHasExist";
        if (registerDao.getUserTel(Tel)!=null) return  "TelHasExist";
        if (registerDao.getUserEmail(Email)!=null) return "EmailHasExist";
        return "InfoCorrect";
    }


    public static String insertUserLoginMessage(String LoginNo,String LoginPass,String A1,String A2,String A3,String Tel,String Email,String Q1,String Q2,String Q3){
        LoginInfo loginInfo=new LoginInfo();
        loginInfo.setLoginNo(LoginNo);
        loginInfo.setLoginPass(LoginPass);
        loginInfo.setA1(A1);
        loginInfo.setA2(A2);
        loginInfo.setA3(A3);
        loginInfo.setQ1(Integer.parseInt(Q1));
        loginInfo.setQ2(Integer.parseInt(Q2));
        loginInfo.setQ3(Integer.parseInt(Q3));
        loginInfo.setTel(Tel);
        loginInfo.setType(0);
        loginInfo.setEmail(Email);
        Student student=new Student();
        loginInfo.setStudent(student);
        registerDao.insertLogin(loginInfo);
        return "InfoCorrect";
    }
}
