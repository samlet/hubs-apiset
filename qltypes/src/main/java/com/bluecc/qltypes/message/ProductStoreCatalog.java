package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStoreCatalog implements WithKey{
    String productStoreId;
    String prodCatalogId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String tenantId;
    ProdCatalog prodCatalog;
    ModelEntity model;
    ProductStore productStore;
    String proto;
    String format;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



