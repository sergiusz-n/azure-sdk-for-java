// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The VirtualMachineScaleSetUpdateOSDisk model.
 */
@Fluent
public final class VirtualMachineScaleSetUpdateOSDisk {
    /*
     * Specifies the caching requirements. <br><br> Possible values are:
     * <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br>
     * Default: **None for Standard storage. ReadOnly for Premium storage**
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /*
     * Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     */
    @JsonProperty(value = "writeAcceleratorEnabled")
    private Boolean writeAcceleratorEnabled;

    /*
     * Specifies the size of the operating system disk in gigabytes. This
     * element can be used to overwrite the size of the disk in a virtual
     * machine image. <br><br> This value cannot be larger than 1023 GB
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * Describes the uri of a disk.
     */
    @JsonProperty(value = "image")
    private VirtualHardDisk image;

    /*
     * The list of virtual hard disk container uris.
     */
    @JsonProperty(value = "vhdContainers")
    private List<String> vhdContainers;

    /*
     * Describes the parameters of a ScaleSet managed disk.
     */
    @JsonProperty(value = "managedDisk")
    private VirtualMachineScaleSetManagedDiskParameters managedDisk;

    /**
     * Get the caching property: Specifies the caching requirements.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None**
     * &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for
     * Premium storage**.
     * 
     * @return the caching value.
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching property: Specifies the caching requirements.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **None**
     * &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for
     * Premium storage**.
     * 
     * @param caching the caching value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the writeAcceleratorEnabled property: Specifies whether
     * writeAccelerator should be enabled or disabled on the disk.
     * 
     * @return the writeAcceleratorEnabled value.
     */
    public Boolean writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set the writeAcceleratorEnabled property: Specifies whether
     * writeAccelerator should be enabled or disabled on the disk.
     * 
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * Get the diskSizeGB property: Specifies the size of the operating system
     * disk in gigabytes. This element can be used to overwrite the size of the
     * disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot
     * be larger than 1023 GB.
     * 
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Specifies the size of the operating system
     * disk in gigabytes. This element can be used to overwrite the size of the
     * disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot
     * be larger than 1023 GB.
     * 
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the image property: Describes the uri of a disk.
     * 
     * @return the image value.
     */
    public VirtualHardDisk image() {
        return this.image;
    }

    /**
     * Set the image property: Describes the uri of a disk.
     * 
     * @param image the image value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withImage(VirtualHardDisk image) {
        this.image = image;
        return this;
    }

    /**
     * Get the vhdContainers property: The list of virtual hard disk container
     * uris.
     * 
     * @return the vhdContainers value.
     */
    public List<String> vhdContainers() {
        return this.vhdContainers;
    }

    /**
     * Set the vhdContainers property: The list of virtual hard disk container
     * uris.
     * 
     * @param vhdContainers the vhdContainers value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withVhdContainers(List<String> vhdContainers) {
        this.vhdContainers = vhdContainers;
        return this;
    }

    /**
     * Get the managedDisk property: Describes the parameters of a ScaleSet
     * managed disk.
     * 
     * @return the managedDisk value.
     */
    public VirtualMachineScaleSetManagedDiskParameters managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: Describes the parameters of a ScaleSet
     * managed disk.
     * 
     * @param managedDisk the managedDisk value to set.
     * @return the VirtualMachineScaleSetUpdateOSDisk object itself.
     */
    public VirtualMachineScaleSetUpdateOSDisk withManagedDisk(VirtualMachineScaleSetManagedDiskParameters managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }
}