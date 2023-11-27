package org.openmetadatainitiative.openminds.latest.core.research;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.AgeCategory;
import org.openmetadatainitiative.openminds.latest.controlledTerms.Handedness;
import org.openmetadatainitiative.openminds.latest.controlledTerms.SubjectAttribute;
import org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectGroupStateAge;
import org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectGroupStatePathology;
import org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectGroupStateRelativeTimeIndication;
import org.openmetadatainitiative.openminds.latest.core.research.intf.SubjectGroupStateWeight;


import static org.openmetadatainitiative.openminds.latest.core.research.SubjectGroupState.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubjectGroupState extends Instance implements org.openmetadatainitiative.openminds.latest.ephys.activity.intf.RecordingActivityInput, org.openmetadatainitiative.openminds.latest.core.research.intf.ProtocolExecutionInput, org.openmetadatainitiative.openminds.latest.core.research.intf.ProtocolExecutionOutput, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleCollectionStateDescendedFrom, org.openmetadatainitiative.openminds.latest.core.research.intf.TissueSampleStateDescendedFrom, org.openmetadatainitiative.openminds.latest.core.data.intf.FileBundleGroupedBy, org.openmetadatainitiative.openminds.latest.specimenPrep.activity.intf.TissueCulturePreparationInput, org.openmetadatainitiative.openminds.latest.stimulation.activity.intf.StimulationActivityInput, org.openmetadatainitiative.openminds.latest.stimulation.activity.intf.StimulationActivityOutput{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/SubjectGroupState";

    @JsonIgnore
    public Reference<SubjectGroupState> getReference() {
        return doGetReference();
    }

    public static Reference<SubjectGroupState> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private SubjectGroupState(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<SubjectGroupState>{
        
        public Builder additionalRemarks(String additionalRemarks) { SubjectGroupState.this.additionalRemarks = additionalRemarks; return this; }
        
        public Builder age(SubjectGroupStateAge age) { SubjectGroupState.this.age = age; return this; }
        
        public Builder ageCategory(List<Reference<AgeCategory>> ageCategory) { SubjectGroupState.this.ageCategory = ageCategory; return this; }
        
        public Builder attribute(List<Reference<SubjectAttribute>> attribute) { SubjectGroupState.this.attribute = attribute; return this; }
        
        public Builder descendedFrom(Reference<SubjectGroupState> descendedFrom) { SubjectGroupState.this.descendedFrom = descendedFrom; return this; }
        
        public Builder handedness(List<Reference<Handedness>> handedness) { SubjectGroupState.this.handedness = handedness; return this; }
        
        public Builder internalIdentifier(String internalIdentifier) { SubjectGroupState.this.internalIdentifier = internalIdentifier; return this; }
        
        public Builder lookupLabel(String lookupLabel) { SubjectGroupState.this.lookupLabel = lookupLabel; return this; }
        
        public Builder pathology(List<Reference<? extends SubjectGroupStatePathology>> pathology) { SubjectGroupState.this.pathology = pathology; return this; }
        
        public Builder relativeTimeIndication(SubjectGroupStateRelativeTimeIndication relativeTimeIndication) { SubjectGroupState.this.relativeTimeIndication = relativeTimeIndication; return this; }
        
        public Builder weight(SubjectGroupStateWeight weight) { SubjectGroupState.this.weight = weight; return this; }
        

        public SubjectGroupState build(OpenMINDSContext context) {
            if (SubjectGroupState.this.id == null) {
                SubjectGroupState.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            SubjectGroupState.this.type = SEMANTIC_NAME;
            return SubjectGroupState.this;
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/age")
    private SubjectGroupStateAge age;
    
    /**
    * Time of life or existence at which some particular qualification, capacity or event arises.
    */
    public SubjectGroupStateAge getAge() {
       return this.age;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/ageCategory")
    private List<Reference<AgeCategory>> ageCategory;
    
    /**
    * Distinct life cycle class that is defined by a similar age or age range (developmental stage) within a group of individual beings.
    */
    public List<Reference<AgeCategory>> getAgeCategory() {
       return this.ageCategory;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/attribute")
    private List<Reference<SubjectAttribute>> attribute;
    
    public List<Reference<SubjectAttribute>> getAttribute() {
       return this.attribute;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/descendedFrom")
    private Reference<SubjectGroupState> descendedFrom;
    
    public Reference<SubjectGroupState> getDescendedFrom() {
       return this.descendedFrom;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/handedness")
    private List<Reference<Handedness>> handedness;
    
    /**
    * Degree to which an organism prefers one hand or foot over the other hand or foot during the performance of a task.
    */
    public List<Reference<Handedness>> getHandedness() {
       return this.handedness;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/internalIdentifier")
    private String internalIdentifier;
    
    /**
    * Term or code that identifies someone or something within a particular product.
    */
    public String getInternalIdentifier() {
       return this.internalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/pathology")
    private List<Reference<? extends SubjectGroupStatePathology>> pathology;
    
    /**
    * Structural and functional deviation from the normal that constitutes a disease or characterizes a particular disease.
    */
    public List<Reference<? extends SubjectGroupStatePathology>> getPathology() {
       return this.pathology;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relativeTimeIndication")
    private SubjectGroupStateRelativeTimeIndication relativeTimeIndication;
    
    public SubjectGroupStateRelativeTimeIndication getRelativeTimeIndication() {
       return this.relativeTimeIndication;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/weight")
    private SubjectGroupStateWeight weight;
    
    /**
    * Amount that a thing or being weighs.
    */
    public SubjectGroupStateWeight getWeight() {
       return this.weight;
    }

 
    public static SubjectGroupState.Builder create(LocalId localId){
        return new SubjectGroupState(localId).new Builder();
    }

    public SubjectGroupState.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, SubjectGroupState.class).new Builder();
    }
}