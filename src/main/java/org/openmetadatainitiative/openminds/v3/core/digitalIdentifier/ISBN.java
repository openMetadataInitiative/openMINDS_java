package org.openmetadatainitiative.openminds.v3.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.ISBN.SEMANTIC_NAME;
/**
 * An International Standard Book Number of the International ISBN Agency.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ISBN extends Instance implements org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceCitedPublication, org.openmetadatainitiative.openminds.v3.publications.intf.ChapterCitedPublication, org.openmetadatainitiative.openminds.v3.publications.intf.ScholarlyArticleCitedPublication, org.openmetadatainitiative.openminds.v3.publications.intf.LivePaperVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.publications.intf.BookCitedPublication, org.openmetadatainitiative.openminds.v3.publications.intf.BookDigitalIdentifier, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionDigitalIdentifier, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasDigitalIdentifier, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceDigitalIdentifier, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionDigitalIdentifier, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.core.products.intf.WebServiceVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelVersionRelatedPublication, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionRelatedPublication{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/ISBN";

    @JsonIgnore
    public Reference<ISBN> getReference() {
        return doGetReference();
    }

    public static Reference<ISBN> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private ISBN(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ISBN>{
        
        public Builder identifier(String identifier) { ISBN.this.identifier = identifier; return this; }
        

        public ISBN build(OpenMINDSContext context) {
            if (ISBN.this.id == null) {
                ISBN.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            ISBN.this.type = SEMANTIC_NAME;
            return ISBN.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/identifier")
    private String identifier;
    
    /**
    * Term or code used to identify something or someone.
    */
    public String getIdentifier() {
       return this.identifier;
    }

 
    public static ISBN.Builder create(LocalId localId){
        return new ISBN(localId).new Builder();
    }

    public ISBN.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ISBN.class).new Builder();
    }
}