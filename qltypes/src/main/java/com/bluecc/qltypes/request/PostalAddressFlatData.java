package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PostalAddressFlatData {
    String contactMechId;
    String toName;
    String attnName;
    String address1;
    String address2;
    long houseNumber;
    String houseNumberExt;
    String directions;
    String city;
    String cityGeoId;
    String postalCode;
    String postalCodeExt;
    String countryGeoId;
    String stateProvinceGeoId;
    String countyGeoId;
    String municipalityGeoId;
    String postalCodeGeoId;
    String geoPointId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



