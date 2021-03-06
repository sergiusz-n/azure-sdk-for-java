/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_10_01.implementation;

import com.microsoft.azure.management.resources.v2019_10_01.TagDetails;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.resources.v2019_10_01.TagCount;
import java.util.ArrayList;
import com.microsoft.azure.management.resources.v2019_10_01.TagValue;
import java.util.List;

class TagDetailsImpl extends WrapperImpl<TagDetailsInner> implements TagDetails {
    private final ResourcesManager manager;

    TagDetailsImpl(TagDetailsInner inner,  ResourcesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ResourcesManager manager() {
        return this.manager;
    }



    @Override
    public TagCount count() {
        return this.inner().count();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String tagName() {
        return this.inner().tagName();
    }

    @Override
    public List<TagValue> values() {
        List<TagValue> lst = new ArrayList<TagValue>();
        if (this.inner().values() != null) {
            for (TagValueInner inner : this.inner().values()) {
                lst.add( new TagValueImpl(inner, manager()));
            }
        }
        return lst;
    }

}
