package org.example;

import java.util.List;

public class Questions {
    private String questionText;
    private Answer correctAnswer;
    private List<Answer> answerOptions;

    public Questions (String questionText, Answer correctAnswer, List<Answer> answerOptions){
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.answerOptions = answerOptions;
    }
    public String getQuestionText(){
        return questionText;
    }
    public Answer getCorrectAnswer(){
        return correctAnswer;
    }
    public List<Answer> getAnswerOptions(){
        return answerOptions;
    }
}
