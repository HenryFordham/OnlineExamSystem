package beans;

/**
 * Created by henry_fordham on 2017/12/1.
 */
public class Admin {
    public String AdmNo;
    public String AdmName;
    public int AdmGender;
    public int AdmAge;

    /**
     * @author Henry Fordham
     * @return
     */
    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }

    public String getAdmNo() {
        return AdmNo;
    }

    public void setAdmNo(String admNo) {
        AdmNo = admNo;
    }

    public String getAdmName() {
        return AdmName;
    }

    public void setAdmName(String admName) {
        AdmName = admName;
    }

    public int getAdmGender() {
        return AdmGender;
    }

    public void setAdmGender(int admGender) {
        AdmGender = admGender;
    }

    public int getAdmAge() {
        return AdmAge;
    }

    public void setAdmAge(int admAge) {
        AdmAge = admAge;
    }

    public LoginInfo loginInfo;
}
