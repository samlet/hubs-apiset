package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStoreGroupRole implements WithKey{
    String productStoreGroupId;
    String partyId;
    String roleTypeId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    ProductStoreGroup productStoreGroup;
    String format;
    FieldCatsValue cats;
    Party party;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



