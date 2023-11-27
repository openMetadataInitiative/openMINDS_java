package org.openmetadatainitiative.openminds.v3.core.research.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface TissueSampleStateRelativeTimeIndication extends Entity {
   Reference<? extends TissueSampleStateRelativeTimeIndication> getReference();

   class Deserializer extends ByTypeDeserializer<TissueSampleStateRelativeTimeIndication> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValue.class, org.openmetadatainitiative.openminds.v3.core.miscellaneous.QuantitativeValueRange.class);
        }
    }
}