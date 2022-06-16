package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyRelationshipFlatData {
    String partyIdFrom;
    String partyIdTo;
    String roleTypeIdFrom;
    String roleTypeIdTo;
    Timestamp fromDate;
    Timestamp thruDate;
    String statusId;
    String relationshipName;
    String securityGroupId;
    String priorityTypeId;
    String partyRelationshipTypeId;
    String permissionsEnumId;
    String positionTitle;
    String comments;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



