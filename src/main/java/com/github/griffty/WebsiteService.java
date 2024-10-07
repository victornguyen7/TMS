package com.github.griffty;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Service class that contains the business logic for handling data operations.
 */
@Service
public class WebsiteService {

    private final DataRepository dataRepository;

    /**
     * Constructs a new WebsiteService with the specified DataRepository.
     *
     * @param dataRepository the DataRepository to be used for database operations
     */
    public WebsiteService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    /**
     * Submits the provided data by creating a new SomeDataFile instance with a random ID
     * and saving it to the database.
     *
     * @param data the data to be saved
     * @return the saved data
     */
    public String submit(String data) {
        SomeDataFile dataFile = dataRepository.save(new SomeDataFile((long) new Random().nextInt(100000), data));
        return dataFile.getData();
    }

    /**
     * Retrieves data from the database that matches the provided data string.
     *
     * @param data the data to be retrieved
     * @return the first matching data found, or "No data found" if no match is found
     */
    public String getData(String data) {
        return dataRepository.findByData(data).stream().map(SomeDataFile::getData).findFirst().orElse("No data found");
    }
}
