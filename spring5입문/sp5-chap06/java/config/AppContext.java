package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.Client;
import spring.Client2;

@Configuration
public class AppContext {
	//@Bean
	public Client client() {
		Client client = new Client();
		client.setHost("host");
		return client;
	}
	
	//InitializingBean,DisposableBean interface를 사용할 수 없거나 할 때, 직접 메서드를 지정 가능.
	@Bean(initMethod="connect",destroyMethod = "close")
	public Client2 client2() {
		Client2 client=new Client2();
		client.setHost("host");
		return client;
	}
	
	
}
