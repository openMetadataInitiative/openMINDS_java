package org.openmetadatainitiative.openminds.v3.ephys.device.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface PipetteUsagePipetteResistance extends Entity {
   Reference<? extends PipetteUsagePipetteResistance> getReference();

   class Deserializer extends ByTypeDeserializer<PipetteUsagePipetteResistance> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValue.class, org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValueRange.class);
        }
    }
}