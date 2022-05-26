package hu.nye.nyeprogkorny.services;

import hu.nye.nyeprogkorny.model.domain.FamilyMember;
import hu.nye.nyeprogkorny.repository.FamilyMemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MemberServiceImplTest {

  @Mock
  private FamilyMemberRepository familyMemberRepository;

  @InjectMocks
  private MemberServiceImpl memberService;

  @Test
  @DisplayName("Should return the family member when the id is valid")
  public void testGetFamilyMemberWhenIdIsValid() {

    FamilyMember familyMember = new FamilyMember();
    familyMember.setId(1L);
    when(familyMemberRepository.getById(anyLong())).thenReturn(familyMember);

    FamilyMember result = memberService.getFamilyMember(1L);

    assertEquals(1L, result.getId());
  }

  @Test
  @DisplayName("Should saves the family member")
  public void testSaveFamilyMember() {

    FamilyMember familyMember = new FamilyMember();
    familyMember.setFirstName("John");
    familyMember.setLastName("Doe");
    familyMember.setBirthDate(new Date());
    familyMember.setBirthPlace("Budapest");
    familyMember.setCity("Budapest");
    familyMember.setDeathDate(new Date());
    familyMember.setGender("male");
    familyMember.setUserId(1L);

    when(familyMemberRepository.save(familyMember)).thenReturn(familyMember);

    assertEquals(familyMember, memberService.saveFamilyMember(familyMember));
  }

  @Test
  @DisplayName("Should return all members")
  public void testGetMembersShouldReturnAllMembers() {

    List<FamilyMember> familyMemberList = new ArrayList<>();
    FamilyMember familyMember = new FamilyMember();
    familyMember.setId(1L);
    familyMember.setFirstName("John");
    familyMember.setLastName("Doe");
    familyMemberList.add(familyMember);

    when(familyMemberRepository.findAll()).thenReturn(familyMemberList);

    List<FamilyMember> result = memberService.getMembers();

    assertEquals(1, result.size());
    assertEquals("John", result.get(0).getFirstName());
  }
}