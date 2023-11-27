package org.openmetadatainitiative.openminds.latest.publications;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.ISSN;


import static org.openmetadatainitiative.openminds.latest.publications.Periodical.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Periodical extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/publications/Periodical";

    @JsonIgnore
    public Reference<Periodical> getReference() {
        return doGetReference();
    }

    public static Reference<Periodical> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private Periodical(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Periodical>{
        
        public Builder abbreviation(String abbreviation) { Periodical.this.abbreviation = abbreviation; return this; }
        
        public Builder digitalIdentifier(Reference<ISSN> digitalIdentifier) { Periodical.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder name(String name) { Periodical.this.name = name; return this; }
        

        public Periodical build() {
            if (Periodical.this.id == null) {
                Periodical.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(Periodical.this.types == null || Periodical.this.types.isEmpty() || !Periodical.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = Periodical.this.types;
                Periodical.this.types = new ArrayList<>();
                Periodical.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    Periodical.this.types.addAll(oldValues);
                }
            }
            return Periodical.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/abbreviation")
    private String abbreviation;
    
    public String getAbbreviation() {
       return this.abbreviation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<ISSN> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<ISSN> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

 
    public static Periodical.Builder create(LocalId localId){
        return new Periodical(localId).new Builder();
    }

    public Periodical.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Periodical.class).new Builder();
    }
}