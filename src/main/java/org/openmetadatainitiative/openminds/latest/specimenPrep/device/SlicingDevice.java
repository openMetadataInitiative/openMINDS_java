package org.openmetadatainitiative.openminds.latest.specimenPrep.device;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadatainitiative.openminds.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.openmetadatainitiative.openminds.latest.controlledTerms.DeviceType;
import org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceDigitalIdentifier;
import org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceManufacturer;
import org.openmetadatainitiative.openminds.latest.specimenPrep.device.intf.SlicingDeviceOwner;


import static org.openmetadatainitiative.openminds.latest.specimenPrep.device.SlicingDevice.*;
/**
 * 
 *
 * ATTENTION! This is an autogenerated file based on the openMINDS schema - do not apply manual changes since they are going to be overwritten.
 */
@InstanceType(SEMANTIC_NAME)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SlicingDevice extends Instance implements org.openmetadatainitiative.openminds.latest.core.products.intf.SetupHasPart{
    static final String SEMANTIC_NAME = "https://openminds.ebrains.eu/specimenPrep/SlicingDevice";

    @JsonIgnore
    public Reference<SlicingDevice> getReference() {
        return doGetReference();
    }

    public static Reference<SlicingDevice> createReference(InstanceId instanceId) {
        return new Reference<>(instanceId);
    }

    private SlicingDevice(LocalId localId ) {
        super(localId);
    }


    public class Builder implements org.openmetadatainitiative.openminds.utils.Builder<SlicingDevice>{
        
        public Builder description(String description) { SlicingDevice.this.description = description; return this; }
        
        public Builder deviceType(Reference<DeviceType> deviceType) { SlicingDevice.this.deviceType = deviceType; return this; }
        
        public Builder digitalIdentifier(Reference<? extends SlicingDeviceDigitalIdentifier> digitalIdentifier) { SlicingDevice.this.digitalIdentifier = digitalIdentifier; return this; }
        
        public Builder lookupLabel(String lookupLabel) { SlicingDevice.this.lookupLabel = lookupLabel; return this; }
        
        public Builder manufacturer(List<Reference<? extends SlicingDeviceManufacturer>> manufacturer) { SlicingDevice.this.manufacturer = manufacturer; return this; }
        
        public Builder name(String name) { SlicingDevice.this.name = name; return this; }
        
        public Builder owner(List<Reference<? extends SlicingDeviceOwner>> owner) { SlicingDevice.this.owner = owner; return this; }
        
        public Builder serialNumber(String serialNumber) { SlicingDevice.this.serialNumber = serialNumber; return this; }
        

        public SlicingDevice build() {
            if (SlicingDevice.this.id == null) {
                SlicingDevice.this.id = new InstanceId(UUID.randomUUID().toString());
            }
            if(SlicingDevice.this.types == null || SlicingDevice.this.types.isEmpty() || !SlicingDevice.this.types.contains(SEMANTIC_NAME)){
                final List<String> oldValues = SlicingDevice.this.types;
                SlicingDevice.this.types = new ArrayList<>();
                SlicingDevice.this.types.add(SEMANTIC_NAME);
                if(oldValues != null){
                    SlicingDevice.this.types.addAll(oldValues);
                }
            }
            return SlicingDevice.this;
        }
    }

   @JsonProperty(value = "https://openminds.ebrains.eu/vocab/description")
    private String description;
    
    /**
    * Longer statement or account giving the characteristics of someone or something.
    */
    public String getDescription() {
       return this.description;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/deviceType")
    private Reference<DeviceType> deviceType;
    
    public Reference<DeviceType> getDeviceType() {
       return this.deviceType;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/digitalIdentifier")
    private Reference<? extends SlicingDeviceDigitalIdentifier> digitalIdentifier;
    
    /**
    * Digital handle to identify objects or legal persons.
    */
    public Reference<? extends SlicingDeviceDigitalIdentifier> getDigitalIdentifier() {
       return this.digitalIdentifier;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/lookupLabel")
    private String lookupLabel;
    
    public String getLookupLabel() {
       return this.lookupLabel;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/manufacturer")
    private List<Reference<? extends SlicingDeviceManufacturer>> manufacturer;
    
    public List<Reference<? extends SlicingDeviceManufacturer>> getManufacturer() {
       return this.manufacturer;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/name")
    private String name;
    
    /**
    * Word or phrase that constitutes the distinctive designation of a being or thing.
    */
    public String getName() {
       return this.name;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/owner")
    private List<Reference<? extends SlicingDeviceOwner>> owner;
    
    public List<Reference<? extends SlicingDeviceOwner>> getOwner() {
       return this.owner;
    }

    @JsonProperty(value = "https://openminds.ebrains.eu/vocab/serialNumber")
    private String serialNumber;
    
    public String getSerialNumber() {
       return this.serialNumber;
    }

 
    public static SlicingDevice.Builder create(LocalId localId){
        return new SlicingDevice(localId).new Builder();
    }

    public SlicingDevice.Builder copy(){
        return ParsingUtils.OBJECT_MAPPER.convertValue(this, SlicingDevice.class).new Builder();
    }
}