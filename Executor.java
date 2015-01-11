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
	}
}

