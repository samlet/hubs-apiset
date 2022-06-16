package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStoreKeywordOvrd implements WithKey{
    String productStoreId;
    String keyword;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String target;
    String targetTypeEnumId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    ProductStore productStore;
    ModelEntity model;
    String format;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



