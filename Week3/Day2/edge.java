package Week3.Day2;

public class edge extends BROWSER {
	public void takeSnap() {
System.out.println("takeSnap");
	}
	public void clearCookies() {
System.out.println("clearCookies");

	}
	public static void main(String[] args) {
		edge e=new edge();
		e.browserName();
		e.browserVersion();e.clearCookies();
		e.closeBrowser();
		e.clearCookies();
		e.navigateBack();
		e.openURL();
		e.takeSnap();
		
	}

}
