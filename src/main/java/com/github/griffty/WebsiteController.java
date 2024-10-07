package com.github.griffty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Controller class that handles HTTP requests for the website.
 * <p>
 * The {@code @Controller} annotation indicates that this class serves as a web controller,
 * capable of handling HTTP requests and returning views.
 */
@Controller
public class WebsiteController {
    private final WebsiteService service;

    /**
     * Constructs a new WebsiteController with the specified WebsiteService.
     *
     * @param service the WebsiteService to be used for business logic operations
     */
    public WebsiteController(WebsiteService service) {
        this.service = service;
    }

    /**
     * Handles GET requests to the /index endpoint.
     * <p>
     * The {@code @GetMapping} annotation maps HTTP GET requests to this method.
     * This method returns the name of the view to be rendered.
     *
     * @return the name of the index view
     */
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * Handles GET requests to the /{data} endpoint.
     * <p>
     * The {@code @GetMapping} annotation maps HTTP GET requests to this method.
     * The {@code @PathVariable} annotation binds the value of the URI template variable
     * to the method parameter.
     *
     * @param data the data path variable
     * @return the data retrieved from the service
     */
    @GetMapping("/{data}")
    public String data(@PathVariable("data") String data) {
        return service.getData(data);
    }

    /**
     * Handles POST requests to the /submit endpoint.
     * <p>
     * The {@code @PostMapping} annotation maps HTTP POST requests to this method.
     * The {@code @RequestBody} annotation binds the HTTP request body to the method parameter.
     *
     * @param data the data to be submitted
     * @return the data saved by the service
     */
    @PostMapping("/submit")
    public String submit(@RequestBody String data) {
        return service.submit(data);
    }
}