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
package com.amazonaws.services.config.model;

import javax.annotation.Generated;

/**
 * <p>
 * You have reached the limit (100,000) of active custom resource types in your account. Delete unused resources using
 * <code>DeleteResourceConfig</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaxActiveResourcesExceededException extends com.amazonaws.services.config.model.AmazonConfigException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new MaxActiveResourcesExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public MaxActiveResourcesExceededException(String message) {
        super(message);
    }

}
