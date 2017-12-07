package test;
/**
 * Created by henry_fordham on 2017/12/1.
 */

import beans.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;

public class App {
    public static StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure( "hibernate.cfg.xml" )
            .build();
    public static Metadata metadata = new MetadataSources( standardRegistry )
            .getMetadataBuilder()
            .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE ).build();
    public static SessionFactory sessionFactory = metadata.getSessionFactoryBuilder()
            .build();
    public static Session session=sessionFactory.openSession();
    public static Transaction transaction=session.beginTransaction();

    public static void test_student_Logininfo() {
        /**
         * @author Henry Fordham
         */
        Student stu=new Student();
        stu.setStuAge(21);
        stu.setStuGrade("Junior");
        stu.setStuGender(1);
        stu.setStuName("Henry");
        LoginInfo loginInfo=new LoginInfo();
        loginInfo.setLoginNo("775933804");
        loginInfo.setLoginPass("961009xy");
        loginInfo.setType(0);
        loginInfo.setQ1(2);
        loginInfo.setA1("Shanghai");
        loginInfo.setQ2(1);
        loginInfo.setA2("Software Engineer");
        loginInfo.setQ3(3);
        loginInfo.setA3("Shushu");
        loginInfo.setTel("15269218298");
        loginInfo.setEmail("smallpangxie@vip.qq.com");
        loginInfo.setStudent(stu);
        session.save(stu);
        session.save(loginInfo);

        Student stu1=new Student();
        stu1.setStuAge(22);
        stu1.setStuGrade("Senior");
        stu1.setStuGender(1);
        stu1.setStuName("Jerry");
        LoginInfo loginInfo1=new LoginInfo();
        loginInfo1.setLoginNo("Kiomi_Jerry");
        loginInfo1.setLoginPass("961009xy");
        loginInfo1.setType(0);
        loginInfo1.setQ1(7);
        loginInfo1.setA1("Henry");
        loginInfo1.setQ2(6);
        loginInfo1.setA2("Millionare");
        loginInfo1.setQ3(2);
        loginInfo1.setA3("Jinan");
        loginInfo1.setTel("17865428032");
        loginInfo1.setEmail("961819766@qq.com");
        loginInfo1.setStudent(stu1);
        session.save(stu1);
        session.save(loginInfo1);


        Student stu2=new Student();
        stu2.setStuAge(22);
        stu2.setStuGrade("Senior");
        stu2.setStuGender(0);
        stu2.setStuName("Doron Antebi");
        LoginInfo loginInfo2=new LoginInfo();
        loginInfo2.setLoginNo("Doron_Antebi");
        loginInfo2.setLoginPass("961009xy");
        loginInfo2.setType(0);
        loginInfo2.setQ1(7);
        loginInfo2.setA1("Henry");
        loginInfo2.setQ2(8);
        loginInfo2.setA2("Yarin Udi");
        loginInfo2.setQ3(2);
        loginInfo2.setA3("Haifa Israel");
        loginInfo2.setTel("+97 525294451");
        loginInfo2.setEmail("Doron_Antebi@gmail.com");
        loginInfo2.setStudent(stu2);
        session.save(stu2);
        session.save(loginInfo2);


        Student stu3=new Student();
        stu3.setStuAge(20);
        stu3.setStuGrade("Freshman");
        stu3.setStuGender(1);
        stu3.setStuName("Udi Yarin");
        LoginInfo loginInfo3=new LoginInfo();
        loginInfo3.setLoginNo("Udi_Yarin");
        loginInfo3.setLoginPass("961009xy");
        loginInfo3.setType(0);
        loginInfo3.setQ1(7);
        loginInfo3.setA1("Henry");
        loginInfo3.setQ2(8);
        loginInfo3.setA2("Doron Antebi");
        loginInfo3.setQ3(2);
        loginInfo3.setA3("Tel Aviv Israel");
        loginInfo3.setTel("+972 544791288");
        loginInfo3.setEmail("Udi_Yarin@gmail.com");
        loginInfo3.setStudent(stu3);
        session.save(stu3);
        session.save(loginInfo3);

    }
    public static void test_Admin_Logininfo() {
        /**
         * @author Henry Fordham
         */
        Admin admin=new Admin();
        admin.setAdmName("Henry Fordham");
        admin.setAdmAge(21);
        admin.setAdmGender(1);
        LoginInfo loginInfo=new LoginInfo();
        loginInfo.setLoginNo("Henry_Fordham");
        loginInfo.setLoginPass("961009xy");
        loginInfo.setType(1);
        loginInfo.setQ1(2);
        loginInfo.setA1("Qingdao");
        loginInfo.setQ2(1);
        loginInfo.setA2("Software Engineer");
        loginInfo.setQ3(3);
        loginInfo.setA3("Shushu");
        loginInfo.setTel("15269218298");
        loginInfo.setEmail("smallpangxie@vip.qq.com");
        loginInfo.setAdmin(admin);
        session.save(admin);
        session.save(loginInfo);


        Admin admin2=new Admin();
        admin2.setAdmName("David Mazouz");
        admin2.setAdmAge(21);
        admin2.setAdmGender(1);
        LoginInfo loginInfo1=new LoginInfo();
        loginInfo1.setLoginNo("David_Mazouz");
        loginInfo1.setLoginPass("961009xy");
        loginInfo1.setType(1);
        loginInfo1.setQ1(2);
        loginInfo1.setA1("HongKong");
        loginInfo1.setQ2(1);
        loginInfo1.setA2("Financial Engineer");
        loginInfo1.setQ3(7);
        loginInfo1.setA3("Henry Fordham");
        loginInfo1.setTel("+852 15769912374");
        loginInfo1.setEmail("DavidMazouz@gmail.com");
        loginInfo1.setAdmin(admin2);
        session.save(admin2);
        session.save(loginInfo1);

    }
    public static void test_ValidateQuestion() {
        ValidateQuestion validateQuestion1=new ValidateQuestion();
        validateQuestion1.setQue("What is the job position of your father?");
        validateQuestion1.setQueNo(1);


        ValidateQuestion validateQuestion2=new ValidateQuestion();
        validateQuestion2.setQue("Where are you from?");
        validateQuestion2.setQueNo(2);


        ValidateQuestion validateQuestion3=new ValidateQuestion();
        validateQuestion3.setQue("What is the name of your pet?");
        validateQuestion3.setQueNo(3);

        ValidateQuestion validateQuestion4=new ValidateQuestion();
        validateQuestion4.setQue("Who is your favorate teacher?");
        validateQuestion4.setQueNo(4);

        ValidateQuestion validateQuestion5=new ValidateQuestion();
        validateQuestion5.setQue("What is your favorate subject in your High School?");
        validateQuestion5.setQueNo(5);

        ValidateQuestion validateQuestion6=new ValidateQuestion();
        validateQuestion6.setQue("What is your dream job position?");
        validateQuestion6.setQueNo(6);

        ValidateQuestion validateQuestion7=new ValidateQuestion();
        validateQuestion7.setQue("Who is your best friend?");
        validateQuestion7.setQueNo(7);

        ValidateQuestion validateQuestion8=new ValidateQuestion();
        validateQuestion8.setQue("Who is your girl/boy friend?");
        validateQuestion8.setQueNo(8);

        ValidateQuestion validateQuestion9=new ValidateQuestion();
        validateQuestion9.setQue("What is your gender preference?");
        validateQuestion9.setQueNo(9);

        ValidateQuestion validateQuestion10=new ValidateQuestion();
        validateQuestion10.setQue("Which country have you ever been before and leave you a deep impression?");
        validateQuestion10.setQueNo(10);

        session.save(validateQuestion1);
        session.save(validateQuestion2);
        session.save(validateQuestion3);
        session.save(validateQuestion4);
        session.save(validateQuestion5);
        session.save(validateQuestion6);
        session.save(validateQuestion7);
        session.save(validateQuestion8);
        session.save(validateQuestion9);
        session.save(validateQuestion10);
    }
    public static void test_course_exam() {
        Courses courses=new Courses();
        courses.setCouName("Chinese");
        courses.setTeachNo("T001");
        courses.setTeachName("Aviad Levi");
        courses.setAvailNum(50);
        Exam exam_1=new Exam();
        exam_1.setExamDate("20170102");
        Exam exam_2=new Exam();
        exam_2.setExamDate("20170412");
        exam_1.setCourses(courses);
        exam_2.setCourses(courses);
        session.save(courses);
        session.save(exam_1);
        session.save(exam_2);


        Courses Courses1=new Courses();
        Courses1.setCouName("JAVAEE");
        Courses1.setTeachNo("T002");
        Courses1.setTeachName("Rahul Talreja");
        Courses1.setAvailNum(125);
        Exam exam_3=new Exam();
        exam_3.setExamDate("20160921");
        Exam exam_4=new Exam();
        exam_4.setExamDate("20170921");
        Exam exam_5=new Exam();
        exam_5.setExamDate("20171221");
        exam_3.setCourses(Courses1);
        exam_4.setCourses(Courses1);
        exam_5.setCourses(Courses1);
        session.save(Courses1);
        session.save(exam_3);
        session.save(exam_4);
        session.save(exam_5);


        Courses Courses2=new Courses();
        Courses2.setCouName("Algorithms");
        Courses2.setTeachNo("T003");
        Courses2.setTeachName("Zhao Ning");
        Courses2.setAvailNum(130);
        Exam exam_6=new Exam();
        exam_6.setExamDate("20160811");
        Exam exam_7=new Exam();
        exam_7.setExamDate("20171111");
        Exam exam_8=new Exam();
        exam_8.setExamDate("20180110");
        exam_6.setCourses(Courses2);
        exam_7.setCourses(Courses2);
        exam_8.setCourses(Courses2);
        session.save(Courses2);
        session.save(exam_6);
        session.save(exam_7);
        session.save(exam_8);

        Courses Courses3=new Courses();
        Courses3.setCouName("MathMatics");
        Courses3.setTeachNo("T004");
        Courses3.setTeachName("Roy Ben Zur");
        Courses3.setAvailNum(126);
        Exam exam_9=new Exam();
        exam_9.setExamDate("20160310");
        Exam exam_10=new Exam();
        exam_10.setExamDate("20171222");
        Exam exam_11=new Exam();
        exam_11.setExamDate("20180210");
        Exam exam_12=new Exam();
        exam_12.setExamDate("20180310");
        exam_9.setCourses(Courses3);
        exam_10.setCourses(Courses3);
        exam_11.setCourses(Courses3);
        exam_12.setCourses(Courses3);
        session.save(Courses3);
        session.save(exam_9);
        session.save(exam_10);
        session.save(exam_11);
        session.save(exam_12);


        Courses Courses4=new Courses();
        Courses4.setCouName("GRE");
        Courses4.setTeachNo("T005");
        Courses4.setTeachName("Tom Mathew");
        Courses4.setAvailNum(3);
        Exam exam_13=new Exam();
        exam_13.setExamDate("20171230");
        Exam exam_14=new Exam();
        exam_14.setExamDate("20180210");
        Exam exam_15=new Exam();
        exam_15.setExamDate("20180310");
        Exam exam_16=new Exam();
        exam_16.setExamDate("20180410");
        exam_13.setCourses(Courses4);
        exam_14.setCourses(Courses4);
        exam_15.setCourses(Courses4);
        exam_16.setCourses(Courses4);
        session.save(Courses4);
        session.save(exam_13);
        session.save(exam_14);
        session.save(exam_15);
        session.save(exam_16);
    }
    public static void Add_StuCourse() {
        /**
         * @author Henry Fordham
         */

        //Find the student named Henry
        Query Q_Stu1=session.createQuery("from Student where StuName=:mystu");
        Q_Stu1.setParameter("mystu","Henry");
        List<Student> studentList = (List<Student>) Q_Stu1.list();
        Student stu1=studentList.get(0);
        //Find the class named Chinese
        Query Q_Cou1=session.createQuery("from Courses where CouName=:mycou");
        Q_Cou1.setParameter("mycou","Chinese");
        List<Courses> coursesList = (List<Courses>) Q_Cou1.list();
        Courses cou1=coursesList.get(0);
        //Find the class named JAVAEE
        Query Q_Cou2=session.createQuery("from Courses where CouName=:mycou");
        Q_Cou2.setParameter("mycou","JAVAEE");
        List<Courses> coursesList2= (List<Courses>) Q_Cou2.list();
        Courses cou2=coursesList2.get(0);
        //Find the class named Algorithms
        Query Q_Cou3=session.createQuery("from Courses where CouName=:mycou");
        Q_Cou3.setParameter("mycou","Algorithms");
        List<Courses> coursesList3= (List<Courses>) Q_Cou3.list();
        Courses cou3=coursesList3.get(0);
        stu1.getCourses().add(cou1);
        stu1.getCourses().add(cou2);
        stu1.getCourses().add(cou3);
        session.save(stu1);


        //Find the student named Jerry
        Query Q_Stu2=session.createQuery("from Student where StuName=:mystu");
        Q_Stu2.setParameter("mystu","Jerry");
        List<Student> studentList2 = (List<Student>) Q_Stu2.list();
        Student stu2=studentList2.get(0);
        //Find the class named MathMatics
        Query Q_Cou4=session.createQuery("from Courses where CouName=:mycou");
        Q_Cou4.setParameter("mycou","MathMatics");
        List<Courses> coursesList4= (List<Courses>) Q_Cou4.list();
        Courses cou4=coursesList4.get(0);
        stu2.getCourses().add(cou2);
        stu2.getCourses().add(cou3);
        stu2.getCourses().add(cou4);
        session.save(stu2);

        //Find the student named Doron Antebi
        Query Q_Stu3=session.createQuery("from Student where StuName=:mystu");
        Q_Stu3.setParameter("mystu","Doron Antebi");
        List<Student> studentList3 = (List<Student>) Q_Stu3.list();
        Student stu3=studentList3.get(0);
        //Find the class named GRE
        Query Q_Cou5=session.createQuery("from Courses where CouName=:mycou");
        Q_Cou5.setParameter("mycou","GRE");
        List<Courses> coursesList5= (List<Courses>) Q_Cou5.list();
        Courses cou5=coursesList5.get(0);
        stu3.getCourses().add(cou3);
        stu3.getCourses().add(cou4);
        stu3.getCourses().add(cou5);


        //Find the student named Udi Yarin
        Query Q_Stu4=session.createQuery("from Student where StuName=:mystu");
        Q_Stu4.setParameter("mystu","Udi Yarin");
        List<Student> studentList4 = (List<Student>) Q_Stu4.list();
        Student stu4=studentList4.get(0);
        stu4.getCourses().add(cou1);
        stu4.getCourses().add(cou2);
        stu4.getCourses().add(cou5);

    }
    public static void test_student_exam() {
        /**
         * @author Henry Fordham
         */

        //Find the student named Henry
        Query Q_Stu1=session.createQuery("from Student where StuName=:mystu");
        Q_Stu1.setParameter("mystu","Henry");
        List<Student> studentList = (List<Student>) Q_Stu1.list();
        Student stu1=studentList.get(0);
        //Find the class named Chinese
        Query Q_Cou1=session.createQuery("from Courses where CouName=:mycou");
        Q_Cou1.setParameter("mycou","Chinese");
        List<Courses> coursesList = (List<Courses>) Q_Cou1.list();
        Courses cou1=coursesList.get(0);
        //Find the first exam of the subject
        Query Q_exam1=session.createQuery("from Exam where courses=:mycou");
        Q_exam1.setParameter("mycou",cou1);
        List<Exam> examList = (List<Exam>) Q_exam1.list();
        Exam exam1=examList.get(0);
        stu1.getExams().add(exam1);
        //Find the class named JAVAEE
        Query Q_Cou2=session.createQuery("from Courses where CouName=:mycou");
        Q_Cou2.setParameter("mycou","JAVAEE");
        List<Courses> coursesList2= (List<Courses>) Q_Cou2.list();
        Courses cou2=coursesList2.get(0);
        //Find the first exam of the subject
        Query Q_exam2=session.createQuery("from Exam where courses=:mycou");
        Q_exam2.setParameter("mycou",cou2);
        List<Exam> examList2 = (List<Exam>) Q_exam2.list();
        Exam exam2=examList2.get(0);
        stu1.getExams().add(exam2);
        stu1.getExams().add(exam2);



        //Find the student named Jerry
        Query Q_Stu2=session.createQuery("from Student where StuName=:mystu");
        Q_Stu2.setParameter("mystu","Jerry");
        List<Student> studentList2 = (List<Student>) Q_Stu2.list();
        Student stu2=studentList2.get(0);
        stu2.getExams().add(exam2);

    }
    public static void main(String[] args) {

        test_ValidateQuestion();
        test_Admin_Logininfo();
        test_student_Logininfo();
        test_course_exam();
        Add_StuCourse();
        test_student_exam();

        //Find the student named Henry
//        Query Q_Stu1=session.createQuery("from Student where StuName=:mystu");
//        Q_Stu1.setParameter("mystu","Henry");
//        List<Student> studentList = (List<Student>) Q_Stu1.list();
//        Student stu1=studentList.get(0);
//
//        Courses courses=session.load(Courses.class,"4028fc8260169eaa0160169eaccc0016");
//        stu1.getCourses().add(courses);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
