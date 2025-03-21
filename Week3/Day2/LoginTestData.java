package Week3.Day2;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("sureka");
		
		
	}
	public void enterPassword() {
		System.out.println("123456");
		
	}
	public static void main(String[] args) {
		LoginTestData l=new LoginTestData();
		l.enterCredentials();
		l.enterPassword();
		l.enterUsername();
		l.navigateToHomePage();
	}
		
	}


