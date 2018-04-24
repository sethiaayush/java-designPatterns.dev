package proxy;

public class App {

	public static void main(String[] args) {
		Internet intConn = new InternetProxy();
		try {
			intConn.connectTo("java2novice.com");
			intConn.connectTo("adult-site.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
