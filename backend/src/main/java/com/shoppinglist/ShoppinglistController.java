package com.shoppinglist;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/shopping-list-items")
@CrossOrigin("http://localhost:5173")
public class ShoppinglistController {
    @GetMapping
    public List<String> get() {
        return List.of(
                "Boter",
                "Kaas",
                "scharreleieren",
                "biologische sinaasappelsap"
        );
        //just a comment so i can commit again
    }
}
