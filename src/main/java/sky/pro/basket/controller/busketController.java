package sky.pro.basket.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order/")

public class busketController {
    private final basketServiceImpl basketServiceImpl;

    public busketController(basketServiceImpl basketServiceImpl) {
        this.basketServiceImpl = basketServiceImpl;
    }

    @GetMapping("/add")
    public void addItems(List<Integer> items) {

    }

    @GetMapping("/get")
    public void getItems(List<Integer> items) {
    }
}