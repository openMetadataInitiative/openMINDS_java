package org.openmetadatainitiative.openminds.latest.core.products.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface DatasetVersionAuthor extends Entity {
   Reference<? extends DatasetVersionAuthor> getReference();

   class Deserializer extends ByTypeDeserializer<DatasetVersionAuthor> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.latest.core.actors.Consortium.class, org.openmetadatainitiative.openminds.latest.core.actors.Organization.class, org.openmetadatainitiative.openminds.latest.core.actors.Person.class);
        }
    }
}