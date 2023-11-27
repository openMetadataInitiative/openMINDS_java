package org.openmetadatainitiative.openminds.latest.computation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.computation.ValidationTestVersion;
import org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestCustodian;
import org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestDeveloper;
import org.openmetadatainitiative.openminds.latest.computation.intf.ValidationTestStudyTarget;
import org.openmetadatainitiative.openminds.latest.controlledTerms.DifferenceMeasure;
import org.openmetadatainitiative.openminds.latest.controlledTerms.ModelScope;
import org.openmetadatainitiative.openminds.latest.controlledTerms.Technique;
import org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.DOI;


import static org.openmetadatainitiative.openminds.latest.computation.ValidationTest.SEMANTIC_NAME;
/**
 * Structured information about the definition of a process for validating a computational model.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidationTest extends Instance implements org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.CommentAbout{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/ValidationTest";

    @JsonIgnore
    public Reference<ValidationTest> getReference() {
        return doGetReference();
    }

    public static Reference<ValidationTest> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private ValidationTest(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ValidationTest>{
        
        public Builder custodian(List<Reference<? extends ValidationTestCustodian>> custodian) { ValidationTest.this.custodian = custodian; return this; }
        
        public Builder description(String description) { ValidationTest.this.description = description; return this; }
        
        public Builder developer(List<Reference<? extends ValidationTestDeveloper>> developer) { ValidationTest.this.developer = developer; return this; }
        
        public Builder digitalIdentifier(Reference<DOI> digitalIdentifier) { ValidationTest.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder fullName(String fullName) { ValidationTest.this.fullName = fullName; return this; }
        
        public Builder hasVersion(List<Reference<ValidationTestVersion>> hasVersion) { ValidationTest.this.hasVersion = hasVersion; return this; }
        
        public Builder homepage(String homepage) { ValidationTest.this.homepage = homepage; return this; }
        
        public Builder howToCite(String howToCite) { ValidationTest.this.howToCite = howToCite; return this; }
        
        public Builder referenceDataAcquisition(List<Reference<Technique>> referenceDataAcquisition) { ValidationTest.this.referenceDataAcquisition = referenceDataAcquisition; return this; }
        
        public Builder scope(Reference<ModelScope> scope) { ValidationTest.this.scope = scope; return this; }
        
        public Builder scoreType(Reference<DifferenceMeasure> scoreType) { ValidationTest.this.scoreType = scoreType; return this; }
        
        public Builder shortName(String shortName) { ValidationTest.this.shortName = shortName; return this; }
        
        public Builder studyTarget(List<Reference<? extends ValidationTestStudyTarget>> studyTarget) { ValidationTest.this.studyTarget = studyTarget; return this; }
        

        public ValidationTest build(OpenMINDSContext context) {
            if (ValidationTest.this.id == null) {
                ValidationTest.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            ValidationTest.this.type = SEMANTIC_NAME;
            return ValidationTest.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends ValidationTestCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends ValidationTestCustodian>> getCustodian() {
       return this.custodian;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/developer")
    private List<Reference<? extends ValidationTestDeveloper>> developer;
    
    /**
    * Legal person that creates or improves products or services (e.g., software, applications, etc.).
    */
    public List<Reference<? extends ValidationTestDeveloper>> getDeveloper() {
       return this.developer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<DOI> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<DOI> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullName")
    private String fullName;
    
    /**
    * Whole, non-abbreviated name of something or somebody.
    */
    public String getFullName() {
       return this.fullName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hasVersion")
    private List<Reference<ValidationTestVersion>> hasVersion;
    
    /**
    * Reference to variants of an original.
    */
    public List<Reference<ValidationTestVersion>> getHasVersion() {
       return this.hasVersion;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/homepage")
    private String homepage;
    
    /**
    * Main website of something or someone.
    */
    public String getHomepage() {
       return this.homepage;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/howToCite")
    private String howToCite;
    
    /**
    * Preferred format for citing a particular object or legal person.
    */
    public String getHowToCite() {
       return this.howToCite;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/referenceDataAcquisition")
    private List<Reference<Technique>> referenceDataAcquisition;
    
    public List<Reference<Technique>> getReferenceDataAcquisition() {
       return this.referenceDataAcquisition;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/scope")
    private Reference<ModelScope> scope;
    
    /**
    * Extent of something.
    */
    public Reference<ModelScope> getScope() {
       return this.scope;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/scoreType")
    private Reference<DifferenceMeasure> scoreType;
    
    public Reference<DifferenceMeasure> getScoreType() {
       return this.scoreType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/shortName")
    private String shortName;
    
    /**
    * Shortened or fully abbreviated name of something or somebody.
    */
    public String getShortName() {
       return this.shortName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends ValidationTestStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends ValidationTestStudyTarget>> getStudyTarget() {
       return this.studyTarget;
    }

 
    public static ValidationTest.Builder create(LocalId localId){
        return new ValidationTest(localId).new Builder();
    }

    public ValidationTest.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ValidationTest.class).new Builder();
    }
}