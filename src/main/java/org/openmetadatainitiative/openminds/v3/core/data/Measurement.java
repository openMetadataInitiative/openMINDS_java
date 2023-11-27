package org.openmetadatainitiative.openminds.v3.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.MeasuredQuantity;
import org.openmetadatainitiative.openminds.v3.core.data.intf.MeasurementMeasuredWith;
import org.openmetadatainitiative.openminds.v3.core.data.intf.MeasurementValue;


import static org.openmetadatainitiative.openminds.v3.core.data.Measurement.*;
/**
 * Structured information about a measurement performed during a scientific experiment.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Measurement extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Measurement";

    @JsonIgnore
    public Reference<Measurement> getReference() {
        return doGetReference();
    }

    public static Reference<Measurement> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private Measurement(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Measurement>{
        
        public Builder additionalRemarks(String additionalRemarks) { Measurement.this.additionalRemarks = additionalRemarks; return this; }
        
        public Builder measuredQuantity(Reference<MeasuredQuantity> measuredQuantity) { Measurement.this.measuredQuantity = measuredQuantity; return this; }
        
        public Builder measuredWith(Reference<? extends MeasurementMeasuredWith> measuredWith) { Measurement.this.measuredWith = measuredWith; return this; }
        
        public Builder timestamp(String timestamp) { Measurement.this.timestamp = timestamp; return this; }
        
        public Builder value(List<? extends MeasurementValue> value) { Measurement.this.value = value; return this; }
        

        public Measurement build() {
            if (Measurement.this.id == null) {
                Measurement.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(Measurement.this.types == null || Measurement.this.types.isEmpty() || !Measurement.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = Measurement.this.types;
                Measurement.this.types = new ArrayList<>();
                Measurement.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    Measurement.this.types.addAll(oldValues);
                }
            }
            return Measurement.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/additionalRemarks")
    private String additionalRemarks;
    
    /**
    * Mention of what deserves additional attention or notice.
    */
    public String getAdditionalRemarks() {
       return this.additionalRemarks;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/measuredQuantity")
    private Reference<MeasuredQuantity> measuredQuantity;
    
    public Reference<MeasuredQuantity> getMeasuredQuantity() {
       return this.measuredQuantity;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/measuredWith")
    private Reference<? extends MeasurementMeasuredWith> measuredWith;
    
    public Reference<? extends MeasurementMeasuredWith> getMeasuredWith() {
       return this.measuredWith;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/timestamp")
    private String timestamp;
    
    public String getTimestamp() {
       return this.timestamp;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/value")
    private List<? extends MeasurementValue> value;
    
    /**
    * Entry for a property.
    */
    public List<? extends MeasurementValue> getValue() {
       return this.value;
    }

 
    public static Measurement.Builder create(LocalId localId){
        return new Measurement(localId).new Builder();
    }

    public Measurement.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Measurement.class).new Builder();
    }
}