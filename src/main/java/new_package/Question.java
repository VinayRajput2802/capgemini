package new_package;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int qid;
    private String questionName;
    @OneToMany(mappedBy="question",cascade = CascadeType.ALL)
    private List<Answer> answer;
    private String level;

    public Question(){}
    public Question(String questionName,String level){
        this.questionName = questionName;
        this.level = level;
    }
    public Question(String questionName, List<Answer> answer, String level) {
        this.questionName = questionName;
        this.answer = answer;
        this.level = level;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public int getQid(){
        return this.qid;
    }

}
