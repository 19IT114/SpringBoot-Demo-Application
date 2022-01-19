package config;

import Repository.CourseRepository;
import entity.Course;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;


@Configuration
public class LoadDatabase {
    private static final Logger log = (Logger) LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(CourseRepository courseRepository) {
        return args -> {
            log.info("Preloading " + courseRepository.save(new Course("Spring","Learn new Concepts abouts Spring Boot",new Date())));
            log.info("Preloading " + courseRepository.save(new Course("OS","Learn new Consepts abouts Operating System",new Date())));

        };
    }
}
