package beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by henry_fordham on 2017/11/30.
 */
public class Exam {
    public String ExamNo;
    public String ExamDate;
    public Courses courses;
    public Set<Student> students=new HashSet<Student>();


    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
    public String getExamNo() {
        return ExamNo;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public void setExamNo(String examNo) {
        ExamNo = examNo;
    }

    public String getExamDate() {
        return ExamDate;
    }

    public void setExamDate(String examDate) {
        ExamDate = examDate;
    }
}
