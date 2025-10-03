package advJava;
	import java.util.*;

	class Question {
	    String question;
	    String[] options;
	    int answer; // index of correct option

	    Question(String q, String[] opts, int ans) {
	        question = q;
	        options = opts;
	        answer = ans;
	    }
	}

	public class OnlineQuiz {
	    public static void main(String[] args) {
	        List<Question> quiz = new ArrayList<>();
	        quiz.add(new Question("Capital of India?", new String[]{"Delhi","Mumbai","Kolkata"}, 0));
	        quiz.add(new Question("5 + 3 = ?", new String[]{"5","8","10"}, 1));

	        Scanner sc = new Scanner(System.in);
	        int score = 0;

	        for (Question q : quiz) {
	            System.out.println(q.question);
	            for (int i = 0; i < q.options.length; i++)
	                System.out.println((i+1) + ". " + q.options[i]);
	            System.out.print("Enter option number: ");
	            int ans = sc.nextInt();
	            if (ans - 1 == q.answer) score++;
	        }

	        System.out.println("Your score: " + score + "/" + quiz.size());
	    }
	}
