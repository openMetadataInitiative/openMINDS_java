package org.openmetadatainitiative.openminds.latest.core.research.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface ProtocolStimulusType extends Entity {
   Reference<? extends ProtocolStimulusType> getReference();

   class Deserializer extends ByTypeDeserializer<ProtocolStimulusType> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.controlledTerms.AuditoryStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.ElectricalStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.GustatoryStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OlfactoryStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.OpticalStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.TactileStimulusType.class, org.openmetadatainitiative.openminds.latest.controlledTerms.VisualStimulusType.class);
        }
    }
}