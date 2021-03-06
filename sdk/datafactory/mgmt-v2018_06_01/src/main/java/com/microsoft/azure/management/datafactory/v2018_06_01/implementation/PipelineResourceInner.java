/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.datafactory.v2018_06_01.Activity;
import com.microsoft.azure.management.datafactory.v2018_06_01.ParameterSpecification;
import com.microsoft.azure.management.datafactory.v2018_06_01.VariableSpecification;
import com.microsoft.azure.management.datafactory.v2018_06_01.PipelineFolder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * Pipeline resource type.
 */
@JsonFlatten
public class PipelineResourceInner extends SubResource {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * The description of the pipeline.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * List of activities in pipeline.
     */
    @JsonProperty(value = "properties.activities")
    private List<Activity> activities;

    /**
     * List of parameters for pipeline.
     */
    @JsonProperty(value = "properties.parameters")
    private Map<String, ParameterSpecification> parameters;

    /**
     * List of variables for pipeline.
     */
    @JsonProperty(value = "properties.variables")
    private Map<String, VariableSpecification> variables;

    /**
     * The max number of concurrent runs for the pipeline.
     */
    @JsonProperty(value = "properties.concurrency")
    private Integer concurrency;

    /**
     * List of tags that can be used for describing the Pipeline.
     */
    @JsonProperty(value = "properties.annotations")
    private List<Object> annotations;

    /**
     * Dimensions emitted by Pipeline.
     */
    @JsonProperty(value = "properties.runDimensions")
    private Map<String, Object> runDimensions;

    /**
     * The folder that this Pipeline is in. If not specified, Pipeline will
     * appear at the root level.
     */
    @JsonProperty(value = "properties.folder")
    private PipelineFolder folder;

    /**
     * The resource name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Etag identifies change in the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get the description of the pipeline.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the pipeline.
     *
     * @param description the description value to set
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get list of activities in pipeline.
     *
     * @return the activities value
     */
    public List<Activity> activities() {
        return this.activities;
    }

    /**
     * Set list of activities in pipeline.
     *
     * @param activities the activities value to set
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withActivities(List<Activity> activities) {
        this.activities = activities;
        return this;
    }

    /**
     * Get list of parameters for pipeline.
     *
     * @return the parameters value
     */
    public Map<String, ParameterSpecification> parameters() {
        return this.parameters;
    }

    /**
     * Set list of parameters for pipeline.
     *
     * @param parameters the parameters value to set
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withParameters(Map<String, ParameterSpecification> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get list of variables for pipeline.
     *
     * @return the variables value
     */
    public Map<String, VariableSpecification> variables() {
        return this.variables;
    }

    /**
     * Set list of variables for pipeline.
     *
     * @param variables the variables value to set
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withVariables(Map<String, VariableSpecification> variables) {
        this.variables = variables;
        return this;
    }

    /**
     * Get the max number of concurrent runs for the pipeline.
     *
     * @return the concurrency value
     */
    public Integer concurrency() {
        return this.concurrency;
    }

    /**
     * Set the max number of concurrent runs for the pipeline.
     *
     * @param concurrency the concurrency value to set
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    /**
     * Get list of tags that can be used for describing the Pipeline.
     *
     * @return the annotations value
     */
    public List<Object> annotations() {
        return this.annotations;
    }

    /**
     * Set list of tags that can be used for describing the Pipeline.
     *
     * @param annotations the annotations value to set
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withAnnotations(List<Object> annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Get dimensions emitted by Pipeline.
     *
     * @return the runDimensions value
     */
    public Map<String, Object> runDimensions() {
        return this.runDimensions;
    }

    /**
     * Set dimensions emitted by Pipeline.
     *
     * @param runDimensions the runDimensions value to set
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withRunDimensions(Map<String, Object> runDimensions) {
        this.runDimensions = runDimensions;
        return this;
    }

    /**
     * Get the folder that this Pipeline is in. If not specified, Pipeline will appear at the root level.
     *
     * @return the folder value
     */
    public PipelineFolder folder() {
        return this.folder;
    }

    /**
     * Set the folder that this Pipeline is in. If not specified, Pipeline will appear at the root level.
     *
     * @param folder the folder value to set
     * @return the PipelineResourceInner object itself.
     */
    public PipelineResourceInner withFolder(PipelineFolder folder) {
        this.folder = folder;
        return this;
    }

    /**
     * Get the resource name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the resource type.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get etag identifies change in the resource.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
