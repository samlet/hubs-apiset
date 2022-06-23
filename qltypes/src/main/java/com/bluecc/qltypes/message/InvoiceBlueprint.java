package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InvoiceBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    Invoice entity;
    List<ResponseValue> response;
    InvoiceBlueprint addAcctgTransList;
    InvoiceBlueprint addOrderAdjustmentBilling;
    InvoiceBlueprint addInvoiceStatus;
    InvoiceBlueprint removeInvoiceItem;
    InvoiceBlueprint removeOrderItemBilling;
    InvoiceBlueprint addOrderItemBillingList;
    InvoiceBlueprint addInvoiceItem;
    InvoiceBlueprint addOrderAdjustmentBillingList;
    InvoiceBlueprint removeOrderAdjustmentBilling;
    InvoiceBlueprint addInvoiceItemList;
    InvoiceBlueprint addAcctgTrans;
    InvoiceBlueprint addInvoiceStatusList;
    InvoiceBlueprint updateOrderAdjustmentBilling;
    InvoiceBlueprint updateInvoiceItem;
    InvoiceBlueprint removeInvoiceStatus;
    InvoiceBlueprint updateOrderItemBilling;
    InvoiceBlueprint modifyInvoiceType;
    InvoiceBlueprint addOrderItemBilling;
    InvoiceBlueprint updateAcctgTrans;
    InvoiceBlueprint updateInvoiceStatus;
    InvoiceBlueprint removeAcctgTrans;
}



