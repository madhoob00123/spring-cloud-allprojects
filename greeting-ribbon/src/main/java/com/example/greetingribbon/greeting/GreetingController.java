package com.example.greetingribbon.greeting;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@Controller
@RestController
public class GreetingController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private LoadBalancerClient loadBalancerClient;
    private RestTemplate restTemplate;

  // @Autowired
    private Quote quote;

    @Autowired
    public GreetingController(LoadBalancerClient loadBalancerClient) {
        this.loadBalancerClient = loadBalancerClient;
        this.restTemplate = new RestTemplate();
    }


    @RequestMapping("/")
  //  public String getGreeting(Model model) {
    public Quote getGreeting(){
        logger.debug("Adding greeting");

       quote=new Quote();

      //  model.addAttribute("msg", "Greetings!!!");
        quote.setMsg("Greetings!!!");


        String fortune = restTemplate.getForObject(fetchFortuneServiceUrl(), String.class);

        logger.debug("Adding fortune"+fortune);
     //   model.addAttribute("fortune", fortune);
        quote.setFortune(fortune);

        //resolves to the greeting.vm velocity template
      return  quote;
    }


    private String fetchFortuneServiceUrl() {
        ServiceInstance instance = loadBalancerClient.choose("fortune-service");

        logger.debug("uri: {}", instance.getUri().toString());
        logger.debug("serviceId: {}", instance.getServiceId());

        logger.debug("instance {}",instance.getUri().toString());

        return instance.getUri().toString();
    }
}
