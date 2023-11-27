package org.openmetadatainitiative.openminds.v3.core.research;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.BreedingType;
import org.openmetadatainitiative.openminds.v3.controlledTerms.GeneticStrainType;
import org.openmetadatainitiative.openminds.v3.controlledTerms.Species;
import org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.RRID;
import org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.StockNumber;
import org.openmetadatainitiative.openminds.v3.core.research.intf.StrainDiseaseModel;


import static org.openmetadatainitiative.openminds.v3.core.research.Strain.SEMANTIC_NAME;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Strain extends Instance implements org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleSpecies, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionSpecies, org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectSpecies, org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectGroupSpecies{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/Strain";

    @JsonIgnore
    public Reference<Strain> getReference() {
        return doGetReference();
    }

    public static Reference<Strain> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private Strain(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<Strain>{
        
        public Builder alternateIdentifier(List<String> alternateIdentifier) { Strain.this.alternateIdentifier = alternateIdentifier; return this; }
        
        public Builder backgroundStrain(List<Reference<Strain>> backgroundStrain) { Strain.this.backgroundStrain = backgroundStrain; return this; }
        
        public Builder breedingType(Reference<BreedingType> breedingType) { Strain.this.breedingType = breedingType; return this; }
        
        public Builder description(String description) { Strain.this.description = description; return this; }
        
        public Builder digitalIdentifier(Reference<RRID> digitalIdentifier) { Strain.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder diseaseModel(List<Reference<? extends StrainDiseaseModel>> diseaseModel) { Strain.this.diseaseModel = diseaseModel; return this; }
        
        public Builder geneticStrainType(Reference<GeneticStrainType> geneticStrainType) { Strain.this.geneticStrainType = geneticStrainType; return this; }
        
        public Builder laboratoryCode(String laboratoryCode) { Strain.this.laboratoryCode = laboratoryCode; return this; }
        
        public Builder name(String name) { Strain.this.name = name; return this; }
        
        public Builder ontologyIdentifier(List<String> ontologyIdentifier) { Strain.this.ontologyIdentifier = ontologyIdentifier; return this; }
        
        public Builder phenotype(String phenotype) { Strain.this.phenotype = phenotype; return this; }
        
        public Builder species(Reference<Species> species) { Strain.this.species = species; return this; }
        
        public Builder stockNumber(StockNumber stockNumber) { Strain.this.stockNumber = stockNumber; return this; }
        
        public Builder synonym(List<String> synonym) { Strain.this.synonym = synonym; return this; }
        

        public Strain build(OpenMINDSContext context) {
            if (Strain.this.id == null) {
                Strain.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            Strain.this.type = SEMANTIC_NAME;
            return Strain.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/alternateIdentifier")
    private List<String> alternateIdentifier;
    
    public List<String> getAlternateIdentifier() {
       return this.alternateIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/backgroundStrain")
    private List<Reference<Strain>> backgroundStrain;
    
    public List<Reference<Strain>> getBackgroundStrain() {
       return this.backgroundStrain;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/breedingType")
    private Reference<BreedingType> breedingType;
    
    public Reference<BreedingType> getBreedingType() {
       return this.breedingType;
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
    private Reference<RRID> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<RRID> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/diseaseModel")
    private List<Reference<? extends StrainDiseaseModel>> diseaseModel;
    
    public List<Reference<? extends StrainDiseaseModel>> getDiseaseModel() {
       return this.diseaseModel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/geneticStrainType")
    private Reference<GeneticStrainType> geneticStrainType;
    
    public Reference<GeneticStrainType> getGeneticStrainType() {
       return this.geneticStrainType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/laboratoryCode")
    private String laboratoryCode;
    
    public String getLaboratoryCode() {
       return this.laboratoryCode;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/ontologyIdentifier")
    private List<String> ontologyIdentifier;
    
    /**
    * Term or code used to identify something or someone registered within a particular ontology.
    */
    public List<String> getOntologyIdentifier() {
       return this.ontologyIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/phenotype")
    private String phenotype;
    
    /**
    * Physical expression of one or more genes of an organism.
    */
    public String getPhenotype() {
       return this.phenotype;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/species")
    private Reference<Species> species;
    
    /**
    * Category of biological classification comprising related organisms or populations potentially capable of interbreeding, and being designated by a binomial that consists of the name of a genus followed by a Latin or latinized uncapitalized noun or adjective.
    */
    public Reference<Species> getSpecies() {
       return this.species;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/stockNumber")
    private StockNumber stockNumber;
    
    public StockNumber getStockNumber() {
       return this.stockNumber;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/synonym")
    private List<String> synonym;
    
    /**
    * Words or expressions used in the same language that have the same or nearly the same meaning in some or all senses.
    */
    public List<String> getSynonym() {
       return this.synonym;
    }

 
    public static Strain.Builder create(LocalId localId){
        return new Strain(localId).new Builder();
    }

    public Strain.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, Strain.class).new Builder();
    }
}