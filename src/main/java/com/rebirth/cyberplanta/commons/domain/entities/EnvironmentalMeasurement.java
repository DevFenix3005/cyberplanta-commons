package com.rebirth.cyberplanta.commons.domain.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("environmental_measure")
public final class EnvironmentalMeasurement implements Serializable {

    @Id
    private String id;

    private Float heatIndex;

    private Float humidity;

    private String observation;

    private Float soilMoisture;

    private Float temperature;

    private TemperatureUnit temperatureUnit;

    private LocalDateTime measurementDateTaken;

    private String kafkaKey;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private LocalDateTime createdAt;

}
