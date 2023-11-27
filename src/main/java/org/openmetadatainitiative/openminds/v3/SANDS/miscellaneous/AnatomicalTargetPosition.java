package org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.CoordinatePoint;
import org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.intf.AnatomicalTargetPositionAnatomicalTarget;
import org.openmetadatainitiative.openminds.v3.controlledTerms.AnatomicalIdentificationType;


import static org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.AnatomicalTargetPosition.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnatomicalTargetPosition extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/AnatomicalTargetPosition";

    @JsonIgnore
    public Reference<AnatomicalTargetPosition> getReference() {
        return doGetReference();
    }

    public static Reference<AnatomicalTargetPosition> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private AnatomicalTargetPosition(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<AnatomicalTargetPosition>{
        
        public Builder additionalRemarks(String additionalRemarks) { AnatomicalTargetPosition.this.additionalRemarks = additionalRemarks; return this; }
        
        public Builder anatomicalTarget(List<Reference<? extends AnatomicalTargetPositionAnatomicalTarget>> anatomicalTarget) { AnatomicalTargetPosition.this.anatomicalTarget = anatomicalTarget; return this; }
        
        public Builder spatialLocation(List<CoordinatePoint> spatialLocation) { AnatomicalTargetPosition.this.spatialLocation = spatialLocation; return this; }
        
        public Builder targetIdentificationType(Reference<AnatomicalIdentificationType> targetIdentificationType) { AnatomicalTargetPosition.this.targetIdentificationType = targetIdentificationType; return this; }
        

        public AnatomicalTargetPosition build() {
            if (AnatomicalTargetPosition.this.id == null) {
                AnatomicalTargetPosition.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(AnatomicalTargetPosition.this.types == null || AnatomicalTargetPosition.this.types.isEmpty() || !AnatomicalTargetPosition.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = AnatomicalTargetPosition.this.types;
                AnatomicalTargetPosition.this.types = new ArrayList<>();
                AnatomicalTargetPosition.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    AnatomicalTargetPosition.this.types.addAll(oldValues);
                }
            }
            return AnatomicalTargetPosition.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/additionalRemarks")
    private String additionalRemarks;
    
    /**
    * Mention of what deserves additional attention or notice.
    */
    public String getAdditionalRemarks() {
       return this.additionalRemarks;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/anatomicalTarget")
    private List<Reference<? extends AnatomicalTargetPositionAnatomicalTarget>> anatomicalTarget;
    
    public List<Reference<? extends AnatomicalTargetPositionAnatomicalTarget>> getAnatomicalTarget() {
       return this.anatomicalTarget;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/spatialLocation")
    private List<CoordinatePoint> spatialLocation;
    
    public List<CoordinatePoint> getSpatialLocation() {
       return this.spatialLocation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/targetIdentificationType")
    private Reference<AnatomicalIdentificationType> targetIdentificationType;
    
    public Reference<AnatomicalIdentificationType> getTargetIdentificationType() {
       return this.targetIdentificationType;
    }

 
    public static AnatomicalTargetPosition.Builder create(LocalId localId){
        return new AnatomicalTargetPosition(localId).new Builder();
    }

    public AnatomicalTargetPosition.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, AnatomicalTargetPosition.class).new Builder();
    }
}