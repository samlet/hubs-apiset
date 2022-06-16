package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStoreGroup implements WithKey{
    String productStoreGroupId;
    String productStoreGroupTypeId;
    String primaryParentGroupId;
    String productStoreGroupName;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ProductStoreCollection primaryProductStores;
    ProductStoreGroupRoleCollection productStoreGroupRoles;
    ProductStoreGroup primaryParentProductStoreGroup;
    String proto;
    ProductStoreGroupMemberCollection productStoreGroupMembers;
    FieldCatsValue cats;
    TypesEntity type;
    ModelEntity model;
    ListItemProtoValue subview;
    VendorProductCollection vendorProducts;
    String format;
    @Override
    public String getKey() {
        return productStoreGroupId;
    }
}



