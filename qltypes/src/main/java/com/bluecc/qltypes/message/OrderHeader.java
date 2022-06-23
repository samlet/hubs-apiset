package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderHeader implements WithKey{
    String orderId;
    String orderTypeId;
    String orderName;
    String externalId;
    String salesChannelEnumId;
    TimestampValue orderDate;
    String priority;
    TimestampValue entryDate;
    TimestampValue pickSheetPrintedDate;
    String visitId;
    String statusId;
    String createdBy;
    String firstAttemptOrderId;
    String currencyUom;
    String syncStatusId;
    String billingAccountId;
    String originFacilityId;
    String webSiteId;
    String productStoreId;
    String agreementId;
    String terminalId;
    String transactionId;
    String autoOrderShoppingListId;
    String needsInventoryIssuance;
    String isRushOrder;
    String internalCode;
    CurrencyValue remainingSubTotal;
    CurrencyValue grandTotal;
    String isViewed;
    String invoicePerShipment;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    OrderItemPriceInfoCollection orderItemPriceInfos;
    ListItemProtoValue subview;
    String format;
    BillingAccount billingAccount;
    OrderContactMechCollection orderContactMeches;
    OrderRoleCollection orderRoles;
    OrderItemShipGroupCollection orderItemShipGroups;
    Facility originFacility;
    TypesEntity type;
    OrderItemShipGroupAssocCollection orderItemShipGroupAssocs;
    OrderWithSalesOrder asSalesOrder;
    UserLogin createdByUserLogin;
    String proto;
    FieldCatsValue cats;
    ProductStore productStore;
    OrderAdjustmentCollection orderAdjustments;
    OrderItemCollection orderItems;
    WorkOrderItemFulfillmentCollection workOrderItemFulfillments;
    OrderHeaderNoteCollection orderHeaderNotes;
    ShoppingList autoOrderShoppingList;
    OrderStatusCollection orderStatuses;
    OrderPaymentPreferenceCollection orderPaymentPreferences;
    ModelEntity model;
    WebSite webSite;
    OrderWithPurchaseOrder asPurchaseOrder;
    @Override
    public String getKey() {
        return orderId;
    }
}



