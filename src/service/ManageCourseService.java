package service;

import beans.Courses;
import dao.ManageCourseDao;

/**
 * Created by henry_fordham on 2017/12/3.
 */
public class ManageCourseService {
    public static ManageCourseDao manageCourseDao=new ManageCourseDao();

    public static Courses GetCourse(String CouNo){
        Courses courses;
        courses=manageCourseDao.FindCourseById(CouNo);
        return courses;
    }

    public static void Add(String StuNo,String CouNo){
        manageCourseDao.AddC(StuNo,CouNo);
    }

    public static void Delete(String StuNo,String CouNo){
        manageCourseDao.DeleteC(StuNo,CouNo);
    }
}
