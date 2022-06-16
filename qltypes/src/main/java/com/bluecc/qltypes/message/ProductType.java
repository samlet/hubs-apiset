package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductType implements WithKey{
    String productTypeId;
    String parentTypeId;
    String isPhysical;
    String isDigital;
    String hasTable;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    FieldCatsValue cats;
    String proto;
    String format;
    ModelEntity model;
    @Override
    public String getKey() {
        return productTypeId;
    }
}



