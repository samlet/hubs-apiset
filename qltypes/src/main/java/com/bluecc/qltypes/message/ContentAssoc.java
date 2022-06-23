package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ContentAssoc implements WithKey{
    String contentId;
    String contentIdTo;
    String contentAssocTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String contentAssocPredicateId;
    String dataSourceId;
    Long sequenceNum;
    String mapKey;
    Long upperCoordinate;
    Long leftCoordinate;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Content fromContent;
    FieldCatsValue cats;
    ModelEntity model;
    String proto;
    UserLogin lastmodifiedbyuserlogin;
    String format;
    Content toContent;
    UserLogin createdbyuserlogin;
    @Override
    public String getKey() {
        return id;
    }
}



