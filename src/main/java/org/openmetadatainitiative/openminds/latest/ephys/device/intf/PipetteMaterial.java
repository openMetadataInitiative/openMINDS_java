package org.openmetadatainitiative.openminds.latest.ephys.device.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface PipetteMaterial extends Entity {
   Reference<? extends PipetteMaterial> getReference();

   class Deserializer extends ByTypeDeserializer<PipetteMaterial> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.chemicals.ChemicalMixture.class, org.openmetadatainitiative.openminds.latest.chemicals.ChemicalSubstance.class, org.openmetadatainitiative.openminds.latest.controlledTerms.MolecularEntity.class);
        }
    }
}