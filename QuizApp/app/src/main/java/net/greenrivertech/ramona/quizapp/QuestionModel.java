package net.greenrivertech.ramona.quizapp;

/**
 * Created by Ramona on 5/24/2016.
 */
public class QuestionModel {

    private String question;
    private boolean response;

    /**
     * This contractor initializes question to an empty String, and response to boolean false.
     */
    public QuestionModel() {
        question = "";
        response = false;
    }

    /**
     * This constructor provides a means to enter a String question and boolean response
     * @param question The question to be answered true or false
     * @param response the answer
     */
    public QuestionModel(String question, boolean response) {
        this.question = question;
        this.response = response;
    }

    /**
     * This method returns the question at the specified element (questionNumber)
     * @param questionNumber
     * @return question and response
     */
    public String getQuestion(int questionNumber) {
        return question;
    }

    /**
     * This method returns the answer in the question
     * @return response answer
     */
    public boolean getResponse() {
        return response;
    }
}

