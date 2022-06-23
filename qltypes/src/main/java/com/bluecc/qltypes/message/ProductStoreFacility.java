package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStoreFacility implements WithKey{
    String productStoreId;
    String facilityId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    Long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String tenantId;
    ModelEntity model;
    String format;
    FieldCatsValue cats;
    Facility facility;
    String proto;
    ProductStore productStore;
    @Override
    public String getKey() {
        return id;
    }
}



