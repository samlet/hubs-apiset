package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductFeature implements WithKey{
    String productFeatureId;
    String productFeatureTypeId;
    String productFeatureCategoryId;
    String description;
    String uomId;
    FixedPointValue numberSpecified;
    CurrencyValue defaultAmount;
    long defaultSequenceNum;
    String abbrev;
    String idCode;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    String proto;
    ProductFeatureCategory productFeatureCategory;
    ListItemProtoValue subview;
    FieldCatsValue cats;
    ModelEntity model;
    TypesEntity type;
    @Override
    public String getKey() {
        return productFeatureId;
    }
}



