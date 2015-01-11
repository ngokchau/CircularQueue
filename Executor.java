public class Executor {

	public static void main(String[] args) {
		Utility.init(); // initializes file readers
		String[] questions = Utility.readQuestions(); //reads question.txt file into questions array
		String[] answers = Utility.readAnswers(); // reads answers.txt file into answers array
		
		int numOracles = answers.length; //finds the number of oracles

		ArrayQueue[] oracles = new ArrayQueue[numOracles];

		for(String question : questions)
		{
			int n = Utility.random(numOracles);

			if(null == oracles[n])
			{
				ArrayQueue oracle = new ArrayQueue();
				oracle.enqueue(question);
				oracles[n] = oracle;
			}
			else
			{
				oracles[n].enqueue(question);
			}
		}

		/**
		 * Doesn't always have 10 questions?
		 * Answers are always in the same order?
		 * 	first oracle always get the first answer
		 * 	second oracle always get the second answer
		 *
		 */
		for(int i = 0; i < oracles.length; i++)
		{
			ArrayQueue oracle = oracles[i];

			if(null != oracle && 0 != oracle.getSize())
			{
				String question = oracle.dequeue();
				System.out.println((i + 1) + " " + question + ": " + answers[i]);
			}
		}


		//TODO Assign questions to oracles using Utility.random and print the question paired with the oracle response

		// 1. Initialize one ArrayQueue per oracle (arrays will work best).

		// 2. Put the questions into the queues, assigning each one to the queue of the oracle whose number is returned by the random number generator.

		// 3. Loop through the oracles, having each one remove a question from its queue (if empty do nothing) and answer it with its unique answer (oracle[k] uses answers[k]). Do this repeatedly till all queues become empty.
	}
}

