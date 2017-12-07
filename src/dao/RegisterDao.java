package dao;

import DataBean.HibernateData;
import beans.LoginInfo;
import beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by henry_fordham on 2017/12/7.
 */
public class RegisterDao {

    public static LoginInfo getUserInfoNo(String loginNo){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        LoginInfo loginInfo=session.get(LoginInfo.class,loginNo);

        transaction.commit();
        session.close();
        return loginInfo;
    }

    public static LoginInfo getUserTel(String Tel){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Query Q_login1=session.createQuery("from LoginInfo where tel=:mytel");
        Q_login1.setParameter("mytel",Tel);
        List<LoginInfo> loginInfoList = (List<LoginInfo>) Q_login1.list();
        transaction.commit();
        session.close();
        if (loginInfoList.size()==0) return null;
        return loginInfoList.get(0);
    }

    public static LoginInfo getUserEmail(String Email){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Query Q_login1=session.createQuery("from LoginInfo where Email=:myemail");
        Q_login1.setParameter("myemail",Email);
        List<LoginInfo> loginInfoList = (List<LoginInfo>) Q_login1.list();
        transaction.commit();
        session.close();
        if (loginInfoList.size()==0) return null;
        return loginInfoList.get(0);
    }

    public static LoginInfo insertLogin(LoginInfo loginInfo){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        session.save(loginInfo.student);
        session.save(loginInfo);

        transaction.commit();
        session.close();
        return loginInfo;
    }
}
