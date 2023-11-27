package org.openmetadatainitiative.openminds.v3.stimulation.activity.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface StimulationActivityInput extends Entity {
   Reference<? extends StimulationActivityInput> getReference();

   class Deserializer extends ByTypeDeserializer<StimulationActivityInput> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.core.research.SubjectGroupState.class, org.openmetadatainitiative.openminds.v3.core.research.SubjectState.class, org.openmetadatainitiative.openminds.v3.core.research.TissueSampleCollectionState.class, org.openmetadatainitiative.openminds.v3.core.research.TissueSampleState.class);
        }
    }
}