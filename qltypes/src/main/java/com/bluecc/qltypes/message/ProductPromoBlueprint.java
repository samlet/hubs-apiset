package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductPromoBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    ProductPromo entity;
    List<ResponseValue> response;
    ProductPromoBlueprint addProductPromoAction;
    ProductPromoBlueprint addProductPromoActionList;
    ProductPromoBlueprint updateProductPromoRule;
    ProductPromoBlueprint updateProductPromoAction;
    ProductPromoBlueprint removeProductPromoAction;
    ProductPromoBlueprint removeProductPromoRule;
    ProductPromoBlueprint addProductPromoRuleList;
    ProductPromoBlueprint addProductPromoRule;
}



