package DataBean;

import beans.Courses;
import dao.CourseDao;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

/**
 * Created by henry_fordham on 2017/12/3.
 */
@ManagedBean(name = "CourseBean")
@SessionScoped
public class CourseBean {
    ArrayList<Courses> courses=new ArrayList<Courses>();
    public CourseBean(){
        CourseDao courseDao=new CourseDao();
        courses=courseDao.getAvailCourse();
    }
    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public boolean getCourse(){
        CourseDao courseDao=new CourseDao();
        courses=courseDao.getAvailCourse();
        return true;
    }
    public void setCourses(ArrayList<Courses> courses) {
        this.courses = courses;
    }
}
