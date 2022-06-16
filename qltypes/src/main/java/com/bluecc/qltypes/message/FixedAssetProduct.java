package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FixedAssetProduct implements WithKey{
    String fixedAssetId;
    String productId;
    String fixedAssetProductTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String comments;
    long sequenceNum;
    FixedPointValue quantity;
    String quantityUomId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    Product product;
    FixedAsset fixedAsset;
    String format;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



