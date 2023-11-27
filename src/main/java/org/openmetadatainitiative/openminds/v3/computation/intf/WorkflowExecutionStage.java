package org.openmetadatainitiative.openminds.v3.computation.intf;

import org.openmetadatainitiative.openminds.utils.ByTypeDeserializer;
import org.openmetadatainitiative.openminds.utils.Entity;
import org.openmetadatainitiative.openminds.utils.Reference;

/**
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
public interface WorkflowExecutionStage extends Entity {
   Reference<? extends WorkflowExecutionStage> getReference();

   class Deserializer extends ByTypeDeserializer<WorkflowExecutionStage> {
        public Deserializer() {
            super(org.openmetadatainitiative.openminds.v3.computation.DataAnalysis.class, org.openmetadatainitiative.openminds.v3.computation.DataCopy.class, org.openmetadatainitiative.openminds.v3.computation.GenericComputation.class, org.openmetadatainitiative.openminds.v3.computation.ModelValidation.class, org.openmetadatainitiative.openminds.v3.computation.Optimization.class, org.openmetadatainitiative.openminds.v3.computation.Simulation.class, org.openmetadatainitiative.openminds.v3.computation.Visualization.class);
        }
    }
}