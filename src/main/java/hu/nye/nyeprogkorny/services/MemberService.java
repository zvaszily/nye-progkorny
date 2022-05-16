package hu.nye.nyeprogkorny.services;

import hu.nye.nyeprogkorny.model.domain.FamilyMember;

import java.util.List;
import java.util.Set;

public interface MemberService {
    //Set<FamilyMember> getMembers();
    List<FamilyMember> getMembers();

    FamilyMember saveFamilyMember(FamilyMember familyMember);

    FamilyMember getFamilyMember(Long id);

}
