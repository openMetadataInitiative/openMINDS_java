package org.openmetadatainitiative.openminds.latest.chemicals;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.chemicals.intf.AmountOfChemicalChemicalProduct;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.latest.chemicals.AmountOfChemical.SEMANTIC_NAME;
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

    public static Reference<AmountOfChemical> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private AmountOfChemical(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<AmountOfChemical>{
        
        public Builder amount(QuantitativeValue amount) { AmountOfChemical.this.amount = amount; return this; }
        
        public Builder chemicalProduct(Reference<? extends AmountOfChemicalChemicalProduct> chemicalProduct) { AmountOfChemical.this.chemicalProduct = chemicalProduct; return this; }
        

        public AmountOfChemical build(OpenMINDSContext context) {
            if (AmountOfChemical.this.id == null) {
                AmountOfChemical.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            AmountOfChemical.this.type = SEMANTIC_NAME;
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