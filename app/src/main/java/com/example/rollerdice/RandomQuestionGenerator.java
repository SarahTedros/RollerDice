package com.example.rollerdice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public final class RandomQuestionGenerator {

    ArrayList<String> questions = new ArrayList<String>();
    public  String getRandomQuestions() {

        questions.add("What Course Are Studying ?");
        questions.add("What is your Favorite Colour ?");
        questions.add("What is your Favorite Subject ?");
        questions.add("Can you play an isntrument ?");
        questions.add("What is your favourite sport ?");
        questions.add("Do you like technology ?");
        String question = questions.get(new Random().nextInt(questions.size()));
        return question;
    }

}
