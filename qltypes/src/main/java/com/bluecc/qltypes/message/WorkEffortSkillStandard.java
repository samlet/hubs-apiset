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
    double estimatedNumPeople;
    double estimatedDuration;
    CurrencyValue estimatedCost;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    String format;
    FieldCatsValue cats;
    ModelEntity model;
    WorkEffort workEffort;
    @Override
    public String getKey() {
        return id;
    }
}



