package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class DataResource implements WithKey{
    String dataResourceId;
    String dataResourceTypeId;
    String dataTemplateTypeId;
    String dataCategoryId;
    String dataSourceId;
    String statusId;
    String dataResourceName;
    String localeString;
    String mimeTypeId;
    String characterSetId;
    String objectInfo;
    String surveyId;
    String surveyResponseId;
    String relatedDetailId;
    String isPublic;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    FieldCatsValue cats;
    TypesEntity type;
    UserLogin createdbyuserlogin;
    String format;
    ListItemProtoValue subview;
    DataResourceWithVideo asVideo;
    UserLogin lastmodifiedbyuserlogin;
    ModelEntity model;
    String proto;
    DataResourceWithAudio asAudio;
    DataResourceWithImage asImage;
    DataResourceWithText asText;
    @Override
    public String getKey() {
        return dataResourceId;
    }
}



