package org.openmetadatainitiative.openminds.v3.publications;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.publications.Periodical;


import static org.openmetadatainitiative.openminds.v3.publications.PublicationVolume.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PublicationVolume extends Instance implements org.openmetadatainitiative.openminds.v3.publications.intf.ScholarlyArticleIsPartOf{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/publications/PublicationVolume";

    @JsonIgnore
    public Reference<PublicationVolume> getReference() {
        return doGetReference();
    }

    public static Reference<PublicationVolume> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private PublicationVolume(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<PublicationVolume>{
        
        public Builder isPartOf(Reference<Periodical> isPartOf) { PublicationVolume.this.isPartOf = isPartOf; return this; }
        
        public Builder volumeNumber(String volumeNumber) { PublicationVolume.this.volumeNumber = volumeNumber; return this; }
        

        public PublicationVolume build(OpenMINDSContext context) {
            if (PublicationVolume.this.id == null) {
                PublicationVolume.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            PublicationVolume.this.type = SEMANTIC_NAME;
            return PublicationVolume.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isPartOf")
    private Reference<Periodical> isPartOf;
    
    /**
    * Reference to the ensemble of multiple things or beings.
    */
    public Reference<Periodical> getIsPartOf() {
       return this.isPartOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/volumeNumber")
    private String volumeNumber;
    
    public String getVolumeNumber() {
       return this.volumeNumber;
    }

 
    public static PublicationVolume.Builder create(LocalId localId){
        return new PublicationVolume(localId).new Builder();
    }

    public PublicationVolume.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, PublicationVolume.class).new Builder();
    }
}