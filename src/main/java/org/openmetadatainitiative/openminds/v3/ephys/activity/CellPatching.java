package org.openmetadatainitiative.openminds.v3.ephys.activity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.AnatomicalTargetPosition;
import org.openmetadatainitiative.openminds.v3.chemicals.ChemicalMixture;
import org.openmetadatainitiative.openminds.v3.controlledTerms.PatchClampVariation;
import org.openmetadatainitiative.openminds.v3.controlledTerms.PreparationType;
import org.openmetadatainitiative.openminds.v3.core.products.DatasetVersion;
import org.openmetadatainitiative.openminds.v3.core.research.CustomPropertySet;
import org.openmetadatainitiative.openminds.v3.core.research.Protocol;
import org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingBathTemperature;
import org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingDevice;
import org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingInput;
import org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingOutput;
import org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingPerformedBy;
import org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingStudyTarget;


import static org.openmetadatainitiative.openminds.v3.ephys.activity.CellPatching.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CellPatching extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/ephys/CellPatching";

    @JsonIgnore
    public Reference<CellPatching> getReference() {
        return doGetReference();
    }

    public static Reference<CellPatching> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private CellPatching(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<CellPatching>{
        
        public Builder bathTemperature(CellPatchingBathTemperature bathTemperature) { CellPatching.this.bathTemperature = bathTemperature; return this; }
        
        public Builder customPropertySet(List<CustomPropertySet> customPropertySet) { CellPatching.this.customPropertySet = customPropertySet; return this; }
        
        public Builder description(String description) { CellPatching.this.description = description; return this; }
        
        public Builder device(List<Reference<? extends CellPatchingDevice>> device) { CellPatching.this.device = device; return this; }
        
        public Builder endTime(String endTime) { CellPatching.this.endTime = endTime; return this; }
        
        public Builder input(List<Reference<? extends CellPatchingInput>> input) { CellPatching.this.input = input; return this; }
        
        public Builder isPartOf(Reference<DatasetVersion> isPartOf) { CellPatching.this.isPartOf = isPartOf; return this; }
        
        public Builder lookupLabel(String lookupLabel) { CellPatching.this.lookupLabel = lookupLabel; return this; }
        
        public Builder output(List<Reference<? extends CellPatchingOutput>> output) { CellPatching.this.output = output; return this; }
        
        public Builder performedBy(List<Reference<? extends CellPatchingPerformedBy>> performedBy) { CellPatching.this.performedBy = performedBy; return this; }
        
        public Builder preparationDesign(Reference<PreparationType> preparationDesign) { CellPatching.this.preparationDesign = preparationDesign; return this; }
        
        public Builder protocol(List<Reference<Protocol>> protocol) { CellPatching.this.protocol = protocol; return this; }
        
        public Builder startTime(String startTime) { CellPatching.this.startTime = startTime; return this; }
        
        public Builder studyTarget(List<Reference<? extends CellPatchingStudyTarget>> studyTarget) { CellPatching.this.studyTarget = studyTarget; return this; }
        
        public Builder targetPosition(AnatomicalTargetPosition targetPosition) { CellPatching.this.targetPosition = targetPosition; return this; }
        
        public Builder tissueBathSolution(Reference<ChemicalMixture> tissueBathSolution) { CellPatching.this.tissueBathSolution = tissueBathSolution; return this; }
        
        public Builder variation(Reference<PatchClampVariation> variation) { CellPatching.this.variation = variation; return this; }
        

        public CellPatching build() {
            if (CellPatching.this.id == null) {
                CellPatching.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(CellPatching.this.types == null || CellPatching.this.types.isEmpty() || !CellPatching.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = CellPatching.this.types;
                CellPatching.this.types = new ArrayList<>();
                CellPatching.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    CellPatching.this.types.addAll(oldValues);
                }
            }
            return CellPatching.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/bathTemperature")
    private CellPatchingBathTemperature bathTemperature;
    
    public CellPatchingBathTemperature getBathTemperature() {
       return this.bathTemperature;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/customPropertySet")
    private List<CustomPropertySet> customPropertySet;
    
    public List<CustomPropertySet> getCustomPropertySet() {
       return this.customPropertySet;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/device")
    private List<Reference<? extends CellPatchingDevice>> device;
    
    /**
    * Piece of equipment or mechanism (hardware) designed to serve a special purpose or perform a special function.
    */
    public List<Reference<? extends CellPatchingDevice>> getDevice() {
       return this.device;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/endTime")
    private String endTime;
    
    public String getEndTime() {
       return this.endTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/input")
    private List<Reference<? extends CellPatchingInput>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<? extends CellPatchingInput>> getInput() {
       return this.input;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isPartOf")
    private Reference<DatasetVersion> isPartOf;
    
    /**
    * Reference to the ensemble of multiple things or beings.
    */
    public Reference<DatasetVersion> getIsPartOf() {
       return this.isPartOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/output")
    private List<Reference<? extends CellPatchingOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends CellPatchingOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/performedBy")
    private List<Reference<? extends CellPatchingPerformedBy>> performedBy;
    
    public List<Reference<? extends CellPatchingPerformedBy>> getPerformedBy() {
       return this.performedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/preparationDesign")
    private Reference<PreparationType> preparationDesign;
    
    public Reference<PreparationType> getPreparationDesign() {
       return this.preparationDesign;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/protocol")
    private List<Reference<Protocol>> protocol;
    
    /**
    * Plan that describes the process of a scientific or medical experiment, treatment, or procedure.
    */
    public List<Reference<Protocol>> getProtocol() {
       return this.protocol;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends CellPatchingStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends CellPatchingStudyTarget>> getStudyTarget() {
       return this.studyTarget;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/targetPosition")
    private AnatomicalTargetPosition targetPosition;
    
    public AnatomicalTargetPosition getTargetPosition() {
       return this.targetPosition;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/tissueBathSolution")
    private Reference<ChemicalMixture> tissueBathSolution;
    
    public Reference<ChemicalMixture> getTissueBathSolution() {
       return this.tissueBathSolution;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/variation")
    private Reference<PatchClampVariation> variation;
    
    public Reference<PatchClampVariation> getVariation() {
       return this.variation;
    }

 
    public static CellPatching.Builder create(LocalId localId){
        return new CellPatching(localId).new Builder();
    }

    public CellPatching.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, CellPatching.class).new Builder();
    }
}