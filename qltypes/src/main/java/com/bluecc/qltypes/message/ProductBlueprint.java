package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    Product entity;
    List<ResponseValue> response;
    ProductBlueprint updateProductPrice;
    ProductBlueprint addProductFeatureApplList;
    ProductBlueprint removeAssocProductAssoc;
    ProductBlueprint addProductFacilityAssoc;
    ProductBlueprint removeProductPrice;
    ProductBlueprint removeMainProductAssoc;
    ProductBlueprint addProductFacility;
    ProductBlueprint addProductKeywordList;
    ProductBlueprint removeProductKeyword;
    ProductBlueprint removeProductFacilityAssoc;
    ProductBlueprint addProductContent;
    ProductBlueprint removeProductPromoProduct;
    ProductBlueprint updateProductContent;
    ProductBlueprint removeProductProductConfig;
    ProductBlueprint removeProductFeatureAppl;
    ProductBlueprint removeProductContent;
    ProductBlueprint addProductFacilityLocationList;
    ProductBlueprint addMainProductAssocList;
    ProductBlueprint addAssocProductAssoc;
    ProductBlueprint addProductProductConfig;
    ProductBlueprint addWorkEffortGoodStandard;
    ProductBlueprint addProductFacilityList;
    ProductBlueprint addAssocProductAssocList;
    ProductBlueprint updateProductFeatureAppl;
    ProductBlueprint addProductPromoProduct;
    ProductBlueprint addProductKeyword;
    ProductBlueprint updateProductFacility;
    ProductBlueprint modifyProductType;
    ProductBlueprint updateProductFacilityLocation;
    ProductBlueprint addWorkEffortGoodStandardList;
    ProductBlueprint updateProductProductConfig;
    ProductBlueprint updateProductFacilityAssoc;
    ProductBlueprint updateWorkEffortGoodStandard;
    ProductBlueprint removeWorkEffortGoodStandard;
    ProductBlueprint addProductPromoProductList;
    ProductBlueprint removeProductFacilityLocation;
    ProductBlueprint addProductPriceList;
    ProductBlueprint addProductFacilityAssocList;
    ProductBlueprint addProductPrice;
    ProductBlueprint addProductFeatureAppl;
    ProductBlueprint addProductFacilityLocation;
    ProductBlueprint updateAssocProductAssoc;
    ProductBlueprint removeProductFacility;
    ProductBlueprint updateMainProductAssoc;
    ProductBlueprint addMainProductAssoc;
    ProductBlueprint addProductProductConfigList;
    ProductBlueprint addProductContentList;
    ProductBlueprint updateProductKeyword;
    ProductBlueprint updateProductPromoProduct;
}



