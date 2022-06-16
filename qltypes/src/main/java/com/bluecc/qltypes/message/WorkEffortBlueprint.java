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
    WorkEffortBlueprint addWorkEffortSkillStandard;
    WorkEffortBlueprint addToWorkEffortAssocList;
    WorkEffortBlueprint updateWorkEffortSkillStandard;
    WorkEffortBlueprint addWorkEffortFixedAssetAssignList;
    WorkEffortBlueprint removeToWorkEffortAssoc;
    WorkEffortBlueprint addWorkEffortFixedAssetAssign;
    WorkEffortBlueprint updateFromWorkEffortAssoc;
    WorkEffortBlueprint modifyWorkEffortType;
    WorkEffortBlueprint removeWorkEffortFixedAssetAssign;
    WorkEffortBlueprint updateWorkEffortPartyAssignment;
    WorkEffortBlueprint updateWorkEffortFixedAssetAssign;
    WorkEffortBlueprint removeWorkEffortSkillStandard;
    WorkEffortBlueprint removeWorkEffortStatus;
    WorkEffortBlueprint addWorkEffortPartyAssignment;
    WorkEffortBlueprint updateWorkEffortStatus;
    WorkEffortBlueprint removeFromWorkEffortAssoc;
    WorkEffortBlueprint addWorkEffortSkillStandardList;
    WorkEffortBlueprint addWorkEffortStatus;
    WorkEffortBlueprint addFromWorkEffortAssoc;
    WorkEffortBlueprint updateToWorkEffortAssoc;
    WorkEffortBlueprint addWorkEffortStatusList;
    WorkEffortBlueprint addWorkEffortPartyAssignmentList;
    WorkEffortBlueprint addFromWorkEffortAssocList;
    WorkEffortBlueprint removeWorkEffortPartyAssignment;
    WorkEffortBlueprint addToWorkEffortAssoc;
}



