package quiz2;

public class Request {
	String name;
	String message;
	
	public Request()
	{}
	
	public Request(String name, String message)
	{
		this.name = name;
		this.message = message;
	}
	
	public String getmethod()
	{
		return name;
	}
	
	
}
