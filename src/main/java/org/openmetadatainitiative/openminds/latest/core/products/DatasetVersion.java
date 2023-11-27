package org.openmetadatainitiative.openminds.latest.core.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.EthicsAssessment;
import org.openmetadatainitiative.openminds.latest.controlledTerms.ExperimentalApproach;
import org.openmetadatainitiative.openminds.latest.controlledTerms.PreparationType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.ProductAccessibility;
import org.openmetadatainitiative.openminds.latest.controlledTerms.SemanticDataType;
import org.openmetadatainitiative.openminds.latest.core.actors.Contribution;
import org.openmetadatainitiative.openminds.latest.core.data.Copyright;
import org.openmetadatainitiative.openminds.latest.core.data.FileRepository;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.Funding;
import org.openmetadatainitiative.openminds.latest.core.products.DatasetVersion;
import org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionAuthor;
import org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionCustodian;
import org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionDigitalIdentifier;
import org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionFullDocumentation;
import org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionInputData;
import org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionKeyword;
import org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionLicense;
import org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionRelatedPublication;
import org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionStudiedSpecimen;
import org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionStudyTarget;
import org.openmetadatainitiative.openminds.latest.core.products.intf.DatasetVersionTechnique;
import org.openmetadatainitiative.openminds.latest.core.research.BehavioralProtocol;
import org.openmetadatainitiative.openminds.latest.core.research.Protocol;


import static org.openmetadatainitiative.openminds.latest.core.products.DatasetVersion.*;
/**
 * Structured information on data originating from human/animal studies or simulations (version level).
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatasetVersion extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyInput, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionAbout, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.CommentAbout{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/DatasetVersion";

    @JsonIgnore
    public Reference<DatasetVersion> getReference() {
        return doGetReference();
    }

    public static Reference<DatasetVersion> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private DatasetVersion(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<DatasetVersion>{
        
        public Builder accessibility(Reference<ProductAccessibility> accessibility) { DatasetVersion.this.accessibility = accessibility; return this; }
        
        public Builder author(List<Reference<? extends DatasetVersionAuthor>> author) { DatasetVersion.this.author = author; return this; }
        
        public Builder behavioralProtocol(List<Reference<BehavioralProtocol>> behavioralProtocol) { DatasetVersion.this.behavioralProtocol = behavioralProtocol; return this; }
        
        public Builder copyright(Copyright copyright) { DatasetVersion.this.copyright = copyright; return this; }
        
        public Builder custodian(List<Reference<? extends DatasetVersionCustodian>> custodian) { DatasetVersion.this.custodian = custodian; return this; }
        
        public Builder dataType(List<Reference<SemanticDataType>> dataType) { DatasetVersion.this.dataType = dataType; return this; }
        
        public Builder description(String description) { DatasetVersion.this.description = description; return this; }
        
        public Builder digitalIdentifier(Reference<? extends DatasetVersionDigitalIdentifier> digitalIdentifier) { DatasetVersion.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder ethicsAssessment(Reference<EthicsAssessment> ethicsAssessment) { DatasetVersion.this.ethicsAssessment = ethicsAssessment; return this; }
        
        public Builder experimentalApproach(List<Reference<ExperimentalApproach>> experimentalApproach) { DatasetVersion.this.experimentalApproach = experimentalApproach; return this; }
        
        public Builder fullDocumentation(Reference<? extends DatasetVersionFullDocumentation> fullDocumentation) { DatasetVersion.this.fullDocumentation = fullDocumentation; return this; }
        
        public Builder fullName(String fullName) { DatasetVersion.this.fullName = fullName; return this; }
        
        public Builder funding(List<Reference<Funding>> funding) { DatasetVersion.this.funding = funding; return this; }
        
        public Builder homepage(String homepage) { DatasetVersion.this.homepage = homepage; return this; }
        
        public Builder howToCite(String howToCite) { DatasetVersion.this.howToCite = howToCite; return this; }
        
        public Builder inputData(List<Reference<? extends DatasetVersionInputData>> inputData) { DatasetVersion.this.inputData = inputData; return this; }
        
        public Builder isAlternativeVersionOf(List<Reference<DatasetVersion>> isAlternativeVersionOf) { DatasetVersion.this.isAlternativeVersionOf = isAlternativeVersionOf; return this; }
        
        public Builder isNewVersionOf(Reference<DatasetVersion> isNewVersionOf) { DatasetVersion.this.isNewVersionOf = isNewVersionOf; return this; }
        
        public Builder keyword(List<Reference<? extends DatasetVersionKeyword>> keyword) { DatasetVersion.this.keyword = keyword; return this; }
        
        public Builder license(Reference<? extends DatasetVersionLicense> license) { DatasetVersion.this.license = license; return this; }
        
        public Builder otherContribution(List<Contribution> otherContribution) { DatasetVersion.this.otherContribution = otherContribution; return this; }
        
        public Builder preparationDesign(List<Reference<PreparationType>> preparationDesign) { DatasetVersion.this.preparationDesign = preparationDesign; return this; }
        
        public Builder protocol(List<Reference<Protocol>> protocol) { DatasetVersion.this.protocol = protocol; return this; }
        
        public Builder relatedPublication(List<Reference<? extends DatasetVersionRelatedPublication>> relatedPublication) { DatasetVersion.this.relatedPublication = relatedPublication; return this; }
        
        public Builder releaseDate(String releaseDate) { DatasetVersion.this.releaseDate = releaseDate; return this; }
        
        public Builder repository(Reference<FileRepository> repository) { DatasetVersion.this.repository = repository; return this; }
        
        public Builder shortName(String shortName) { DatasetVersion.this.shortName = shortName; return this; }
        
        public Builder studiedSpecimen(List<Reference<? extends DatasetVersionStudiedSpecimen>> studiedSpecimen) { DatasetVersion.this.studiedSpecimen = studiedSpecimen; return this; }
        
        public Builder studyTarget(List<Reference<? extends DatasetVersionStudyTarget>> studyTarget) { DatasetVersion.this.studyTarget = studyTarget; return this; }
        
        public Builder supportChannel(List<String> supportChannel) { DatasetVersion.this.supportChannel = supportChannel; return this; }
        
        public Builder technique(List<Reference<? extends DatasetVersionTechnique>> technique) { DatasetVersion.this.technique = technique; return this; }
        
        public Builder versionIdentifier(String versionIdentifier) { DatasetVersion.this.versionIdentifier = versionIdentifier; return this; }
        
        public Builder versionInnovation(String versionInnovation) { DatasetVersion.this.versionInnovation = versionInnovation; return this; }
        

        public DatasetVersion build() {
            if (DatasetVersion.this.id == null) {
                DatasetVersion.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(DatasetVersion.this.types == null || DatasetVersion.this.types.isEmpty() || !DatasetVersion.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = DatasetVersion.this.types;
                DatasetVersion.this.types = new ArrayList<>();
                DatasetVersion.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    DatasetVersion.this.types.addAll(oldValues);
                }
            }
            return DatasetVersion.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/accessibility")
    private Reference<ProductAccessibility> accessibility;
    
    /**
    * Level to which something is accessible to someone or something.
    */
    public Reference<ProductAccessibility> getAccessibility() {
       return this.accessibility;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/author")
    private List<Reference<? extends DatasetVersionAuthor>> author;
    
    /**
    * Creator of a literary or creative work, as well as a dataset publication.
    */
    public List<Reference<? extends DatasetVersionAuthor>> getAuthor() {
       return this.author;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/behavioralProtocol")
    private List<Reference<BehavioralProtocol>> behavioralProtocol;
    
    public List<Reference<BehavioralProtocol>> getBehavioralProtocol() {
       return this.behavioralProtocol;
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
    private List<Reference<? extends DatasetVersionCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends DatasetVersionCustodian>> getCustodian() {
       return this.custodian;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/dataType")
    private List<Reference<SemanticDataType>> dataType;
    
    public List<Reference<SemanticDataType>> getDataType() {
       return this.dataType;
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
    private Reference<? extends DatasetVersionDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends DatasetVersionDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/ethicsAssessment")
    private Reference<EthicsAssessment> ethicsAssessment;
    
    /**
    * Judgment about the applied principles of conduct governing an individual or a group.
    */
    public Reference<EthicsAssessment> getEthicsAssessment() {
       return this.ethicsAssessment;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/experimentalApproach")
    private List<Reference<ExperimentalApproach>> experimentalApproach;
    
    public List<Reference<ExperimentalApproach>> getExperimentalApproach() {
       return this.experimentalApproach;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullDocumentation")
    private Reference<? extends DatasetVersionFullDocumentation> fullDocumentation;
    
    /**
    * Non-abridged instructions, comments, and information for using a particular product.
    */
    public Reference<? extends DatasetVersionFullDocumentation> getFullDocumentation() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/inputData")
    private List<Reference<? extends DatasetVersionInputData>> inputData;
    
    /**
    * Data that is put into a process or machine.
    */
    public List<Reference<? extends DatasetVersionInputData>> getInputData() {
       return this.inputData;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isAlternativeVersionOf")
    private List<Reference<DatasetVersion>> isAlternativeVersionOf;
    
    /**
    * Reference to an original form where the essence was preserved, but presented in an alternative form.
    */
    public List<Reference<DatasetVersion>> getIsAlternativeVersionOf() {
       return this.isAlternativeVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isNewVersionOf")
    private Reference<DatasetVersion> isNewVersionOf;
    
    /**
    * Reference to a previous (potentially outdated) particular form of something.
    */
    public Reference<DatasetVersion> getIsNewVersionOf() {
       return this.isNewVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/keyword")
    private List<Reference<? extends DatasetVersionKeyword>> keyword;
    
    /**
    * Significant word or concept that are representative of something or someone.
    */
    public List<Reference<? extends DatasetVersionKeyword>> getKeyword() {
       return this.keyword;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/license")
    private Reference<? extends DatasetVersionLicense> license;
    
    /**
    * Grant by a party to another party as an element of an agreement between those parties that permits to do, use, or own something.
    */
    public Reference<? extends DatasetVersionLicense> getLicense() {
       return this.license;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/otherContribution")
    private List<Contribution> otherContribution;
    
    /**
    * Giving or supplying of something (such as money or time) as a part or share other than what is covered elsewhere.
    */
    public List<Contribution> getOtherContribution() {
       return this.otherContribution;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/preparationDesign")
    private List<Reference<PreparationType>> preparationDesign;
    
    public List<Reference<PreparationType>> getPreparationDesign() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relatedPublication")
    private List<Reference<? extends DatasetVersionRelatedPublication>> relatedPublication;
    
    /**
    * Reference to something that was made available for the general public to see or buy.
    */
    public List<Reference<? extends DatasetVersionRelatedPublication>> getRelatedPublication() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studiedSpecimen")
    private List<Reference<? extends DatasetVersionStudiedSpecimen>> studiedSpecimen;
    
    public List<Reference<? extends DatasetVersionStudiedSpecimen>> getStudiedSpecimen() {
       return this.studiedSpecimen;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/studyTarget")
    private List<Reference<? extends DatasetVersionStudyTarget>> studyTarget;
    
    /**
    * Structure or function that was targeted within a study.
    */
    public List<Reference<? extends DatasetVersionStudyTarget>> getStudyTarget() {
       return this.studyTarget;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/supportChannel")
    private List<String> supportChannel;
    
    /**
    * Way of communication used to interact with users or customers.
    */
    public List<String> getSupportChannel() {
       return this.supportChannel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/technique")
    private List<Reference<? extends DatasetVersionTechnique>> technique;
    
    /**
    * Method of accomplishing a desired aim.
    */
    public List<Reference<? extends DatasetVersionTechnique>> getTechnique() {
       return this.technique;
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

 
    public static DatasetVersion.Builder create(LocalId localId){
        return new DatasetVersion(localId).new Builder();
    }

    public DatasetVersion.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, DatasetVersion.class).new Builder();
    }
}