package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductFeatureAppl implements WithKey{
    String productId;
    String productFeatureId;
    String productFeatureApplTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    long sequenceNum;
    CurrencyValue amount;
    CurrencyValue recurringAmount;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    String proto;
    Product product;
    ProductFeature productFeature;
    String format;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



