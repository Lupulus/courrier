package letter;

public class SimpleContent implements Content{

	private String text;
	
	public String getDescription() {
		return "Text content";
	}
	
	public SimpleContent(String text){
		this.text = text;
	}
	
	public String getText(){
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
