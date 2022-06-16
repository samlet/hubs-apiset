package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FacilityBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    Facility entity;
    List<ResponseValue> response;
    FacilityBlueprint removeFacilityContactMechPurpose;
    FacilityBlueprint addFacilityContactMechList;
    FacilityBlueprint modifyFacilityType;
    FacilityBlueprint addFacilityContactMech;
    FacilityBlueprint addFacilityContactMechPurpose;
    FacilityBlueprint removeFacilityContactMech;
    FacilityBlueprint addFacilityContactMechPurposeList;
    FacilityBlueprint updateFacilityContactMechPurpose;
    FacilityBlueprint updateFacilityContactMech;
}



