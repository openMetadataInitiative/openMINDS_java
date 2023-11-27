package org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.latest.SANDS.mathematicalShapes.Ellipse.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ellipse extends Instance implements org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.CranialWindowPreparationDimension{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/Ellipse";

    @JsonIgnore
    public Reference<Ellipse> getReference() {
        return doGetReference();
    }

    public static Reference<Ellipse> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private Ellipse(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Ellipse>{
        
        public Builder semiMajorAxis(QuantitativeValue semiMajorAxis) { Ellipse.this.semiMajorAxis = semiMajorAxis; return this; }
        
        public Builder semiMinorAxis(QuantitativeValue semiMinorAxis) { Ellipse.this.semiMinorAxis = semiMinorAxis; return this; }
        

        public Ellipse build(OpenMINDSContext context) {
            if (Ellipse.this.id == null) {
                Ellipse.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            Ellipse.this.type = SEMANTIC_NAME;
            return Ellipse.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/semiMajorAxis")
    private QuantitativeValue semiMajorAxis;
    
    public QuantitativeValue getSemiMajorAxis() {
       return this.semiMajorAxis;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/semiMinorAxis")
    private QuantitativeValue semiMinorAxis;
    
    public QuantitativeValue getSemiMinorAxis() {
       return this.semiMinorAxis;
    }

 
    public static Ellipse.Builder create(LocalId localId){
        return new Ellipse(localId).new Builder();
    }

    public Ellipse.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Ellipse.class).new Builder();
    }
}