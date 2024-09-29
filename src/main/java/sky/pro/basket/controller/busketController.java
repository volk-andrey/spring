package sky.pro.basket.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.basket.service.basketService;

import java.util.ArrayList;
import java.util.List;

@RestController

public class busketController {
    private final basketService basketService;

    public busketController(basketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void addItems(@RequestParam("items") ArrayList<Integer> items) {
        basketService.addItems(items);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return basketService.getItems();
    }
}