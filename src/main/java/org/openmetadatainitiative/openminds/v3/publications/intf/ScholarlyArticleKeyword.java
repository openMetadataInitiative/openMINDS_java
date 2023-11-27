package org.openmetadatainitiative.openminds.v3.publications.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface ScholarlyArticleKeyword extends Entity {
   Reference<? extends ScholarlyArticleKeyword> getReference();

   class Deserializer extends ByTypeDeserializer<ScholarlyArticleKeyword> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.controlledTerms.ActionStatusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.AgeCategory.class, org.openmetadatainitiative.openminds.v3.controlledTerms.AnalysisTechnique.class, org.openmetadatainitiative.openminds.v3.controlledTerms.AnatomicalAxesOrientation.class, org.openmetadatainitiative.openminds.v3.controlledTerms.AnatomicalIdentificationType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.AnatomicalPlane.class, org.openmetadatainitiative.openminds.v3.controlledTerms.AnnotationCriteriaType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.AnnotationType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.AtlasType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.AuditoryStimulusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.BiologicalOrder.class, org.openmetadatainitiative.openminds.v3.controlledTerms.BiologicalProcess.class, org.openmetadatainitiative.openminds.v3.controlledTerms.BiologicalSex.class, org.openmetadatainitiative.openminds.v3.controlledTerms.BreedingType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.CellCultureType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.CellType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.ChemicalMixtureType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Colormap.class, org.openmetadatainitiative.openminds.v3.controlledTerms.ContributionType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.CranialWindowConstructionType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.CranialWindowReinforcementType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.CriteriaQualityType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.DataType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.DeviceType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.DifferenceMeasure.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Disease.class, org.openmetadatainitiative.openminds.v3.controlledTerms.DiseaseModel.class, org.openmetadatainitiative.openminds.v3.controlledTerms.EducationalLevel.class, org.openmetadatainitiative.openminds.v3.controlledTerms.ElectricalStimulusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.EthicsAssessment.class, org.openmetadatainitiative.openminds.v3.controlledTerms.ExperimentalApproach.class, org.openmetadatainitiative.openminds.v3.controlledTerms.FileBundleGrouping.class, org.openmetadatainitiative.openminds.v3.controlledTerms.FileRepositoryType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.FileUsageRole.class, org.openmetadatainitiative.openminds.v3.controlledTerms.GeneticStrainType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.GustatoryStimulusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Handedness.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Language.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Laterality.class, org.openmetadatainitiative.openminds.v3.controlledTerms.LearningResourceType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.MeasuredQuantity.class, org.openmetadatainitiative.openminds.v3.controlledTerms.MeasuredSignalType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.MetaDataModelType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.ModelAbstractionLevel.class, org.openmetadatainitiative.openminds.v3.controlledTerms.ModelScope.class, org.openmetadatainitiative.openminds.v3.controlledTerms.MolecularEntity.class, org.openmetadatainitiative.openminds.v3.controlledTerms.OlfactoryStimulusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.OperatingDevice.class, org.openmetadatainitiative.openminds.v3.controlledTerms.OperatingSystem.class, org.openmetadatainitiative.openminds.v3.controlledTerms.OpticalStimulusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Organ.class, org.openmetadatainitiative.openminds.v3.controlledTerms.OrganismSubstance.class, org.openmetadatainitiative.openminds.v3.controlledTerms.OrganismSystem.class, org.openmetadatainitiative.openminds.v3.controlledTerms.PatchClampVariation.class, org.openmetadatainitiative.openminds.v3.controlledTerms.PreparationType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.ProductAccessibility.class, org.openmetadatainitiative.openminds.v3.controlledTerms.ProgrammingLanguage.class, org.openmetadatainitiative.openminds.v3.controlledTerms.QualitativeOverlap.class, org.openmetadatainitiative.openminds.v3.controlledTerms.SemanticDataType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Service.class, org.openmetadatainitiative.openminds.v3.controlledTerms.SetupType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.SoftwareApplicationCategory.class, org.openmetadatainitiative.openminds.v3.controlledTerms.SoftwareFeature.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Species.class, org.openmetadatainitiative.openminds.v3.controlledTerms.StimulationApproach.class, org.openmetadatainitiative.openminds.v3.controlledTerms.StimulationTechnique.class, org.openmetadatainitiative.openminds.v3.controlledTerms.SubcellularEntity.class, org.openmetadatainitiative.openminds.v3.controlledTerms.SubjectAttribute.class, org.openmetadatainitiative.openminds.v3.controlledTerms.TactileStimulusType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Technique.class, org.openmetadatainitiative.openminds.v3.controlledTerms.TermSuggestion.class, org.openmetadatainitiative.openminds.v3.controlledTerms.Terminology.class, org.openmetadatainitiative.openminds.v3.controlledTerms.TissueSampleAttribute.class, org.openmetadatainitiative.openminds.v3.controlledTerms.TissueSampleType.class, org.openmetadatainitiative.openminds.v3.controlledTerms.TypeOfUncertainty.class, org.openmetadatainitiative.openminds.v3.controlledTerms.UBERONParcellation.class, org.openmetadatainitiative.openminds.v3.controlledTerms.UnitOfMeasurement.class, org.openmetadatainitiative.openminds.v3.controlledTerms.VisualStimulusType.class);
        }
    }
}