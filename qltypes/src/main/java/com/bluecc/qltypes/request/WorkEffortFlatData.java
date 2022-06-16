package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortFlatData {
    String workEffortId;
    String workEffortTypeId;
    String currentStatusId;
    Timestamp lastStatusUpdate;
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
    Timestamp estimatedStartDate;
    Timestamp estimatedCompletionDate;
    Timestamp actualStartDate;
    Timestamp actualCompletionDate;
    double estimatedMilliSeconds;
    double estimatedSetupMillis;
    String estimateCalcMethod;
    double actualMilliSeconds;
    double actualSetupMillis;
    double totalMilliSecondsAllowed;
    Currency totalMoneyAllowed;
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
    FixedPoint quantityToProduce;
    FixedPoint quantityProduced;
    FixedPoint quantityRejected;
    FixedPoint reservPersons;
    FixedPoint reserv2ndPPPerc;
    FixedPoint reservNthPPPerc;
    String accommodationMapId;
    String accommodationSpotId;
    long revisionNumber;
    Timestamp createdDate;
    String createdByUserLogin;
    Timestamp lastModifiedDate;
    String lastModifiedByUserLogin;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    long sequenceNum;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



