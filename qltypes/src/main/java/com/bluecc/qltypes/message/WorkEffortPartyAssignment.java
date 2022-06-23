package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortPartyAssignment implements WithKey{
    String workEffortId;
    String partyId;
    String roleTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String assignedByUserLoginId;
    String statusId;
    TimestampValue statusDateTime;
    String expectationEnumId;
    String delegateReasonEnumId;
    String facilityId;
    String comments;
    String mustRsvp;
    String availabilityStatusId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    Facility facility;
    String proto;
    UserLogin assignedByUserLogin;
    FieldCatsValue cats;
    Party party;
    String format;
    WorkEffort workEffort;
    @Override
    public String getKey() {
        return id;
    }
}



