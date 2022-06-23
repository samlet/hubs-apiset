package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShoppingListType implements WithKey{
    String shoppingListTypeId;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    FieldCatsValue cats;
    ModelEntity model;
    String proto;
    @Override
    public String getKey() {
        return shoppingListTypeId;
    }
}



