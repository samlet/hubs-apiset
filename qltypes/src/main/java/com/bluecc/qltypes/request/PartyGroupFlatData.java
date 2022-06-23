package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyGroupFlatData {
    String partyId;
    String groupName;
    String groupNameLocal;
    String officeSiteName;
    Currency annualRevenue;
    Long numEmployees;
    String tickerSymbol;
    String comments;
    String logoImageUrl;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



