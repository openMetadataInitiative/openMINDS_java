package org.openmetadatainitiative.openminds.latest.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface VisualizationInput extends Entity {
   Reference<? extends VisualizationInput> getReference();

   class Deserializer extends ByTypeDeserializer<VisualizationInput> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.computation.LocalFile.class, org.openmetadatainitiative.openminds.latest.core.data.File.class, org.openmetadatainitiative.openminds.latest.core.data.FileBundle.class, org.openmetadatainitiative.openminds.latest.core.products.SoftwareVersion.class);
        }
    }
}