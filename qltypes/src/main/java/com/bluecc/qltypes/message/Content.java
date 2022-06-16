package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Content implements WithKey{
    String contentId;
    String contentTypeId;
    String ownerContentId;
    String decoratorContentId;
    String instanceOfContentId;
    String dataResourceId;
    String templateDataResourceId;
    String dataSourceId;
    String statusId;
    String privilegeEnumId;
    String serviceName;
    String customMethodId;
    String contentName;
    String description;
    String localeString;
    String mimeTypeId;
    String characterSetId;
    long childLeafCount;
    long childBranchCount;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    DataResource templateDataResource;
    FieldCatsValue cats;
    String format;
    ContentAssocCollection toContentAssocs;
    Content decoratorContent;
    Content instanceOfContent;
    ModelEntity model;
    ContentAttributeCollection contentAttributes;
    ListItemProtoValue subview;
    Content ownerContent;
    UserLogin lastmodifiedbyuserlogin;
    DataResource dataResource;
    UserLogin createdbyuserlogin;
    ContentPurposeCollection contentPurposes;
    String proto;
    @Override
    public String getKey() {
        return contentId;
    }
}



