package org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes.Rectangle.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rectangle extends Instance implements org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.CranialWindowPreparationDimension{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/Rectangle";

    @JsonIgnore
    public Reference<Rectangle> getReference() {
        return doGetReference();
    }

    public static Reference<Rectangle> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private Rectangle(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Rectangle>{
        
        public Builder length(QuantitativeValue length) { Rectangle.this.length = length; return this; }
        
        public Builder width(QuantitativeValue width) { Rectangle.this.width = width; return this; }
        

        public Rectangle build() {
            if (Rectangle.this.id == null) {
                Rectangle.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(Rectangle.this.types == null || Rectangle.this.types.isEmpty() || !Rectangle.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = Rectangle.this.types;
                Rectangle.this.types = new ArrayList<>();
                Rectangle.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    Rectangle.this.types.addAll(oldValues);
                }
            }
            return Rectangle.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/length")
    private QuantitativeValue length;
    
    public QuantitativeValue getLength() {
       return this.length;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/width")
    private QuantitativeValue width;
    
    public QuantitativeValue getWidth() {
       return this.width;
    }

 
    public static Rectangle.Builder create(LocalId localId){
        return new Rectangle(localId).new Builder();
    }

    public Rectangle.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Rectangle.class).new Builder();
    }
}