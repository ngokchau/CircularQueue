
public class ArrayQueue {
	private String[] queueArray;
	private int size;
	private int front;
	private int back;
	
	public ArrayQueue()
	{
		queueArray = new String[100];
		size = 0;
		front = 0;
		back = -1;
	}
	
	public ArrayQueue(int startSize)
	{
		queueArray = new String[startSize];
		size = 0;
		front = 0;
		back = -1;
	}

	/**
	 * @function returns the number of elements in the queue
	 * @return size
	 */
	public int getSize()
	{
		return size;
	}

	/**
	 * @function adds a string to the end of the queue
	 * @param toEnqueue: the input to be inserted
	 */
	public void enqueue(String toEnqueue)
	{
		if(isFull())
		{
			throw new StackOverflowError();
		}

		size++;
        int next;

		if(back == size - 1)
		{
			next = size;
		}
		else if(back > size)
		{
			next = back + 1;
		}
		else
		{
			next = (back + 1) % size;
		}

        queueArray[next] = toEnqueue;
        back = next;
	}
	
	/**
	 * @function removes the string from the front of the queue
	 * @return the string from the front of the queue
	 */
	public String dequeue()
	{
		if(isEmpty())
		{
			return null;
		}

        String toDequeue = queueArray[front];

		if((front + 1) % size != 0 && front % size != 0)
		{
			front = (front + 1) % size;
		}
		else if(front == size - 1)
		{
			front = size;
		}
		else
		{
			front++;
		}

        size--;
        return toDequeue;
	}
	
	/**
	 * 
	 * @return returns true if the queue is empty, false otherwise
	 */
	public boolean isEmpty()
	{
		return size == 0;
	}

	/**
	 * 
	 * @return returns true if the queue is full, false otherwise
	 */
	public boolean isFull()
	{
		return size == queueArray.length;
	}
	
}
