package org.openmetadatainitiative.openminds.v3.core.research;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.core.research.intf.NumericalPropertyValue;


import static org.openmetadatainitiative.openminds.v3.core.research.NumericalProperty.SEMANTIC_NAME;
/**
 * Structured information about a property of some entity or process whose value is a number.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NumericalProperty extends Instance implements org.openmetadatainitiative.openminds.v3.core.research.intf.PropertyValueListPropertyValuePair, org.openmetadatainitiative.openminds.v3.specimenPrep.device.intf.SlicingDeviceUsageSlicingAngle{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/NumericalProperty";

    @JsonIgnore
    public Reference<NumericalProperty> getReference() {
        return doGetReference();
    }

    public static Reference<NumericalProperty> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private NumericalProperty(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<NumericalProperty>{
        
        public Builder name(String name) { NumericalProperty.this.name = name; return this; }
        
        public Builder value(List<? extends NumericalPropertyValue> value) { NumericalProperty.this.value = value; return this; }
        

        public NumericalProperty build(OpenMINDSContext context) {
            if (NumericalProperty.this.id == null) {
                NumericalProperty.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            NumericalProperty.this.type = SEMANTIC_NAME;
            return NumericalProperty.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/value")
    private List<? extends NumericalPropertyValue> value;
    
    /**
    * Entry for a property.
    */
    public List<? extends NumericalPropertyValue> getValue() {
       return this.value;
    }

 
    public static NumericalProperty.Builder create(LocalId localId){
        return new NumericalProperty(localId).new Builder();
    }

    public NumericalProperty.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, NumericalProperty.class).new Builder();
    }
}