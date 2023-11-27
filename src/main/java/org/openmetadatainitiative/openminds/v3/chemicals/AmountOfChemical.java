package org.openmetadatainitiative.openminds.v3.chemicals;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.chemicals.intf.AmountOfChemicalChemicalProduct;
import org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.v3.chemicals.AmountOfChemical.*;
/**
 * Structured information about the amount of a given chemical that was used.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AmountOfChemical extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/chemicals/AmountOfChemical";

    @JsonIgnore
    public Reference<AmountOfChemical> getReference() {
        return doGetReference();
    }

    public static Reference<AmountOfChemical> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private AmountOfChemical(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<AmountOfChemical>{
        
        public Builder amount(QuantitativeValue amount) { AmountOfChemical.this.amount = amount; return this; }
        
        public Builder chemicalProduct(Reference<? extends AmountOfChemicalChemicalProduct> chemicalProduct) { AmountOfChemical.this.chemicalProduct = chemicalProduct; return this; }
        

        public AmountOfChemical build() {
            if (AmountOfChemical.this.id == null) {
                AmountOfChemical.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(AmountOfChemical.this.types == null || AmountOfChemical.this.types.isEmpty() || !AmountOfChemical.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = AmountOfChemical.this.types;
                AmountOfChemical.this.types = new ArrayList<>();
                AmountOfChemical.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    AmountOfChemical.this.types.addAll(oldValues);
                }
            }
            return AmountOfChemical.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/amount")
    private QuantitativeValue amount;
    
    public QuantitativeValue getAmount() {
       return this.amount;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/chemicalProduct")
    private Reference<? extends AmountOfChemicalChemicalProduct> chemicalProduct;
    
    public Reference<? extends AmountOfChemicalChemicalProduct> getChemicalProduct() {
       return this.chemicalProduct;
    }

 
    public static AmountOfChemical.Builder create(LocalId localId){
        return new AmountOfChemical(localId).new Builder();
    }

    public AmountOfChemical.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, AmountOfChemical.class).new Builder();
    }
}