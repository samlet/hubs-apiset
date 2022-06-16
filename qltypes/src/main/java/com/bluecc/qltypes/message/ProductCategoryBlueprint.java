package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductCategoryBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    ProductCategory entity;
    List<ResponseValue> response;
    ProductCategoryBlueprint addCurrentProductCategoryRollupList;
    ProductCategoryBlueprint addProductCategoryMember;
    ProductCategoryBlueprint modifyProductCategoryType;
    ProductCategoryBlueprint addProductCategoryMemberList;
    ProductCategoryBlueprint removeProductCategoryMember;
    ProductCategoryBlueprint removeCurrentProductCategoryRollup;
    ProductCategoryBlueprint removeProductPromoCategory;
    ProductCategoryBlueprint updateProductCategoryMember;
    ProductCategoryBlueprint updateProductPromoCategory;
    ProductCategoryBlueprint updateCurrentProductCategoryRollup;
    ProductCategoryBlueprint addCurrentProductCategoryRollup;
    ProductCategoryBlueprint addProductPromoCategoryList;
    ProductCategoryBlueprint addProductPromoCategory;
}



