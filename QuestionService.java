
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];
    
    public QuestionService(){
        questions[0] = new Question(1, "What is two power 10 ?", "1024", "1065", "24", "96", "1024");
        questions[1] = new Question(2, "What is the capital of France?", "Paris", "London", "Berlin", "Madrid", "Paris");
        questions[2] = new Question(3, "Which planet is known as the Red Planet?", "Mars", "Venus", "Jupiter", "Saturn", "Mars");
        questions[3] = new Question(4, "What is the largest country in the world by land area?", "Russia", "Canada", "China", "United States", "Russia");
        questions[4] = new Question(5, "Who painted the Mona Lisa?", "Leonardo da Vinci", "Michelangelo", "Raphael", "Donatello", "Leonardo da Vinci");
    }
    public void PlayQuiz()
    {
        int i = 0; 
        for(Question q : questions)
        {
            System.out.println("Question no. "+ q.getId());
            System.out.println("Question: "+ q.getQuestion());
            System.out.println("Option 1: "+ q.getOpt1());
            System.out.println("Option 2: "+ q.getOpt2());
            System.out.println("Option 3: "+ q.getOpt3());
            System.out.println("Option 4: "+ q.getOpt4());
            System.out.println("Enter Your Answer:");
            Scanner abc = new Scanner(System.in);
            selection[i] = abc.nextLine();
            i++;
            }
            System.out.println("Your given Answers:");
            for(String s : selection){
                System.out.println(s);
            }
        }

        public void printscore()
        {
            int score = 0;
            for(int i = 0; i < questions.length; i++)
            {
                Question que = questions[i];
                String actualAnswer = que.getAnswer();
                String userAnswer = selection[i];

                if(actualAnswer.equals(userAnswer))
                {
                    score++;
                }
                System.out.println("Your gave wrong answers to the questions: ");
                if(!actualAnswer.equals(userAnswer))
                {
                    System.out.println(que.getQuestion());
                }
            }
            System.out.println("Your Score is: "+ score);
        }
    }
