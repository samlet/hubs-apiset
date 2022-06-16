package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProdCatalogCategory implements WithKey{
    String prodCatalogId;
    String productCategoryId;
    String prodCatalogCategoryTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String tenantId;
    ProdCatalog prodCatalog;
    ModelEntity model;
    FieldCatsValue cats;
    ProductCategory productCategory;
    String format;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



