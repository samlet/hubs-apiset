package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AcctgTrans implements WithKey{
    String acctgTransId;
    String acctgTransTypeId;
    String description;
    TimestampValue transactionDate;
    String isPosted;
    TimestampValue postedDate;
    TimestampValue scheduledPostingDate;
    String glJournalId;
    String glFiscalTypeId;
    String voucherRef;
    TimestampValue voucherDate;
    String groupStatusId;
    String fixedAssetId;
    String inventoryItemId;
    String physicalInventoryId;
    String partyId;
    String roleTypeId;
    String invoiceId;
    String paymentId;
    String finAccountTransId;
    String shipmentId;
    String receiptId;
    String workEffortId;
    String theirAcctgTransId;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ListItemProtoValue subview;
    AcctgTransEntryCollection acctgTransEntries;
    @Override
    public String getKey() {
        return acctgTransId;
    }
}



