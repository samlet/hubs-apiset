package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortSkillStandard implements WithKey{
    String workEffortId;
    String skillTypeId;
    Double estimatedNumPeople;
    Double estimatedDuration;
    CurrencyValue estimatedCost;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    WorkEffort workEffort;
    String format;
    String proto;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



