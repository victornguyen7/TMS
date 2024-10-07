package com.github.griffty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SomeDataFile {
    @Id
    private final Long id;
    private final String data;

    protected SomeDataFile(Long id, String data) {
        this.id = id;
        this.data = data;
    }

    public SomeDataFile() {
        this.id = -1L;
        this.data = null;
    }


    public Long getId() {
        return id;
    }

    public String getData() {
        return data;
    }
}
