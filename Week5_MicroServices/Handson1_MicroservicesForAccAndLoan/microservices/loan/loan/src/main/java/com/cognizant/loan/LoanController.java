package com.cognizant.loan;

import org.springframework.web.bind.annotation.*;

@RestController
public class LoanController {

    @GetMapping("/loans/{number}")
    public String getLoanDetails(@PathVariable String number) {
        return "{ number: '" + number + "', type: 'car', loan: 400000, emi: 3258, tenure: 18 }";
    }
}
