package org.openmetadatainitiative.openminds.v3.computation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.computation.WorkflowRecipeVersion;
import org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowExecutionConfiguration;
import org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowExecutionStage;
import org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowExecutionStartedBy;


import static org.openmetadatainitiative.openminds.v3.computation.WorkflowExecution.SEMANTIC_NAME;
/**
 * Structured information about an execution of a computational workflow.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowExecution extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/WorkflowExecution";

    @JsonIgnore
    public Reference<WorkflowExecution> getReference() {
        return doGetReference();
    }

    public static Reference<WorkflowExecution> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private WorkflowExecution(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<WorkflowExecution>{
        
        public Builder configuration(Reference<? extends WorkflowExecutionConfiguration> configuration) { WorkflowExecution.this.configuration = configuration; return this; }
        
        public Builder recipe(Reference<WorkflowRecipeVersion> recipe) { WorkflowExecution.this.recipe = recipe; return this; }
        
        public Builder stage(List<Reference<? extends WorkflowExecutionStage>> stage) { WorkflowExecution.this.stage = stage; return this; }
        
        public Builder startedBy(Reference<? extends WorkflowExecutionStartedBy> startedBy) { WorkflowExecution.this.startedBy = startedBy; return this; }
        

        public WorkflowExecution build(OpenMINDSContext context) {
            if (WorkflowExecution.this.id == null) {
                WorkflowExecution.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            WorkflowExecution.this.type = SEMANTIC_NAME;
            return WorkflowExecution.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/configuration")
    private Reference<? extends WorkflowExecutionConfiguration> configuration;
    
    public Reference<? extends WorkflowExecutionConfiguration> getConfiguration() {
       return this.configuration;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/recipe")
    private Reference<WorkflowRecipeVersion> recipe;
    
    public Reference<WorkflowRecipeVersion> getRecipe() {
       return this.recipe;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/stage")
    private List<Reference<? extends WorkflowExecutionStage>> stage;
    
    public List<Reference<? extends WorkflowExecutionStage>> getStage() {
       return this.stage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/startedBy")
    private Reference<? extends WorkflowExecutionStartedBy> startedBy;
    
    public Reference<? extends WorkflowExecutionStartedBy> getStartedBy() {
       return this.startedBy;
    }

 
    public static WorkflowExecution.Builder create(LocalId localId){
        return new WorkflowExecution(localId).new Builder();
    }

    public WorkflowExecution.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, WorkflowExecution.class).new Builder();
    }
}