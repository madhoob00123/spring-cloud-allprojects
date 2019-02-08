package com.example.quote.quote;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @RequestMapping("/getQuote")
    public Quote  getQuote() {
        Quote quote = new Quote("hghghg", "Madhu");
        return quote;
    }

    @RequestMapping("/qaQuote")
    public Quote  getQaQuote() {
        Quote quote = new Quote("QaQoute", "Mohamed");
        return quote;
    }
}
