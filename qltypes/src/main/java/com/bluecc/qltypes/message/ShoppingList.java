package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShoppingList implements WithKey{
    String shoppingListId;
    String shoppingListTypeId;
    String parentShoppingListId;
    String productStoreId;
    String visitorId;
    String partyId;
    String listName;
    String description;
    String isPublic;
    String isActive;
    String currencyUom;
    String shipmentMethodTypeId;
    String carrierPartyId;
    String carrierRoleTypeId;
    String contactMechId;
    String paymentMethodId;
    String recurrenceInfoId;
    TimestampValue lastOrderedDate;
    TimestampValue lastAdminModified;
    String productPromoCodeId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ContactMech contactMech;
    ProductStore productStore;
    TypesEntity type;
    FieldCatsValue cats;
    ModelEntity model;
    String proto;
    ListItemProtoValue subview;
    Party party;
    String format;
    ShoppingList parentShoppingList;
    ShoppingListItemCollection shoppingListItems;
    @Override
    public String getKey() {
        return shoppingListId;
    }
}



