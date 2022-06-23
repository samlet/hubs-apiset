package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class VendorProduct implements WithKey{
    String productId;
    String vendorPartyId;
    String productStoreGroupId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    Party vendorParty;
    ModelEntity model;
    FieldCatsValue cats;
    Product product;
    String format;
    ProductStoreGroup productStoreGroup;
    @Override
    public String getKey() {
        return id;
    }
}



