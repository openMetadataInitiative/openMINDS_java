package org.openmetadatainitiative.openminds.latest.core.miscellaneous.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface ResearchProductGroupHasPart extends Entity {
   Reference<? extends ResearchProductGroupHasPart> getReference();

   class Deserializer extends ByTypeDeserializer<ResearchProductGroupHasPart> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.computation.ValidationTest.class, org.openmetadatainitiative.openminds.latest.computation.ValidationTestVersion.class, org.openmetadatainitiative.openminds.latest.computation.WorkflowRecipe.class, org.openmetadatainitiative.openminds.latest.computation.WorkflowRecipeVersion.class, org.openmetadatainitiative.openminds.latest.core.products.Dataset.class, org.openmetadatainitiative.openminds.latest.core.products.DatasetVersion.class, org.openmetadatainitiative.openminds.latest.core.products.MetaDataModel.class, org.openmetadatainitiative.openminds.latest.core.products.MetaDataModelVersion.class, org.openmetadatainitiative.openminds.latest.core.products.Model.class, org.openmetadatainitiative.openminds.latest.core.products.ModelVersion.class, org.openmetadatainitiative.openminds.latest.core.products.Software.class, org.openmetadatainitiative.openminds.latest.core.products.SoftwareVersion.class, org.openmetadatainitiative.openminds.latest.core.products.WebService.class, org.openmetadatainitiative.openminds.latest.core.products.WebServiceVersion.class, org.openmetadatainitiative.openminds.latest.publications.LivePaper.class, org.openmetadatainitiative.openminds.latest.publications.LivePaperVersion.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.BrainAtlas.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.BrainAtlasVersion.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.CommonCoordinateSpace.class, org.openmetadatainitiative.openminds.latest.SANDS.atlas.CommonCoordinateSpaceVersion.class);
        }
    }
}