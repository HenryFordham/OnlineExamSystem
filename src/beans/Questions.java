package beans;

public class Questions {
    String QuesNo;
    String CouName;
    String Question;
    String A;
    String B;
    String C;
    String D;
    String Answer;
    public Questions(){

    }
    public Questions(String CouName,String Question,String A,String B,String C,String D,String Answer){
        this.CouName=CouName;
        this.Question=Question;
        this.A=A;
        this.B=B;
        this.C=C;
        this.D=D;
        this.Answer=Answer;
    }
    public String getQuesNo() {
        return QuesNo;
    }

    public void setQuesNo(String quesNo) {
        QuesNo = quesNo;
    }

    public String getCouName() {
        return CouName;
    }

    public void setCouName(String couName) {
        CouName = couName;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }




}
