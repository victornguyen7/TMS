package com.github.griffty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Autowiring
 * <p>
 *     Spring autowiring is a feature that automatically connects different parts of your application. It helps to reduce the need for manual configuration by automatically injecting the required dependencies into your classes. This is done using annotations like @Autowired, @Inject, or @Resource.
 * <p>
 * Services, Controllers, and Repositories
 * <p>
 *      Service: A service class contains the main business logic of your application. It is marked with the @Service annotation. Services are used to perform operations, often involving multiple repositories or other services.
 * <p>
 *      Controller: A controller class handles HTTP requests from the web. It is marked with the @Controller or @RestController annotation. Controllers process user input and return appropriate responses, often by calling methods in service classes.
 * <p>
 *      Repository: A repository interface provides methods to perform CRUD (Create, Read, Update, Delete) operations on your data. It is marked with the @Repository annotation and typically extends JpaRepository or another Spring Data repository interface. Repositories abstract the data access layer, making it easier to interact with the database
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
