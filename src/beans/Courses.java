package beans;

import dao.CourseDao;
import service.ManageCourseService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jerry on 2017/12/1.
 */
@ManagedBean(name = "course")//create a bean which has a name as data
@RequestScoped//the scope of bean is request
public class Courses {
    public String CouNo;
    public String CouName;
    public String TeachNo;
    public String TeachName;
    public Integer AvailNum;
    public Set<Exam> exam=new HashSet<Exam>();
    public Set<Student> students=new HashSet<Student>();

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Exam> getExam() {
        return exam;
    }

    public void setExam(Set<Exam> exam) {
        this.exam = exam;
    }

    public String getCouNo() {
        return CouNo;
    }

    public void setCouNo(String couNo) {
        CouNo = couNo;
    }

    public String getCouName() {
        return CouName;
    }

    public void setCouName(String couName) {
        CouName = couName;
    }

    public String getTeachNo() {
        return TeachNo;
    }

    public void setTeachNo(String teachNo) {
        TeachNo = teachNo;
    }

    public String getTeachName() {
        return TeachName;
    }

    public void setTeachName(String teachName) {
        TeachName = teachName;
    }

    public Integer getAvailNum() {
        return AvailNum;
    }

    public void setAvailNum(Integer availNum) {
        AvailNum = availNum;
    }

    public Set<Exam> getEmps() {
        return exam;
    }

    public void setEmps(Set<Exam> exam) {
        this.exam = exam;
    }

}
