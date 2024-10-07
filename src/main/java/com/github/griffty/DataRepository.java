package com.github.griffty;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository interface for SomeDataFile entities.
 * <p>
 * The {@code @Repository} annotation indicates that this interface is a Spring Data repository.
 * It provides CRUD operations for SomeDataFile entities.
 */
public interface DataRepository extends JpaRepository<SomeDataFile, Long> {
    /**
     * Finds SomeDataFile entities by their data field.
     *
     * @param data the data to search for
     * @return a list of SomeDataFile entities with the matching data
     */
    List<SomeDataFile> findByData(String data);
}
