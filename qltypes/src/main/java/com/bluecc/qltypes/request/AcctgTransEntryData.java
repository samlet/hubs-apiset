package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AcctgTransEntryData {
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
    Currency amount;
    String currencyUomId;
    Currency origAmount;
    String origCurrencyUomId;
    String debitCreditFlag;
    Date dueDate;
    String groupId;
    String taxId;
    String reconcileStatusId;
    String settlementTermId;
    String isSummary;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



