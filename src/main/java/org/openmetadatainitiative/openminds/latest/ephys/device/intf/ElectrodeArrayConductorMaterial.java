package org.openmetadatainitiative.openminds.latest.ephys.device.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface ElectrodeArrayConductorMaterial extends Entity {
   Reference<? extends ElectrodeArrayConductorMaterial> getReference();

   class Deserializer extends ByTypeDeserializer<ElectrodeArrayConductorMaterial> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.chemicals.ChemicalMixture.class, org.openmetadatainitiative.openminds.latest.chemicals.ChemicalSubstance.class, org.openmetadatainitiative.openminds.latest.controlledTerms.MolecularEntity.class);
        }
    }
}