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
    Long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String tenantId;
    FieldCatsValue cats;
    String proto;
    ProductStore productStore;
    String format;
    ProdCatalog prodCatalog;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



