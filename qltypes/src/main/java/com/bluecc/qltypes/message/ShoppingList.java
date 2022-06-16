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
    ListItemProtoValue subview;
    FieldCatsValue cats;
    ShoppingList parentShoppingList;
    ContactMech contactMech;
    ModelEntity model;
    TypesEntity type;
    String format;
    Party party;
    ShoppingListItemCollection shoppingListItems;
    ProductStore productStore;
    String proto;
    @Override
    public String getKey() {
        return shoppingListId;
    }
}



