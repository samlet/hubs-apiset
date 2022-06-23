package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderItem implements WithKey{
    String orderId;
    String orderItemSeqId;
    String externalId;
    String orderItemTypeId;
    String orderItemGroupSeqId;
    String isItemGroupPrimary;
    String fromInventoryItemId;
    String budgetId;
    String budgetItemSeqId;
    String productId;
    String supplierProductId;
    String productFeatureId;
    String prodCatalogId;
    String productCategoryId;
    String isPromo;
    String quoteId;
    String quoteItemSeqId;
    String shoppingListId;
    String shoppingListItemSeqId;
    String subscriptionId;
    String deploymentId;
    FixedPointValue quantity;
    FixedPointValue cancelQuantity;
    FixedPointValue selectedAmount;
    CurrencyValue unitPrice;
    CurrencyValue unitListPrice;
    CurrencyValue unitAverageCost;
    CurrencyValue unitRecurringPrice;
    String isModifiedPrice;
    String recurringFreqUomId;
    String itemDescription;
    String comments;
    String correspondingPoId;
    String statusId;
    String syncStatusId;
    TimestampValue estimatedShipDate;
    TimestampValue estimatedDeliveryDate;
    TimestampValue autoCancelDate;
    TimestampValue dontCancelSetDate;
    String dontCancelSetUserLogin;
    TimestampValue shipBeforeDate;
    TimestampValue shipAfterDate;
    TimestampValue reserveAfterDate;
    TimestampValue cancelBackOrderDate;
    String overrideGlAccountId;
    String salesOpportunityId;
    String changeByUserLoginId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String tenantId;
    UserLogin changeByUserLogin;
    ModelEntity model;
    InventoryItem fromInventoryItem;
    UserLogin dontcancelsetuserlogin;
    OrderHeader orderHeader;
    String proto;
    ShoppingList addSuggestionsToShoppingList;
    String format;
    Product product;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



