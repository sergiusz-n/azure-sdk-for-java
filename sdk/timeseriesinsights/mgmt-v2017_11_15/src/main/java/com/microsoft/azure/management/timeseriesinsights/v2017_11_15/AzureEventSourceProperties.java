/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of an event source that reads events from an event broker in
 * Azure.
 */
public class AzureEventSourceProperties extends EventSourceCommonProperties {
    /**
     * The resource id of the event source in Azure Resource Manager.
     */
    @JsonProperty(value = "eventSourceResourceId", required = true)
    private String eventSourceResourceId;

    /**
     * Get the resource id of the event source in Azure Resource Manager.
     *
     * @return the eventSourceResourceId value
     */
    public String eventSourceResourceId() {
        return this.eventSourceResourceId;
    }

    /**
     * Set the resource id of the event source in Azure Resource Manager.
     *
     * @param eventSourceResourceId the eventSourceResourceId value to set
     * @return the AzureEventSourceProperties object itself.
     */
    public AzureEventSourceProperties withEventSourceResourceId(String eventSourceResourceId) {
        this.eventSourceResourceId = eventSourceResourceId;
        return this;
    }

}