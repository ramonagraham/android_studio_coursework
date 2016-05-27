package net.greenrivertech.ramona.quizapp;

/**
 * Created by Ramona on 5/24/2016.
 */
public class QuestionModel {

    private String question;
    private boolean response;

    public QuestionModel() {
        question = "";
        response = false;
    }

    public QuestionModel(String question, boolean response) {
        this.question = question;
        this.response = response;
    }

    public String getQuestion(int questionNumber) {
        return question;
    }

    public boolean getResponse() {
        return response;
    }
}

