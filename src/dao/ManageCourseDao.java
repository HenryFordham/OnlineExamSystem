package dao;

import DataBean.HibernateData;
import beans.Courses;
import beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 * Created by henry_fordham on 2017/12/3.
 */
public class ManageCourseDao {
    public static Courses FindCourseById(String CouID){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Courses courses=session.load(Courses.class,CouID);
        transaction.commit();
        session.close();
        return courses;
    }

    public static Student FindStudentById(String StuID){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Student student=session.load(Student.class,StuID);

        transaction.commit();
        return student;
    }

    public static void AddC(String StuNo,String CouNo){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Courses courses=session.load(Courses.class,CouNo);
        Student student=session.load(Student.class,StuNo);
        courses.setAvailNum(courses.getAvailNum()-1);
        student.getCourses().add(courses);
        session.save(student);

        transaction.commit();
        session.close();
    }

    public static void DeleteC(String StuNo,String CouNo){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();


        Courses courses=session.load(Courses.class,CouNo);
        Student student=session.load(Student.class,StuNo);

        student.getCourses().remove(courses);

        session.save(student);
        transaction.commit();
        session.close();

    }
}
