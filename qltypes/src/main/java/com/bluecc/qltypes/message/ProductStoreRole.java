package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStoreRole implements WithKey{
    String partyId;
    String roleTypeId;
    String productStoreId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    ProductStore productStore;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    Party party;
    @Override
    public String getKey() {
        return id;
    }
}



