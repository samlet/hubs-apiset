package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyRelationship implements WithKey{
    String partyIdFrom;
    String partyIdTo;
    String roleTypeIdFrom;
    String roleTypeIdTo;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String statusId;
    String relationshipName;
    String securityGroupId;
    String priorityTypeId;
    String partyRelationshipTypeId;
    String permissionsEnumId;
    String positionTitle;
    String comments;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String tenantId;
    SecurityGroup securityGroup;
    FieldCatsValue cats;
    String proto;
    ModelEntity model;
    String format;
    Party fromParty;
    Party toParty;
    @Override
    public String getKey() {
        return id;
    }
}



