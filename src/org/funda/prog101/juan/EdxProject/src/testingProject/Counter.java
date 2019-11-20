package testingProject;

public class Counter {
	int counter;
	
	public Counter()
	{
		this.counter = 0;
	}
	
	public int increment()
	{
		this.counter++;
		return counter;
	}
	
	public int decrement()
	{
		this.counter--;
		return counter;
	}
}
