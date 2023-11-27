package org.openmetadatainitiative.openminds.v3.SANDS.atlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.SANDS.atlas.CommonCoordinateSpaceVersion;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionAuthor;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionCustodian;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionDigitalIdentifier;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionFullDocumentation;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionKeyword;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionRelatedPublication;
import org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionUsedSpecimen;
import org.openmetadatainitiative.openminds.v3.controlledTerms.AnatomicalAxesOrientation;
import org.openmetadatainitiative.openminds.v3.controlledTerms.ProductAccessibility;
import org.openmetadatainitiative.openminds.v3.controlledTerms.UnitOfMeasurement;
import org.openmetadatainitiative.openminds.v3.core.actors.Contribution;
import org.openmetadatainitiative.openminds.v3.core.data.Copyright;
import org.openmetadatainitiative.openminds.v3.core.data.File;
import org.openmetadatainitiative.openminds.v3.core.data.FileRepository;
import org.openmetadatainitiative.openminds.v3.core.data.License;
import org.openmetadatainitiative.openminds.v3.core.miscellaneous.Funding;
import org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.v3.SANDS.atlas.CommonCoordinateSpaceVersion.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonCoordinateSpaceVersion extends Instance implements org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisInput, org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.v3.SANDS.nonatlas.intf.CustomAnnotationCoordinateSpace, org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.intf.CoordinatePointCoordinateSpace, org.openmetadatainitiative.openminds.v3.core.research.intf.ProtocolExecutionInput, org.openmetadatainitiative.openminds.v3.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionInputData, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.v3.core.miscellaneous.intf.CommentAbout, org.openmetadatainitiative.openminds.v3.core.data.intf.FileBundleGroupedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/CommonCoordinateSpaceVersion";

    @JsonIgnore
    public Reference<CommonCoordinateSpaceVersion> getReference() {
        return doGetReference();
    }

    public static Reference<CommonCoordinateSpaceVersion> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private CommonCoordinateSpaceVersion(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<CommonCoordinateSpaceVersion>{
        
        public Builder abbreviation(String abbreviation) { CommonCoordinateSpaceVersion.this.abbreviation = abbreviation; return this; }
        
        public Builder accessibility(Reference<ProductAccessibility> accessibility) { CommonCoordinateSpaceVersion.this.accessibility = accessibility; return this; }
        
        public Builder anatomicalAxesOrientation(Reference<AnatomicalAxesOrientation> anatomicalAxesOrientation) { CommonCoordinateSpaceVersion.this.anatomicalAxesOrientation = anatomicalAxesOrientation; return this; }
        
        public Builder author(List<Reference<? extends CommonCoordinateSpaceVersionAuthor>> author) { CommonCoordinateSpaceVersion.this.author = author; return this; }
        
        public Builder axesOrigin(List<QuantitativeValue> axesOrigin) { CommonCoordinateSpaceVersion.this.axesOrigin = axesOrigin; return this; }
        
        public Builder copyright(Copyright copyright) { CommonCoordinateSpaceVersion.this.copyright = copyright; return this; }
        
        public Builder custodian(List<Reference<? extends CommonCoordinateSpaceVersionCustodian>> custodian) { CommonCoordinateSpaceVersion.this.custodian = custodian; return this; }
        
        public Builder defaultImage(List<Reference<File>> defaultImage) { CommonCoordinateSpaceVersion.this.defaultImage = defaultImage; return this; }
        
        public Builder description(String description) { CommonCoordinateSpaceVersion.this.description = description; return this; }
        
        public Builder digitalIdentifier(Reference<? extends CommonCoordinateSpaceVersionDigitalIdentifier> digitalIdentifier) { CommonCoordinateSpaceVersion.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder fullDocumentation(Reference<? extends CommonCoordinateSpaceVersionFullDocumentation> fullDocumentation) { CommonCoordinateSpaceVersion.this.fullDocumentation = fullDocumentation; return this; }
        
        public Builder fullName(String fullName) { CommonCoordinateSpaceVersion.this.fullName = fullName; return this; }
        
        public Builder funding(List<Reference<Funding>> funding) { CommonCoordinateSpaceVersion.this.funding = funding; return this; }
        
        public Builder homepage(String homepage) { CommonCoordinateSpaceVersion.this.homepage = homepage; return this; }
        
        public Builder howToCite(String howToCite) { CommonCoordinateSpaceVersion.this.howToCite = howToCite; return this; }
        
        public Builder isAlternativeVersionOf(List<Reference<CommonCoordinateSpaceVersion>> isAlternativeVersionOf) { CommonCoordinateSpaceVersion.this.isAlternativeVersionOf = isAlternativeVersionOf; return this; }
        
        public Builder isNewVersionOf(Reference<CommonCoordinateSpaceVersion> isNewVersionOf) { CommonCoordinateSpaceVersion.this.isNewVersionOf = isNewVersionOf; return this; }
        
        public Builder keyword(List<Reference<? extends CommonCoordinateSpaceVersionKeyword>> keyword) { CommonCoordinateSpaceVersion.this.keyword = keyword; return this; }
        
        public Builder license(Reference<License> license) { CommonCoordinateSpaceVersion.this.license = license; return this; }
        
        public Builder nativeUnit(Reference<UnitOfMeasurement> nativeUnit) { CommonCoordinateSpaceVersion.this.nativeUnit = nativeUnit; return this; }
        
        public Builder ontologyIdentifier(List<String> ontologyIdentifier) { CommonCoordinateSpaceVersion.this.ontologyIdentifier = ontologyIdentifier; return this; }
        
        public Builder otherContribution(List<Contribution> otherContribution) { CommonCoordinateSpaceVersion.this.otherContribution = otherContribution; return this; }
        
        public Builder relatedPublication(List<Reference<? extends CommonCoordinateSpaceVersionRelatedPublication>> relatedPublication) { CommonCoordinateSpaceVersion.this.relatedPublication = relatedPublication; return this; }
        
        public Builder releaseDate(String releaseDate) { CommonCoordinateSpaceVersion.this.releaseDate = releaseDate; return this; }
        
        public Builder repository(Reference<FileRepository> repository) { CommonCoordinateSpaceVersion.this.repository = repository; return this; }
        
        public Builder shortName(String shortName) { CommonCoordinateSpaceVersion.this.shortName = shortName; return this; }
        
        public Builder supportChannel(List<String> supportChannel) { CommonCoordinateSpaceVersion.this.supportChannel = supportChannel; return this; }
        
        public Builder usedSpecimen(List<Reference<? extends CommonCoordinateSpaceVersionUsedSpecimen>> usedSpecimen) { CommonCoordinateSpaceVersion.this.usedSpecimen = usedSpecimen; return this; }
        
        public Builder versionIdentifier(String versionIdentifier) { CommonCoordinateSpaceVersion.this.versionIdentifier = versionIdentifier; return this; }
        
        public Builder versionInnovation(String versionInnovation) { CommonCoordinateSpaceVersion.this.versionInnovation = versionInnovation; return this; }
        

        public CommonCoordinateSpaceVersion build() {
            if (CommonCoordinateSpaceVersion.this.id == null) {
                CommonCoordinateSpaceVersion.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(CommonCoordinateSpaceVersion.this.types == null || CommonCoordinateSpaceVersion.this.types.isEmpty() || !CommonCoordinateSpaceVersion.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = CommonCoordinateSpaceVersion.this.types;
                CommonCoordinateSpaceVersion.this.types = new ArrayList<>();
                CommonCoordinateSpaceVersion.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    CommonCoordinateSpaceVersion.this.types.addAll(oldValues);
                }
            }
            return CommonCoordinateSpaceVersion.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/abbreviation")
    private String abbreviation;
    
    public String getAbbreviation() {
       return this.abbreviation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/accessibility")
    private Reference<ProductAccessibility> accessibility;
    
    /**
    * Level to which something is accessible to someone or something.
    */
    public Reference<ProductAccessibility> getAccessibility() {
       return this.accessibility;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/anatomicalAxesOrientation")
    private Reference<AnatomicalAxesOrientation> anatomicalAxesOrientation;
    
    /**
    * Relation between reference planes used in anatomy and mathematics.
    */
    public Reference<AnatomicalAxesOrientation> getAnatomicalAxesOrientation() {
       return this.anatomicalAxesOrientation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/author")
    private List<Reference<? extends CommonCoordinateSpaceVersionAuthor>> author;
    
    /**
    * Creator of a literary or creative work, as well as a dataset publication.
    */
    public List<Reference<? extends CommonCoordinateSpaceVersionAuthor>> getAuthor() {
       return this.author;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/axesOrigin")
    private List<QuantitativeValue> axesOrigin;
    
    /**
    * Special point in a coordinate system used as a fixed point of reference for the geometry of the surrounding space.
    */
    public List<QuantitativeValue> getAxesOrigin() {
       return this.axesOrigin;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/copyright")
    private Copyright copyright;
    
    /**
    * Exclusive and assignable legal right of an originator to reproduce, publish, sell, or distribute the matter and form of a creative work for a defined time period.
    */
    public Copyright getCopyright() {
       return this.copyright;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends CommonCoordinateSpaceVersionCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends CommonCoordinateSpaceVersionCustodian>> getCustodian() {
       return this.custodian;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/defaultImage")
    private List<Reference<File>> defaultImage;
    
    /**
    * Two or three dimensional image that particluarly represents a specific coordinate space.
    */
    public List<Reference<File>> getDefaultImage() {
       return this.defaultImage;
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
    private Reference<? extends CommonCoordinateSpaceVersionDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends CommonCoordinateSpaceVersionDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullDocumentation")
    private Reference<? extends CommonCoordinateSpaceVersionFullDocumentation> fullDocumentation;
    
    /**
    * Non-abridged instructions, comments, and information for using a particular product.
    */
    public Reference<? extends CommonCoordinateSpaceVersionFullDocumentation> getFullDocumentation() {
       return this.fullDocumentation;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullName")
    private String fullName;
    
    /**
    * Whole, non-abbreviated name of something or somebody.
    */
    public String getFullName() {
       return this.fullName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/funding")
    private List<Reference<Funding>> funding;
    
    /**
    * Money provided by a legal person for a particular purpose.
    */
    public List<Reference<Funding>> getFunding() {
       return this.funding;
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isAlternativeVersionOf")
    private List<Reference<CommonCoordinateSpaceVersion>> isAlternativeVersionOf;
    
    /**
    * Reference to an original form where the essence was preserved, but presented in an alternative form.
    */
    public List<Reference<CommonCoordinateSpaceVersion>> getIsAlternativeVersionOf() {
       return this.isAlternativeVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isNewVersionOf")
    private Reference<CommonCoordinateSpaceVersion> isNewVersionOf;
    
    /**
    * Reference to a previous (potentially outdated) particular form of something.
    */
    public Reference<CommonCoordinateSpaceVersion> getIsNewVersionOf() {
       return this.isNewVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/keyword")
    private List<Reference<? extends CommonCoordinateSpaceVersionKeyword>> keyword;
    
    /**
    * Significant word or concept that are representative of something or someone.
    */
    public List<Reference<? extends CommonCoordinateSpaceVersionKeyword>> getKeyword() {
       return this.keyword;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/license")
    private Reference<License> license;
    
    /**
    * Grant by a party to another party as an element of an agreement between those parties that permits to do, use, or own something.
    */
    public Reference<License> getLicense() {
       return this.license;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/nativeUnit")
    private Reference<UnitOfMeasurement> nativeUnit;
    
    /**
    * Determinate quantity used in the original measurement.
    */
    public Reference<UnitOfMeasurement> getNativeUnit() {
       return this.nativeUnit;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/ontologyIdentifier")
    private List<String> ontologyIdentifier;
    
    /**
    * Term or code used to identify something or someone registered within a particular ontology.
    */
    public List<String> getOntologyIdentifier() {
       return this.ontologyIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/otherContribution")
    private List<Contribution> otherContribution;
    
    /**
    * Giving or supplying of something (such as money or time) as a part or share other than what is covered elsewhere.
    */
    public List<Contribution> getOtherContribution() {
       return this.otherContribution;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relatedPublication")
    private List<Reference<? extends CommonCoordinateSpaceVersionRelatedPublication>> relatedPublication;
    
    /**
    * Reference to something that was made available for the general public to see or buy.
    */
    public List<Reference<? extends CommonCoordinateSpaceVersionRelatedPublication>> getRelatedPublication() {
       return this.relatedPublication;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/releaseDate")
    private String releaseDate;
    
    /**
    * Fixed date on which a product is due to become or was made available for the general public to see or buy
    */
    public String getReleaseDate() {
       return this.releaseDate;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/repository")
    private Reference<FileRepository> repository;
    
    /**
    * Place, room, or container where something is deposited or stored.
    */
    public Reference<FileRepository> getRepository() {
       return this.repository;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/shortName")
    private String shortName;
    
    /**
    * Shortened or fully abbreviated name of something or somebody.
    */
    public String getShortName() {
       return this.shortName;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/supportChannel")
    private List<String> supportChannel;
    
    /**
    * Way of communication used to interact with users or customers.
    */
    public List<String> getSupportChannel() {
       return this.supportChannel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/usedSpecimen")
    private List<Reference<? extends CommonCoordinateSpaceVersionUsedSpecimen>> usedSpecimen;
    
    public List<Reference<? extends CommonCoordinateSpaceVersionUsedSpecimen>> getUsedSpecimen() {
       return this.usedSpecimen;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/versionIdentifier")
    private String versionIdentifier;
    
    /**
    * Term or code used to identify the version of something.
    */
    public String getVersionIdentifier() {
       return this.versionIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/versionInnovation")
    private String versionInnovation;
    
    /**
    * Documentation on what changed in comparison to a previously published form of something.
    */
    public String getVersionInnovation() {
       return this.versionInnovation;
    }

 
    public static CommonCoordinateSpaceVersion.Builder create(LocalId localId){
        return new CommonCoordinateSpaceVersion(localId).new Builder();
    }

    public CommonCoordinateSpaceVersion.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, CommonCoordinateSpaceVersion.class).new Builder();
    }
}