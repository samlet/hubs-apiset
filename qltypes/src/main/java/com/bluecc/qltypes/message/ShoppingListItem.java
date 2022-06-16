package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShoppingListItem implements WithKey{
    String shoppingListId;
    String shoppingListItemSeqId;
    String productId;
    FixedPointValue quantity;
    CurrencyValue modifiedPrice;
    TimestampValue reservStart;
    FixedPointValue reservLength;
    FixedPointValue reservPersons;
    FixedPointValue quantityPurchased;
    String configId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    FieldCatsValue cats;
    String proto;
    String format;
    Product product;
    ShoppingList shoppingList;
    @Override
    public String getKey() {
        return id;
    }
}



