package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortPartyAssignmentData {
    String workEffortId;
    String partyId;
    String roleTypeId;
    Timestamp fromDate;
    Timestamp thruDate;
    String assignedByUserLoginId;
    String statusId;
    Timestamp statusDateTime;
    String expectationEnumId;
    String delegateReasonEnumId;
    String facilityId;
    String comments;
    String mustRsvp;
    String availabilityStatusId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



