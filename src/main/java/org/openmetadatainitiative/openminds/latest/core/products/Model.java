package org.openmetadatainitiative.openminds.latest.core.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.ModelAbstractionLevel;
import org.openmetadatainitiative.openminds.latest.controlledTerms.ModelScope;
import org.openmetadatainitiative.openminds.latest.core.products.ModelVersion;
import org.openmetadatainitiative.openminds.latest.core.products.intf.ModelCustodian;
import org.openmetadatainitiative.openminds.latest.core.products.intf.ModelDeveloper;
import org.openmetadatainitiative.openminds.latest.core.products.intf.ModelDigitalIdentifier;
import org.openmetadatainitiative.openminds.latest.core.products.intf.ModelStudyTarget;


import static org.openmetadatainitiative.openminds.latest.core.products.Model.*;
/**
 * Structured information on a computational model (concept level).
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Model extends Instance implements org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.CommentAbout{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Model";

    @JsonIgnore
    public Reference<Model> getReference() {
        return doGetReference();
    }

    public static Reference<Model> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private Model(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Model>{
        
        public Builder abstractionLevel(Reference<ModelAbstractionLevel> abstractionLevel) { Model.this.abstractionLevel = abstractionLevel; return this; }
        
        public Builder custodian(List<Reference<? extends ModelCustodian>> custodian) { Model.this.custodian = custodian; return this; }
        
        public Builder description(String description) { Model.this.description = description; return this; }
        
        public Builder developer(List<Reference<? extends ModelDeveloper>> developer) { Model.this.developer = developer; return this; }
        
        public Builder digitalIdentifier(Reference<? extends ModelDigitalIdentifier> digitalIdentifier) { Model.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder fullName(String fullName) { Model.this.fullName = fullName; return this; }
        
        public Builder hasVersion(List<Reference<ModelVersion>> hasVersion) { Model.this.hasVersion = hasVersion; return this; }
        
        public Builder homepage(String homepage) { Model.this.homepage = homepage; return this; }
        
        public Builder howToCite(String howToCite) { Model.this.howToCite = howToCite; return this; }
        
        public Builder scope(Reference<ModelScope> scope) { Model.this.scope = scope; return this; }
        
        public Builder shortName(String shortName) { Model.this.shortName = shortName; return this; }
        
        public Builder studyTarget(List<Reference<? extends ModelStudyTarget>> studyTarget) { Model.this.studyTarget = studyTarget; return this; }
        

        public Model build() {
            if (Model.this.id == null) {
                Model.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(Model.this.types == null || Model.this.types.isEmpty() || !Model.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = Model.this.types;
                Model.this.types = new ArrayList<>();
                Model.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    Model.this.types.addAll(oldValues);
                }
            }
            return Model.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/abstractionLevel")
    private Reference<ModelAbstractionLevel> abstractionLevel;
    
    /**
    * Extent of simplification of physical, spatial, or temporal details or attributes in the study of objects or systems.
    */
    public Reference<ModelAbstractionLevel> getAbstractionLevel() {
       return this.abstractionLevel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends ModelCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends ModelCustodian>> getCustodian() {
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
    private List<Reference<? extends ModelDeveloper>> developer;
    
    /**
    * Legal person that creates or improves products or services (e.g., software, applications, etc.).
    */
    public List<Reference<? extends ModelDeveloper>> getDeveloper() {
       return this.developer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<? extends ModelDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends ModelDigitalIdentifier> getDigitalIdentifier() {
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
    private List<Reference<ModelVersion>> hasVersion;
    
    /**
    * Reference to variants of an original.
    */
    public List<Reference<ModelVersion>> getHasVersion() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/scope")
    private Reference<ModelScope> scope;
    
    /**
    * Extent of something.
    */
    public Reference<ModelScope> getScope() {
       return this.scope;
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
    private List<Reference<? extends ModelStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends ModelStudyTarget>> getStudyTarget() {
       return this.studyTarget;
    }

 
    public static Model.Builder create(LocalId localId){
        return new Model(localId).new Builder();
    }

    public Model.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Model.class).new Builder();
    }
}