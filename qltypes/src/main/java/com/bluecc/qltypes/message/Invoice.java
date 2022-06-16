package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Invoice implements WithKey{
    String invoiceId;
    String invoiceTypeId;
    String partyIdFrom;
    String partyId;
    String roleTypeId;
    String statusId;
    String billingAccountId;
    String contactMechId;
    TimestampValue invoiceDate;
    TimestampValue dueDate;
    TimestampValue paidDate;
    String invoiceMessage;
    String referenceNumber;
    String description;
    String currencyUomId;
    String recurrenceInfoId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    OrderItemBillingCollection orderItemBillings;
    TypesEntity type;
    ModelEntity model;
    Party party;
    Party fromParty;
    InvoiceItemCollection invoiceItems;
    String proto;
    OrderAdjustmentBillingCollection orderAdjustmentBillings;
    ContactMech contactMech;
    InvoiceStatusCollection invoiceStatuses;
    FieldCatsValue cats;
    BillingAccount billingAccount;
    String format;
    ListItemProtoValue subview;
    @Override
    public String getKey() {
        return invoiceId;
    }
}



