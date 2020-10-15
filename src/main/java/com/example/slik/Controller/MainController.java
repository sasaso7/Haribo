package com.example.slik.Controller;

import com.example.slik.Model.Candy;
import com.example.slik.Model.Candybag;
import com.example.slik.Repo.CandyRep;
import com.example.slik.Repo.CandybagRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
public class MainController {
    @Autowired
    CandybagRep candybagRep;

    @Autowired
    CandyRep candyRep;

    @GetMapping("/")
    public String index(Model model){
        Iterable<Candybag> candybags = candybagRep.findAll();
        model.addAttribute("list", candybags);
        return "index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("Baglist", candybagRep.findAll());
        return "create";
    }
    @PostMapping("/create")
    public String createItem(@ModelAttribute Candy i, @RequestParam("Candybag_Id") Long id){
        i.setCandybag(candybagRep.findById(id).get());
        candyRep.save(i);
        System.out.println("success");
        return "redirect:/";
    }
    @GetMapping("/seemore/{id}")
    public String seemore(Model model, @PathVariable Long id){
        Candybag can = candybagRep.findById(id).get();
        model.addAttribute("list",can.getCandies());
        return "seemore";
    }
}
