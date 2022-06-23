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
    Long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    Party party;
    ProductStore productStore;
    String format;
    ModelEntity model;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



