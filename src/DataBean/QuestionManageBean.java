package DataBean;

import beans.AnswerSheet;
import beans.Questions;
import dao.QuestionManageDao;
import service.QuestionManageService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.awt.*;
import java.util.ArrayList;

@ManagedBean(name = "QuestionManageBean")//create a bean which has a name as data
@SessionScoped
public class QuestionManageBean {
    public  String CouID="4028fc82603b982d01603b98304a0006";
    public  int pageNo;
    public  ArrayList<String> answerList=new ArrayList<String>(30);
    public  ArrayList<Questions> arrayList=new ArrayList<Questions>();
    public  ArrayList<Boolean> isFirst=new ArrayList<Boolean>(10);
    public  Questions questions;
    public  Questions questions2;
    public  Questions questions3;
    public  Questions questions4;
    public  Questions questions5;
    public  AnswerSheet answerSheet;
    public  String Choice;
    public  String Choice2;
    public  String Choice3;
    public  String Choice4;
    public  String Choice5;
    public  ArrayList<String> Bullet=new ArrayList<String>();//桶排序，每次放选择的答案
    public  ArrayList<String> Bullet_Ques=new ArrayList<String>();//对应存储选择答案的真实题代号
    public  int index,flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public  String StuID="4028fc82603b982d01603b9830440002";
    public String getCouID() {
        return CouID;
    }

    public void setCouID(String couID) {
        CouID = couID;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public ArrayList<String> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(ArrayList<String> answerList) {
        this.answerList = answerList;
    }

    public ArrayList<Questions> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Questions> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<Boolean> getIsFirst() {
        return isFirst;
    }

    public void setIsFirst(ArrayList<Boolean> isFirst) {
        this.isFirst = isFirst;
    }

    public Questions getQuestions() {
        return questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public Questions getQuestions2() {
        return questions2;
    }

    public void setQuestions2(Questions questions2) {
        this.questions2 = questions2;
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

    public AnswerSheet getAnswerSheet() {
        return answerSheet;
    }

    public void setAnswerSheet(AnswerSheet answerSheet) {
        this.answerSheet = answerSheet;
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

    public ArrayList<String> getBullet() {
        return Bullet;
    }

    public void setBullet(ArrayList<String> bullet) {
        Bullet = bullet;
    }

    public ArrayList<String> getBullet_Ques() {
        return Bullet_Ques;
    }

    public void setBullet_Ques(ArrayList<String> bullet_Ques) {
        Bullet_Ques = bullet_Ques;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getStuID() {
        return StuID;
    }

    public void setStuID(String stuID) {
        StuID = stuID;
    }






    public QuestionManageBean(){
        QuestionManageService questionManageService=new QuestionManageService();
        arrayList=questionManageService.GetAllQuestions();
        answerSheet=new AnswerSheet();
        for (int i=0;i<=20;i++){
            Bullet.add("null");
            Bullet_Ques.add("null");
        }
        for (int i=0;i<=30;i++){
            answerList.add(null);
        }
        for (int i=0;i<10;i++)
            isFirst.add(false);
        index=0;
        flag=1;
        pageNo=1;//
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
        CouID=new String("4028fc82603b982d01603b98304a0006");
        StuID="4028fc82603b982d01603b9830440002";
        if (questionManageService.IfExistExam(StuID,CouID)){
            answerSheet=QuestionManageService.getSheetItem("4028fc82603b982d01603b9830440002","4028fc82603b982d01603b98304a0006");
            if (answerSheet.getIsEnd()==1){
                Choice=null;
                Choice2=null;
                Choice3=null;
                Choice4=null;
                Choice5=null;
            }
            else{
                Choice=answerSheet.getQ1();
                Choice2=answerSheet.getQ2();
                Choice3=answerSheet.getQ3();
                Choice4=answerSheet.getQ4();
                Choice5=answerSheet.getQ5();
            }

            if (answerSheet.getQ1()==null){
                isFirst.set(1,true);
            }
            if (answerSheet.getQ6()==null){
                isFirst.set(2,true);
            }
            if (answerSheet.getQ11()==null){
                isFirst.set(3,true);
            }
            answerList.set(1,answerSheet.Q1);
            answerList.set(2,answerSheet.Q2);
            answerList.set(3,answerSheet.Q3);
            answerList.set(4,answerSheet.Q4);
            answerList.set(5,answerSheet.Q5);
            answerList.set(6,answerSheet.Q6);
            answerList.set(7,answerSheet.Q7);
            answerList.set(8,answerSheet.Q8);
            answerList.set(9,answerSheet.Q9);
            answerList.set(10,answerSheet.Q10);
            answerList.set(11,answerSheet.Q11);
            answerList.set(12,answerSheet.Q12);
            answerList.set(13,answerSheet.Q13);
            answerList.set(14,answerSheet.Q14);
            answerList.set(15,answerSheet.Q15);

        }
        else {
            answerSheet.setCouNo(CouID);
            answerSheet.setStuNo(StuID);
        }
    }

    public String showQuestionInSequence(){
        QuestionManageService questionManageService=new QuestionManageService();
        if (answerSheet.getIsEnd()==1) return "NOEXAM";
        //先更新数据
        answerList.set((pageNo-1)*5+1,Choice);
        answerList.set((pageNo-1)*5+2,Choice2);
        answerList.set((pageNo-1)*5+3,Choice3);
        answerList.set((pageNo-1)*5+4,Choice4);
        answerList.set((pageNo-1)*5+5,Choice5);
        if (pageNo==1){
            answerSheet.Q1=Choice;
            answerSheet.Q2=Choice2;
            answerSheet.Q3=Choice3;
            answerSheet.Q4=Choice4;
            answerSheet.Q5=Choice5;

            answerSheet.QNO1=questions.getQuesNo();
            answerSheet.QNO2=questions2.getQuesNo();
            answerSheet.QNO3=questions3.getQuesNo();
            answerSheet.QNO4=questions4.getQuesNo();
            answerSheet.QNO5=questions5.getQuesNo();
        }
        if (pageNo==2){
            answerSheet.Q6=Choice;
            answerSheet.Q7=Choice2;
            answerSheet.Q8=Choice3;
            answerSheet.Q9=Choice4;
            answerSheet.Q10=Choice5;

            answerSheet.QNO6=questions.getQuesNo();
            answerSheet.QNO7=questions2.getQuesNo();
            answerSheet.QNO8=questions3.getQuesNo();
            answerSheet.QNO9=questions4.getQuesNo();
            answerSheet.QNO10=questions5.getQuesNo();
        }
        if (pageNo==3){
            answerSheet.Q11=Choice;
            answerSheet.Q12=Choice2;
            answerSheet.Q13=Choice3;
            answerSheet.Q14=Choice4;
            answerSheet.Q15=Choice5;

            answerSheet.QNO11=questions.getQuesNo();
            answerSheet.QNO12=questions2.getQuesNo();
            answerSheet.QNO13=questions3.getQuesNo();
            answerSheet.QNO14=questions4.getQuesNo();
            answerSheet.QNO15=questions5.getQuesNo();
        }

        questionManageService.submit(answerSheet);
        if (index>10) return "NONE";
        //检查是否是第一次到达该页面
        //如果是的话，则恢复原先的答案
        if (isFirst.get(pageNo)){
            Choice=answerList.get(pageNo*5+1);
            Choice2=answerList.get(pageNo*5+2);
            Choice3=answerList.get(pageNo*5+3);
            Choice4=answerList.get(pageNo*5+4);
            Choice5=answerList.get(pageNo*5+5);
        }
        //否则刷新答案为空
        else {
            Choice=new String();
            Choice2=new String();
            Choice3=new String();
            Choice4=new String();
            Choice5=new String();
            isFirst.set(pageNo,true);
        }
        //页面标记到下一页
        pageNo++;

        if (index>10){
            return "OVER";
        }
        else{
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
        }
        return "NOTOVER";
    }

    public String SubmitSequence(){
        answerSheet.setIsEnd(1);
        QuestionManageService questionManageService=new QuestionManageService();
        questionManageService.submit(answerSheet);
        return "OVER";
    }
    public String showQuestionDecreaseSequence(){
        if (pageNo==1) return "NOTHING";
        //先更新数据
        answerList.set((pageNo-1)*5+1,Choice);
        answerList.set((pageNo-1)*5+2,Choice2);
        answerList.set((pageNo-1)*5+3,Choice3);
        answerList.set((pageNo-1)*5+4,Choice4);
        answerList.set((pageNo-1)*5+5,Choice5);
        if (pageNo==1){
            answerSheet.Q1=Choice;
            answerSheet.Q2=Choice2;
            answerSheet.Q3=Choice3;
            answerSheet.Q4=Choice4;
            answerSheet.Q5=Choice5;

            answerSheet.QNO1=questions.getQuesNo();
            answerSheet.QNO2=questions2.getQuesNo();
            answerSheet.QNO3=questions3.getQuesNo();
            answerSheet.QNO4=questions4.getQuesNo();
            answerSheet.QNO5=questions5.getQuesNo();
        }
        if (pageNo==2){
            answerSheet.Q6=Choice;
            answerSheet.Q7=Choice2;
            answerSheet.Q8=Choice3;
            answerSheet.Q9=Choice4;
            answerSheet.Q10=Choice5;

            answerSheet.QNO6=questions.getQuesNo();
            answerSheet.QNO7=questions2.getQuesNo();
            answerSheet.QNO8=questions3.getQuesNo();
            answerSheet.QNO9=questions4.getQuesNo();
            answerSheet.QNO10=questions5.getQuesNo();
        }
        if (pageNo==3){
            answerSheet.Q11=Choice;
            answerSheet.Q12=Choice2;
            answerSheet.Q13=Choice3;
            answerSheet.Q14=Choice4;
            answerSheet.Q15=Choice5;

            answerSheet.QNO11=questions.getQuesNo();
            answerSheet.QNO12=questions2.getQuesNo();
            answerSheet.QNO13=questions3.getQuesNo();
            answerSheet.QNO14=questions4.getQuesNo();
            answerSheet.QNO15=questions5.getQuesNo();
        }
        //上一页一定有保存答案
        Choice=answerList.get((pageNo-2)*5+1);
        Choice2=answerList.get((pageNo-2)*5+2);
        Choice3=answerList.get((pageNo-2)*5+3);
        Choice4=answerList.get((pageNo-2)*5+4);
        Choice5=answerList.get((pageNo-2)*5+5);

        pageNo--;



        questions5=arrayList.get(index);
        index--;
        questions4=arrayList.get(index);
        index--;
        questions3=arrayList.get(index);
        index--;
        questions2=arrayList.get(index);
        index--;
        questions=arrayList.get(index);
        index--;
        return "OK";
    }
}
