package org.openmetadatainitiative.openminds.latest.publications.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface BookKeyword extends Entity {
   Reference<? extends BookKeyword> getReference();

   class Deserializer extends ByTypeDeserializer<BookKeyword> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.controlledTerms.ActionStatusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.AgeCategory.class, org.openmetadatainitiative.openminds.latest.controlledTerms.AnalysisTechnique.class, org.openmetadatainitiative.openminds.latest.controlledTerms.AnatomicalAxesOrientation.class, org.openmetadatainitiative.openminds.latest.controlledTerms.AnatomicalIdentificationType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.AnatomicalPlane.class, org.openmetadatainitiative.openminds.latest.controlledTerms.AnnotationCriteriaType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.AnnotationType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.AtlasType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.AuditoryStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.BiologicalOrder.class, org.openmetadatainitiative.openminds.latest.controlledTerms.BiologicalProcess.class, org.openmetadatainitiative.openminds.latest.controlledTerms.BiologicalSex.class, org.openmetadatainitiative.openminds.latest.controlledTerms.BreedingType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.CellCultureType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.CellType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.ChemicalMixtureType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Colormap.class, org.openmetadatainitiative.openminds.latest.controlledTerms.ContributionType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.CranialWindowConstructionType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.CranialWindowReinforcementType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.CriteriaQualityType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.DataType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.DeviceType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.DifferenceMeasure.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Disease.class, org.openmetadatainitiative.openminds.latest.controlledTerms.DiseaseModel.class, org.openmetadatainitiative.openminds.latest.controlledTerms.EducationalLevel.class, org.openmetadatainitiative.openminds.latest.controlledTerms.ElectricalStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.EthicsAssessment.class, org.openmetadatainitiative.openminds.latest.controlledTerms.ExperimentalApproach.class, org.openmetadatainitiative.openminds.latest.controlledTerms.FileBundleGrouping.class, org.openmetadatainitiative.openminds.latest.controlledTerms.FileRepositoryType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.FileUsageRole.class, org.openmetadatainitiative.openminds.latest.controlledTerms.GeneticStrainType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.GustatoryStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Handedness.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Language.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Laterality.class, org.openmetadatainitiative.openminds.latest.controlledTerms.LearningResourceType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.MeasuredQuantity.class, org.openmetadatainitiative.openminds.latest.controlledTerms.MeasuredSignalType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.MetaDataModelType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.ModelAbstractionLevel.class, org.openmetadatainitiative.openminds.latest.controlledTerms.ModelScope.class, org.openmetadatainitiative.openminds.latest.controlledTerms.MolecularEntity.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OlfactoryStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OperatingDevice.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OperatingSystem.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OpticalStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Organ.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OrganismSubstance.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OrganismSystem.class, org.openmetadatainitiative.openminds.latest.controlledTerms.PatchClampVariation.class, org.openmetadatainitiative.openminds.latest.controlledTerms.PreparationType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.ProductAccessibility.class, org.openmetadatainitiative.openminds.latest.controlledTerms.ProgrammingLanguage.class, org.openmetadatainitiative.openminds.latest.controlledTerms.QualitativeOverlap.class, org.openmetadatainitiative.openminds.latest.controlledTerms.SemanticDataType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Service.class, org.openmetadatainitiative.openminds.latest.controlledTerms.SetupType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.SoftwareApplicationCategory.class, org.openmetadatainitiative.openminds.latest.controlledTerms.SoftwareFeature.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Species.class, org.openmetadatainitiative.openminds.latest.controlledTerms.StimulationApproach.class, org.openmetadatainitiative.openminds.latest.controlledTerms.StimulationTechnique.class, org.openmetadatainitiative.openminds.latest.controlledTerms.SubcellularEntity.class, org.openmetadatainitiative.openminds.latest.controlledTerms.SubjectAttribute.class, org.openmetadatainitiative.openminds.latest.controlledTerms.TactileStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Technique.class, org.openmetadatainitiative.openminds.latest.controlledTerms.TermSuggestion.class, org.openmetadatainitiative.openminds.latest.controlledTerms.Terminology.class, org.openmetadatainitiative.openminds.latest.controlledTerms.TissueSampleAttribute.class, org.openmetadatainitiative.openminds.latest.controlledTerms.TissueSampleType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.TypeOfUncertainty.class, org.openmetadatainitiative.openminds.latest.controlledTerms.UBERONParcellation.class, org.openmetadatainitiative.openminds.latest.controlledTerms.UnitOfMeasurement.class, org.openmetadatainitiative.openminds.latest.controlledTerms.VisualStimulusType.class);
        }
    }
}