package org.openmetadatainitiative.openminds.latest.core.research;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.research.intf.ProtocolDescribedIn;
import org.openmetadatainitiative.openminds.latest.core.research.intf.ProtocolStimulusType;
import org.openmetadatainitiative.openminds.latest.core.research.intf.ProtocolTechnique;


import static org.openmetadatainitiative.openminds.latest.core.research.Protocol.*;
/**
 * Structured information on a research project.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Protocol extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Protocol";

    @JsonIgnore
    public Reference<Protocol> getReference() {
        return doGetReference();
    }

    public static Reference<Protocol> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private Protocol(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Protocol>{
        
        public Builder describedIn(Reference<? extends ProtocolDescribedIn> describedIn) { Protocol.this.describedIn = describedIn; return this; }
        
        public Builder description(String description) { Protocol.this.description = description; return this; }
        
        public Builder name(String name) { Protocol.this.name = name; return this; }
        
        public Builder stimulusType(List<Reference<? extends ProtocolStimulusType>> stimulusType) { Protocol.this.stimulusType = stimulusType; return this; }
        
        public Builder technique(List<Reference<? extends ProtocolTechnique>> technique) { Protocol.this.technique = technique; return this; }
        

        public Protocol build() {
            if (Protocol.this.id == null) {
                Protocol.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(Protocol.this.types == null || Protocol.this.types.isEmpty() || !Protocol.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = Protocol.this.types;
                Protocol.this.types = new ArrayList<>();
                Protocol.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    Protocol.this.types.addAll(oldValues);
                }
            }
            return Protocol.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/describedIn")
    private Reference<? extends ProtocolDescribedIn> describedIn;
    
    public Reference<? extends ProtocolDescribedIn> getDescribedIn() {
       return this.describedIn;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/stimulusType")
    private List<Reference<? extends ProtocolStimulusType>> stimulusType;
    
    public List<Reference<? extends ProtocolStimulusType>> getStimulusType() {
       return this.stimulusType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/technique")
    private List<Reference<? extends ProtocolTechnique>> technique;
    
    /**
    * Method of accomplishing a desired aim.
    */
    public List<Reference<? extends ProtocolTechnique>> getTechnique() {
       return this.technique;
    }

 
    public static Protocol.Builder create(LocalId localId){
        return new Protocol(localId).new Builder();
    }

    public Protocol.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Protocol.class).new Builder();
    }
}