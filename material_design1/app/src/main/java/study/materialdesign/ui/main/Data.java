package study.materialdesign.ui.main;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<String> fruitList, vegetablesList, natureList;

    Data() {
        fruitList = new ArrayList<>();

        fruitList.add("Клубника");
        fruitList.add("Малина");
        fruitList.add("Лимон");
        fruitList.add("Апельсин");
        fruitList.add("Киви");
        fruitList.add("Черника");


        natureList = new ArrayList<>();

        natureList.add("Океан");
        natureList.add("Горы");
        natureList.add("Пустыня");
        natureList.add("Пляж");
        natureList.add("Джунгли");
        natureList.add("Степь");
    }

    public List<String> getFruitList() {
        return fruitList;
    }

    public List<String> getNatureList() {
        return natureList;
    }
}
