/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Https settings for a domain.
 */
@JsonFlatten
public class CustomHttpsConfiguration {
    /**
     * Defines the source of the SSL certificate. Possible values include:
     * 'AzureKeyVault', 'FrontDoor'.
     */
    @JsonProperty(value = "certificateSource", required = true)
    private FrontDoorCertificateSource certificateSource;

    /**
     * Defines the TLS extension protocol that is used for secure delivery.
     */
    @JsonProperty(value = "protocolType", required = true)
    private String protocolType;

    /**
     * The minimum TLS version required from the clients to establish an SSL
     * handshake with Front Door. Possible values include: '1.0', '1.2'.
     */
    @JsonProperty(value = "minimumTlsVersion", required = true)
    private MinimumTLSVersion minimumTlsVersion;

    /**
     * The Key Vault containing the SSL certificate.
     */
    @JsonProperty(value = "keyVaultCertificateSourceParameters.vault")
    private KeyVaultCertificateSourceParametersVault vault;

    /**
     * The name of the Key Vault secret representing the full certificate PFX.
     */
    @JsonProperty(value = "keyVaultCertificateSourceParameters.secretName")
    private String secretName;

    /**
     * The version of the Key Vault secret representing the full certificate
     * PFX.
     */
    @JsonProperty(value = "keyVaultCertificateSourceParameters.secretVersion")
    private String secretVersion;

    /**
     * Defines the type of the certificate used for secure connections to a
     * frontendEndpoint. Possible values include: 'Dedicated'.
     */
    @JsonProperty(value = "frontDoorCertificateSourceParameters.certificateType")
    private FrontDoorCertificateType certificateType;

    /**
     * Creates an instance of CustomHttpsConfiguration class.
     * @param certificateSource defines the source of the SSL certificate. Possible values include: 'AzureKeyVault', 'FrontDoor'.
     * @param minimumTlsVersion the minimum TLS version required from the clients to establish an SSL handshake with Front Door. Possible values include: '1.0', '1.2'.
     */
    public CustomHttpsConfiguration() {
        protocolType = "ServerNameIndication";
    }

    /**
     * Get defines the source of the SSL certificate. Possible values include: 'AzureKeyVault', 'FrontDoor'.
     *
     * @return the certificateSource value
     */
    public FrontDoorCertificateSource certificateSource() {
        return this.certificateSource;
    }

    /**
     * Set defines the source of the SSL certificate. Possible values include: 'AzureKeyVault', 'FrontDoor'.
     *
     * @param certificateSource the certificateSource value to set
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withCertificateSource(FrontDoorCertificateSource certificateSource) {
        this.certificateSource = certificateSource;
        return this;
    }

    /**
     * Get defines the TLS extension protocol that is used for secure delivery.
     *
     * @return the protocolType value
     */
    public String protocolType() {
        return this.protocolType;
    }

    /**
     * Set defines the TLS extension protocol that is used for secure delivery.
     *
     * @param protocolType the protocolType value to set
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }

    /**
     * Get the minimum TLS version required from the clients to establish an SSL handshake with Front Door. Possible values include: '1.0', '1.2'.
     *
     * @return the minimumTlsVersion value
     */
    public MinimumTLSVersion minimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    /**
     * Set the minimum TLS version required from the clients to establish an SSL handshake with Front Door. Possible values include: '1.0', '1.2'.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withMinimumTlsVersion(MinimumTLSVersion minimumTlsVersion) {
        this.minimumTlsVersion = minimumTlsVersion;
        return this;
    }

    /**
     * Get the Key Vault containing the SSL certificate.
     *
     * @return the vault value
     */
    public KeyVaultCertificateSourceParametersVault vault() {
        return this.vault;
    }

    /**
     * Set the Key Vault containing the SSL certificate.
     *
     * @param vault the vault value to set
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withVault(KeyVaultCertificateSourceParametersVault vault) {
        this.vault = vault;
        return this;
    }

    /**
     * Get the name of the Key Vault secret representing the full certificate PFX.
     *
     * @return the secretName value
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the name of the Key Vault secret representing the full certificate PFX.
     *
     * @param secretName the secretName value to set
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the version of the Key Vault secret representing the full certificate PFX.
     *
     * @return the secretVersion value
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the version of the Key Vault secret representing the full certificate PFX.
     *
     * @param secretVersion the secretVersion value to set
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Get defines the type of the certificate used for secure connections to a frontendEndpoint. Possible values include: 'Dedicated'.
     *
     * @return the certificateType value
     */
    public FrontDoorCertificateType certificateType() {
        return this.certificateType;
    }

    /**
     * Set defines the type of the certificate used for secure connections to a frontendEndpoint. Possible values include: 'Dedicated'.
     *
     * @param certificateType the certificateType value to set
     * @return the CustomHttpsConfiguration object itself.
     */
    public CustomHttpsConfiguration withCertificateType(FrontDoorCertificateType certificateType) {
        this.certificateType = certificateType;
        return this;
    }

}
