package dao;

import DataBean.HibernateData;
import beans.Admin;
import beans.Exam;
import beans.LoginInfo;
import beans.Student;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by henry_fordham on 2017/12/2.
 */
public class LoginDao {
    public void deleteStudentById(int id) {
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Student student=session.load(Student.class,id);
        session.delete(student);
        transaction.commit();
    }

    public void deleteAdminById(int id) {
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Admin admin=session.load(Admin.class,id);
        session.delete(admin);
        transaction.commit();
    }

    public static LoginInfo getUserInfoNo(String loginNo){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        LoginInfo loginInfo=session.get(LoginInfo.class,loginNo);
        transaction.commit();
        session.close();
        return loginInfo;
    }

    public static Student getStudentByInfo(LoginInfo loginInfo){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Student student=loginInfo.getStudent();

        transaction.commit();
        session.close();
        return student;
    }
}
