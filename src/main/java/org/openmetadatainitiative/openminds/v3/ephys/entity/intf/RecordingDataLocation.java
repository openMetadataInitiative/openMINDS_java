package org.openmetadatainitiative.openminds.v3.ephys.entity.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface RecordingDataLocation extends Entity {
   Reference<? extends RecordingDataLocation> getReference();

   class Deserializer extends ByTypeDeserializer<RecordingDataLocation> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.core.data.File.class, org.openmetadatainitiative.openminds.v3.core.data.FileBundle.class);
        }
    }
}