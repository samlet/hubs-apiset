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
    PartyGeoPointCollection partyGeoPoints;
    PartyStatusCollection partyStatuses;
    ContactMech contactMech;
    SupplierProductFeatureCollection supplierProductFeatures;
    UserLogin lastmodifiedbyuserlogin;
    ModelEntity model;
    String proto;
    ListItemProtoValue subview;
    PartyContactMechPurposeCollection partyContactMechPurposes;
    UserLogin createdbyuserlogin;
    PartyRelationshipCollection fromPartyRelationships;
    FieldCatsValue cats;
    PartyWithSupplier asSupplier;
    PartyWithPerson asPerson;
    SupplierProductCollection supplierProducts;
    String format;
    PartyRoleCollection partyRoles;
    PartyContactMechCollection partyContactMeches;
    PartyWithPartyGroup asPartyGroup;
    PartyWithCorporation asCorporation;
    PartyNoteCollection partyNotes;
    TypesEntity type;
    AgreementRoleCollection agreementRoles;
    @Override
    public String getKey() {
        return partyId;
    }
}



