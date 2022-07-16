import java.util.ArrayList;
import java.util.Scanner;

// resizable array
// Elements  編譯階段之後 可以被 新增與刪除
class Array_List{
    public static void main(String[] args) {

        // ArrayList can only store referenced type
        // so if you want to use the primitive type
        // you have to use the wrapper class

        // 簡單來說 ArrayList 就是可以控制 size的 array
        // 透過 angle bracket 裡面的 referenced type 設定要存取的資料類型
        ArrayList<String> food = new ArrayList<String>();
        
        // add 可以新增
        food.add("Banana");
        food.add("Apple");
        food.add("Pine Apple");
        food.add("Mango");
        System.out.println(food);
        
        // remove 可以刪除
        food.remove("Banana");
        food.remove("Apple");
        System.out.println(food);
        // set 可以設定某個index的element
        food.set(0,"newFood");
        System.out.println(food);
    }

}