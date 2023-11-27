package org.openmetadatainitiative.openminds.v3.publications.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface LivePaperVersionRelatedPublication extends Entity {
   Reference<? extends LivePaperVersionRelatedPublication> getReference();

   class Deserializer extends ByTypeDeserializer<LivePaperVersionRelatedPublication> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.DOI.class, org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.HANDLE.class, org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.ISBN.class, org.openmetadatainitiative.openminds.v3.core.digitalIdentifier.ISSN.class, org.openmetadatainitiative.openminds.v3.publications.Book.class, org.openmetadatainitiative.openminds.v3.publications.Chapter.class, org.openmetadatainitiative.openminds.v3.publications.ScholarlyArticle.class);
        }
    }
}