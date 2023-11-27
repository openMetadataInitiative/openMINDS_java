package org.openmetadatainitiative.openminds.v3.core.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.DataType;


import static org.openmetadatainitiative.openminds.v3.core.data.ContentType.SEMANTIC_NAME;
/**
 * Structured information on the content type of a file instance, bundle or repository.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContentType extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/ContentType";

    @JsonIgnore
    public Reference<ContentType> getReference() {
        return doGetReference();
    }

    public static Reference<ContentType> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private ContentType(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<ContentType>{
        
        public Builder dataType(List<Reference<DataType>> dataType) { ContentType.this.dataType = dataType; return this; }
        
        public Builder description(String description) { ContentType.this.description = description; return this; }
        
        public Builder displayLabel(String displayLabel) { ContentType.this.displayLabel = displayLabel; return this; }
        
        public Builder fileExtension(List<String> fileExtension) { ContentType.this.fileExtension = fileExtension; return this; }
        
        public Builder name(String name) { ContentType.this.name = name; return this; }
        
        public Builder relatedMediaType(String relatedMediaType) { ContentType.this.relatedMediaType = relatedMediaType; return this; }
        
        public Builder specification(String specification) { ContentType.this.specification = specification; return this; }
        
        public Builder synonym(List<String> synonym) { ContentType.this.synonym = synonym; return this; }
        

        public ContentType build(OpenMINDSContext context) {
            if (ContentType.this.id == null) {
                ContentType.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            ContentType.this.type = SEMANTIC_NAME;
            return ContentType.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/dataType")
    private List<Reference<DataType>> dataType;
    
    public List<Reference<DataType>> getDataType() {
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

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/displayLabel")
    private String displayLabel;
    
    public String getDisplayLabel() {
       return this.displayLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/fileExtension")
    private List<String> fileExtension;
    
    /**
    * String of characters attached as suffix to the names of files of a particular format.
    */
    public List<String> getFileExtension() {
       return this.fileExtension;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/relatedMediaType")
    private String relatedMediaType;
    
    /**
    * Reference to an official two-part identifier for file formats and format contents.
    */
    public String getRelatedMediaType() {
       return this.relatedMediaType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/specification")
    private String specification;
    
    /**
    * Detailed and precise presentation of, or proposal for something.
    */
    public String getSpecification() {
       return this.specification;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/synonym")
    private List<String> synonym;
    
    /**
    * Words or expressions used in the same language that have the same or nearly the same meaning in some or all senses.
    */
    public List<String> getSynonym() {
       return this.synonym;
    }

 
    public static ContentType.Builder create(LocalId localId){
        return new ContentType(localId).new Builder();
    }

    public ContentType.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, ContentType.class).new Builder();
    }
}