package Week3.Day2;

public class Textfield extends webelement {
	public void getText() {
		System.out.println("getText");
		
	}
	public static void main(String[] args) {
		Textfield t=new Textfield();
		t.setText();
		t.getText();
		t.click();
		
	}

}
