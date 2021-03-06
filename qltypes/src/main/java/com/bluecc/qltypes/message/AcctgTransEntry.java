package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AcctgTransEntry implements WithKey{
    String acctgTransId;
    String acctgTransEntrySeqId;
    String acctgTransEntryTypeId;
    String description;
    String voucherRef;
    String partyId;
    String roleTypeId;
    String theirPartyId;
    String productId;
    String theirProductId;
    String inventoryItemId;
    String glAccountTypeId;
    String glAccountId;
    String organizationPartyId;
    CurrencyValue amount;
    String currencyUomId;
    CurrencyValue origAmount;
    String origCurrencyUomId;
    String debitCreditFlag;
    DateValue dueDate;
    String groupId;
    String taxId;
    String reconcileStatusId;
    String settlementTermId;
    String isSummary;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    Party party;
    String proto;
    InventoryItem inventoryItem;
    FieldCatsValue cats;
    String format;
    AcctgTrans acctgTrans;
    @Override
    public String getKey() {
        return id;
    }
}



