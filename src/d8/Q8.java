package d8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Q8 {
    public static void main(String[] args) {
        Map<String, Integer> menu = new HashMap<>();
        Map<String, Integer> order = new HashMap<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input;
        Integer total = 0;
        while (true) {
            try {
                input = new StringTokenizer(bf.readLine());
                String menuName = input.nextToken();
                if (menuName.equals("order")) {
                    break;
                }
                menu.put(menuName, Integer.parseInt(input.nextToken()));
            } catch (NumberFormatException numberFormatException) {
                System.out.println("error: " + numberFormatException.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        while (true) {
            try {
                input = new StringTokenizer(bf.readLine());
                String orderMenu = input.nextToken();
                if (orderMenu.equals("done")) break;
                order.put(orderMenu, Integer.parseInt(input.nextToken()));
            } catch (NullPointerException nullPointerException) {
                nullPointerException.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (Map.Entry<String, Integer> entrySet : order.entrySet()) {
            total += (entrySet.getValue() * menu.get(entrySet.getKey()));
        }
        System.out.println(String.format("total amount is %d", total));
    }
}
