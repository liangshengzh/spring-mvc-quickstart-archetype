package ${package}.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/healcheck")
public class HelloController {

  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public String healthCheck(){
    return "success";
  }
}
