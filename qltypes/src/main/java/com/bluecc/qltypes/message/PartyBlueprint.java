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
    PartyBlueprint addPartyNoteList;
    PartyBlueprint removeSupplierProduct;
    PartyBlueprint updateSupplierProduct;
    PartyBlueprint addAgreementRoleList;
    PartyBlueprint removePartyContactMech;
    PartyBlueprint updatePartyNote;
    PartyBlueprint addPartyContactMechPurpose;
    PartyBlueprint addSupplierProduct;
    PartyBlueprint addAgreementRole;
    PartyBlueprint removePartyNote;
    PartyBlueprint addPartyStatus;
    PartyBlueprint addPartyRoleList;
    PartyBlueprint addSupplierProductFeature;
    PartyBlueprint removePartyRole;
    PartyBlueprint updatePartyContactMech;
    PartyBlueprint addPartyGeoPointList;
    PartyBlueprint updateFromPartyRelationship;
    PartyBlueprint addSupplierProductFeatureList;
    PartyBlueprint addSupplierProductList;
    PartyBlueprint addPartyStatusList;
    PartyBlueprint addFromPartyRelationshipList;
    PartyBlueprint updateAgreementRole;
    PartyBlueprint modifyPartyType;
    PartyBlueprint addPartyContactMechList;
    PartyBlueprint addPartyRole;
    PartyBlueprint addPartyGeoPoint;
    PartyBlueprint updatePartyStatus;
    PartyBlueprint removePartyStatus;
    PartyBlueprint removePartyContactMechPurpose;
    PartyBlueprint modifyPerson;
    PartyBlueprint addPartyNote;
    PartyBlueprint addPartyContactMech;
    PartyBlueprint removeSupplierProductFeature;
    PartyBlueprint updatePartyContactMechPurpose;
    PartyBlueprint removeFromPartyRelationship;
    PartyBlueprint updatePartyRole;
    PartyBlueprint addPartyContactMechPurposeList;
    PartyBlueprint removeAgreementRole;
    PartyBlueprint modifyPartyGroup;
    PartyBlueprint updateSupplierProductFeature;
    PartyBlueprint addFromPartyRelationship;
    PartyBlueprint removePartyGeoPoint;
    PartyBlueprint updatePartyGeoPoint;
}



