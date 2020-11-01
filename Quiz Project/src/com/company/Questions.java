package com.company;

public class Questions {
    Game[] questions = new Game[3];
    Player player = new Player();

    String[] questionsdata = {  "Who was the first person to land on Moon?",
                                "What is the capital of India?",
                                "Which is the top grossing film?"
    };

    String[] options1 = {"Alan Bean", "Mumbai", "Avatar"};
    String[] options2 = {"Sunita Williams", "Kolkata", "Titanic"};
    String[] options3 = {"Neil Armstrong", "Chennai", "Avengers"};
    String[] options4 = {"Dr Strange", "Delhi", "Canberra"};
    int[] answers = {3, 4, 3};

    public void startGame() {
//        created three objects
        for (int i = 0; i < 3; i++) {
            questions[i] = new Game();
        }

        for (int i = 0; i < 3; i++) {

            questions[i].question = questionsdata[i];
            questions[i].option1 = options1[i];
            questions[i].option2 = options2[i];
            questions[i].option3 = options3[i];
            questions[i].option4 = options4[i];
            questions[i].correctAnswer = answers[i];
        }

    }

    public void play() {
        player.getDetails();
        for (int i = 0; i < 3; i++) {
            boolean status = questions[i].askQuestion();
            if (status) {
                System.out.println("******** Correct Answer ********");
                player.score = player.score + 5;
            } else {
                System.out.println("******** Wrong Answer ********");
                player.score = player.score - 5;
            }
        }

        System.out.println(player.name + " - You scored " + player.score);
    }
}
