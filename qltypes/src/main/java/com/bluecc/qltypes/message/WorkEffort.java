package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffort implements WithKey{
    String workEffortId;
    String workEffortTypeId;
    String currentStatusId;
    TimestampValue lastStatusUpdate;
    String workEffortPurposeTypeId;
    String workEffortParentId;
    String scopeEnumId;
    Long priority;
    Long percentComplete;
    String workEffortName;
    String showAsEnumId;
    String sendNotificationEmail;
    String description;
    String locationDesc;
    TimestampValue estimatedStartDate;
    TimestampValue estimatedCompletionDate;
    TimestampValue actualStartDate;
    TimestampValue actualCompletionDate;
    Double estimatedMilliSeconds;
    Double estimatedSetupMillis;
    String estimateCalcMethod;
    Double actualMilliSeconds;
    Double actualSetupMillis;
    Double totalMilliSecondsAllowed;
    CurrencyValue totalMoneyAllowed;
    String moneyUomId;
    String specialTerms;
    Long timeTransparency;
    String universalId;
    String sourceReferenceId;
    String fixedAssetId;
    String facilityId;
    String infoUrl;
    String recurrenceInfoId;
    String tempExprId;
    String runtimeDataId;
    String noteId;
    String serviceLoaderName;
    FixedPointValue quantityToProduce;
    FixedPointValue quantityProduced;
    FixedPointValue quantityRejected;
    FixedPointValue reservPersons;
    FixedPointValue reserv2ndPPPerc;
    FixedPointValue reservNthPPPerc;
    String accommodationMapId;
    String accommodationSpotId;
    Long revisionNumber;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    Long sequenceNum;
    String tenantId;
    WorkEffortStatusCollection workEffortStatuses;
    ListItemProtoValue subview;
    Facility facility;
    WorkEffortSkillStandardCollection workEffortSkillStandards;
    WorkEffortAttributeCollection workEffortAttributes;
    TemporalExpression temporalExpression;
    WorkEffortAssocCollection fromWorkEffortAssocs;
    WorkEffortFixedAssetAssignCollection workEffortFixedAssetAssigns;
    ModelEntity model;
    TypesEntity type;
    NoteData noteData;
    FixedAsset fixedAsset;
    String proto;
    WorkEffortPartyAssignmentCollection workEffortPartyAssignments;
    WorkEffort parentWorkEffort;
    FieldCatsValue cats;
    WorkEffortAssocCollection toWorkEffortAssocs;
    String format;
    @Override
    public String getKey() {
        return workEffortId;
    }
}



