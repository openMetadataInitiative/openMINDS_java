package org.openmetadatainitiative.openminds.v3.core.miscellaneous;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.v3.controlledTerms.UnitOfMeasurement;


import static org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValueRange.SEMANTIC_NAME;
/**
 * A representation of a range of quantitative values.
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuantitativeValueRange extends Instance implements org.openmetadatainitiative.openminds.v3.computation.intf.OptimizationResourceUsage, org.openmetadatainitiative.openminds.v3.computation.intf.ModelValidationResourceUsage, org.openmetadatainitiative.openminds.v3.computation.intf.DataCopyResourceUsage, org.openmetadatainitiative.openminds.v3.computation.intf.SimulationResourceUsage, org.openmetadatainitiative.openminds.v3.computation.intf.VisualizationResourceUsage, org.openmetadatainitiative.openminds.v3.computation.intf.DataAnalysisResourceUsage, org.openmetadatainitiative.openminds.v3.computation.intf.GenericComputationResourceUsage, org.openmetadatainitiative.openminds.v3.publications.intf.LearningResourceRequiredTime, org.openmetadatainitiative.openminds.v3.chemicals.intf.ChemicalSubstancePurity, org.openmetadatainitiative.openminds.v3.chemicals.intf.ProductSourcePurity, org.openmetadatainitiative.openminds.v3.ephys.activity.intf.CellPatchingBathTemperature, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayUsageContactResistances, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeUsageContactResistance, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeIntrinsicResistance, org.openmetadatainitiative.openminds.v3.ephys.device.intf.ElectrodeArrayIntrinsicResistance, org.openmetadatainitiative.openminds.v3.ephys.device.intf.PipetteUsagePipetteResistance, org.openmetadatainitiative.openminds.v3.SANDS.miscellaneous.intf.QuantitativeRelationAssessmentQuantitativeOverlap, org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectStateAge, org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectStateRelativeTimeIndication, org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectStateWeight, org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectGroupStateAge, org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectGroupStateRelativeTimeIndication, org.openmetadatainitiative.openminds.v3.core.research.intf.SubjectGroupStateWeight, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionStateAge, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionStateRelativeTimeIndication, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleCollectionStateWeight, org.openmetadatainitiative.openminds.v3.core.research.intf.NumericalPropertyValue, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleStateAge, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleStateRelativeTimeIndication, org.openmetadatainitiative.openminds.v3.core.research.intf.TissueSampleStateWeight, org.openmetadatainitiative.openminds.v3.core.data.intf.MeasurementValue, org.openmetadatainitiative.openminds.v3.specimenPrep.activity.intf.TissueSampleSlicingTemperature, org.openmetadatainitiative.openminds.v3.specimenPrep.device.intf.SlicingDeviceUsageSliceThickness{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/core/QuantitativeValueRange";

    @JsonIgnore
    public Reference<QuantitativeValueRange> getReference() {
        return doGetReference();
    }

    public static Reference<QuantitativeValueRange> reference(String instanceId) {
        return new Reference<>(new InstanceId(instanceId));
    }

    private QuantitativeValueRange(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<QuantitativeValueRange>{
        
        public Builder maxValue(Object maxValue) { QuantitativeValueRange.this.maxValue = maxValue; return this; }
        
        public Builder maxValueUnit(Reference<UnitOfMeasurement> maxValueUnit) { QuantitativeValueRange.this.maxValueUnit = maxValueUnit; return this; }
        
        public Builder minValue(Object minValue) { QuantitativeValueRange.this.minValue = minValue; return this; }
        
        public Builder minValueUnit(Reference<UnitOfMeasurement> minValueUnit) { QuantitativeValueRange.this.minValueUnit = minValueUnit; return this; }
        

        public QuantitativeValueRange build(OpenMINDSContext context) {
            if (QuantitativeValueRange.this.id == null) {
                QuantitativeValueRange.this.id = InstanceId.withPrefix(UUID.randomUUID().toString(), context.idPrefix());
            }
            QuantitativeValueRange.this.type = SEMANTIC_NAME;
            return QuantitativeValueRange.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/maxValue")
    private Object maxValue;
    
    /**
    * Greatest quantity attained or allowed.
    */
    public Object getMaxValue() {
       return this.maxValue;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/maxValueUnit")
    private Reference<UnitOfMeasurement> maxValueUnit;
    
    public Reference<UnitOfMeasurement> getMaxValueUnit() {
       return this.maxValueUnit;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/minValue")
    private Object minValue;
    
    /**
    * Smallest quantity attained or allowed.
    */
    public Object getMinValue() {
       return this.minValue;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/minValueUnit")
    private Reference<UnitOfMeasurement> minValueUnit;
    
    public Reference<UnitOfMeasurement> getMinValueUnit() {
       return this.minValueUnit;
    }

 
    public static QuantitativeValueRange.Builder create(LocalId localId){
        return new QuantitativeValueRange(localId).new Builder();
    }

    public QuantitativeValueRange.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, QuantitativeValueRange.class).new Builder();
    }
}