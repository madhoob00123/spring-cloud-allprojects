package com.example.greetinghystrix.greeting;

import com.example.greetinghystrix.fortune.FortuneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class GreetingController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private FortuneService fortuneService;

    private Quote quote;

    @Autowired
    public GreetingController(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @RequestMapping("/")
  //  public String getGreeting(Model model) {
            public Quote getGreeting(){
        logger.debug("Adding greeting");
      //  model.addAttribute("msg", "Greetings!!!");

        quote=new Quote();

        //  model.addAttribute("msg", "Greetings!!!");
        quote.setMsg("Greetings!!!");

        String fortune = fortuneService.getFortune();

//        logger.debug("Adding fortune");
//        model.addAttribute("fortune", fortune);
//
//        //resolves to the greeting.vm velocity template
//        return "greeting";
        logger.debug("Adding fortune"+fortune);
        //   model.addAttribute("fortune", fortune);
        quote.setFortune(fortune);

        //resolves to the greeting.vm velocity template
        return  quote;
    }



}