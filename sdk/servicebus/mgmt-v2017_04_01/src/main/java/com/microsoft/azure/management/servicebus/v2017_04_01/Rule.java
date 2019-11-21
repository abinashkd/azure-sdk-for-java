/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.servicebus.v2017_04_01.implementation.RuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.servicebus.v2017_04_01.implementation.ServiceBusManager;

/**
 * Type representing Rule.
 */
public interface Rule extends HasInner<RuleInner>, Indexable, Refreshable<Rule>, Updatable<Rule.Update>, HasManager<ServiceBusManager> {
    /**
     * @return the action value.
     */
    Action action();

    /**
     * @return the correlationFilter value.
     */
    CorrelationFilter correlationFilter();

    /**
     * @return the filterType value.
     */
    FilterType filterType();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the sqlFilter value.
     */
    SqlFilter sqlFilter();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Rule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSubscription, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Rule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Rule definition.
         */
        interface Blank extends WithSubscription {
        }

        /**
         * The stage of the rule definition allowing to specify Subscription.
         */
        interface WithSubscription {
           /**
            * Specifies resourceGroupName, namespaceName, topicName, subscriptionName.
            * @param resourceGroupName Name of the Resource group within the Azure subscription
            * @param namespaceName The namespace name
            * @param topicName The topic name
            * @param subscriptionName The subscription name
            * @return the next definition stage
            */
            WithCreate withExistingSubscription(String resourceGroupName, String namespaceName, String topicName, String subscriptionName);
        }

        /**
         * The stage of the rule definition allowing to specify Action.
         */
        interface WithAction {
            /**
             * Specifies action.
             * @param action Represents the filter actions which are allowed for the transformation of a message that have been matched by a filter expression
             * @return the next definition stage
             */
            WithCreate withAction(Action action);
        }

        /**
         * The stage of the rule definition allowing to specify CorrelationFilter.
         */
        interface WithCorrelationFilter {
            /**
             * Specifies correlationFilter.
             * @param correlationFilter Properties of correlationFilter
             * @return the next definition stage
             */
            WithCreate withCorrelationFilter(CorrelationFilter correlationFilter);
        }

        /**
         * The stage of the rule definition allowing to specify FilterType.
         */
        interface WithFilterType {
            /**
             * Specifies filterType.
             * @param filterType Filter type that is evaluated against a BrokeredMessage. Possible values include: 'SqlFilter', 'CorrelationFilter'
             * @return the next definition stage
             */
            WithCreate withFilterType(FilterType filterType);
        }

        /**
         * The stage of the rule definition allowing to specify SqlFilter.
         */
        interface WithSqlFilter {
            /**
             * Specifies sqlFilter.
             * @param sqlFilter Properties of sqlFilter
             * @return the next definition stage
             */
            WithCreate withSqlFilter(SqlFilter sqlFilter);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Rule>, DefinitionStages.WithAction, DefinitionStages.WithCorrelationFilter, DefinitionStages.WithFilterType, DefinitionStages.WithSqlFilter {
        }
    }
    /**
     * The template for a Rule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Rule>, UpdateStages.WithAction, UpdateStages.WithCorrelationFilter, UpdateStages.WithFilterType, UpdateStages.WithSqlFilter {
    }

    /**
     * Grouping of Rule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the rule update allowing to specify Action.
         */
        interface WithAction {
            /**
             * Specifies action.
             * @param action Represents the filter actions which are allowed for the transformation of a message that have been matched by a filter expression
             * @return the next update stage
             */
            Update withAction(Action action);
        }

        /**
         * The stage of the rule update allowing to specify CorrelationFilter.
         */
        interface WithCorrelationFilter {
            /**
             * Specifies correlationFilter.
             * @param correlationFilter Properties of correlationFilter
             * @return the next update stage
             */
            Update withCorrelationFilter(CorrelationFilter correlationFilter);
        }

        /**
         * The stage of the rule update allowing to specify FilterType.
         */
        interface WithFilterType {
            /**
             * Specifies filterType.
             * @param filterType Filter type that is evaluated against a BrokeredMessage. Possible values include: 'SqlFilter', 'CorrelationFilter'
             * @return the next update stage
             */
            Update withFilterType(FilterType filterType);
        }

        /**
         * The stage of the rule update allowing to specify SqlFilter.
         */
        interface WithSqlFilter {
            /**
             * Specifies sqlFilter.
             * @param sqlFilter Properties of sqlFilter
             * @return the next update stage
             */
            Update withSqlFilter(SqlFilter sqlFilter);
        }

    }
}