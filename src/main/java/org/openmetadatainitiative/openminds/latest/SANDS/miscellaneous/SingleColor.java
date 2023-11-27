package org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.SingleColor.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SingleColor extends Instance implements org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.intf.ViewerSpecificationPreferredDisplayColor{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/SingleColor";

    @JsonIgnore
    public Reference<SingleColor> getReference() {
        return doGetReference();
    }

    public static Reference<SingleColor> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private SingleColor(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<SingleColor>{
        
        public Builder value(String value) { SingleColor.this.value = value; return this; }
        

        public SingleColor build() {
            if (SingleColor.this.id == null) {
                SingleColor.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(SingleColor.this.types == null || SingleColor.this.types.isEmpty() || !SingleColor.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = SingleColor.this.types;
                SingleColor.this.types = new ArrayList<>();
                SingleColor.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    SingleColor.this.types.addAll(oldValues);
                }
            }
            return SingleColor.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/value")
    private String value;
    
    /**
    * Entry for a property.
    */
    public String getValue() {
       return this.value;
    }

 
    public static SingleColor.Builder create(LocalId localId){
        return new SingleColor(localId).new Builder();
    }

    public SingleColor.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, SingleColor.class).new Builder();
    }
}