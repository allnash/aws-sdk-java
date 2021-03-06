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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Continas information about the member account
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Member" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Member implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Member account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Member account's detector ID.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * Master account ID.
     * </p>
     */
    private String masterId;
    /**
     * <p>
     * Member account's email address.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The status of the relationship between the member and the master.
     * </p>
     */
    private String relationshipStatus;
    /**
     * <p>
     * Timestamp at which the invitation was sent
     * </p>
     */
    private String invitedAt;
    /**
     * <p>
     * Member last updated timestamp.
     * </p>
     */
    private String updatedAt;

    /**
     * <p>
     * Member account ID.
     * </p>
     * 
     * @param accountId
     *        Member account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Member account ID.
     * </p>
     * 
     * @return Member account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * Member account ID.
     * </p>
     * 
     * @param accountId
     *        Member account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Member account's detector ID.
     * </p>
     * 
     * @param detectorId
     *        Member account's detector ID.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * Member account's detector ID.
     * </p>
     * 
     * @return Member account's detector ID.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * Member account's detector ID.
     * </p>
     * 
     * @param detectorId
     *        Member account's detector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * Master account ID.
     * </p>
     * 
     * @param masterId
     *        Master account ID.
     */

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    /**
     * <p>
     * Master account ID.
     * </p>
     * 
     * @return Master account ID.
     */

    public String getMasterId() {
        return this.masterId;
    }

    /**
     * <p>
     * Master account ID.
     * </p>
     * 
     * @param masterId
     *        Master account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withMasterId(String masterId) {
        setMasterId(masterId);
        return this;
    }

    /**
     * <p>
     * Member account's email address.
     * </p>
     * 
     * @param email
     *        Member account's email address.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * Member account's email address.
     * </p>
     * 
     * @return Member account's email address.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * Member account's email address.
     * </p>
     * 
     * @param email
     *        Member account's email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The status of the relationship between the member and the master.
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the relationship between the member and the master.
     */

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    /**
     * <p>
     * The status of the relationship between the member and the master.
     * </p>
     * 
     * @return The status of the relationship between the member and the master.
     */

    public String getRelationshipStatus() {
        return this.relationshipStatus;
    }

    /**
     * <p>
     * The status of the relationship between the member and the master.
     * </p>
     * 
     * @param relationshipStatus
     *        The status of the relationship between the member and the master.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withRelationshipStatus(String relationshipStatus) {
        setRelationshipStatus(relationshipStatus);
        return this;
    }

    /**
     * <p>
     * Timestamp at which the invitation was sent
     * </p>
     * 
     * @param invitedAt
     *        Timestamp at which the invitation was sent
     */

    public void setInvitedAt(String invitedAt) {
        this.invitedAt = invitedAt;
    }

    /**
     * <p>
     * Timestamp at which the invitation was sent
     * </p>
     * 
     * @return Timestamp at which the invitation was sent
     */

    public String getInvitedAt() {
        return this.invitedAt;
    }

    /**
     * <p>
     * Timestamp at which the invitation was sent
     * </p>
     * 
     * @param invitedAt
     *        Timestamp at which the invitation was sent
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withInvitedAt(String invitedAt) {
        setInvitedAt(invitedAt);
        return this;
    }

    /**
     * <p>
     * Member last updated timestamp.
     * </p>
     * 
     * @param updatedAt
     *        Member last updated timestamp.
     */

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * Member last updated timestamp.
     * </p>
     * 
     * @return Member last updated timestamp.
     */

    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * Member last updated timestamp.
     * </p>
     * 
     * @param updatedAt
     *        Member last updated timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Member withUpdatedAt(String updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getMasterId() != null)
            sb.append("MasterId: ").append(getMasterId()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getRelationshipStatus() != null)
            sb.append("RelationshipStatus: ").append(getRelationshipStatus()).append(",");
        if (getInvitedAt() != null)
            sb.append("InvitedAt: ").append(getInvitedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Member == false)
            return false;
        Member other = (Member) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getMasterId() == null ^ this.getMasterId() == null)
            return false;
        if (other.getMasterId() != null && other.getMasterId().equals(this.getMasterId()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getRelationshipStatus() == null ^ this.getRelationshipStatus() == null)
            return false;
        if (other.getRelationshipStatus() != null && other.getRelationshipStatus().equals(this.getRelationshipStatus()) == false)
            return false;
        if (other.getInvitedAt() == null ^ this.getInvitedAt() == null)
            return false;
        if (other.getInvitedAt() != null && other.getInvitedAt().equals(this.getInvitedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getMasterId() == null) ? 0 : getMasterId().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getRelationshipStatus() == null) ? 0 : getRelationshipStatus().hashCode());
        hashCode = prime * hashCode + ((getInvitedAt() == null) ? 0 : getInvitedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Member clone() {
        try {
            return (Member) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.MemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
