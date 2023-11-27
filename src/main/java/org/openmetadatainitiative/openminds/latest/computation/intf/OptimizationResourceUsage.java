package org.openmetadatainitiative.openminds.latest.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface OptimizationResourceUsage extends Entity {
   Reference<? extends OptimizationResourceUsage> getReference();

   class Deserializer extends ByTypeDeserializer<OptimizationResourceUsage> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValue.class, org.openmetadatainitiative.openminds.latest.core.miscellaneous.QuantitativeValueRange.class);
        }
    }
}