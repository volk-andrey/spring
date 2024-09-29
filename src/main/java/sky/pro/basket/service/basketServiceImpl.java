package sky.pro.basket.service;


import org.springframework.stereotype.Service;
import sky.pro.basket.repository.Basket;

import java.util.List;


@Service
public class basketServiceImpl implements basketService {
    private final Basket basket;

    public basketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addItems(List<Integer> items){
        basket.addItems(items);
    }

    @Override
    public List<Integer> getItems(){
        return basket.getItems();
    }
}
