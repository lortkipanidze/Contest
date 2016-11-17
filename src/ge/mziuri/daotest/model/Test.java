
package ge.mziuri.daotest.model;


public class Test {
    private int id;
    private String question;
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;
    private String correctanswer;
    private int  contest_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public String getCorrectanswer() {
        return correctanswer;
    }

    public void setCorrectanswer(String correctanswer) {
        this.correctanswer = correctanswer;
    }

    public int getContest_id() {
        return contest_id;
    }

    public void setContest_id(int contest_id) {
        this.contest_id = contest_id;
    }

    public Test(int id, String question, String ans1, String ans2, String ans3, String ans4, String correctanswer, int contest_id) {
        this.id = id;
        this.question = question;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.correctanswer = correctanswer;
        this.contest_id = contest_id;
    }

    public Test() {
    }
      @Override
    public String toString() {
        return "Contest{" + "id=" + id + ", question=" + question + ", ans1=" + ans1 + ", ans2=" + ans2  + ", ans3=" + ans3 +  ", ans4=" + ans4 + ", correctanswer=" + correctanswer + ", contest_id=" + contest_id + '}';
    }
}
