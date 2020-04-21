package es.autowired.scc.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Application implements CommandLineRunner {

	private final String jdbcurl;
	private final String password;
	private final String unparametro;

	public Application(@Value("${jdbcurl") String jdbcurl,
					   @Value("${password}") String password,
					   @Value("${unparametro}") String unparametro) {
		this.jdbcurl = jdbcurl;
		this.password = password;
		this.unparametro = unparametro;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("\n\n\n\n🤓 Bienvenido al test!!");
		log.info("\n 🚀 jdbcurl: {}", jdbcurl);
		log.info("\n 🚀 password: {}", password);
		log.info("\n 🚀 unparametro: {}", unparametro);
	}
}
