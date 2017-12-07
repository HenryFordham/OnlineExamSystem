package dao;

import DataBean.HibernateData;
import beans.Courses;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry_fordham on 2017/12/3.
 */
public class CourseDao {
    public static ArrayList<Courses> getAvailCourse(){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Query Q_Cou=session.createQuery("from Courses where AvailNum>0");
        ArrayList<Courses> courses= (ArrayList<Courses>) Q_Cou.list();
        transaction.commit();
        return courses;
    }
}
