package net.greenrivertech.ramona.quizapp;

import android.view.View;

import java.util.Random;

/**
 * Created by Ramona on 5/24/2016.
 */
public class QuizModel {

    QuestionModel[] question;
    public static final int BUTTON_TRUE = 0;
    public static final int BUTTON_FALSE = 1;

    private String buttonTrue;
    private String buttonFalse;

    public QuizModel() {
        question = new QuestionModel[4];

        question[0] = new QuestionModel("Jupiter is the 5th planet from tbe sun", true);
        question[1] = new QuestionModel("The Earth is square", false);
        question[2] = new QuestionModel("Election day in the United States is the Tuesday following the first Monday in November", true);
        question[3] = new QuestionModel("The Sun is 10,000,000 degrees F", false);
    }

    public QuestionModel getQuestion() {
        Random randomNumber = new Random();
        int i = randomNumber.nextInt(4);
        return question[i];
    }


    public String getButtonTrue() {
        return buttonTrue;
    }

    public String getButtonFalse() {
        return buttonFalse;
    }




}
