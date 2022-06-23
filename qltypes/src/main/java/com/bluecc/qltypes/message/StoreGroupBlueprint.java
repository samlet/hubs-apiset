package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class StoreGroupBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    ProductStoreGroup entity;
    List<ResponseValue> response;
    StoreGroupBlueprint addProductStoreGroupRoleList;
    StoreGroupBlueprint modifyProductStoreGroupType;
    StoreGroupBlueprint updateProductStoreGroupMember;
    StoreGroupBlueprint updateProductStoreGroupRole;
    StoreGroupBlueprint addProductStoreGroupMemberList;
    StoreGroupBlueprint addProductStoreGroupRole;
    StoreGroupBlueprint removeProductStoreGroupMember;
    StoreGroupBlueprint addProductStoreGroupMember;
    StoreGroupBlueprint addVendorProduct;
    StoreGroupBlueprint removeProductStoreGroupRole;
    StoreGroupBlueprint removeVendorProduct;
    StoreGroupBlueprint addVendorProductList;
    StoreGroupBlueprint updateVendorProduct;
}



