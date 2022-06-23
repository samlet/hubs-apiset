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
    Long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    FieldCatsValue cats;
    ModelEntity model;
    String proto;
    ProductStoreGroup productStoreGroup;
    ProductStore productStore;
    @Override
    public String getKey() {
        return id;
    }
}



