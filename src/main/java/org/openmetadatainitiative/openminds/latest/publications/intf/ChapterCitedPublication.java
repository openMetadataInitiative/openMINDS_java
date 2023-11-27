package org.openmetadatainitiative.openminds.latest.publications.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface ChapterCitedPublication extends Entity {
   Reference<? extends ChapterCitedPublication> getReference();

   class Deserializer extends ByTypeDeserializer<ChapterCitedPublication> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.latest.core.digitalIdentifier.ISBN.class);
        }
    }
}