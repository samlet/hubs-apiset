package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Party implements WithKey{
    String partyId;
    String partyTypeId;
    String externalId;
    String preferredCurrencyUomId;
    String description;
    String statusId;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    String dataSourceId;
    String isUnread;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    AgreementRoleCollection agreementRoles;
    PartyWithPerson asPerson;
    PartyNoteCollection partyNotes;
    PartyWithCorporation asCorporation;
    ListItemProtoValue subview;
    UserLogin createdbyuserlogin;
    ModelEntity model;
    PartyWithPartyGroup asPartyGroup;
    PartyGeoPointCollection partyGeoPoints;
    PartyContactMechPurposeCollection partyContactMechPurposes;
    PartyContactMechCollection partyContactMeches;
    TypesEntity type;
    SupplierProductFeatureCollection supplierProductFeatures;
    PartyRoleCollection partyRoles;
    PartyStatusCollection partyStatuses;
    PartyRelationshipCollection fromPartyRelationships;
    String format;
    ContactMech contactMech;
    FieldCatsValue cats;
    SupplierProductCollection supplierProducts;
    UserLogin lastmodifiedbyuserlogin;
    PartyWithSupplier asSupplier;
    @Override
    public String getKey() {
        return partyId;
    }
}



