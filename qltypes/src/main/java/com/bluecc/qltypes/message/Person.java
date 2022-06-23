package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Person implements WithKey{
    String partyId;
    String salutation;
    String firstName;
    String middleName;
    String lastName;
    String personalTitle;
    String suffix;
    String nickname;
    String firstNameLocal;
    String middleNameLocal;
    String lastNameLocal;
    String otherLocal;
    String memberId;
    String gender;
    DateValue birthDate;
    DateValue deceasedDate;
    Double height;
    Double weight;
    String mothersMaidenName;
    String maritalStatusEnumId;
    String socialSecurityNumber;
    String passportNumber;
    DateValue passportExpireDate;
    Double totalYearsWorkExperience;
    String comments;
    String employmentStatusEnumId;
    String residenceStatusEnumId;
    String occupation;
    Long yearsWithEmployer;
    Long monthsWithEmployer;
    String existingCustomer;
    String cardId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    FieldCatsValue cats;
    String format;
    ModelEntity model;
    Party party;
    @Override
    public String getKey() {
        return partyId;
    }
}



