/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Exclusive to findings that are generated as the result of a check run against a specific rule in a supported standard
 * (for example, CIS AWS Foundations). Contains compliance-related finding details.
 * </p>
 * <p>
 * Values include the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Allowed values are the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>PASSED</code> - Compliance check passed for all evaluated resources.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>WARNING</code> - Some information is missing or this check is not supported given your configuration.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>FAILED</code> - Compliance check failed for at least one evaluated resource.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>NOT_AVAILABLE</code> - Check could not be performed due to a service outage or API error.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Compliance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Compliance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The result of a compliance check.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The result of a compliance check.
     * </p>
     * 
     * @param status
     *        The result of a compliance check.
     * @see ComplianceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The result of a compliance check.
     * </p>
     * 
     * @return The result of a compliance check.
     * @see ComplianceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The result of a compliance check.
     * </p>
     * 
     * @param status
     *        The result of a compliance check.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public Compliance withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The result of a compliance check.
     * </p>
     * 
     * @param status
     *        The result of a compliance check.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComplianceStatus
     */

    public Compliance withStatus(ComplianceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Compliance == false)
            return false;
        Compliance other = (Compliance) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Compliance clone() {
        try {
            return (Compliance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ComplianceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
