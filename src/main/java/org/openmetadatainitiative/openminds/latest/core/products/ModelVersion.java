package org.openmetadatainitiative.openminds.latest.core.products;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.ProductAccessibility;
import org.openmetadatainitiative.openminds.latest.core.actors.Contribution;
import org.openmetadatainitiative.openminds.latest.core.data.ContentType;
import org.openmetadatainitiative.openminds.latest.core.data.Copyright;
import org.openmetadatainitiative.openminds.latest.core.data.FileRepository;
import org.openmetadatainitiative.openminds.latest.core.data.License;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.Funding;
import org.openmetadatainitiative.openminds.latest.core.products.ModelVersion;
import org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionCustodian;
import org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionDeveloper;
import org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionDigitalIdentifier;
import org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionFullDocumentation;
import org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionInputData;
import org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionKeyword;
import org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionOutputData;
import org.openmetadatainitiative.openminds.latest.core.products.intf.ModelVersionRelatedPublication;


import static org.openmetadatainitiative.openminds.latest.core.products.ModelVersion.SEMANTIC_NAME;
/**
 * Structured information on a computational model (version level).
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelVersion extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationInput, org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationOutput, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationInput, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyInput, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationInput, org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionAbout, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.CommentAbout, org.openmetadatainitiative.openminds.latest.core.data.intf.ServiceLinkDataLocation{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/ModelVersion";

    @JsonIgnore
    public Reference<ModelVersion> getReference() {
        return doGetReference();
    }

    public static Reference<ModelVersion> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private ModelVersion(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ModelVersion>{
        
        public Builder accessibility(Reference<ProductAccessibility> accessibility) { ModelVersion.this.accessibility = accessibility; return this; }
        
        public Builder copyright(Copyright copyright) { ModelVersion.this.copyright = copyright; return this; }
        
        public Builder custodian(List<Reference<? extends ModelVersionCustodian>> custodian) { ModelVersion.this.custodian = custodian; return this; }
        
        public Builder description(String description) { ModelVersion.this.description = description; return this; }
        
        public Builder developer(List<Reference<? extends ModelVersionDeveloper>> developer) { ModelVersion.this.developer = developer; return this; }
        
        public Builder digitalIdentifier(Reference<? extends ModelVersionDigitalIdentifier> digitalIdentifier) { ModelVersion.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder format(List<Reference<ContentType>> format) { ModelVersion.this.format = format; return this; }
        
        public Builder fullDocumentation(Reference<? extends ModelVersionFullDocumentation> fullDocumentation) { ModelVersion.this.fullDocumentation = fullDocumentation; return this; }
        
        public Builder fullName(String fullName) { ModelVersion.this.fullName = fullName; return this; }
        
        public Builder funding(List<Reference<Funding>> funding) { ModelVersion.this.funding = funding; return this; }
        
        public Builder homepage(String homepage) { ModelVersion.this.homepage = homepage; return this; }
        
        public Builder howToCite(String howToCite) { ModelVersion.this.howToCite = howToCite; return this; }
        
        public Builder inputData(List<Reference<? extends ModelVersionInputData>> inputData) { ModelVersion.this.inputData = inputData; return this; }
        
        public Builder isAlternativeVersionOf(List<Reference<ModelVersion>> isAlternativeVersionOf) { ModelVersion.this.isAlternativeVersionOf = isAlternativeVersionOf; return this; }
        
        public Builder isNewVersionOf(Reference<ModelVersion> isNewVersionOf) { ModelVersion.this.isNewVersionOf = isNewVersionOf; return this; }
        
        public Builder keyword(List<Reference<? extends ModelVersionKeyword>> keyword) { ModelVersion.this.keyword = keyword; return this; }
        
        public Builder license(List<Reference<License>> license) { ModelVersion.this.license = license; return this; }
        
        public Builder otherContribution(List<Contribution> otherContribution) { ModelVersion.this.otherContribution = otherContribution; return this; }
        
        public Builder outputData(List<Reference<? extends ModelVersionOutputData>> outputData) { ModelVersion.this.outputData = outputData; return this; }
        
        public Builder relatedPublication(List<Reference<? extends ModelVersionRelatedPublication>> relatedPublication) { ModelVersion.this.relatedPublication = relatedPublication; return this; }
        
        public Builder releaseDate(String releaseDate) { ModelVersion.this.releaseDate = releaseDate; return this; }
        
        public Builder repository(Reference<FileRepository> repository) { ModelVersion.this.repository = repository; return this; }
        
        public Builder shortName(String shortName) { ModelVersion.this.shortName = shortName; return this; }
        
        public Builder supportChannel(List<String> supportChannel) { ModelVersion.this.supportChannel = supportChannel; return this; }
        
        public Builder versionIdentifier(String versionIdentifier) { ModelVersion.this.versionIdentifier = versionIdentifier; return this; }
        
        public Builder versionInnovation(String versionInnovation) { ModelVersion.this.versionInnovation = versionInnovation; return this; }
        

        public ModelVersion build(OpenMINDSContext context) {
            if (ModelVersion.this.id == null) {
                ModelVersion.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            ModelVersion.this.type = SEMANTIC_NAME;
            return ModelVersion.this;
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/copyright")
    private Copyright copyright;
    
    /**
    * Exclusive and assignable legal right of an originator to reproduce, publish, sell, or distribute the matter and form of a creative work for a defined time period.
    */
    public Copyright getCopyright() {
       return this.copyright;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/custodian")
    private List<Reference<? extends ModelVersionCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends ModelVersionCustodian>> getCustodian() {
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
    private List<Reference<? extends ModelVersionDeveloper>> developer;
    
    /**
    * Legal person that creates or improves products or services (e.g., software, applications, etc.).
    */
    public List<Reference<? extends ModelVersionDeveloper>> getDeveloper() {
       return this.developer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<? extends ModelVersionDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends ModelVersionDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/format")
    private List<Reference<ContentType>> format;
    
    /**
    * Method of digitally organizing and structuring data or information.
    */
    public List<Reference<ContentType>> getFormat() {
       return this.format;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullDocumentation")
    private Reference<? extends ModelVersionFullDocumentation> fullDocumentation;
    
    /**
    * Non-abridged instructions, comments, and information for using a particular product.
    */
    public Reference<? extends ModelVersionFullDocumentation> getFullDocumentation() {
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
    private List<Reference<? extends ModelVersionInputData>> inputData;
    
    /**
    * Data that is put into a process or machine.
    */
    public List<Reference<? extends ModelVersionInputData>> getInputData() {
       return this.inputData;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isAlternativeVersionOf")
    private List<Reference<ModelVersion>> isAlternativeVersionOf;
    
    /**
    * Reference to an original form where the essence was preserved, but presented in an alternative form.
    */
    public List<Reference<ModelVersion>> getIsAlternativeVersionOf() {
       return this.isAlternativeVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isNewVersionOf")
    private Reference<ModelVersion> isNewVersionOf;
    
    /**
    * Reference to a previous (potentially outdated) particular form of something.
    */
    public Reference<ModelVersion> getIsNewVersionOf() {
       return this.isNewVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/keyword")
    private List<Reference<? extends ModelVersionKeyword>> keyword;
    
    /**
    * Significant word or concept that are representative of something or someone.
    */
    public List<Reference<? extends ModelVersionKeyword>> getKeyword() {
       return this.keyword;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/license")
    private List<Reference<License>> license;
    
    /**
    * Grant by a party to another party as an element of an agreement between those parties that permits to do, use, or own something.
    */
    public List<Reference<License>> getLicense() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/outputData")
    private List<Reference<? extends ModelVersionOutputData>> outputData;
    
    /**
    * Data that comes out of, is delivered or produced by a process or machine.
    */
    public List<Reference<? extends ModelVersionOutputData>> getOutputData() {
       return this.outputData;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relatedPublication")
    private List<Reference<? extends ModelVersionRelatedPublication>> relatedPublication;
    
    /**
    * Reference to something that was made available for the general public to see or buy.
    */
    public List<Reference<? extends ModelVersionRelatedPublication>> getRelatedPublication() {
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

 
    public static ModelVersion.Builder create(LocalId localId){
        return new ModelVersion(localId).new Builder();
    }

    public ModelVersion.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ModelVersion.class).new Builder();
    }
}