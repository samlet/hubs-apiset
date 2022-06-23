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
    Party party;
    InvoiceItemCollection invoiceItems;
    TypesEntity type;
    String format;
    String proto;
    InvoiceStatusCollection invoiceStatuses;
    ListItemProtoValue subview;
    ContactMech contactMech;
    FieldCatsValue cats;
    OrderAdjustmentBillingCollection orderAdjustmentBillings;
    ModelEntity model;
    Party fromParty;
    BillingAccount billingAccount;
    OrderItemBillingCollection orderItemBillings;
    @Override
    public String getKey() {
        return invoiceId;
    }
}



