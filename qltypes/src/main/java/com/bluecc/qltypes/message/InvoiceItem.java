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
    ProductFeature productFeature;
    String format;
    Product product;
    String proto;
    Party taxAuthorityParty;
    Party overrideOrgParty;
    ModelEntity model;
    InventoryItem inventoryItem;
    FieldCatsValue cats;
    Invoice invoice;
    @Override
    public String getKey() {
        return id;
    }
}



