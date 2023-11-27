package org.openmetadatainitiative.openminds.latest.publications;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.publications.PublicationVolume;


import static org.openmetadatainitiative.openminds.latest.publications.PublicationIssue.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PublicationIssue extends Instance implements org.openmetadatainitiative.openminds.latest.publications.intf.ScholarlyArticleIsPartOf{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/publications/PublicationIssue";

    @JsonIgnore
    public Reference<PublicationIssue> getReference() {
        return doGetReference();
    }

    public static Reference<PublicationIssue> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private PublicationIssue(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<PublicationIssue>{
        
        public Builder isPartOf(Reference<PublicationVolume> isPartOf) { PublicationIssue.this.isPartOf = isPartOf; return this; }
        
        public Builder issueNumber(String issueNumber) { PublicationIssue.this.issueNumber = issueNumber; return this; }
        

        public PublicationIssue build(OpenMINDSContext context) {
            if (PublicationIssue.this.id == null) {
                PublicationIssue.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            PublicationIssue.this.type = SEMANTIC_NAME;
            return PublicationIssue.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isPartOf")
    private Reference<PublicationVolume> isPartOf;
    
    /**
    * Reference to the ensemble of multiple things or beings.
    */
    public Reference<PublicationVolume> getIsPartOf() {
       return this.isPartOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/issueNumber")
    private String issueNumber;
    
    public String getIssueNumber() {
       return this.issueNumber;
    }

 
    public static PublicationIssue.Builder create(LocalId localId){
        return new PublicationIssue(localId).new Builder();
    }

    public PublicationIssue.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, PublicationIssue.class).new Builder();
    }
}