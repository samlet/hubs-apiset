package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductKeyword implements WithKey{
    String productId;
    String keyword;
    String keywordTypeId;
    long relevancyWeight;
    String statusId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    Product product;
    ModelEntity model;
    String format;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



