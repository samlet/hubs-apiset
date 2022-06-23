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
    FacilityBlueprint removeFacilityContactMech;
    FacilityBlueprint updateFacilityContactMechPurpose;
    FacilityBlueprint addFacilityContactMech;
    FacilityBlueprint removeFacilityContactMechPurpose;
    FacilityBlueprint addFacilityContactMechPurposeList;
    FacilityBlueprint modifyFacilityType;
    FacilityBlueprint updateFacilityContactMech;
    FacilityBlueprint addFacilityContactMechList;
    FacilityBlueprint addFacilityContactMechPurpose;
}



