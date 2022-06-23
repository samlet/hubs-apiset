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
    ShoppingListBlueprint updateShoppingListItem;
    ShoppingListBlueprint modifyShoppingListType;
    ShoppingListBlueprint addShoppingListItem;
    CurrencyValue grandTotal;
    ShoppingListBlueprint removeShoppingListItem;
    ShoppingListBlueprint addShoppingListItemList;
}



