package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InvoiceItemFlatData {
    String invoiceId;
    String invoiceItemSeqId;
    String invoiceItemTypeId;
    String overrideGlAccountId;
    String overrideOrgPartyId;
    String inventoryItemId;
    String productId;
    String productFeatureId;
    String parentInvoiceId;
    String parentInvoiceItemSeqId;
    String uomId;
    String taxableFlag;
    FixedPoint quantity;
    Currency amount;
    String description;
    String taxAuthPartyId;
    String taxAuthGeoId;
    String taxAuthorityRateSeqId;
    String salesOpportunityId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



