package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductFeatureCategory implements WithKey{
    String productFeatureCategoryId;
    String parentCategoryId;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ProductFeatureCategory parentProductFeatureCategory;
    ModelEntity model;
    String proto;
    String format;
    ListItemProtoValue subview;
    ProductFeatureCategoryCollection childProductFeatureCategories;
    FieldCatsValue cats;
    ProductFeatureCollection productFeatures;
    @Override
    public String getKey() {
        return productFeatureCategoryId;
    }
}



