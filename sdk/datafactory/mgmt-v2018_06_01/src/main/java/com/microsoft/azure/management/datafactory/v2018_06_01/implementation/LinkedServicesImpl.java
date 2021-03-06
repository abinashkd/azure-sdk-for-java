/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.datafactory.v2018_06_01.LinkedServices;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.datafactory.v2018_06_01.LinkedServiceResource;

class LinkedServicesImpl extends WrapperImpl<LinkedServicesInner> implements LinkedServices {
    private final DataFactoryManager manager;

    LinkedServicesImpl(DataFactoryManager manager) {
        super(manager.inner().linkedServices());
        this.manager = manager;
    }

    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public LinkedServiceResourceImpl define(String name) {
        return wrapModel(name);
    }

    private LinkedServiceResourceImpl wrapModel(LinkedServiceResourceInner inner) {
        return  new LinkedServiceResourceImpl(inner, manager());
    }

    private LinkedServiceResourceImpl wrapModel(String name) {
        return new LinkedServiceResourceImpl(name, this.manager());
    }

    @Override
    public Observable<LinkedServiceResource> listByFactoryAsync(final String resourceGroupName, final String factoryName) {
        LinkedServicesInner client = this.inner();
        return client.listByFactoryAsync(resourceGroupName, factoryName)
        .flatMapIterable(new Func1<Page<LinkedServiceResourceInner>, Iterable<LinkedServiceResourceInner>>() {
            @Override
            public Iterable<LinkedServiceResourceInner> call(Page<LinkedServiceResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<LinkedServiceResourceInner, LinkedServiceResource>() {
            @Override
            public LinkedServiceResource call(LinkedServiceResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<LinkedServiceResource> getAsync(String resourceGroupName, String factoryName, String linkedServiceName) {
        LinkedServicesInner client = this.inner();
        return client.getAsync(resourceGroupName, factoryName, linkedServiceName)
        .flatMap(new Func1<LinkedServiceResourceInner, Observable<LinkedServiceResource>>() {
            @Override
            public Observable<LinkedServiceResource> call(LinkedServiceResourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((LinkedServiceResource)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String factoryName, String linkedServiceName) {
        LinkedServicesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, factoryName, linkedServiceName).toCompletable();
    }

}
