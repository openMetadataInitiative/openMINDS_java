package org.openmetadatainitiative.openminds.v3.ephys.activity.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface RecordingActivityDevice extends Entity {
   Reference<? extends RecordingActivityDevice> getReference();

   class Deserializer extends ByTypeDeserializer<RecordingActivityDevice> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.ephys.device.ElectrodeArrayUsage.class, org.openmetadatainitiative.openminds.v3.ephys.device.ElectrodeUsage.class, org.openmetadatainitiative.openminds.v3.ephys.device.PipetteUsage.class);
        }
    }
}