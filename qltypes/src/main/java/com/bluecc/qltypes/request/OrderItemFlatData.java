package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderItemFlatData {
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
    FixedPoint quantity;
    FixedPoint cancelQuantity;
    FixedPoint selectedAmount;
    Currency unitPrice;
    Currency unitListPrice;
    Currency unitAverageCost;
    Currency unitRecurringPrice;
    String isModifiedPrice;
    String recurringFreqUomId;
    String itemDescription;
    String comments;
    String correspondingPoId;
    String statusId;
    String syncStatusId;
    Timestamp estimatedShipDate;
    Timestamp estimatedDeliveryDate;
    Timestamp autoCancelDate;
    Timestamp dontCancelSetDate;
    String dontCancelSetUserLogin;
    Timestamp shipBeforeDate;
    Timestamp shipAfterDate;
    Timestamp reserveAfterDate;
    Timestamp cancelBackOrderDate;
    String overrideGlAccountId;
    String salesOpportunityId;
    String changeByUserLoginId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



