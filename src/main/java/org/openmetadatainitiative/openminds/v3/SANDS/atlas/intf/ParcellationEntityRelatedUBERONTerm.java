package org.openmetadatainitiative.openminds.v3.SANDS.atlas.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface ParcellationEntityRelatedUBERONTerm extends Entity {
   Reference<? extends ParcellationEntityRelatedUBERONTerm> getReference();

   class Deserializer extends ByTypeDeserializer<ParcellationEntityRelatedUBERONTerm> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.controlledTerms.Organ.class, org.openmetadatainitiative.openminds.v3.controlledTerms.UBERONParcellation.class);
        }
    }
}