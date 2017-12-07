package DataBean;

import beans.Courses;
import beans.Student;
import dao.CourseDao;
import service.ManageCourseService;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

/**
 * Created by henry_fordham on 2017/12/3.
 */
@ManagedBean(name = "ManageCourseBean")//create a bean which has a name as data
@SessionScoped
public class ManageCourseBean {
    String CourseNo;
    Student student;
    String SelectCourseNo;
    public Courses getSelectedCourses() {
        return SelectedCourses;
    }

    public String getSelectCourseNo() {
        return SelectCourseNo;
    }

    public void setSelectCourseNo(String selectCourseNo) {
        SelectCourseNo = selectCourseNo;
    }

    public void setSelectedCourses(Courses selectedCourses) {
        SelectedCourses = selectedCourses;
    }

    Courses SelectedCourses;
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    ArrayList<Courses> courses=new ArrayList<Courses>();
    public ManageCourseBean(){
        CourseDao courseDao=new CourseDao();
        courses=courseDao.getAvailCourse();
    }
    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Courses> courses) {
        this.courses = courses;
    }
    public String getCourseNo() {
        return CourseNo;
    }

    public void setCourseNo(String courseNo) {
        CourseNo = courseNo;
    }

//    public String insert(){
//        ManageCourseService manageCourseService=new ManageCourseService();
//        Courses courses=manageCourseService.GetCourse(CourseNo);
//        String StuNo=student.getStuNo();
//        String CourseNo=courses.getCouNo();
//        manageCourseService.Add(StuNo,CourseNo);
//        return "OKAY";
//    }

    public void insert(){
            ManageCourseService manageCourseService=new ManageCourseService();
            Courses courses2=manageCourseService.GetCourse(CourseNo);
            String StuNo=student.getStuNo();
            String CourseNo=courses2.getCouNo();
            manageCourseService.Add(StuNo,CourseNo);
            CourseDao courseDao=new CourseDao();
            courses=courseDao.getAvailCourse();
        }

    public void insert2(){
        ManageCourseService manageCourseService=new ManageCourseService();
        Courses courses2=manageCourseService.GetCourse(SelectCourseNo);
        String StuNo=student.getStuNo();
        String CourseNo=courses2.getCouNo();
        manageCourseService.Add(StuNo,CourseNo);
        CourseDao courseDao=new CourseDao();
        courses=courseDao.getAvailCourse();
    }


    public void delete(){
        ManageCourseService manageCourseService=new ManageCourseService();
        Courses courses=manageCourseService.GetCourse(CourseNo);
        String StuNo=student.getStuNo();
        String CourseNo=courses.getCouNo();
        manageCourseService.Delete(StuNo,CourseNo);
    }
}
