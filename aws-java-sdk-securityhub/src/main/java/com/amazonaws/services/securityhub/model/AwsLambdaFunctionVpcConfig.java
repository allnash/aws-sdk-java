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
 * The VPC security groups and subnets that are attached to a Lambda function. For more information, see VPC Settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsLambdaFunctionVpcConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsLambdaFunctionVpcConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of VPC security groups IDs.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * A list of VPC subnet IDs.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * A list of VPC security groups IDs.
     * </p>
     * 
     * @return A list of VPC security groups IDs.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * A list of VPC security groups IDs.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of VPC security groups IDs.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * A list of VPC security groups IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of VPC security groups IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionVpcConfig withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups IDs.
     * </p>
     * 
     * @param securityGroupIds
     *        A list of VPC security groups IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionVpcConfig withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * A list of VPC subnet IDs.
     * </p>
     * 
     * @return A list of VPC subnet IDs.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * A list of VPC subnet IDs.
     * </p>
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * A list of VPC subnet IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionVpcConfig withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC subnet IDs.
     * </p>
     * 
     * @param subnetIds
     *        A list of VPC subnet IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionVpcConfig withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsLambdaFunctionVpcConfig withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsLambdaFunctionVpcConfig == false)
            return false;
        AwsLambdaFunctionVpcConfig other = (AwsLambdaFunctionVpcConfig) obj;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public AwsLambdaFunctionVpcConfig clone() {
        try {
            return (AwsLambdaFunctionVpcConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsLambdaFunctionVpcConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
