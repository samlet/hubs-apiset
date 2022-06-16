package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AcctgTransFlatData {
    String acctgTransId;
    String acctgTransTypeId;
    String description;
    Timestamp transactionDate;
    String isPosted;
    Timestamp postedDate;
    Timestamp scheduledPostingDate;
    String glJournalId;
    String glFiscalTypeId;
    String voucherRef;
    Timestamp voucherDate;
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
    Timestamp createdDate;
    String createdByUserLogin;
    Timestamp lastModifiedDate;
    String lastModifiedByUserLogin;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



