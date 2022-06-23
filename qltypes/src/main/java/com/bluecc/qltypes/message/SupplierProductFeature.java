package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class SupplierProductFeature implements WithKey{
    String partyId;
    String productFeatureId;
    String description;
    String uomId;
    String idCode;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    Party party;
    String format;
    ProductFeature productFeature;
    FieldCatsValue cats;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



