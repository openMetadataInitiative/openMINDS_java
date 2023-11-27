package org.openmetadatainitiative.openminds.latest.computation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.DataType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.FileUsageRole;
import org.openmetadatainitiative.openminds.latest.core.data.ContentType;
import org.openmetadatainitiative.openminds.latest.core.data.File;
import org.openmetadatainitiative.openminds.latest.core.data.Hash;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue;


import static org.openmetadatainitiative.openminds.latest.computation.LocalFile.SEMANTIC_NAME;
/**
 * Structured information about a file that is not accessible via a URL.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalFile extends Instance implements org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationInput, org.openmetadatainitiative.openminds.latest.computation.intf.OptimizationOutput, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationInput, org.openmetadatainitiative.openminds.latest.computation.intf.ModelValidationOutput, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyInput, org.openmetadatainitiative.openminds.latest.computation.intf.DataCopyOutput, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationInput, org.openmetadatainitiative.openminds.latest.computation.intf.SimulationOutput, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationInput, org.openmetadatainitiative.openminds.latest.computation.intf.VisualizationOutput, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisInput, org.openmetadatainitiative.openminds.latest.computation.intf.DataAnalysisOutput, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationInput, org.openmetadatainitiative.openminds.latest.computation.intf.GenericComputationOutput, org.openmetadatainitiative.openminds.latest.core.data.intf.FileBundleGroupedBy{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/computation/LocalFile";

    @JsonIgnore
    public Reference<LocalFile> getReference() {
        return doGetReference();
    }

    public static Reference<LocalFile> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private LocalFile(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<LocalFile>{
        
        public Builder contentDescription(String contentDescription) { LocalFile.this.contentDescription = contentDescription; return this; }
        
        public Builder copyOf(Reference<File> copyOf) { LocalFile.this.copyOf = copyOf; return this; }
        
        public Builder dataType(List<Reference<DataType>> dataType) { LocalFile.this.dataType = dataType; return this; }
        
        public Builder format(Reference<ContentType> format) { LocalFile.this.format = format; return this; }
        
        public Builder hash(Hash hash) { LocalFile.this.hash = hash; return this; }
        
        public Builder name(String name) { LocalFile.this.name = name; return this; }
        
        public Builder path(String path) { LocalFile.this.path = path; return this; }
        
        public Builder specialUsageRole(Reference<FileUsageRole> specialUsageRole) { LocalFile.this.specialUsageRole = specialUsageRole; return this; }
        
        public Builder storageSize(QuantitativeValue storageSize) { LocalFile.this.storageSize = storageSize; return this; }
        

        public LocalFile build(OpenMINDSContext context) {
            if (LocalFile.this.id == null) {
                LocalFile.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            LocalFile.this.type = SEMANTIC_NAME;
            return LocalFile.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/contentDescription")
    private String contentDescription;
    
    public String getContentDescription() {
       return this.contentDescription;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/copyOf")
    private Reference<File> copyOf;
    
    public Reference<File> getCopyOf() {
       return this.copyOf;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/dataType")
    private List<Reference<DataType>> dataType;
    
    public List<Reference<DataType>> getDataType() {
       return this.dataType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/format")
    private Reference<ContentType> format;
    
    /**
    * Method of digitally organizing and structuring data or information.
    */
    public Reference<ContentType> getFormat() {
       return this.format;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/hash")
    private Hash hash;
    
    /**
    * Term used for the process of converting any data into a single value. Often also directly refers to the resulting single value.
    */
    public Hash getHash() {
       return this.hash;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/path")
    private String path;
    
    public String getPath() {
       return this.path;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/specialUsageRole")
    private Reference<FileUsageRole> specialUsageRole;
    
    /**
    * Particular function of something when it is used.
    */
    public Reference<FileUsageRole> getSpecialUsageRole() {
       return this.specialUsageRole;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/storageSize")
    private QuantitativeValue storageSize;
    
    /**
    * Quantitative value defining how much disk space is used by an object on a computer system.
    */
    public QuantitativeValue getStorageSize() {
       return this.storageSize;
    }

 
    public static LocalFile.Builder create(LocalId localId){
        return new LocalFile(localId).new Builder();
    }

    public LocalFile.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, LocalFile.class).new Builder();
    }
}