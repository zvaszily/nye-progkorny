package hu.nye.nyeprogkorny.controllers;

import hu.nye.nyeprogkorny.model.domain.FamilyMember;
import hu.nye.nyeprogkorny.services.MemberService;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for FamilyMembers.
 */
@Controller
@RequiredArgsConstructor
@RequestMapping("/family_members")
public class FamilyMemberController {
  private final MemberService memberService;

  @RequestMapping({"/list.html"})
  public String getListFamilyMember(Model model) {
    model.addAttribute("members", memberService.getMembers());
    return "family_members/list.html";
  }

  @RequestMapping({"/create.html"})
  public String createMember(FamilyMember familyMember) {
    return "family_members/create.html";
  }

  /**
   * Create FamilyMember.
   */
  @PostMapping("/create")
  public String createFamilyMember(final Model model, final FamilyMember familyMember) {
    final FamilyMember savedFamilyMember = memberService.saveFamilyMember(familyMember);
    model.addAttribute("familyMember", savedFamilyMember);
    return "redirect:/family_members/list.html";
  }

  /**
   * Edit FamilyMember.
   */
  @GetMapping("/edit/{id}")
  public String getFamilyMember(final Model model, final @PathVariable Long id) {
    final FamilyMember familyMember = memberService.getFamilyMember(id);
    model.addAttribute("familyMember", familyMember);
    return "family_members/edit.html";
  }

  /**
   * Update FamilyMember.
   */
  @PostMapping("/update")
  public String updateFamilyMember(final Model model, final FamilyMember familyMember) {
    final FamilyMember savedFamilyMember = memberService.saveFamilyMember(familyMember);
    model.addAttribute("familyMember", savedFamilyMember);
    return "redirect:/family_members/list.html";
  }

  @InitBinder
  public void initBinder(WebDataBinder binder) {
    binder.registerCustomEditor(Date.class,
      new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
  }
}
