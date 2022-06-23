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
    Long relevancyWeight;
    String statusId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Product product;
    FieldCatsValue cats;
    ModelEntity model;
    String proto;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



