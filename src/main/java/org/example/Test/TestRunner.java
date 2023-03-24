package org.example.Test;

import org.example.Answer;
import org.example.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestRunner {
    private List<Questions> questions;
    private TestResult testResult = new TestResult();
    private Collections Collestion;


    public TestRunner(List<Questions> questions){
        this.questions = questions;
    }
    public void runTest(){
        Collestion.shuffle(questions);
        Scanner scanner = new Scanner(System.in);

        for (Questions questions : questions){
            System.out.println(questions.getQuestionText());
            List<Answer> answerOptions = new ArrayList<>(questions.getAnswerOptions());
            Collestion.shuffle(answerOptions);
            for (int i = 0; i<answerOptions.size(); i++ ){
                System.out.println((char) ('A' + i) + ": " + answerOptions.get(i));
            }
            Answer selectedAnswer = null;
            boolean validAnswer = false;
            while (!validAnswer){
                String input =  scanner.nextLine().toUpperCase();
            }
        }

    }
}
