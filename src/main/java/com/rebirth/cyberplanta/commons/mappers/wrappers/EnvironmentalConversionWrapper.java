package com.rebirth.cyberplanta.commons.mappers.wrappers;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import com.rebirth.cyberplanta.commons.avro.model.EnvironmentalMeasurementAvroDTO;
import com.rebirth.cyberplanta.commons.avro.model.InnerTemperatureUnit;

public class EnvironmentalConversionWrapper {

    private EnvironmentalConversionWrapper() {
        throw new UnsupportedOperationException();
    }

    public record Source(ConsumerRecord<String, byte[]> environmentConsumerRecord) {
    }

    public record Target(EnvironmentalMeasurementAvroDTO environmentalMeasurementAvroDTO) {

        public float getHeatIndex() {
            return environmentalMeasurementAvroDTO.getHeatIndex();
        }

        public float getHumidity() {
            return environmentalMeasurementAvroDTO.getHumidity();
        }

        public String getObservation() {
            return environmentalMeasurementAvroDTO.getObservation();
        }

        public float getSoilMoisture() {
            return environmentalMeasurementAvroDTO.getSoilMoisture();
        }

        public float getTemperature() {
            return environmentalMeasurementAvroDTO.getTemperature();
        }

        public InnerTemperatureUnit getTemperatureUnit() {
            return environmentalMeasurementAvroDTO.getTemperatureUnit();
        }

        public long getTimestamp() {
            return environmentalMeasurementAvroDTO.getTimestamp();
        }
    }
}
