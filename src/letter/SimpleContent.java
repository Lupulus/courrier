package letter;

public class SimpleContent implements Content{

	private String text;
	
	
	public SimpleContent(String text){
		this.text = text;
	}
	
	//Returns the content's description
	public String getDescription() {
		return "Text content";
	}
	
	//Returns the content's text
	public String getText(){
		return this.text;
	}

	//Set the content's text
	public void setText(String text) {
		this.text = text;
	}
}
