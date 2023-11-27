package org.openmetadatainitiative.openminds.v3.core.digitalIdentifier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.RORID.SEMANTIC_NAME;
/**
 * A persistent identifier for a research organization, provided by the Research Organization Registry.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RORID extends Instance implements org.openmetadatainitiative.openminds.v3.core.actors.intf.OrganizationDigitalIdentifier{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/RORID";

    @JsonIgnore
    public Reference<RORID> getReference() {
        return doGetReference();
    }

    public static Reference<RORID> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private RORID(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<RORID>{
        
        public Builder identifier(String identifier) { RORID.this.identifier = identifier; return this; }
        

        public RORID build(OpenMINDSContext context) {
            if (RORID.this.id == null) {
                RORID.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            RORID.this.type = SEMANTIC_NAME;
            return RORID.this;
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

 
    public static RORID.Builder create(LocalId localId){
        return new RORID(localId).new Builder();
    }

    public RORID.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, RORID.class).new Builder();
    }
}