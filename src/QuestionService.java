import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5]; // Created Question Reference Array
    String[] userAnswer = new String[5];

    //Adding Question Objects
    public QuestionService(){
        questions[0] = new Question(1, "Which of the following is not a Java keyword?",
                new String[]{"class", "interface", "delete", "extends"}, "delete");
        questions[1] = new Question(2, "What is the size of an int variable in Java?",
                new String[]{"4 bytes", "2 bytes", "8 bytes", "Depends on system"}, "4 bytes");

        questions[2] = new Question(3, "Which method is the entry point of a Java program?",
                new String[]{"start()", "main()", "run()", "init()"}, "main()");

        questions[3] = new Question(4, "Which data structure uses FIFO order?",
                new String[]{"Stack", "Queue", "Tree", "Graph"}, "Queue");

        questions[4] = new Question(5, "Which of these is not a primitive data type in Java?",
                new String[]{"int", "float", "boolean", "String"}, "String");

    }


    //Play Quiz Service
    public void playQuiz(){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for (Question q : questions){
            System.out.println("Question no. : " +  q.getId());
            System.out.println(q.getQuestion());
            for (String option : q.getOptions()){
                System.out.println(option);
            }
            System.out.println("--------------");
            System.out.println("Enter your answer : ");
            userAnswer[i] = sc.nextLine();
            i++;


        }
        System.out.println("--------------");
        System.out.println("Your Answers");
        for (String s : userAnswer){
            System.out.println(s);
        }
        System.out.println("--------------");






    }
    // Score Function
    public int  score (){
        int score = 0;
        for (int i = 0; i < questions.length; i++){
            String currectAnswer = questions[i].getAnswer();
            String answerByUser = userAnswer[i];
            if (currectAnswer.equals(answerByUser))
                score++;
        }
        return score;
    }
}
