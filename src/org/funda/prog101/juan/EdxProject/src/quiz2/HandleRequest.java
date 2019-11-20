package quiz2;

public class HandleRequest {
	
	public String readBodyMessage(Request inputRequestObject)
	{
		String bodyMessage = "<body><h1>" + inputRequestObject.message + "</h1></body>";
		return bodyMessage;
	}
	
	public String compute(String inputMessage)
	{
		String message = "<html>" + inputMessage + "</html>";
		return message;
	}
	
	public void attachBody(Request inputRequestObject, String inputComputation)
	{
		//something
	}
	
	
}
