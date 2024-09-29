package sky.pro.basket.service;

import java.util.List;

public interface basketService {
    void addItems(List<Integer> items);

    List<Integer> getItems();
}
