package JavaOOP;

import java.time.*;
import java.util.Set;

public class JavaDateTime {
    public static void main(String[] args) {
//        workingWithLocalDate();
//        workingWithLocalTime();
//        workingWithLocalDateTime();
        usingZonedDataTime();
    }
    // LocalDate Interface
    public static  void workingWithLocalDate(){
         LocalDate localDate = LocalDate.now();
        System.out.println(String.format("%s - %s - %s ", localDate.getYear(), localDate.getMonth(), localDate.getDayOfMonth()));
        //chúng ta có thể lấy LocalDate biểu thị một ngày
        // bang phuong thuc  of hoac parse
        LocalDate date = LocalDate.parse("2024-10-20");
        System.out.println(date.getDayOfMonth());
        LocalDate date1 = LocalDate.of(2014, 2, 1);
        System.out.println(date1);
        // in ra ngay mai
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("tomorrow = " + tomorrow.getDayOfMonth());
        // co the kiem tra xem nam nay co phai nam nhuan khong
        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println("is leapYear = " +leapYear);
    }

    // Localtime Interface
    public  static  void workingWithLocalTime(){
        //Tương tự như LocalDate, chúng ta có thể tạo một phiên bản LocalTime từ đồng hồ
        // hệ thống hoặc bằng cách sử dụng phân tích cú pháp và các phương thức
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime  sixThirty = LocalTime.parse("06:30");
        System.out.println(sixThirty.getHour());
//        Chúng ta cũng có thể kiểm tra xem một thời điểm cụ thể là trước hay sau một thời gian cụ thể khác.
//        Mẫu mã này so sánh hai LocalTime và kết quả sẽ đúng
        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.of(5,30));
        System.out.println(isbefore);
        System.out.printf("max time = %s  , min time = %s \n",LocalTime.MAX,LocalTime.MIN );
    }

    // LocalDatetime Interface
    public static  void  workingWithLocalDateTime(){
        //LocalDateTime được sử dụng để thể hiện sự kết hợp giữa ngày và giờ.
        // Đây là lớp được sử dụng phổ biến nhất khi chúng ta cần kết hợp ngày và giờ.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime dateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20,5,30);
        System.out.println(dateTime);
    }

    // ZonedDateTime API
    public  static  void  usingZonedDataTime(){
//        ZonedDateTime khi chúng ta cần xử lý ngày và giờ theo múi giờ cụ thể.
//        ZoneId là mã định danh được sử dụng để thể hiện các vùng khác nhau

        // Tap hop tat ca id cua cac vung
        Set<String> allZoneId = ZoneId.getAvailableZoneIds();
        System.out.println(allZoneId);

        // we create a Zone for Korea
        ZoneId zoneId  = ZoneId.of("Asia/Ho_Chi_Minh");
        //The LocalDateTime can be converted to a specific zone
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime);

    }



}
