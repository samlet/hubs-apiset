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
    StoreBlueprint addProductStoreFacility;
    StoreBlueprint updateProductStorePaymentSetting;
    StoreBlueprint updateProductStoreCatalog;
    StoreBlueprint addProductStoreKeywordOvrdList;
    StoreBlueprint removeProductStoreRole;
    StoreBlueprint removeProductStorePromoAppl;
    StoreBlueprint addProductStoreCatalog;
    StoreBlueprint addProductStorePaymentSetting;
    StoreBlueprint removeProductStoreCatalog;
    StoreBlueprint addProductStoreKeywordOvrd;
    StoreBlueprint addProductStoreRoleList;
    StoreBlueprint addProductStorePromoAppl;
    StoreBlueprint addProductStorePaymentSettingList;
    StoreBlueprint updateProductStoreEmailSetting;
    StoreBlueprint addProductStoreRole;
    StoreBlueprint updateProductStoreKeywordOvrd;
    StoreBlueprint addProductStoreFacilityList;
    StoreBlueprint removeProductStoreKeywordOvrd;
    StoreBlueprint addProductStoreEmailSettingList;
    StoreBlueprint removeProductStorePaymentSetting;
    StoreBlueprint addProductStoreCatalogList;
    StoreBlueprint addProductStorePromoApplList;
    StoreBlueprint removeProductStoreEmailSetting;
    StoreBlueprint updateProductStoreFacility;
    StoreBlueprint updateProductStorePromoAppl;
    StoreBlueprint updateProductStoreRole;
    StoreBlueprint addProductStoreEmailSetting;
    StoreBlueprint removeProductStoreFacility;
}



