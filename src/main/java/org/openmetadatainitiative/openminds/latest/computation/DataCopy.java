package org.openmetadatainitiative.openminds.latest.computation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.computation.LaunchConfiguration;
import org.openmetadatainitiative.openminds.latest.computation.WorkflowRecipeVersion;
import org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyEnvironment;
import org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyInput;
import org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyOutput;
import org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyPerformedBy;
import org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyResourceUsage;
import org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyStartedBy;
import org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyStudyTarget;
import org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyWasInformedBy;
import org.openmetadatainitiative.openminds.latest.controlledTerms.ActionStatusType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.AnalysisTechnique;
import org.openmetadatainitiative.openminds.latest.core.research.CustomPropertySet;


import static org.openmetadatainitiative.openminds.latest.computation.DataCopy.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataCopy extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.WorkflowExecutionStage, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisWasInformedBy, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationWasInformedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/DataCopy";

    @JsonIgnore
    public Reference<DataCopy> getReference() {
        return doGetReference();
    }

    public static Reference<DataCopy> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private DataCopy(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<DataCopy>{
        
        public Builder customPropertySet(List<CustomPropertySet> customPropertySet) { DataCopy.this.customPropertySet = customPropertySet; return this; }
        
        public Builder description(String description) { DataCopy.this.description = description; return this; }
        
        public Builder endTime(String endTime) { DataCopy.this.endTime = endTime; return this; }
        
        public Builder environment(Reference<? extends DataCopyEnvironment> environment) { DataCopy.this.environment = environment; return this; }
        
        public Builder input(List<Reference<? extends DataCopyInput>> input) { DataCopy.this.input = input; return this; }
        
        public Builder launchConfiguration(Reference<LaunchConfiguration> launchConfiguration) { DataCopy.this.launchConfiguration = launchConfiguration; return this; }
        
        public Builder lookupLabel(String lookupLabel) { DataCopy.this.lookupLabel = lookupLabel; return this; }
        
        public Builder output(List<Reference<? extends DataCopyOutput>> output) { DataCopy.this.output = output; return this; }
        
        public Builder performedBy(List<Reference<? extends DataCopyPerformedBy>> performedBy) { DataCopy.this.performedBy = performedBy; return this; }
        
        public Builder recipe(Reference<WorkflowRecipeVersion> recipe) { DataCopy.this.recipe = recipe; return this; }
        
        public Builder resourceUsage(List<? extends DataCopyResourceUsage> resourceUsage) { DataCopy.this.resourceUsage = resourceUsage; return this; }
        
        public Builder startTime(String startTime) { DataCopy.this.startTime = startTime; return this; }
        
        public Builder startedBy(Reference<? extends DataCopyStartedBy> startedBy) { DataCopy.this.startedBy = startedBy; return this; }
        
        public Builder status(Reference<ActionStatusType> status) { DataCopy.this.status = status; return this; }
        
        public Builder studyTarget(List<Reference<? extends DataCopyStudyTarget>> studyTarget) { DataCopy.this.studyTarget = studyTarget; return this; }
        
        public Builder tag(List<String> tag) { DataCopy.this.tag = tag; return this; }
        
        public Builder technique(List<Reference<AnalysisTechnique>> technique) { DataCopy.this.technique = technique; return this; }
        
        public Builder wasInformedBy(Reference<? extends DataCopyWasInformedBy> wasInformedBy) { DataCopy.this.wasInformedBy = wasInformedBy; return this; }
        

        public DataCopy build() {
            if (DataCopy.this.id == null) {
                DataCopy.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(DataCopy.this.types == null || DataCopy.this.types.isEmpty() || !DataCopy.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = DataCopy.this.types;
                DataCopy.this.types = new ArrayList<>();
                DataCopy.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    DataCopy.this.types.addAll(oldValues);
                }
            }
            return DataCopy.this;
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/environment")
    private Reference<? extends DataCopyEnvironment> environment;
    
    public Reference<? extends DataCopyEnvironment> getEnvironment() {
       return this.environment;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/input")
    private List<Reference<? extends DataCopyInput>> input;
    
    /**
    * Something or someone that is put into or participates in a process or machine.
    */
    public List<Reference<? extends DataCopyInput>> getInput() {
       return this.input;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/launchConfiguration")
    private Reference<LaunchConfiguration> launchConfiguration;
    
    public Reference<LaunchConfiguration> getLaunchConfiguration() {
       return this.launchConfiguration;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/output")
    private List<Reference<? extends DataCopyOutput>> output;
    
    /**
    * Something or someone that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends DataCopyOutput>> getOutput() {
       return this.output;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/performedBy")
    private List<Reference<? extends DataCopyPerformedBy>> performedBy;
    
    public List<Reference<? extends DataCopyPerformedBy>> getPerformedBy() {
       return this.performedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/recipe")
    private Reference<WorkflowRecipeVersion> recipe;
    
    public Reference<WorkflowRecipeVersion> getRecipe() {
       return this.recipe;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/resourceUsage")
    private List<? extends DataCopyResourceUsage> resourceUsage;
    
    public List<? extends DataCopyResourceUsage> getResourceUsage() {
       return this.resourceUsage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startTime")
    private String startTime;
    
    public String getStartTime() {
       return this.startTime;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startedBy")
    private Reference<? extends DataCopyStartedBy> startedBy;
    
    public Reference<? extends DataCopyStartedBy> getStartedBy() {
       return this.startedBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/status")
    private Reference<ActionStatusType> status;
    
    public Reference<ActionStatusType> getStatus() {
       return this.status;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends DataCopyStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends DataCopyStudyTarget>> getStudyTarget() {
       return this.studyTarget;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/tag")
    private List<String> tag;
    
    public List<String> getTag() {
       return this.tag;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/technique")
    private List<Reference<AnalysisTechnique>> technique;
    
    /**
    * Method of accomplishing a desired aim.
    */
    public List<Reference<AnalysisTechnique>> getTechnique() {
       return this.technique;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/wasInformedBy")
    private Reference<? extends DataCopyWasInformedBy> wasInformedBy;
    
    public Reference<? extends DataCopyWasInformedBy> getWasInformedBy() {
       return this.wasInformedBy;
    }

 
    public static DataCopy.Builder create(LocalId localId){
        return new DataCopy(localId).new Builder();
    }

    public DataCopy.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, DataCopy.class).new Builder();
    }
}