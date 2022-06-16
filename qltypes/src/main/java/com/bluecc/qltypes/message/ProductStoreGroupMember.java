package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStoreGroupMember implements WithKey{
    String productStoreId;
    String productStoreGroupId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    ProductStoreGroup productStoreGroup;
    ProductStore productStore;
    ModelEntity model;
    String proto;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



