package org.openmetadatainitiative.openminds.v3.controlledTerms;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



import static org.openmetadatainitiative.openminds.v3.controlledTerms.DataType.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataType extends Instance implements org.openmetadatainitiative.openminds.v3.computation.intf.WorkflowRecipeVersionKeyword, org.openmetadatainitiative.openminds.v3.computation.intf.ValidationTestVersionKeyword, org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceKeyword, org.openmetadatainitiative.openminds.v3.publications.intf.ChapterKeyword, org.openmetadatainitiative.openminds.v3.publications.intf.ScholarlyArticleKeyword, org.openmetadatainitiative.openminds.v3.publications.intf.LivePaperVersionKeyword, org.openmetadatainitiative.openminds.v3.publications.intf.BookKeyword, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.BrainAtlasVersionKeyword, org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf.CommonCoordinateSpaceVersionKeyword, org.openmetadatainitiative.openminds.v3.core.products.intf.SoftwareVersionKeyword, org.openmetadatainitiative.openminds.v3.core.products.intf.WebServiceVersionKeyword, org.openmetadatainitiative.openminds.v3.core.products.intf.ModelVersionKeyword, org.openmetadatainitiative.openminds.v3.core.products.intf.MetaDataModelVersionKeyword, org.openmetadatainitiative.openminds.v3.core.products.intf.DatasetVersionKeyword{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/controlledTerms/DataType";

    @JsonIgnore
    public Reference<DataType> getReference() {
        return doGetReference();
    }

    public static Reference<DataType> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private DataType(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<DataType>{
        
        public Builder definition(String definition) { DataType.this.definition = definition; return this; }
        
        public Builder description(String description) { DataType.this.description = description; return this; }
        
        public Builder interlexIdentifier(String interlexIdentifier) { DataType.this.interlexIdentifier = interlexIdentifier; return this; }
        
        public Builder knowledgeSpaceLink(String knowledgeSpaceLink) { DataType.this.knowledgeSpaceLink = knowledgeSpaceLink; return this; }
        
        public Builder name(String name) { DataType.this.name = name; return this; }
        
        public Builder preferredOntologyIdentifier(String preferredOntologyIdentifier) { DataType.this.preferredOntologyIdentifier = preferredOntologyIdentifier; return this; }
        
        public Builder synonym(List<String> synonym) { DataType.this.synonym = synonym; return this; }
        

        public DataType build() {
            if (DataType.this.id == null) {
                DataType.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(DataType.this.types == null || DataType.this.types.isEmpty() || !DataType.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = DataType.this.types;
                DataType.this.types = new ArrayList<>();
                DataType.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    DataType.this.types.addAll(oldValues);
                }
            }
            return DataType.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/definition")
    private String definition;
    
    /**
    * Short, but precise statement of the meaning of a word, word group, sign or a symbol.
    */
    public String getDefinition() {
       return this.definition;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/interlexIdentifier")
    private String interlexIdentifier;
    
    /**
    * Persistent identifier for a term registered in the InterLex project.
    */
    public String getInterlexIdentifier() {
       return this.interlexIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/knowledgeSpaceLink")
    private String knowledgeSpaceLink;
    
    /**
    * Persistent link to an encyclopedia entry in the Knowledge Space project.
    */
    public String getKnowledgeSpaceLink() {
       return this.knowledgeSpaceLink;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/preferredOntologyIdentifier")
    private String preferredOntologyIdentifier;
    
    /**
    * Persistent identifier of a preferred ontological term.
    */
    public String getPreferredOntologyIdentifier() {
       return this.preferredOntologyIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/synonym")
    private List<String> synonym;
    
    /**
    * Words or expressions used in the same language that have the same or nearly the same meaning in some or all senses.
    */
    public List<String> getSynonym() {
       return this.synonym;
    }

 
    public static DataType.Builder create(LocalId localId){
        return new DataType(localId).new Builder();
    }

    public DataType.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, DataType.class).new Builder();
    }
}