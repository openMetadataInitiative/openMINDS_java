package org.openmetadatainitiative.openminds.latest.publications;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.ProductAccessibility;
import org.openmetadatainitiative.openminds.latest.core.actors.Contribution;
import org.openmetadatainitiative.openminds.latest.core.data.Copyright;
import org.openmetadatainitiative.openminds.latest.core.data.FileRepository;
import org.openmetadatainitiative.openminds.latest.core.data.License;
import org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.DOI;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.Funding;
import org.openmetadatainitiative.openminds.latest.publications.LivePaperVersion;
import org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionAbout;
import org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionAuthor;
import org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionCustodian;
import org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionFullDocumentation;
import org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionKeyword;
import org.openmetadatainitiative.openminds.latest.publications.intf.LivePaperVersionRelatedPublication;


import static org.openmetadatainitiative.openminds.latest.publications.LivePaperVersion.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LivePaperVersion extends Instance implements org.openmetadatainitiative.openminds.latest.publications.intf.LearningResourceAbout, org.openmetadatainitiative.openminds.latest.core.products.intf.ProjectHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.ResearchProductGroupHasPart, org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf.CommentAbout{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/publications/LivePaperVersion";

    @JsonIgnore
    public Reference<LivePaperVersion> getReference() {
        return doGetReference();
    }

    public static Reference<LivePaperVersion> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private LivePaperVersion(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<LivePaperVersion>{
        
        public Builder about(List<Reference<? extends LivePaperVersionAbout>> about) { LivePaperVersion.this.about = about; return this; }
        
        public Builder accessibility(Reference<ProductAccessibility> accessibility) { LivePaperVersion.this.accessibility = accessibility; return this; }
        
        public Builder author(List<Reference<? extends LivePaperVersionAuthor>> author) { LivePaperVersion.this.author = author; return this; }
        
        public Builder copyright(Copyright copyright) { LivePaperVersion.this.copyright = copyright; return this; }
        
        public Builder custodian(List<Reference<? extends LivePaperVersionCustodian>> custodian) { LivePaperVersion.this.custodian = custodian; return this; }
        
        public Builder description(String description) { LivePaperVersion.this.description = description; return this; }
        
        public Builder digitalIdentifier(Reference<DOI> digitalIdentifier) { LivePaperVersion.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder fullDocumentation(Reference<? extends LivePaperVersionFullDocumentation> fullDocumentation) { LivePaperVersion.this.fullDocumentation = fullDocumentation; return this; }
        
        public Builder fullName(String fullName) { LivePaperVersion.this.fullName = fullName; return this; }
        
        public Builder funding(List<Reference<Funding>> funding) { LivePaperVersion.this.funding = funding; return this; }
        
        public Builder homepage(String homepage) { LivePaperVersion.this.homepage = homepage; return this; }
        
        public Builder howToCite(String howToCite) { LivePaperVersion.this.howToCite = howToCite; return this; }
        
        public Builder isAlternativeVersionOf(List<Reference<LivePaperVersion>> isAlternativeVersionOf) { LivePaperVersion.this.isAlternativeVersionOf = isAlternativeVersionOf; return this; }
        
        public Builder isNewVersionOf(Reference<LivePaperVersion> isNewVersionOf) { LivePaperVersion.this.isNewVersionOf = isNewVersionOf; return this; }
        
        public Builder keyword(List<Reference<? extends LivePaperVersionKeyword>> keyword) { LivePaperVersion.this.keyword = keyword; return this; }
        
        public Builder license(Reference<License> license) { LivePaperVersion.this.license = license; return this; }
        
        public Builder modificationDate(String modificationDate) { LivePaperVersion.this.modificationDate = modificationDate; return this; }
        
        public Builder otherContribution(List<Contribution> otherContribution) { LivePaperVersion.this.otherContribution = otherContribution; return this; }
        
        public Builder relatedPublication(List<Reference<? extends LivePaperVersionRelatedPublication>> relatedPublication) { LivePaperVersion.this.relatedPublication = relatedPublication; return this; }
        
        public Builder releaseDate(String releaseDate) { LivePaperVersion.this.releaseDate = releaseDate; return this; }
        
        public Builder repository(Reference<FileRepository> repository) { LivePaperVersion.this.repository = repository; return this; }
        
        public Builder shortName(String shortName) { LivePaperVersion.this.shortName = shortName; return this; }
        
        public Builder supportChannel(List<String> supportChannel) { LivePaperVersion.this.supportChannel = supportChannel; return this; }
        
        public Builder versionIdentifier(String versionIdentifier) { LivePaperVersion.this.versionIdentifier = versionIdentifier; return this; }
        
        public Builder versionInnovation(String versionInnovation) { LivePaperVersion.this.versionInnovation = versionInnovation; return this; }
        

        public LivePaperVersion build() {
            if (LivePaperVersion.this.id == null) {
                LivePaperVersion.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(LivePaperVersion.this.types == null || LivePaperVersion.this.types.isEmpty() || !LivePaperVersion.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = LivePaperVersion.this.types;
                LivePaperVersion.this.types = new ArrayList<>();
                LivePaperVersion.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    LivePaperVersion.this.types.addAll(oldValues);
                }
            }
            return LivePaperVersion.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/about")
    private List<Reference<? extends LivePaperVersionAbout>> about;
    
    public List<Reference<? extends LivePaperVersionAbout>> getAbout() {
       return this.about;
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
    private List<Reference<? extends LivePaperVersionAuthor>> author;
    
    /**
    * Creator of a literary or creative work, as well as a dataset publication.
    */
    public List<Reference<? extends LivePaperVersionAuthor>> getAuthor() {
       return this.author;
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
    private List<Reference<? extends LivePaperVersionCustodian>> custodian;
    
    /**
    * The 'custodian' is a legal person who is responsible for the content and quality of the data, metadata, and/or code of a research product.
    */
    public List<Reference<? extends LivePaperVersionCustodian>> getCustodian() {
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
    private Reference<DOI> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<DOI> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fullDocumentation")
    private Reference<? extends LivePaperVersionFullDocumentation> fullDocumentation;
    
    /**
    * Non-abridged instructions, comments, and information for using a particular product.
    */
    public Reference<? extends LivePaperVersionFullDocumentation> getFullDocumentation() {
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
    private List<Reference<LivePaperVersion>> isAlternativeVersionOf;
    
    /**
    * Reference to an original form where the essence was preserved, but presented in an alternative form.
    */
    public List<Reference<LivePaperVersion>> getIsAlternativeVersionOf() {
       return this.isAlternativeVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/isNewVersionOf")
    private Reference<LivePaperVersion> isNewVersionOf;
    
    /**
    * Reference to a previous (potentially outdated) particular form of something.
    */
    public Reference<LivePaperVersion> getIsNewVersionOf() {
       return this.isNewVersionOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/keyword")
    private List<Reference<? extends LivePaperVersionKeyword>> keyword;
    
    /**
    * Significant word or concept that are representative of something or someone.
    */
    public List<Reference<? extends LivePaperVersionKeyword>> getKeyword() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/modificationDate")
    private String modificationDate;
    
    public String getModificationDate() {
       return this.modificationDate;
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
    private List<Reference<? extends LivePaperVersionRelatedPublication>> relatedPublication;
    
    /**
    * Reference to something that was made available for the general public to see or buy.
    */
    public List<Reference<? extends LivePaperVersionRelatedPublication>> getRelatedPublication() {
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

 
    public static LivePaperVersion.Builder create(LocalId localId){
        return new LivePaperVersion(localId).new Builder();
    }

    public LivePaperVersion.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, LivePaperVersion.class).new Builder();
    }
}