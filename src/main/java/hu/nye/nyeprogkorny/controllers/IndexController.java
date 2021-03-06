package hu.nye.nyeprogkorny.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for index.
 */
@Controller
public class IndexController {

  @RequestMapping({"", "/", "index"})
  public String getIndexPage(Model model) {
    model.addAttribute("pageTitle", "Családfa");
    return "index";
  }
}
