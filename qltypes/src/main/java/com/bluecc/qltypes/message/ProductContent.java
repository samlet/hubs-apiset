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
    Long useCountLimit;
    Long useTime;
    String useTimeUomId;
    String useRoleTypeId;
    Long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Content content;
    ModelEntity model;
    String proto;
    FieldCatsValue cats;
    String format;
    Product product;
    @Override
    public String getKey() {
        return id;
    }
}



