package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStorePromoAppl implements WithKey{
    String productStoreId;
    String productPromoId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    long sequenceNum;
    String manualOnly;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ProductStore productStore;
    ModelEntity model;
    ProductPromo productPromo;
    FieldCatsValue cats;
    String proto;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



