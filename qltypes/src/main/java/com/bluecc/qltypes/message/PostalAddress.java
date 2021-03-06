package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PostalAddress implements WithKey{
    String contactMechId;
    String toName;
    String attnName;
    String address1;
    String address2;
    Long houseNumber;
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
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    ModelEntity model;
    ContactMech contactMech;
    String proto;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return contactMechId;
    }
}



