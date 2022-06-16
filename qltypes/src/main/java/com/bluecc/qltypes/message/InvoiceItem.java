package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InvoiceItem implements WithKey{
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
    FixedPointValue quantity;
    CurrencyValue amount;
    String description;
    String taxAuthPartyId;
    String taxAuthGeoId;
    String taxAuthorityRateSeqId;
    String salesOpportunityId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String tenantId;
    String proto;
    FieldCatsValue cats;
    ProductFeature productFeature;
    Invoice invoice;
    Party taxAuthorityParty;
    Product product;
    ModelEntity model;
    InventoryItem inventoryItem;
    Party overrideOrgParty;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



