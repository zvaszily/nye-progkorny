package hu.nye.nyeprogkorny.services;

import hu.nye.nyeprogkorny.model.domain.FamilyMember;
import hu.nye.nyeprogkorny.repository.FamilyMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements  MemberService{

    @Autowired
    public FamilyMemberRepository familyMemberRepository;

    @Override
    public List<FamilyMember> getMembers() {
        List<FamilyMember> memberList = familyMemberRepository.findAll();
        return memberList;
    }

    @Override
    public FamilyMember saveFamilyMember(final FamilyMember familyMember) {
        familyMemberRepository.save(familyMember);
        return familyMember;
    }

    @Override
    public FamilyMember getFamilyMember(final Long id){
        FamilyMember familyMember = familyMemberRepository.getById(id);
        return  familyMember;
    }



}
