package org.openmetadatainitiative.openminds.latest.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface WorkflowExecutionConfiguration extends Entity {
   Reference<? extends WorkflowExecutionConfiguration> getReference();

   class Deserializer extends ByTypeDeserializer<WorkflowExecutionConfiguration> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.research.Configuration.class, org.openmetadatainitiative.openminds.latest.core.data.File.class);
        }
    }
}