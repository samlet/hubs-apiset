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
    Party party;
    ModelEntity model;
    String proto;
    ProductStoreGroup productStoreGroup;
    FieldCatsValue cats;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



