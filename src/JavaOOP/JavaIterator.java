package JavaOOP;

import java.util.*;
// Iterator là một  interface  được sự dụng để lập qua các phần tử
// trong môt tập hợp (collection) một cách tuần tự
//  no cung cấp một cách thông nhất để duyệt qua các phần tử mà không cần
// biêt về chi tiết và cấu trúc bên trong
// Iterator cung cấp 3 phương thức chính

//boolean hasNext():
//Kiểm tra xem còn phần tử nào trong tập hợp để duyệt tiếp không.
//Trả về true nếu còn phần tử kế tiếp, ngược lại trả về false.

//E next():
//Trả về phần tử kế tiếp trong tập hợp.
//Ném ra ngoại lệ NoSuchElementException nếu không còn phần tử nào.

//void remove():
//Loại bỏ phần tử cuối cùng được trả về bởi phương thức next khỏi tập hợp.
//Ném ra ngoại lệ UnsupportedOperationException nếu phương thức này không được hỗ trợ.
//Ném ra ngoại lệ IllegalStateException nếu phương thức next chưa được gọi hoặc phương
// thức remove đã được gọi trước đó mà chưa gọi next.
public class JavaIterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("leesin");
        names.add("zed");
        names.add("yasou");
        names.add("garen");
        // lay mot  iterator cho danh sach
        Iterator<String> iterator = names.iterator();
        iterator.next();
        iterator.remove();
        // su dung iterator de duyet qua cac phan tu trong danh sach
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------------------------------------------");

        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(11,"yasou");
        map.put(12,"zed");
        map.put(13,"garen");

        Iterator<Map.Entry<Integer,String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry<Integer,String> entry = entryIterator.next();
            System.out.println(String.format("key = %d , value = %s ",entry.getKey(),entry.getValue()));
        }

    }
}
