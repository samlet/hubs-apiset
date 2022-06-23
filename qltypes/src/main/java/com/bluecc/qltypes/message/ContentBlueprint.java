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
    ContentBlueprint updateToContentAssoc;
    ContentBlueprint removeContentPurpose;
    ContentBlueprint addToContentAssoc;
    ContentBlueprint removeContentAttribute;
    ContentBlueprint addContentPurpose;
    ContentBlueprint updateContentAttribute;
    ContentBlueprint addContentAttribute;
    ContentBlueprint addToContentAssocList;
    ContentBlueprint addContentPurposeList;
    ContentBlueprint removeToContentAssoc;
    ContentBlueprint updateContentPurpose;
    ContentBlueprint addContentAttributeList;
}



