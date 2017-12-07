package service;

import beans.LoginInfo;
import beans.Student;
import dao.LoginDao;

/**
 * Created by henry_fordham on 2017/12/2.
 */
public class LoginService {
    public static LoginDao loginDao=new LoginDao();
    public static String JudgeStudentByNo(String loginNo,String LoginPass,String LoginType){
        LoginInfo loginInfo;
        loginInfo=loginDao.getUserInfoNo(loginNo);
        if (loginInfo==null)
                return "NoAccount";
        int type;
        if (LoginType.equals("Student")) type=0;
            else type=1;
        if (type!=loginInfo.getType())
            return "NoAccount";
        if (type==1){
            String AdminPass=loginInfo.getLoginPass();
            if (AdminPass.equals(LoginPass))
                return "AdmOK";
            return "AdmStuPassWrong";
        }
        String StuPass=loginInfo.getLoginPass();
        if (StuPass.equals(LoginPass))
            return "StuOK";
        return "StuPassWrong";
    }

    public static Student GetStudent(String loginNo){
        LoginInfo loginInfo;
        loginInfo=loginDao.getUserInfoNo(loginNo);
        Student student=loginDao.getStudentByInfo(loginInfo);
        return student;
    }
}
