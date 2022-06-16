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
    long sequenceNum;
    String mapKey;
    long upperCoordinate;
    long leftCoordinate;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    Content toContent;
    FieldCatsValue cats;
    Content fromContent;
    UserLogin lastmodifiedbyuserlogin;
    UserLogin createdbyuserlogin;
    String format;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



