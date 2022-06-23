package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    Party entity;
    List<ResponseValue> response;
    PartyBlueprint updateFromPartyRelationship;
    PartyBlueprint updatePartyRole;
    PartyBlueprint addFromPartyRelationship;
    PartyBlueprint addSupplierProduct;
    PartyBlueprint updateAgreementRole;
    PartyBlueprint addPartyGeoPoint;
    PartyBlueprint addSupplierProductFeature;
    PartyBlueprint addPartyContactMechPurposeList;
    PartyBlueprint removeAgreementRole;
    PartyBlueprint removePartyGeoPoint;
    PartyBlueprint addPartyNote;
    PartyBlueprint addAgreementRoleList;
    PartyBlueprint addPartyStatusList;
    PartyBlueprint updateSupplierProduct;
    PartyBlueprint addPartyContactMech;
    PartyBlueprint updateSupplierProductFeature;
    PartyBlueprint updatePartyContactMechPurpose;
    PartyBlueprint addPartyRole;
    PartyBlueprint modifyPartyGroup;
    PartyBlueprint removePartyNote;
    PartyBlueprint addPartyGeoPointList;
    PartyBlueprint addAgreementRole;
    PartyBlueprint modifyPartyType;
    PartyBlueprint updatePartyStatus;
    PartyBlueprint addSupplierProductList;
    PartyBlueprint addPartyContactMechPurpose;
    PartyBlueprint addSupplierProductFeatureList;
    PartyBlueprint addPartyNoteList;
    PartyBlueprint removeFromPartyRelationship;
    PartyBlueprint removePartyStatus;
    PartyBlueprint removeSupplierProduct;
    PartyBlueprint addFromPartyRelationshipList;
    PartyBlueprint removePartyContactMechPurpose;
    PartyBlueprint modifyPerson;
    PartyBlueprint updatePartyContactMech;
    PartyBlueprint removePartyRole;
    PartyBlueprint updatePartyNote;
    PartyBlueprint removeSupplierProductFeature;
    PartyBlueprint removePartyContactMech;
    PartyBlueprint addPartyRoleList;
    PartyBlueprint addPartyStatus;
    PartyBlueprint updatePartyGeoPoint;
    PartyBlueprint addPartyContactMechList;
}



