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
    ProductBlueprint addProductContentList;
    ProductBlueprint removeProductFacilityLocation;
    ProductBlueprint removeWorkEffortGoodStandard;
    ProductBlueprint addAssocProductAssocList;
    ProductBlueprint addProductPromoProduct;
    ProductBlueprint updateProductKeyword;
    ProductBlueprint addWorkEffortGoodStandard;
    ProductBlueprint addAssocProductAssoc;
    ProductBlueprint removeProductPromoProduct;
    ProductBlueprint addProductPriceList;
    ProductBlueprint removeProductFacilityAssoc;
    ProductBlueprint updateProductFacility;
    ProductBlueprint addMainProductAssoc;
    ProductBlueprint addMainProductAssocList;
    ProductBlueprint updateProductProductConfig;
    ProductBlueprint addProductKeyword;
    ProductBlueprint addProductFacilityList;
    ProductBlueprint modifyProductType;
    ProductBlueprint updateMainProductAssoc;
    ProductBlueprint removeProductFeatureAppl;
    ProductBlueprint updateProductPrice;
    ProductBlueprint updateProductFeatureAppl;
    ProductBlueprint updateAssocProductAssoc;
    ProductBlueprint addProductFacilityLocation;
    ProductBlueprint addProductPrice;
    ProductBlueprint addProductFacilityLocationList;
    ProductBlueprint addWorkEffortGoodStandardList;
    ProductBlueprint addProductProductConfig;
    ProductBlueprint addProductKeywordList;
    ProductBlueprint updateProductFacilityAssoc;
    ProductBlueprint removeAssocProductAssoc;
    ProductBlueprint addProductFacilityAssoc;
    ProductBlueprint removeProductFacility;
    ProductBlueprint updateProductContent;
    ProductBlueprint addProductFeatureAppl;
    ProductBlueprint updateWorkEffortGoodStandard;
    ProductBlueprint removeMainProductAssoc;
    ProductBlueprint removeProductProductConfig;
    ProductBlueprint addProductFacility;
    ProductBlueprint removeProductKeyword;
    ProductBlueprint removeProductContent;
    ProductBlueprint updateProductFacilityLocation;
    ProductBlueprint addProductFeatureApplList;
    ProductBlueprint addProductPromoProductList;
    ProductBlueprint addProductFacilityAssocList;
    ProductBlueprint updateProductPromoProduct;
    ProductBlueprint removeProductPrice;
    ProductBlueprint addProductContent;
    ProductBlueprint addProductProductConfigList;
}



