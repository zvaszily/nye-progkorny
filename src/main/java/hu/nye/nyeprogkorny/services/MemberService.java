package hu.nye.nyeprogkorny.services;

import hu.nye.nyeprogkorny.model.domain.FamilyMember;
import java.util.List;

/**
 * Service interface for FamilyMember.
 */
public interface MemberService {

  List<FamilyMember> getMembers();

  FamilyMember saveFamilyMember(FamilyMember familyMember);

  FamilyMember getFamilyMember(Long id);

  void deleteFamilyMemberById(Long id);

}
