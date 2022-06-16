package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShoppingListBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    ShoppingList entity;
    List<ResponseValue> response;
    ShoppingListBlueprint addShoppingListItem;
    ShoppingListBlueprint removeShoppingListItem;
    ShoppingListBlueprint updateShoppingListItem;
    CurrencyValue grandTotal;
    ShoppingListBlueprint modifyShoppingListType;
    ShoppingListBlueprint addShoppingListItemList;
}



