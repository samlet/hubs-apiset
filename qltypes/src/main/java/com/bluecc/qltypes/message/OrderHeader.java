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
    String format;
    OrderItemShipGroupAssocCollection orderItemShipGroupAssocs;
    UserLogin createdByUserLogin;
    WebSite webSite;
    OrderAdjustmentCollection orderAdjustments;
    WorkOrderItemFulfillmentCollection workOrderItemFulfillments;
    ListItemProtoValue subview;
    BillingAccount billingAccount;
    ProductStore productStore;
    OrderStatusCollection orderStatuses;
    OrderItemShipGroupCollection orderItemShipGroups;
    ModelEntity model;
    String proto;
    OrderItemCollection orderItems;
    OrderContactMechCollection orderContactMeches;
    TypesEntity type;
    FieldCatsValue cats;
    OrderWithSalesOrder asSalesOrder;
    OrderPaymentPreferenceCollection orderPaymentPreferences;
    OrderHeaderNoteCollection orderHeaderNotes;
    Facility originFacility;
    OrderRoleCollection orderRoles;
    ShoppingList autoOrderShoppingList;
    OrderItemPriceInfoCollection orderItemPriceInfos;
    OrderWithPurchaseOrder asPurchaseOrder;
    @Override
    public String getKey() {
        return orderId;
    }
}



