package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderHeaderFlatData {
    String orderId;
    String orderTypeId;
    String orderName;
    String externalId;
    String salesChannelEnumId;
    Timestamp orderDate;
    String priority;
    Timestamp entryDate;
    Timestamp pickSheetPrintedDate;
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
    Currency remainingSubTotal;
    Currency grandTotal;
    String isViewed;
    String invoicePerShipment;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



