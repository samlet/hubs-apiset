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
    long priority;
    long percentComplete;
    String workEffortName;
    String showAsEnumId;
    String sendNotificationEmail;
    String description;
    String locationDesc;
    TimestampValue estimatedStartDate;
    TimestampValue estimatedCompletionDate;
    TimestampValue actualStartDate;
    TimestampValue actualCompletionDate;
    double estimatedMilliSeconds;
    double estimatedSetupMillis;
    String estimateCalcMethod;
    double actualMilliSeconds;
    double actualSetupMillis;
    double totalMilliSecondsAllowed;
    CurrencyValue totalMoneyAllowed;
    String moneyUomId;
    String specialTerms;
    long timeTransparency;
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
    long revisionNumber;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    long sequenceNum;
    String tenantId;
    String format;
    WorkEffortSkillStandardCollection workEffortSkillStandards;
    WorkEffortAssocCollection fromWorkEffortAssocs;
    WorkEffortFixedAssetAssignCollection workEffortFixedAssetAssigns;
    WorkEffort parentWorkEffort;
    Facility facility;
    TemporalExpression temporalExpression;
    ModelEntity model;
    NoteData noteData;
    ListItemProtoValue subview;
    String proto;
    TypesEntity type;
    WorkEffortStatusCollection workEffortStatuses;
    FieldCatsValue cats;
    FixedAsset fixedAsset;
    WorkEffortPartyAssignmentCollection workEffortPartyAssignments;
    WorkEffortAssocCollection toWorkEffortAssocs;
    @Override
    public String getKey() {
        return workEffortId;
    }
}



