package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyContactMechData {
    String partyId;
    String contactMechId;
    Timestamp fromDate;
    Timestamp thruDate;
    String roleTypeId;
    String allowSolicitation;
    String extension;
    String verified;
    String comments;
    Long yearsWithContactMech;
    Long monthsWithContactMech;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



