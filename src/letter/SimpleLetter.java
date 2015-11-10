package letter;

import town.Inhabitant;

public class SimpleLetter extends Letter<SimpleContent> {

	public SimpleLetter(Inhabitant sender, Inhabitant receiver, String text) {
		super(sender, receiver, 1);
		super.content = new SimpleContent(text); 
	}

	@Override
	public void action() {
		System.out.println(content.getText());
	}
	

}
