package org.openmetadatainitiative.openminds.latest.SANDS.atlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.SANDS.atlas.CommonCoordinateSpaceVersion;
import org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceAuthor;
import org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceCustodian;
import org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf.CommonCoordinateSpaceDigitalIdentifier;
import org.openmetadatainitiative.openminds.latest.controlledTerms.Species;


import static org.openmetadatainitiative.openminds.latest.SANDS.atlas.CommonCoordinateSpace.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonCoordinateSpace extends Instance implements org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionInputData, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.CommentAbout, org.openmetadatainitiative.openminds.latest.core.data.intf.FileBundleGroupedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/CommonCoordinateSpace";

    @JsonIgnore
    public Reference<CommonCoordinateSpace> getReference() {
        return doGetReference();
    }

    public static Reference<CommonCoordinateSpace> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private CommonCoordinateSpace(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<CommonCoordinateSpace>{
        
        public Builder abbreviation(String abbreviation) { CommonCoordinateSpace.this.abbreviation = abbreviation; return this; }
        
        public Builder author(List<Reference<? extends CommonCoordinateSpaceAuthor>> author) { CommonCoordinateSpace.this.author = author; return this; }
        
        public Builder custodian(List<Reference<? extends CommonCoordinateSpaceCustodian>> custodian) { CommonCoordinateSpace.this.custodian = custodian; return this; }
        
        public Builder description(String description) { CommonCoordinateSpace.this.description = description; return this; }
        
        public Builder digitalIdentifier(Reference<? extends CommonCoordinateSpaceDigitalIdentifier> digitalIdentifier) { CommonCoordinateSpace.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder fullName(String fullName) { CommonCoordinateSpace.this.fullName = fullName; return this; }
        
        public Builder hasVersion(List<Reference<CommonCoordinateSpaceVersion>> hasVersion) { CommonCoordinateSpace.this.hasVersion = hasVersion; return this; }
        
        public Builder homepage(String homepage) { CommonCoordinateSpace.this.homepage = homepage; return this; }
        
        public Builder howToCite(String howToCite) { CommonCoordinateSpace.this.howToCite = howToCite; return this; }
        
        public Builder ontologyIdentifier(List<String> ontologyIdentifier) { CommonCoordinateSpace.this.ontologyIdentifier = ontologyIdentifier; return this; }
        
        public Builder shortName(String shortName) { CommonCoordinateSpace.this.shortName = shortName; return this; }
        
        public Builder usedSpecies(Reference<Species> usedSpecies) { CommonCoordinateSpace.this.usedSpecies = usedSpecies; return this; }
        

        public CommonCoordinateSpace build(OpenMINDSContext context) {
            if (CommonCoordinateSpace.this.id == null) {
                CommonCoordinateSpace.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            CommonCoordinateSpace.this.type = SEMANTIC_NAME;
            return CommonCoordinateSpace.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/abbreviation")
    private String abbreviation;
    
    public String getAbbreviation() {
       return this.abbreviation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/author")
    private List<Reference<? extends CommonCoordinateSpaceAuthor>> author;
    
    /**
    * Creator of a literary or creative work, as well as a dataset publication.
    */
    public List<Reference<? extends CommonCoordinateSpaceAuthor>> getAuthor() {
       return this.author;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends CommonCoordinateSpaceCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends CommonCoordinateSpaceCustodian>> getCustodian() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<? extends CommonCoordinateSpaceDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends CommonCoordinateSpaceDigitalIdentifier> getDigitalIdentifier() {
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
    private List<Reference<CommonCoordinateSpaceVersion>> hasVersion;
    
    /**
    * Reference to variants of an original.
    */
    public List<Reference<CommonCoordinateSpaceVersion>> getHasVersion() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/ontologyIdentifier")
    private List<String> ontologyIdentifier;
    
    /**
    * Term or code used to identify something or someone registered within a particular ontology.
    */
    public List<String> getOntologyIdentifier() {
       return this.ontologyIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/shortName")
    private String shortName;
    
    /**
    * Shortened or fully abbreviated name of something or somebody.
    */
    public String getShortName() {
       return this.shortName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/usedSpecies")
    private Reference<Species> usedSpecies;
    
    public Reference<Species> getUsedSpecies() {
       return this.usedSpecies;
    }

 
    public static CommonCoordinateSpace.Builder create(LocalId localId){
        return new CommonCoordinateSpace(localId).new Builder();
    }

    public CommonCoordinateSpace.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, CommonCoordinateSpace.class).new Builder();
    }
}