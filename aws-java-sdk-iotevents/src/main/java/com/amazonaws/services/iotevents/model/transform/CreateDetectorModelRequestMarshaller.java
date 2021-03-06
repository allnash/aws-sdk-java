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
package com.amazonaws.services.iotevents.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotevents.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDetectorModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDetectorModelRequestMarshaller {

    private static final MarshallingInfo<String> DETECTORMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorModelName").build();
    private static final MarshallingInfo<StructuredPojo> DETECTORMODELDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorModelDefinition").build();
    private static final MarshallingInfo<String> DETECTORMODELDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("detectorModelDescription").build();
    private static final MarshallingInfo<String> KEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("key").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> EVALUATIONMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("evaluationMethod").build();

    private static final CreateDetectorModelRequestMarshaller instance = new CreateDetectorModelRequestMarshaller();

    public static CreateDetectorModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDetectorModelRequest createDetectorModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDetectorModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDetectorModelRequest.getDetectorModelName(), DETECTORMODELNAME_BINDING);
            protocolMarshaller.marshall(createDetectorModelRequest.getDetectorModelDefinition(), DETECTORMODELDEFINITION_BINDING);
            protocolMarshaller.marshall(createDetectorModelRequest.getDetectorModelDescription(), DETECTORMODELDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createDetectorModelRequest.getKey(), KEY_BINDING);
            protocolMarshaller.marshall(createDetectorModelRequest.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createDetectorModelRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createDetectorModelRequest.getEvaluationMethod(), EVALUATIONMETHOD_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
