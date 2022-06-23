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
    Long childLeafCount;
    Long childBranchCount;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ContentAttributeCollection contentAttributes;
    ModelEntity model;
    FieldCatsValue cats;
    String proto;
    ContentPurposeCollection contentPurposes;
    String format;
    UserLogin lastmodifiedbyuserlogin;
    Content instanceOfContent;
    UserLogin createdbyuserlogin;
    ListItemProtoValue subview;
    DataResource dataResource;
    Content ownerContent;
    Content decoratorContent;
    ContentAssocCollection toContentAssocs;
    DataResource templateDataResource;
    @Override
    public String getKey() {
        return contentId;
    }
}



