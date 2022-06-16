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
    InvoiceBlueprint updateAcctgTrans;
    InvoiceBlueprint addInvoiceItemList;
    InvoiceBlueprint removeInvoiceStatus;
    InvoiceBlueprint removeAcctgTrans;
    InvoiceBlueprint updateInvoiceItem;
    InvoiceBlueprint addOrderItemBilling;
    InvoiceBlueprint addOrderAdjustmentBilling;
    InvoiceBlueprint addAcctgTrans;
    InvoiceBlueprint addInvoiceStatus;
    InvoiceBlueprint addOrderAdjustmentBillingList;
    InvoiceBlueprint addInvoiceItem;
    InvoiceBlueprint removeOrderAdjustmentBilling;
    InvoiceBlueprint updateInvoiceStatus;
    InvoiceBlueprint updateOrderItemBilling;
    InvoiceBlueprint addInvoiceStatusList;
    InvoiceBlueprint removeInvoiceItem;
    InvoiceBlueprint updateOrderAdjustmentBilling;
    InvoiceBlueprint addOrderItemBillingList;
    InvoiceBlueprint removeOrderItemBilling;
    InvoiceBlueprint modifyInvoiceType;
}



