package spring;

public class Client2 {
	private String host;

	public void setHost(String host) {
		this.host =host;
	}
	
	public void connect() {
		System.out.println("client2.connect() excuted");
	}
	
	public void send() {
		System.out.println("client2.send() to "+host);
	}
	
	public void close() {
		System.out.println("client2.close() executed");
	}
}
