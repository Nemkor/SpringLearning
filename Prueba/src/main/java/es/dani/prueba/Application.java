package es.dani.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableCaching
@Configuration
@EnableMongoRepositories("es.dani.prueba.repository")
@SpringBootApplication(scanBasePackages = {"es.dani.prueba"}, exclude = {DataSourceAutoConfiguration.class })
public class Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class, args);

    }


}