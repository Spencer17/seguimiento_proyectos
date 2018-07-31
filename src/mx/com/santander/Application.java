package mx.com.santander;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * This is a Javadoc comment
 * @param <T> the parameter of the class
 */
@SpringBootApplication
@EnableJpaRepositories("mx.com.santander.*")
public class Application {
	private final static Logger logger = LoggerFactory.getLogger(Application.class);
	/**
	 * This is a Javadoc comment
	 * @param <T> the parameter of the class
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			logger.info(beanName);
		}
	}
}