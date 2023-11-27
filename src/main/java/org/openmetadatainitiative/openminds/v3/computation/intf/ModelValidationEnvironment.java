package org.openmetadatainitiative.openminds.v3.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface ModelValidationEnvironment extends Entity {
   Reference<? extends ModelValidationEnvironment> getReference();

   class Deserializer extends ByTypeDeserializer<ModelValidationEnvironment> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.computation.Environment.class, org.openmetadatainitiative.openminds.v3.core.products.WebServiceVersion.class);
        }
    }
}