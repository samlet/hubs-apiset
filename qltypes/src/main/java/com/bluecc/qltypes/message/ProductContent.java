package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductContent implements WithKey{
    String productId;
    String contentId;
    String productContentTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    TimestampValue purchaseFromDate;
    TimestampValue purchaseThruDate;
    long useCountLimit;
    long useTime;
    String useTimeUomId;
    String useRoleTypeId;
    long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    ModelEntity model;
    Product product;
    String format;
    FieldCatsValue cats;
    Content content;
    @Override
    public String getKey() {
        return id;
    }
}



