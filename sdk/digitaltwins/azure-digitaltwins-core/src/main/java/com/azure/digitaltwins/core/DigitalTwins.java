// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.digitaltwins.core.models.DigitalTwinsAddRelationshipResponse;
import com.azure.digitaltwins.core.models.DigitalTwinsAddResponse;
import com.azure.digitaltwins.core.models.DigitalTwinsGetByIdResponse;
import com.azure.digitaltwins.core.models.DigitalTwinsGetComponentResponse;
import com.azure.digitaltwins.core.models.DigitalTwinsGetRelationshipByIdResponse;
import com.azure.digitaltwins.core.models.DigitalTwinsUpdateComponentResponse;
import com.azure.digitaltwins.core.models.DigitalTwinsUpdateRelationshipResponse;
import com.azure.digitaltwins.core.models.DigitalTwinsUpdateResponse;
import com.azure.digitaltwins.core.models.ErrorResponseException;
import com.azure.digitaltwins.core.models.IncomingRelationship;
import com.azure.digitaltwins.core.models.IncomingRelationshipCollection;
import com.azure.digitaltwins.core.models.RelationshipCollection;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DigitalTwins. */
public final class DigitalTwins {
    /** The proxy service used to perform REST calls. */
    private final DigitalTwinsService service;

    /** The service client containing this operation class. */
    private final AzureDigitalTwinsAPI client;

    /**
     * Initializes an instance of DigitalTwins.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DigitalTwins(AzureDigitalTwinsAPI client) {
        this.service = RestProxy.create(DigitalTwinsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureDigitalTwinsAPIDigitalTwins to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureDigitalTwinsAPI")
    private interface DigitalTwinsService {
        @Get("/digitaltwins/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DigitalTwinsGetByIdResponse> getById(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Put("/digitaltwins/{id}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DigitalTwinsAddResponse> add(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") Object twin,
                Context context);

        @Delete("/digitaltwins/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> delete(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @HeaderParam("If-Match") String ifMatch,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Patch("/digitaltwins/{id}")
        @ExpectedResponses({202, 204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DigitalTwinsUpdateResponse> update(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @HeaderParam("If-Match") String ifMatch,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json-patch+json") List<Object> patchDocument,
                Context context);

        @Get("/digitaltwins/{id}/relationships/{relationshipId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DigitalTwinsGetRelationshipByIdResponse> getRelationshipById(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @PathParam("relationshipId") String relationshipId,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Put("/digitaltwins/{id}/relationships/{relationshipId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DigitalTwinsAddRelationshipResponse> addRelationship(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @PathParam("relationshipId") String relationshipId,
                @HeaderParam("If-None-Match") String ifNoneMatch,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") Object relationship,
                Context context);

        @Delete("/digitaltwins/{id}/relationships/{relationshipId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> deleteRelationship(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @PathParam("relationshipId") String relationshipId,
                @HeaderParam("If-Match") String ifMatch,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Patch("/digitaltwins/{id}/relationships/{relationshipId}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DigitalTwinsUpdateRelationshipResponse> updateRelationship(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @PathParam("relationshipId") String relationshipId,
                @HeaderParam("If-Match") String ifMatch,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json-patch+json") List<Object> patchDocument,
                Context context);

        @Get("/digitaltwins/{id}/relationships")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<RelationshipCollection>> listRelationships(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @QueryParam("relationshipName") String relationshipName,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Get("/digitaltwins/{id}/incomingrelationships")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<IncomingRelationshipCollection>> listIncomingRelationships(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Post("/digitaltwins/{id}/telemetry")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> sendTelemetry(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @HeaderParam("dt-id") String dtId,
                @HeaderParam("dt-timestamp") String dtTimestamp,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") Object telemetry,
                Context context);

        @Post("/digitaltwins/{id}/components/{componentPath}/telemetry")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> sendComponentTelemetry(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @PathParam("componentPath") String componentPath,
                @HeaderParam("dt-id") String dtId,
                @HeaderParam("dt-timestamp") String dtTimestamp,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") Object telemetry,
                Context context);

        @Get("/digitaltwins/{id}/components/{componentPath}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DigitalTwinsGetComponentResponse> getComponent(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @PathParam("componentPath") String componentPath,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Patch("/digitaltwins/{id}/components/{componentPath}")
        @ExpectedResponses({202, 204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<DigitalTwinsUpdateComponentResponse> updateComponent(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @PathParam("componentPath") String componentPath,
                @HeaderParam("If-Match") String ifMatch,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json-patch+json") List<Object> patchDocument,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<RelationshipCollection>> listRelationshipsNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<IncomingRelationshipCollection>> listIncomingRelationshipsNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Retrieves a digital twin. Status codes: 200 (OK): Success. 404 (Not Found): There is no digital twin with the
     * provided id.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DigitalTwinsGetByIdResponse> getByIdWithResponseAsync(String id) {
        return FluxUtil.withContext(
                context -> service.getById(this.client.getHost(), id, this.client.getApiVersion(), context));
    }

    /**
     * Adds or replaces a digital twin. Status codes: 200 (OK): Success. 400 (Bad Request): The request is invalid. 412
     * (Precondition Failed): The model is decommissioned or the digital twin already exists (when using If-None-Match:
     * *).
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @param twin Any object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DigitalTwinsAddResponse> addWithResponseAsync(String id, Object twin) {
        final String ifNoneMatch = "*";
        return FluxUtil.withContext(
                context ->
                        service.add(
                                this.client.getHost(), id, ifNoneMatch, this.client.getApiVersion(), twin, context));
    }

    /**
     * Deletes a digital twin. All relationships referencing the digital twin must already be deleted. Status codes: 200
     * (OK): Success. 400 (Bad Request): The request is invalid. 404 (Not Found): There is no digital twin with the
     * provided id.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @param ifMatch Only perform the operation if the entity's etag matches one of the etags provided or * is
     *     provided.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String id, String ifMatch) {
        return FluxUtil.withContext(
                context -> service.delete(this.client.getHost(), id, ifMatch, this.client.getApiVersion(), context));
    }

    /**
     * Updates a digital twin. Status codes: 200 (OK): Success. 400 (Bad Request): The request is invalid. 404 (Not
     * Found): There is no digital twin with the provided id.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @param patchDocument Array of any.
     * @param ifMatch Only perform the operation if the entity's etag matches one of the etags provided or * is
     *     provided.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DigitalTwinsUpdateResponse> updateWithResponseAsync(
            String id, List<Object> patchDocument, String ifMatch) {
        return FluxUtil.withContext(
                context ->
                        service.update(
                                this.client.getHost(),
                                id,
                                ifMatch,
                                this.client.getApiVersion(),
                                patchDocument,
                                context));
    }

    /**
     * Retrieves a relationship between two digital twins. Status codes: 200 (OK): Success. 404 (Not Found): There is
     * either no digital twin or relationship with the provided id.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @param relationshipId The id of the relationship. The id is unique within the digital twin and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DigitalTwinsGetRelationshipByIdResponse> getRelationshipByIdWithResponseAsync(
            String id, String relationshipId) {
        return FluxUtil.withContext(
                context ->
                        service.getRelationshipById(
                                this.client.getHost(), id, relationshipId, this.client.getApiVersion(), context));
    }

    /**
     * Adds a relationship between two digital twins. Status codes: 200 (OK): Success. 400 (Bad Request): The request is
     * invalid. 404 (Not Found): There is either no digital twin, target digital twin, or relationship with the provided
     * id. 409 (Conflict): A relationship with the provided id already exists.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @param relationshipId The id of the relationship. The id is unique within the digital twin and case sensitive.
     * @param relationship Any object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DigitalTwinsAddRelationshipResponse> addRelationshipWithResponseAsync(
            String id, String relationshipId, Object relationship) {
        final String ifNoneMatch = "*";
        return FluxUtil.withContext(
                context ->
                        service.addRelationship(
                                this.client.getHost(),
                                id,
                                relationshipId,
                                ifNoneMatch,
                                this.client.getApiVersion(),
                                relationship,
                                context));
    }

    /**
     * Deletes a relationship between two digital twins. Status codes: 200 (OK): Success. 404 (Not Found): There is
     * either no digital twin or relationship with the provided id.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @param relationshipId The id of the relationship. The id is unique within the digital twin and case sensitive.
     * @param ifMatch Only perform the operation if the entity's etag matches one of the etags provided or * is
     *     provided.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteRelationshipWithResponseAsync(String id, String relationshipId, String ifMatch) {
        return FluxUtil.withContext(
                context ->
                        service.deleteRelationship(
                                this.client.getHost(),
                                id,
                                relationshipId,
                                ifMatch,
                                this.client.getApiVersion(),
                                context));
    }

    /**
     * Updates the properties on a relationship between two digital twins. Status codes: 200 (OK): Success. 400 (Bad
     * Request): The request is invalid. 404 (Not Found): There is either no digital twin or relationship with the
     * provided id.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @param relationshipId The id of the relationship. The id is unique within the digital twin and case sensitive.
     * @param ifMatch Only perform the operation if the entity's etag matches one of the etags provided or * is
     *     provided.
     * @param patchDocument Array of any.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DigitalTwinsUpdateRelationshipResponse> updateRelationshipWithResponseAsync(
            String id, String relationshipId, String ifMatch, List<Object> patchDocument) {
        return FluxUtil.withContext(
                context ->
                        service.updateRelationship(
                                this.client.getHost(),
                                id,
                                relationshipId,
                                ifMatch,
                                this.client.getApiVersion(),
                                patchDocument,
                                context));
    }

    /**
     * Retrieves the relationships from a digital twin. Status codes: 200 (OK): Success. 400 (Bad Request): The request
     * is invalid. 404 (Not Found): There is no digital twin with the provided id.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @param relationshipName The name of the relationship.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of relationships which relate digital twins together.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Object>> listRelationshipsSinglePageAsync(String id, String relationshipName) {
        return FluxUtil.withContext(
                        context ->
                                service.listRelationships(
                                        this.client.getHost(),
                                        id,
                                        relationshipName,
                                        this.client.getApiVersion(),
                                        context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Retrieves all incoming relationship for a digital twin. Status codes: 200 (OK): Success. 400 (Bad Request): The
     * request is invalid. 404 (Not Found): There is no digital twin with the provided id.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of incoming relationships which relate digital twins together.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<IncomingRelationship>> listIncomingRelationshipsSinglePageAsync(String id) {
        return FluxUtil.withContext(
                        context ->
                                service.listIncomingRelationships(
                                        this.client.getHost(), id, this.client.getApiVersion(), context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Sends telemetry on behalf of a digital twin. Status codes: 200 (OK): Success. 400 (Bad Request): The request is
     * invalid. 404 (Not Found): There is no digital twin with the provided id.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @param dtId A unique message identifier (in the scope of the digital twin id) that is commonly used for
     *     de-duplicating messages.
     * @param telemetry Any object.
     * @param dtTimestamp An RFC 3339 timestamp that identifies the time the telemetry was measured.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendTelemetryWithResponseAsync(
            String id, String dtId, Object telemetry, String dtTimestamp) {
        return FluxUtil.withContext(
                context ->
                        service.sendTelemetry(
                                this.client.getHost(),
                                id,
                                dtId,
                                dtTimestamp,
                                this.client.getApiVersion(),
                                telemetry,
                                context));
    }

    /**
     * Sends telemetry on behalf of a component in a digital twin. Status codes: 200 (OK): Success. 400 (Bad Request):
     * The request is invalid. 404 (Not Found): There is either no digital twin with the provided id or the component
     * path is invalid.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @param componentPath The name of the DTDL component.
     * @param dtId A unique message identifier (in the scope of the digital twin id) that is commonly used for
     *     de-duplicating messages.
     * @param telemetry Any object.
     * @param dtTimestamp An RFC 3339 timestamp that identifies the time the telemetry was measured.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendComponentTelemetryWithResponseAsync(
            String id, String componentPath, String dtId, Object telemetry, String dtTimestamp) {
        return FluxUtil.withContext(
                context ->
                        service.sendComponentTelemetry(
                                this.client.getHost(),
                                id,
                                componentPath,
                                dtId,
                                dtTimestamp,
                                this.client.getApiVersion(),
                                telemetry,
                                context));
    }

    /**
     * Retrieves a component from a digital twin. Status codes: 200 (OK): Success. 404 (Not Found): There is either no
     * digital twin with the provided id or the component path is invalid.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @param componentPath The name of the DTDL component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DigitalTwinsGetComponentResponse> getComponentWithResponseAsync(String id, String componentPath) {
        return FluxUtil.withContext(
                context ->
                        service.getComponent(
                                this.client.getHost(), id, componentPath, this.client.getApiVersion(), context));
    }

    /**
     * Updates a component on a digital twin. Status codes: 200 (OK): Success. 400 (Bad Request): The request is
     * invalid. 404 (Not Found): There is either no digital twin with the provided id or the component path is invalid.
     *
     * @param id The id of the digital twin. The id is unique within the service and case sensitive.
     * @param componentPath The name of the DTDL component.
     * @param ifMatch Only perform the operation if the entity's etag matches one of the etags provided or * is
     *     provided.
     * @param patchDocument Array of any.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DigitalTwinsUpdateComponentResponse> updateComponentWithResponseAsync(
            String id, String componentPath, String ifMatch, List<Object> patchDocument) {
        return FluxUtil.withContext(
                context ->
                        service.updateComponent(
                                this.client.getHost(),
                                id,
                                componentPath,
                                ifMatch,
                                this.client.getApiVersion(),
                                patchDocument,
                                context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of relationships which relate digital twins together.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<Object>> listRelationshipsNextSinglePageAsync(String nextLink) {
        return FluxUtil.withContext(context -> service.listRelationshipsNext(nextLink, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of incoming relationships which relate digital twins together.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<IncomingRelationship>> listIncomingRelationshipsNextSinglePageAsync(String nextLink) {
        return FluxUtil.withContext(context -> service.listIncomingRelationshipsNext(nextLink, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }
}
