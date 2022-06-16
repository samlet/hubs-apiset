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
    FieldCatsValue cats;
    String format;
    Product product;
    Party vendorParty;
    String proto;
    ProductStoreGroup productStoreGroup;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



