package P1418_DisplayTableOfFoodOrdersInARestaurant;

import java.util.*;

/**
 * Title: Solution1
 * Description:
 * 给定orders，包含客户名称、桌号和菜名。统计每一桌点菜的数量。菜名按字母序排序。
 *
 * @author Lin Hui
 * Created on 2020/4/19 12:18:57
 */
public class Solution1 {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Map<Integer, Map<String, Integer>> table = new HashMap<>();
        Set<String> foodSet = new TreeSet<>();
        Set<Integer> numSet = new TreeSet<>();
        for (List<String> order : orders) {
            Integer tableNumber = Integer.valueOf(order.get(1));
            String foodItem = order.get(2);

            numSet.add(tableNumber);
            foodSet.add(foodItem);

            Map<String, Integer> foods = table.computeIfAbsent(tableNumber, k -> new HashMap<>());
            foods.put(foodItem, foods.getOrDefault(foodItem, 0) + 1);
        }

        List<List<String>> ans = new ArrayList<>();
        List<String> title = new ArrayList<>();
        title.add("Table");
        title.addAll(foodSet);
        ans.add(title);

        for (Integer tableNum : numSet) {
            List<String> list = new ArrayList<>();
            Map<String, Integer> map = table.get(tableNum);
            list.add(String.valueOf(tableNum));
            for (String food : foodSet) {
                list.add(String.valueOf(map.getOrDefault(food, 0)));
            }
            ans.add(list);
        }

        return ans;
    }
}
