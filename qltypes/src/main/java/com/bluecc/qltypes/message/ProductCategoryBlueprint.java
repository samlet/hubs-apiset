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
    ProductCategoryBlueprint modifyProductCategoryType;
    ProductCategoryBlueprint removeCurrentProductCategoryRollup;
    ProductCategoryBlueprint addProductPromoCategoryList;
    ProductCategoryBlueprint updateProductCategoryMember;
    ProductCategoryBlueprint addProductCategoryMemberList;
    ProductCategoryBlueprint removeProductCategoryMember;
    ProductCategoryBlueprint removeProductPromoCategory;
    ProductCategoryBlueprint updateProductPromoCategory;
    ProductCategoryBlueprint addCurrentProductCategoryRollupList;
    ProductCategoryBlueprint addCurrentProductCategoryRollup;
    ProductCategoryBlueprint addProductCategoryMember;
    ProductCategoryBlueprint addProductPromoCategory;
    ProductCategoryBlueprint updateCurrentProductCategoryRollup;
}



