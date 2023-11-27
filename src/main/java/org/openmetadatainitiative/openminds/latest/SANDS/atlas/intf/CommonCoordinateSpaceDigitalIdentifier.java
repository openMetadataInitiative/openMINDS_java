package org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface CommonCoordinateSpaceDigitalIdentifier extends Entity {
   Reference<? extends CommonCoordinateSpaceDigitalIdentifier> getReference();

   class Deserializer extends ByTypeDeserializer<CommonCoordinateSpaceDigitalIdentifier> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.ISBN.class, org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.RRID.class);
        }
    }
}