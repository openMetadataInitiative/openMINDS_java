package org.openmetadatainitiative.openminds.latest.chemicals;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.chemicals.ProductSource;
import org.openmetadatainitiative.openminds.latest.chemicals.intf.ChemicalSubstancePurity;
import org.openmetadatainitiative.openminds.latest.controlledTerms.MolecularEntity;


import static org.openmetadatainitiative.openminds.latest.chemicals.ChemicalSubstance.*;
/**
 * Structured information about a chemical substance.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChemicalSubstance extends Instance implements org.openmetadatainitiative.openminds.latest.chemicals.intf.AmountOfChemicalChemicalProduct, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeConductorMaterial, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeInsulatorMaterial, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayConductorMaterial, org.openmetadatainitiative.openminds.latest.ephys.device.intf.ElectrodeArrayInsulatorMaterial, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteUsageLabelingCompound, org.openmetadatainitiative.openminds.latest.ephys.device.intf.PipetteMaterial{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/chemicals/ChemicalSubstance";

    @JsonIgnore
    public Reference<ChemicalSubstance> getReference() {
        return doGetReference();
    }

    public static Reference<ChemicalSubstance> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private ChemicalSubstance(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ChemicalSubstance>{
        
        public Builder additionalRemarks(String additionalRemarks) { ChemicalSubstance.this.additionalRemarks = additionalRemarks; return this; }
        
        public Builder lookupLabel(String lookupLabel) { ChemicalSubstance.this.lookupLabel = lookupLabel; return this; }
        
        public Builder molecularEntity(Reference<MolecularEntity> molecularEntity) { ChemicalSubstance.this.molecularEntity = molecularEntity; return this; }
        
        public Builder productSource(Reference<ProductSource> productSource) { ChemicalSubstance.this.productSource = productSource; return this; }
        
        public Builder purity(ChemicalSubstancePurity purity) { ChemicalSubstance.this.purity = purity; return this; }
        

        public ChemicalSubstance build() {
            if (ChemicalSubstance.this.id == null) {
                ChemicalSubstance.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(ChemicalSubstance.this.types == null || ChemicalSubstance.this.types.isEmpty() || !ChemicalSubstance.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = ChemicalSubstance.this.types;
                ChemicalSubstance.this.types = new ArrayList<>();
                ChemicalSubstance.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    ChemicalSubstance.this.types.addAll(oldValues);
                }
            }
            return ChemicalSubstance.this;
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/molecularEntity")
    private Reference<MolecularEntity> molecularEntity;
    
    public Reference<MolecularEntity> getMolecularEntity() {
       return this.molecularEntity;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/productSource")
    private Reference<ProductSource> productSource;
    
    public Reference<ProductSource> getProductSource() {
       return this.productSource;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/purity")
    private ChemicalSubstancePurity purity;
    
    public ChemicalSubstancePurity getPurity() {
       return this.purity;
    }

 
    public static ChemicalSubstance.Builder create(LocalId localId){
        return new ChemicalSubstance(localId).new Builder();
    }

    public ChemicalSubstance.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ChemicalSubstance.class).new Builder();
    }
}