package org.openmetadatainitiative.openminds.latest.SANDS.atlas.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface BrainAtlasVersionAuthor extends Entity {
   Reference<? extends BrainAtlasVersionAuthor> getReference();

   class Deserializer extends ByTypeDeserializer<BrainAtlasVersionAuthor> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.actors.Consortium.class, org.openmetadatainitiative.openminds.latest.core.actors.Organization.class, org.openmetadatainitiative.openminds.latest.core.actors.Person.class);
        }
    }
}