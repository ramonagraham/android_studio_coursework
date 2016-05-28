package net.greenrivertech.ramona.quizapp;

import android.view.View;
import android.widget.Button;

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
        question = new QuestionModel[10];

        question[0] = new QuestionModel("Jupiter is the 5th planet from the sun", true);
        question[1] = new QuestionModel("The Earth is square", false);
        question[2] = new QuestionModel("Election day in the United States is the Tuesday following the first Monday in November", true);
        question[3] = new QuestionModel("The Sun is 10,000,000 degrees F", false);
        question[4] = new QuestionModel("Lemons grow on vines", false);
        question[5] = new QuestionModel("Cranberries grow on trees", false);
        question[4] = new QuestionModel("There are 193 countries (known as member states) in the United Nations", true);
        question[5] = new QuestionModel("The Pacific Northwest of the United States is best known for its beautiful coastline, green interior, rainy weather, and spectacular mountains", true);
        question[5] = new QuestionModel("Linus Torvalds Master of Science thesis was called Linux", true);
        question[6] = new QuestionModel("Linus Torvalds invented Git, the core software for the web GitHub", true);
        question[7] = new QuestionModel("The Bowhead Whales are the oldest living mammal on Earth - 211 years old as of May 2016", true);
        question[8] = new QuestionModel("The American Goldfinsh is not the Washington State bird", false);
        question[9] = new QuestionModel("Paper making was invented around 105 AD in China", true);
    }


    public QuestionModel getQuestion(int questionNumber) {
        return question[questionNumber];
    }


//    public QuestionModel getQuestion() {
//        Random randomNumber = new Random();
//        int i = randomNumber.nextInt(4);
//        return question[i];
//    }


    public String getButtonTrue() {
        return buttonTrue;
    }

    public String getButtonFalse() {
        return buttonFalse;
    }

}
