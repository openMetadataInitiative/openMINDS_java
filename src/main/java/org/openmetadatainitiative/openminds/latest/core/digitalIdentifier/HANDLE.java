package org.openmetadatainitiative.openminds.latest.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.HANDLE.*;
/**
 * A persistent identifier for an information resource provided by the Handle System of the Corporation for National Research Initiatives.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HANDLE extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowRecipeVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.BrainAtlasVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.SoftwareVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.WebServiceVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.MetaDataModelVersionRelatedPublication, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionRelatedPublication{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/HANDLE";

    @JsonIgnore
    public Reference<HANDLE> getReference() {
        return doGetReference();
    }

    public static Reference<HANDLE> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private HANDLE(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<HANDLE>{
        
        public Builder identifier(String identifier) { HANDLE.this.identifier = identifier; return this; }
        

        public HANDLE build() {
            if (HANDLE.this.id == null) {
                HANDLE.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(HANDLE.this.types == null || HANDLE.this.types.isEmpty() || !HANDLE.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = HANDLE.this.types;
                HANDLE.this.types = new ArrayList<>();
                HANDLE.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    HANDLE.this.types.addAll(oldValues);
                }
            }
            return HANDLE.this;
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

 
    public static HANDLE.Builder create(LocalId localId){
        return new HANDLE(localId).new Builder();
    }

    public HANDLE.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, HANDLE.class).new Builder();
    }
}