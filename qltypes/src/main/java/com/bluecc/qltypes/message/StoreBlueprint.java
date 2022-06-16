package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class StoreBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    ProductStore entity;
    List<ResponseValue> response;
    StoreBlueprint addProductStoreEmailSettingList;
    StoreBlueprint addProductStoreRoleList;
    StoreBlueprint updateProductStoreEmailSetting;
    StoreBlueprint updateProductStoreKeywordOvrd;
    StoreBlueprint addProductStoreCatalogList;
    StoreBlueprint updateProductStorePromoAppl;
    StoreBlueprint removeProductStorePromoAppl;
    StoreBlueprint removeProductStoreEmailSetting;
    StoreBlueprint addProductStoreRole;
    StoreBlueprint addProductStoreKeywordOvrd;
    StoreBlueprint addProductStoreFacilityList;
    StoreBlueprint addProductStoreFacility;
    StoreBlueprint addProductStorePromoAppl;
    StoreBlueprint removeProductStoreKeywordOvrd;
    StoreBlueprint updateProductStorePaymentSetting;
    StoreBlueprint addProductStoreEmailSetting;
    StoreBlueprint addProductStorePaymentSettingList;
    StoreBlueprint removeProductStoreCatalog;
    StoreBlueprint removeProductStoreFacility;
    StoreBlueprint updateProductStoreRole;
    StoreBlueprint removeProductStorePaymentSetting;
    StoreBlueprint addProductStoreCatalog;
    StoreBlueprint updateProductStoreCatalog;
    StoreBlueprint removeProductStoreRole;
    StoreBlueprint addProductStoreKeywordOvrdList;
    StoreBlueprint addProductStorePaymentSetting;
    StoreBlueprint addProductStorePromoApplList;
    StoreBlueprint updateProductStoreFacility;
}



