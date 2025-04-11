package com.example.service.dto;

public class CreatePatientDto {
    private String name;

    public CreatePatientDto() {
    }

    public CreatePatientDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
