package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class RecurrenceInfoFlatData {
    String recurrenceInfoId;
    Timestamp startDateTime;
    String exceptionDateTimes;
    String recurrenceDateTimes;
    String exceptionRuleId;
    String recurrenceRuleId;
    Long recurrenceCount;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



