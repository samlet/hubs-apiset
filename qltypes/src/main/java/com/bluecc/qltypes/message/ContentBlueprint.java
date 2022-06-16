package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ContentBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    Content entity;
    List<ResponseValue> response;
    ContentBlueprint addContentPurpose;
    ContentBlueprint addToContentAssoc;
    ContentBlueprint addContentAttributeList;
    ContentBlueprint removeToContentAssoc;
    ContentBlueprint updateContentPurpose;
    ContentBlueprint removeContentAttribute;
    ContentBlueprint updateToContentAssoc;
    ContentBlueprint updateContentAttribute;
    ContentBlueprint addToContentAssocList;
    ContentBlueprint addContentPurposeList;
    ContentBlueprint removeContentPurpose;
    ContentBlueprint addContentAttribute;
}



