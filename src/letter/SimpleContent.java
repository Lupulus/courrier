package letter;

public class SimpleContent implements Content{

	private String text;
	
	public SimpleContent(String text){
		this.text = text;
	}
	
	public String getDescription() {
		return "Simple Content";
	}
	
	public String getText(){
		return this.text;
	}

}
