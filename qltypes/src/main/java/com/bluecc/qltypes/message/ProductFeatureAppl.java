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
    Long sequenceNum;
    CurrencyValue amount;
    CurrencyValue recurringAmount;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    ProductFeature productFeature;
    FieldCatsValue cats;
    String format;
    Product product;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



