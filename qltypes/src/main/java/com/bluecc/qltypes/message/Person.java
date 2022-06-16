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
    double height;
    double weight;
    String mothersMaidenName;
    String maritalStatusEnumId;
    String socialSecurityNumber;
    String passportNumber;
    DateValue passportExpireDate;
    double totalYearsWorkExperience;
    String comments;
    String employmentStatusEnumId;
    String residenceStatusEnumId;
    String occupation;
    long yearsWithEmployer;
    long monthsWithEmployer;
    String existingCustomer;
    String cardId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    String format;
    ModelEntity model;
    Party party;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return partyId;
    }
}



