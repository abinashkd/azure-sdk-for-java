// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The PathList model.
 */
@Fluent
public final class PathList {
    /*
     * The paths property.
     */
    @JsonProperty(value = "paths")
    private List<Path> paths;

    /**
     * Get the paths property: The paths property.
     *
     * @return the paths value.
     */
    public List<Path> getPaths() {
        return this.paths;
    }

    /**
     * Set the paths property: The paths property.
     *
     * @param paths the paths value to set.
     * @return the PathList object itself.
     */
    public PathList setPaths(List<Path> paths) {
        this.paths = paths;
        return this;
    }
}