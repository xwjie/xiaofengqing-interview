package cn.xiaowenjie.webperformance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@ServletComponentScan
@SpringBootApplication
public class WebPerformanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebPerformanceApplication.class, args);
	}

}
