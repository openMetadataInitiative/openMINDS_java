package org.openmetadatainitiative.openminds.latest.SANDS.atlas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.SANDS.miscellaneous.ViewerSpecification;
import org.openmetadatainitiative.openminds.latest.controlledTerms.AnnotationCriteriaType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.AnnotationType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.CriteriaQualityType;
import org.openmetadatainitiative.openminds.latest.controlledTerms.Laterality;
import org.openmetadatainitiative.openminds.latest.core.data.File;
import org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue;
import org.openmetadatainitiative.openminds.latest.core.research.ProtocolExecution;


import static org.openmetadatainitiative.openminds.latest.SANDS.atlas.AtlasAnnotation.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AtlasAnnotation extends Instance {
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/sands/AtlasAnnotation";

    @JsonIgnore
    public Reference<AtlasAnnotation> getReference() {
        return doGetReference();
    }

    public static Reference<AtlasAnnotation> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private AtlasAnnotation(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<AtlasAnnotation>{
        
        public Builder anchorPoint(List<QuantitativeValue> anchorPoint) { AtlasAnnotation.this.anchorPoint = anchorPoint; return this; }
        
        public Builder criteria(Reference<ProtocolExecution> criteria) { AtlasAnnotation.this.criteria = criteria; return this; }
        
        public Builder criteriaQualityType(Reference<CriteriaQualityType> criteriaQualityType) { AtlasAnnotation.this.criteriaQualityType = criteriaQualityType; return this; }
        
        public Builder criteriaType(Reference<AnnotationCriteriaType> criteriaType) { AtlasAnnotation.this.criteriaType = criteriaType; return this; }
        
        public Builder inspiredBy(List<Reference<File>> inspiredBy) { AtlasAnnotation.this.inspiredBy = inspiredBy; return this; }
        
        public Builder internalIdentifier(String internalIdentifier) { AtlasAnnotation.this.internalIdentifier = internalIdentifier; return this; }
        
        public Builder laterality(List<Reference<Laterality>> laterality) { AtlasAnnotation.this.laterality = laterality; return this; }
        
        public Builder preferredVisualization(ViewerSpecification preferredVisualization) { AtlasAnnotation.this.preferredVisualization = preferredVisualization; return this; }
        
        public Builder specification(Reference<File> specification) { AtlasAnnotation.this.specification = specification; return this; }
        
        public Builder type(Reference<AnnotationType> type) { AtlasAnnotation.this.type = type; return this; }
        

        public AtlasAnnotation build() {
            if (AtlasAnnotation.this.id == null) {
                AtlasAnnotation.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(AtlasAnnotation.this.types == null || AtlasAnnotation.this.types.isEmpty() || !AtlasAnnotation.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = AtlasAnnotation.this.types;
                AtlasAnnotation.this.types = new ArrayList<>();
                AtlasAnnotation.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    AtlasAnnotation.this.types.addAll(oldValues);
                }
            }
            return AtlasAnnotation.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/anchorPoint")
    private List<QuantitativeValue> anchorPoint;
    
    public List<QuantitativeValue> getAnchorPoint() {
       return this.anchorPoint;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/criteria")
    private Reference<ProtocolExecution> criteria;
    
    /**
    * Aspects or standards on which a judgement or decision is based.
    */
    public Reference<ProtocolExecution> getCriteria() {
       return this.criteria;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/criteriaQualityType")
    private Reference<CriteriaQualityType> criteriaQualityType;
    
    /**
    * Distinct class that defines how the judgement or decision was made for a particular criteria.
    */
    public Reference<CriteriaQualityType> getCriteriaQualityType() {
       return this.criteriaQualityType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/criteriaType")
    private Reference<AnnotationCriteriaType> criteriaType;
    
    public Reference<AnnotationCriteriaType> getCriteriaType() {
       return this.criteriaType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/inspiredBy")
    private List<Reference<File>> inspiredBy;
    
    /**
    * Reference to an inspiring element.
    */
    public List<Reference<File>> getInspiredBy() {
       return this.inspiredBy;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/internalIdentifier")
    private String internalIdentifier;
    
    /**
    * Term or code that identifies someone or something within a particular product.
    */
    public String getInternalIdentifier() {
       return this.internalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/laterality")
    private List<Reference<Laterality>> laterality;
    
    /**
    * Differentiation between a pair of lateral homologous parts of the body.
    */
    public List<Reference<Laterality>> getLaterality() {
       return this.laterality;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/preferredVisualization")
    private ViewerSpecification preferredVisualization;
    
    public ViewerSpecification getPreferredVisualization() {
       return this.preferredVisualization;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/specification")
    private Reference<File> specification;
    
    /**
    * Detailed and precise presentation of, or proposal for something.
    */
    public Reference<File> getSpecification() {
       return this.specification;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/type")
    private Reference<AnnotationType> type;
    
    /**
    * Distinct class to which a group of entities or concepts with similar characteristics or attributes belong to.
    */
    public Reference<AnnotationType> getType() {
       return this.type;
    }

 
    public static AtlasAnnotation.Builder create(LocalId localId){
        return new AtlasAnnotation(localId).new Builder();
    }

    public AtlasAnnotation.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, AtlasAnnotation.class).new Builder();
    }
}