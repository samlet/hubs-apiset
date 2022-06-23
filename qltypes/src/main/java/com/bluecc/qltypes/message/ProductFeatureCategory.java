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
    FieldCatsValue cats;
    ModelEntity model;
    String proto;
    ProductFeatureCategory parentProductFeatureCategory;
    ProductFeatureCategoryCollection childProductFeatureCategories;
    String format;
    ProductFeatureCollection productFeatures;
    ListItemProtoValue subview;
    @Override
    public String getKey() {
        return productFeatureCategoryId;
    }
}



