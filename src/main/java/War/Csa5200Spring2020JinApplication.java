package War;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class Csa5200Spring2020JinApplication
extends SpringBootServletInitializer {

@Override
protected SpringApplicationBuilder
	configure(SpringApplicationBuilder application) {
	return application.sources(
			Csa5200Spring2020JinApplication.class);
}

public static void main(String[] args) {
	SpringApplication.run(
			Csa5200Spring2020JinApplication.class, args);
}
}

