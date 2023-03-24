package org.example;

import java.util.ArrayList;
import java.util.List;

public class QuestionGenerator {
    private List<Questions> questions = new ArrayList<>();

    public QuestionGenerator(){

        String questionText1 = new String();
        Answer correctAnswer1 = null;
        List<Answer> answerOptions1 = null;

        questions.add( new Questions(questionText1, correctAnswer1, answerOptions1));


        String questionText2 = new String();
        Answer correctAnswer2 = null;
        List<Answer> answerOptions2 = null;

        questions.add(new Questions(questionText2, correctAnswer2, answerOptions2));

    }
    public  List<Questions> getQuestions(){
        return  questions;
    }
}
