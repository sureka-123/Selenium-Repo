package Week3.Day2;

public class chrome extends BROWSER {
		public void openIncognito() {
			System.out.println("openIncognito");
		}
		public void clearCache() {
			System.out.println("clearCache");
		}
		public static void main(String[] args) {
			chrome c=new chrome();
			c.clearCache();
			c.openIncognito();
			c.browserName();
			c.browserVersion();
			c.closeBrowser();
			c.navigateBack();
			c.openURL();
			
			
		}
		
	}

