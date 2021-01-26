import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppContext;
import spring.Client;
import spring.Client2;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
//		Client client = ctx.getBean(Client.class);
//		client.send();
		
		
		//수행 결과 : 여튼 열고~ 실행하고~ 닫는다.
		Client2 client = ctx.getBean(Client2.class);
		client.send();
		
		ctx.close();
		
	}
}
