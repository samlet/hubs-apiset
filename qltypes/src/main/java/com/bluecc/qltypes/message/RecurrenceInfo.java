package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class RecurrenceInfo implements WithKey{
    String recurrenceInfoId;
    TimestampValue startDateTime;
    String exceptionDateTimes;
    String recurrenceDateTimes;
    String exceptionRuleId;
    String recurrenceRuleId;
    Long recurrenceCount;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    String proto;
    FieldCatsValue cats;
    ModelEntity model;
    @Override
    public String getKey() {
        return recurrenceInfoId;
    }
}



