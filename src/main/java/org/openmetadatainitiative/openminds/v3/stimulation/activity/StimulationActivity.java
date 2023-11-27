package org.openmetadatainitiative.openminds.v3.stimulation.activity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.PreparationType;
import org.openmetadatainitiative.openminds.v3.core.products.DatasetVersion;
import org.openmetadatainitiative.openminds.v3.core.products.Setup;
import org.openmetadatainitiative.openminds.v3.core.research.CustomPropertySet;
import org.openmetadatainitiative.openminds.v3.core.research.Protocol;
import org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityInput;
import org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityOutput;
import org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityPerformedBy;
import org.openmetadatainitiative.openminds.v3.stimulation.activity.intf.StimulationActivityStudyTarget;


import static org.openmetadatainitiative.openminds.v3.stimulation.activity.StimulationActivity.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StimulationActivity extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/stimulation/StimulationActivity";

    @JsonIgnore
    public Reference<StimulationActivity> getReference() {
        return doGetReference();
    }

    public static Reference<StimulationActivity> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private StimulationActivity(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<StimulationActivity>{
        
        public Builder customPropertySet(List<CustomPropertySet> customPropertySet) { StimulationActivity.this.customPropertySet = customPropertySet; return this; }
        
        public Builder description(String description) { StimulationActivity.this.description = description; return this; }
        
        public Builder endTime(String endTime) { StimulationActivity.this.endTime = endTime; return this; }
        
        public Builder input(List<Reference<? extends StimulationActivityInput>> input) { StimulationActivity.this.input = input; return this; }
        
        public Builder isPartOf(Reference<DatasetVersion> isPartOf) { StimulationActivity.this.isPartOf = isPartOf; return this; }
        
        public Builder lookupLabel(String lookupLabel) { StimulationActivity.this.lookupLabel = lookupLabel; return this; }
        
        public Builder output(List<Reference<? extends StimulationActivityOutput>> output) { StimulationActivity.this.output = output; return this; }
        
        public Builder performedBy(List<Reference<? extends StimulationActivityPerformedBy>> performedBy) { StimulationActivity.this.performedBy = performedBy; return this; }
        
        public Builder preparationDesign(Reference<PreparationType> preparationDesign) { StimulationActivity.this.preparationDesign = preparationDesign; return this; }
        
        public Builder protocol(List<Reference<Protocol>> protocol) { StimulationActivity.this.protocol = protocol; return this; }
        
        public Builder setup(Reference<Setup> setup) { StimulationActivity.this.setup = setup; return this; }
        
        public Builder startTime(String startTime) { StimulationActivity.this.startTime = startTime; return this; }
        
        public Builder stimulus(Object stimulus) { StimulationActivity.this.stimulus = stimulus; return this; }
        
        public Builder studyTarget(List<Reference<? extends StimulationActivityStudyTarget>> studyTarget) { StimulationActivity.this.studyTarget = studyTarget; return this; }
        

        public StimulationActivity build() {
            if (StimulationActivity.this.id == null) {
                StimulationActivity.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(StimulationActivity.this.types == null || StimulationActivity.this.types.isEmpty() || !StimulationActivity.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = StimulationActivity.this.types;
                StimulationActivity.this.types = new ArrayList<>();
                StimulationActivity.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    StimulationActivity.this.types.addAll(oldValues);
                }
            }
            return StimulationActivity.this;
        }
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/endTime")
    private String endTime;
    
    public String getEndTime() {
       return this.endTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/input")
    private List<Reference<? extends StimulationActivityInput>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<? extends StimulationActivityInput>> getInput() {
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
    private List<Reference<? extends StimulationActivityOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends StimulationActivityOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/performedBy")
    private List<Reference<? extends StimulationActivityPerformedBy>> performedBy;
    
    public List<Reference<? extends StimulationActivityPerformedBy>> getPerformedBy() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/setup")
    private Reference<Setup> setup;
    
    public Reference<Setup> getSetup() {
       return this.setup;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/stimulus")
    private Object stimulus;
    
    public Object getStimulus() {
       return this.stimulus;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends StimulationActivityStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends StimulationActivityStudyTarget>> getStudyTarget() {
       return this.studyTarget;
    }

 
    public static StimulationActivity.Builder create(LocalId localId){
        return new StimulationActivity(localId).new Builder();
    }

    public StimulationActivity.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, StimulationActivity.class).new Builder();
    }
}