package net.greenrivertech.ramona.quizapp;

/**
 * Created by Ramona on 5/24/2016.
 */
public class QuestionModel {

    private String question;
    private String response;

    public QuestionModel() {
        question = "";
        response = "";
    }

    public QuestionModel(String question, String response) {
        this.question = question;
        this.response = response;
    }

    public String getQuestion() {
        return question;
    }

    public String getResponse() {
        return response;
    }
}

