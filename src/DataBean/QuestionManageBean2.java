package DataBean;

import beans.AnswerSheet;
import beans.Questions;
import service.QuestionManageService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

@ManagedBean(name = "QuestionManageBean2")//create a bean which has a name as data
@SessionScoped
public class QuestionManageBean2 {
    public static String CouID;
    public static int pageNo;
    public static ArrayList<String> answerList=new ArrayList<String>(30);
    public static ArrayList<Boolean> isFirst=new ArrayList<Boolean>(10);
    public static Questions questions;
    public static Questions questions2;
    public static Questions questions3;
    public static Questions questions4;
    public static Questions questions5;
    public static AnswerSheet answerSheet;
    public static String Choice;
    public static String Choice2;
    public static String Choice3;
    public static String Choice4;
    public static String Choice5;
    public static ArrayList<String> Bullet=new ArrayList<String>();//桶排序，每次放选择的答案
    public static ArrayList<String> Bullet_Ques=new ArrayList<String>();//对应存储选择答案的真实题代号
    public static int index;
    public static String StuID;

    public static String getStuID() {
        return StuID;
    }

    public static void setStuID(String stuID) {
        StuID = stuID;
    }

    public static String getCouID() {
        return CouID;
    }

    public static void setCouID(String couID) {
        CouID = couID;
    }

    public static ArrayList<Boolean> getIsFirst() {
        return isFirst;
    }

    public static void setIsFirst(ArrayList<Boolean> isFirst) {
        QuestionManageBean2.isFirst = isFirst;
    }



    public static int getPageNo() {
        return pageNo;
    }

    public static void setPageNo(int pageNo) {
        QuestionManageBean2.pageNo = pageNo;
    }

    public static ArrayList<String> getAnswerList() {
        return answerList;
    }

    public static void setAnswerList(ArrayList<String> answerList) {
        QuestionManageBean2.answerList = answerList;
    }

    public static ArrayList<String> getBullet() {
        return Bullet;
    }

    public static void setBullet(ArrayList<String> bullet) {
        Bullet = bullet;
    }

    public static ArrayList<String> getBullet_Ques() {
        return Bullet_Ques;
    }

    public static void setBullet_Ques(ArrayList<String> bullet_Ques) {
        Bullet_Ques = bullet_Ques;
    }


    public String getChoice() {
        return Choice;
    }

    public void setChoice(String choice) {
        Choice = choice;
    }

    public String getChoice2() {
        return Choice2;
    }

    public void setChoice2(String choice2) {
        Choice2 = choice2;
    }

    public String getChoice3() {
        return Choice3;
    }

    public void setChoice3(String choice3) {
        Choice3 = choice3;
    }

    public String getChoice4() {
        return Choice4;
    }

    public void setChoice4(String choice4) {
        Choice4 = choice4;
    }

    public String getChoice5() {
        return Choice5;
    }

    public void setChoice5(String choice5) {
        Choice5 = choice5;
    }




    public AnswerSheet getAnswerSheet() {
        return answerSheet;
    }

    public void setAnswerSheet(AnswerSheet answerSheet) {
        this.answerSheet = answerSheet;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }



    public Questions getQuestions3() {
        return questions3;
    }

    public void setQuestions3(Questions questions3) {
        this.questions3 = questions3;
    }

    public Questions getQuestions4() {
        return questions4;
    }

    public void setQuestions4(Questions questions4) {
        this.questions4 = questions4;
    }

    public Questions getQuestions5() {
        return questions5;
    }

    public void setQuestions5(Questions questions5) {
        this.questions5 = questions5;
    }

    ArrayList<Questions> arrayList=new ArrayList<Questions>();

    public Questions getQuestions2() {
        return questions2;
    }

    public void setQuestions2(Questions questions2) {
        this.questions2 = questions2;
    }

    public Questions getQuestions() {
        return questions;

    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public ArrayList<Questions> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Questions> arrayList) {
        this.arrayList = arrayList;
    }

    public QuestionManageBean2(){
        QuestionManageService questionManageService=new QuestionManageService();
        arrayList=questionManageService.GetAllQuestions();
        answerSheet=new AnswerSheet();
        for (int i=0;i<=20;i++){
            Bullet.add("null");
            Bullet_Ques.add("null");
        }
        for (int i=0;i<=30;i++){
            answerList.add("0");
        }
        index=0;
        pageNo=1;
        questions=arrayList.get(index);
        index++;
        questions2=arrayList.get(index);
        index++;
        questions3=arrayList.get(index);
        index++;
        questions4=arrayList.get(index);
        index++;
        questions5=arrayList.get(index);
        index++;
//        for (int i=0;i<10;i++)
//            isFirst.add(false);
//        if (questionManageService.IfExistExam(StuID,CouID)){
//            answerSheet=QuestionManageService.getSheetItem(StuID,CouID);
//            Choice=answerSheet.getQ1();
//            Choice2=answerSheet.getQ2();
//            Choice3=answerSheet.getQ3();
//            Choice4=answerSheet.getQ4();
//            Choice5=answerSheet.getQ5();
//
//            if (answerSheet.Q1!=null) answerList.set(1,answerSheet.Q1);
//            if (answerSheet.Q2!=null) answerList.set(2,answerSheet.Q2);
//            if (answerSheet.Q3!=null) answerList.set(3,answerSheet.Q3);
//            if (answerSheet.Q4!=null) answerList.set(4,answerSheet.Q4);
//            if (answerSheet.Q5!=null) answerList.set(5,answerSheet.Q5);
//            if (answerSheet.Q6!=null) answerList.set(6,answerSheet.Q6);
//            if (answerSheet.Q7!=null) answerList.set(7,answerSheet.Q7);
//            if (answerSheet.Q8!=null) answerList.set(8,answerSheet.Q8);
//            if (answerSheet.Q9!=null) answerList.set(9,answerSheet.Q9);
//            if (answerSheet.Q10!=null) answerList.set(10,answerSheet.Q10);
//            if (answerSheet.Q11!=null) answerList.set(11,answerSheet.Q11);
//            if (answerSheet.Q12!=null) answerList.set(12,answerSheet.Q12);
//            if (answerSheet.Q13!=null) answerList.set(13,answerSheet.Q13);
//            if (answerSheet.Q14!=null) answerList.set(14,answerSheet.Q14);
//            if (answerSheet.Q15!=null) answerList.set(15,answerSheet.Q15);
//            if (answerSheet.Q16!=null) answerList.set(16,answerSheet.Q16);
//            if (answerSheet.Q17!=null) answerList.set(17,answerSheet.Q17);
//            if (answerSheet.Q18!=null) answerList.set(18,answerSheet.Q18);
//            if (answerSheet.Q19!=null) answerList.set(19,answerSheet.Q19);
//            if (answerSheet.Q20!=null) answerList.set(20,answerSheet.Q20);
//
//            for (int i=0;i<8;i++)
//                isFirst.set(i,true);
//        }
//        else{
//            answerSheet=new AnswerSheet();
//        }
//        answerSheet.setStuNo(getStuID());
//        answerSheet.setCouNo(getCouID());
    }

//    public String showQuestionInSequence(){
//        //先更新数据
//        answerList.set((pageNo-1)*5+1,Choice);
//        answerList.set((pageNo-1)*5+2,Choice2);
//        answerList.set((pageNo-1)*5+3,Choice3);
//        answerList.set((pageNo-1)*5+4,Choice4);
//        answerList.set((pageNo-1)*5+5,Choice5);
////        if (pageNo==1){
////            answerSheet.Q1=Choice;
////            answerSheet.Q2=Choice2;
////            answerSheet.Q3=Choice3;
////            answerSheet.Q4=Choice4;
////            answerSheet.Q5=Choice5;
////
////            answerSheet.QNO1=questions.getQuesNo();
////            answerSheet.QNO2=questions2.getQuesNo();
////            answerSheet.QNO3=questions3.getQuesNo();
////            answerSheet.QNO4=questions4.getQuesNo();
////            answerSheet.QNO5=questions5.getQuesNo();
////        }
////        if (pageNo==2){
////            answerSheet.Q6=Choice;
////            answerSheet.Q7=Choice2;
////            answerSheet.Q8=Choice3;
////            answerSheet.Q9=Choice4;
////            answerSheet.Q10=Choice5;
////
////            answerSheet.QNO6=questions.getQuesNo();
////            answerSheet.QNO7=questions2.getQuesNo();
////            answerSheet.QNO8=questions3.getQuesNo();
////            answerSheet.QNO9=questions4.getQuesNo();
////            answerSheet.QNO10=questions5.getQuesNo();
////        }
////        if (pageNo==3){
////            answerSheet.Q11=Choice;
////            answerSheet.Q12=Choice2;
////            answerSheet.Q13=Choice3;
////            answerSheet.Q14=Choice4;
////            answerSheet.Q15=Choice5;
////
////            answerSheet.QNO11=questions.getQuesNo();
////            answerSheet.QNO12=questions2.getQuesNo();
////            answerSheet.QNO13=questions3.getQuesNo();
////            answerSheet.QNO14=questions4.getQuesNo();
////            answerSheet.QNO15=questions5.getQuesNo();
////        }
//
//        //检查是否是第一次到达该页面
//        //如果是的话，则恢复原先的答案
//        if (isFirst.get(pageNo)){
//            Choice=answerList.get(pageNo*5+1);
//            Choice2=answerList.get(pageNo*5+2);
//            Choice3=answerList.get(pageNo*5+3);
//            Choice4=answerList.get(pageNo*5+4);
//            Choice5=answerList.get(pageNo*5+5);
//        }
//        //否则刷新答案为空
//        else {
//            Choice=new String();
//            Choice2=new String();
//            Choice3=new String();
//            Choice4=new String();
//            Choice5=new String();
//            isFirst.set(pageNo,true);
//        }
//        //页面标记到下一页
//        pageNo++;
//        QuestionManageService questionManageService=new QuestionManageService();
////        questionManageService.submit(answerSheet);
//        Bullet.set(index-1,Choice5);
//        Bullet_Ques.set(index-1,questions5.getQuesNo());
//        Bullet.set(index-2,Choice4);
//        Bullet_Ques.set(index-2,questions4.getQuesNo());
//        Bullet.set(index-3,Choice3);
//        Bullet_Ques.set(index-3,questions3.getQuesNo());
//        Bullet.set(index-4,Choice2);
//        Bullet_Ques.set(index-4,questions2.getQuesNo());
//        Bullet.set(index-5,Choice);
//        Bullet_Ques.set(index-5,questions.getQuesNo());
//
//
//        if (index>10){
//            questionManageService.SubmitAnswer(Bullet,Bullet_Ques);
//            return "OVER";
//        }
//        else{
//            questions=arrayList.get(index);
//            index++;
//            questions2=arrayList.get(index);
//            index++;
//            questions3=arrayList.get(index);
//            index++;
//            questions4=arrayList.get(index);
//            index++;
//            questions5=arrayList.get(index);
//            index++;
//        }
//        return "NOTOVER";
//    }

//    public void showQuestionDecreaseSequence(){
//        //判断是不是第一页
//        if (pageNo-1==0){
//
//        }
//        //先更新数据
//        answerList.set((pageNo-1)*5+1,Choice);
//        answerList.set((pageNo-1)*5+2,Choice2);
//        answerList.set((pageNo-1)*5+3,Choice3);
//        answerList.set((pageNo-1)*5+4,Choice4);
//        answerList.set((pageNo-1)*5+5,Choice5);
//        //上一页一定有保存答案
//        Choice=answerList.get((pageNo-2)*5+1);
//        Choice2=answerList.get((pageNo-2)*5+2);
//        Choice3=answerList.get((pageNo-2)*5+3);
//        Choice4=answerList.get((pageNo-2)*5+4);
//        Choice5=answerList.get((pageNo-2)*5+5);
//        pageNo--;
//
//        questions5=arrayList.get(index);
//        index--;
//        questions4=arrayList.get(index);
//        index--;
//        questions3=arrayList.get(index);
//        index--;
//        questions2=arrayList.get(index);
//        index--;
//        questions=arrayList.get(index);
//        index--;
//    }
}
