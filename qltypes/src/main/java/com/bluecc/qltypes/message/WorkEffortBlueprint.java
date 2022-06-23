package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    WorkEffort entity;
    List<ResponseValue> response;
    WorkEffortBlueprint addWorkEffortFixedAssetAssignList;
    WorkEffortBlueprint updateWorkEffortAttribute;
    WorkEffortBlueprint updateWorkEffortPartyAssignment;
    WorkEffortBlueprint updateWorkEffortSkillStandard;
    WorkEffortBlueprint updateWorkEffortStatus;
    WorkEffortBlueprint modifyRecurrenceInfo;
    WorkEffortBlueprint addWorkEffortFixedAssetAssign;
    WorkEffortBlueprint addWorkEffortStatus;
    WorkEffortBlueprint removeToWorkEffortAssoc;
    WorkEffortBlueprint addFromWorkEffortAssocList;
    WorkEffortBlueprint addWorkEffortSkillStandard;
    WorkEffortBlueprint addFromWorkEffortAssoc;
    WorkEffortBlueprint updateFromWorkEffortAssoc;
    WorkEffortBlueprint removeWorkEffortFixedAssetAssign;
    WorkEffortBlueprint addToWorkEffortAssoc;
    WorkEffortBlueprint modifyWorkEffortType;
    WorkEffortBlueprint removeWorkEffortStatus;
    WorkEffortBlueprint removeWorkEffortSkillStandard;
    WorkEffortBlueprint updateToWorkEffortAssoc;
    WorkEffortBlueprint addWorkEffortAttribute;
    WorkEffortBlueprint removeFromWorkEffortAssoc;
    WorkEffortBlueprint addWorkEffortStatusList;
    WorkEffortBlueprint addToWorkEffortAssocList;
    WorkEffortBlueprint addWorkEffortAttributeList;
    WorkEffortBlueprint removeWorkEffortAttribute;
    WorkEffortBlueprint addWorkEffortSkillStandardList;
    WorkEffortBlueprint updateWorkEffortFixedAssetAssign;
    WorkEffortBlueprint addWorkEffortPartyAssignment;
    WorkEffortBlueprint modifyRuntimeData;
    WorkEffortBlueprint removeWorkEffortPartyAssignment;
    WorkEffortBlueprint addWorkEffortPartyAssignmentList;
}



