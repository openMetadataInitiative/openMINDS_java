package org.openmetadatainitiative.openminds.latest.core.research.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface TissueSampleCollectionStateWeight extends Entity {
   Reference<? extends TissueSampleCollectionStateWeight> getReference();

   class Deserializer extends ByTypeDeserializer<TissueSampleCollectionStateWeight> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue.class, org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValueRange.class);
        }
    }
}