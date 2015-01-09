public class Executor {

	public static void main(String[] args) {
		Utility.init(); // initializes file readers
		String[] questions = Utility.readQuestions(); //reads question.txt file into questions array
		String[] answers = Utility.readAnswers(); // reads answers.txt file into answers array
		
		int numOracles = answers.length; //finds the number of oracles

		ArrayQueue aq = new ArrayQueue();
		aq.enqueue("a");
		aq.enqueue("b");
		aq.enqueue("c");
		String o1 = aq.dequeue();
		aq.enqueue("d");
		aq.enqueue("e");
		String o2 = aq.dequeue();
		String o3 = aq.dequeue();
		aq.enqueue("f");
		String o4 = aq.dequeue();
		String o5 = aq.dequeue();
		String o6 = aq.dequeue();

		// 1. Initialize one ArrayQueue per oracle (arrays will work best).

		// 2. Put the questions (toor.

		// 3. Loop through the oracles, having each one remove a question from its queue (if empty do nothing) and answer it with its unique answer (oracle[k] uses answers[k]). Do this repeatedly till all queues become empty.
	}
}

