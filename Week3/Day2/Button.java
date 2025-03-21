package Week3.Day2;

public class Button extends webelement {
	public void submit() {
		System.out.println("submit");
		
	}
	public static void main(String[] args) {
		Button b=new Button();
		b.click();
		b.setText();
		b.submit();
		
	}

}
