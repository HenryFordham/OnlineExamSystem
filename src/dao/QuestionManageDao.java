package dao;

import DataBean.HibernateData;

import beans.AnswerSheet;
import beans.Questions;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class QuestionManageDao {
    public static ArrayList<Questions> getAvailCourse(){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Query Q_Cou=session.createQuery("from Questions where couName=:cou");
        Q_Cou.setParameter("cou","GRE");
        ArrayList<Questions> questions= (ArrayList<Questions>) Q_Cou.list();

        transaction.commit();
        return questions;
    }


    public static boolean getSheetIfExist(String StuID, String CouID){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Query Q1=session.createQuery("from AnswerSheet where StuNo=:stuno and CouNo=:couno");
        Q1.setParameter("stuno",StuID);
        Q1.setParameter("couno",CouID);
        try{
            ArrayList<AnswerSheet> sheets= (ArrayList<AnswerSheet>) Q1.list();
//            AnswerSheet sheet=sheets.get(0);
//            if (sheet.getIsEnd()==1) return false;
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public static AnswerSheet getAnswerSheetItem(String StuID, String CouID){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Query Q1=session.createQuery("from AnswerSheet where StuNo=:stuno and CouNo=:couno");
        Q1.setParameter("stuno",StuID);
        Q1.setParameter("couno",CouID);
        ArrayList<AnswerSheet> sheets= (ArrayList<AnswerSheet>) Q1.list();
        AnswerSheet sheet=sheets.get(0);

        transaction.commit();
        session.close();
        return sheet;
    }

    public static void submitAnswer(ArrayList<String> studentAnswer,ArrayList<String> studentQuesNo){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        AnswerSheet answerSheet=new AnswerSheet();

        AnswerSheet.setQ1(studentAnswer.get(0));
        AnswerSheet.setQNO1(studentQuesNo.get(0));
        AnswerSheet.setQ2(studentAnswer.get(1));
        AnswerSheet.setQNO2(studentQuesNo.get(1));
        AnswerSheet.setQ3(studentAnswer.get(2));
        AnswerSheet.setQNO3(studentQuesNo.get(2));
        AnswerSheet.setQ4(studentAnswer.get(3));
        AnswerSheet.setQNO4(studentQuesNo.get(3));
        AnswerSheet.setQ5(studentAnswer.get(4));
        AnswerSheet.setQNO5(studentQuesNo.get(4));
        AnswerSheet.setQ6(studentAnswer.get(5));
        AnswerSheet.setQNO6(studentQuesNo.get(5));
        AnswerSheet.setQ7(studentAnswer.get(6));
        AnswerSheet.setQNO7(studentQuesNo.get(6));
        AnswerSheet.setQ8(studentAnswer.get(7));
        AnswerSheet.setQNO8(studentQuesNo.get(7));
        AnswerSheet.setQ9(studentAnswer.get(8));
        AnswerSheet.setQNO9(studentQuesNo.get(8));
        AnswerSheet.setQ10(studentAnswer.get(9));
        AnswerSheet.setQNO10(studentQuesNo.get(9));
        AnswerSheet.setQ11(studentAnswer.get(10));
        AnswerSheet.setQNO11(studentQuesNo.get(10));
        AnswerSheet.setQ12(studentAnswer.get(11));
        AnswerSheet.setQNO12(studentQuesNo.get(11));
        AnswerSheet.setQ13(studentAnswer.get(12));
        AnswerSheet.setQNO13(studentQuesNo.get(12));
        AnswerSheet.setQ14(studentAnswer.get(13));
        AnswerSheet.setQNO14(studentQuesNo.get(13));
        AnswerSheet.setQ15(studentAnswer.get(14));
        AnswerSheet.setQNO15(studentQuesNo.get(14));
        AnswerSheet.setQ16(studentAnswer.get(15));
        AnswerSheet.setQNO16(studentQuesNo.get(15));
        AnswerSheet.setQ17(studentAnswer.get(16));
        AnswerSheet.setQNO17(studentQuesNo.get(16));
        AnswerSheet.setQ18(studentAnswer.get(17));
        AnswerSheet.setQNO18(studentQuesNo.get(17));
        AnswerSheet.setQ19(studentAnswer.get(18));
        AnswerSheet.setQNO19(studentQuesNo.get(18));
        AnswerSheet.setQ20(studentAnswer.get(19));
        AnswerSheet.setQNO20(studentQuesNo.get(19));
        session.save(answerSheet);

        transaction.commit();
        session.close();
    }
    public static void submit(AnswerSheet answerSheet){
        SessionFactory sessionFactory = HibernateData.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Query queryupdate=session.createQuery("delete  from AnswerSheet where StuNo=:stuno and CouNo=:couno");
        queryupdate.setParameter("stuno",answerSheet.getStuNo());
        queryupdate.setParameter("couno",answerSheet.getCouNo());
        queryupdate.executeUpdate();
        session.save(answerSheet);

        transaction.commit();
        session.close();
    }

}
