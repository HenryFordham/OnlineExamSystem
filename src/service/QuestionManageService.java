package service;

import beans.AnswerSheet;
import beans.Questions;
import dao.QuestionManageDao;

import java.util.ArrayList;

public class QuestionManageService {
    public static ArrayList<Questions> GetAllQuestions(){
        QuestionManageDao questionManageDao=new QuestionManageDao();
        ArrayList<Questions> questionss=questionManageDao.getAvailCourse();
        return questionss;
    }

    public static void SubmitAnswer(ArrayList<String> studentAnswer,ArrayList<String> studentQuesNo){
        QuestionManageDao questionManageDao=new QuestionManageDao();
        questionManageDao.submitAnswer(studentAnswer,studentQuesNo);
    }

    public static boolean IfExistExam(String StuID, String CouID){
        QuestionManageDao questionManageDao=new QuestionManageDao();
        return questionManageDao.getSheetIfExist(StuID,CouID);
    }

    public static AnswerSheet getSheetItem(String StuID, String CouID){
        QuestionManageDao questionManageDao=new QuestionManageDao();
        AnswerSheet sheet=questionManageDao.getAnswerSheetItem(StuID,CouID);
        return sheet;
    }
    public static void submit(AnswerSheet answerSheet){
        QuestionManageDao questionManageDao=new QuestionManageDao();
        questionManageDao.submit(answerSheet);
    }


}
