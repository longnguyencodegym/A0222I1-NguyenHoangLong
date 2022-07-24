package ss16_io_text_file.bai_tap.quan_ly_dien_thoai;

public class Valid {
  public static boolean isNumber(String val) {
    try {
      Double.parseDouble(val);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public static boolean checkName(String name) {
    return name.matches("[ABC]\\w*");
  }
}
//    No.	Phương thức	Mô tả
// 1	char charAt(int index)	Trả về giá trị char cho chỉ số cụ thể.
//        2	int length()	Trả về độ dài chuỗi.
//        3	static String format(String format, Object... args)	Trả về chuỗi được format.
//        4	static String format(Locale l, String format, Object... args)	Trả về chuỗi được format
// theo vùng miền(quốc gia).
//        5	String substring(int beginIndex)	Trả về chuỗi con bắt đầu từ chỉ số index.
//        6	String substring(int beginIndex, int endIndex)	Trả về chuỗi con từ chỉ số bắt đầu đến
// chỉ số kết thúc.
//        7	boolean contains(CharSequence s)	Kiểm tra chuỗi chứa chuối không, kết quả trả về là giá
// trị boolean.
//        8	static String join(CharSequence delimiter, CharSequence... elements)	Trả về chuỗi được
// nối từ nhiều chuỗi.
//        9	static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
//	Trả về chuỗi được nối từ nhiều chuỗi.
//        10	boolean equals(Object another)	kiểm tra sự tương đương của chuỗi với đối tượng.
//        11	boolean isEmpty()	Kiểm tra chuỗi rỗng.
//        12	String concat(String str)	Nối chuỗi cụ thể.
//        13	String replace(char old, char new)	Thay thế tất cả giá trị char cụ thể bằng một giá trị
// char mới.
//        14	String replace(CharSequence old, CharSequence new)	Thay thế tất cả các chuỗi bằng một
// chuỗi mới.
//        15	static String equalsIgnoreCase(String another)	So sanh chuỗi, không phân biệt chữ hoa
// hay chữ thường.
//        16	String[] split(String regex)	Trả về mảng các chuỗi được tách ra theo giá trị regex.
//        17	String[] split(String regex, int limit)	Trả về mảng các chuỗi được tách ra theo giá trị
// regex và có giới hạn.
//        18	String intern()	Trả về chuỗi interned.
//        19	int indexOf(int ch)	Trả về vị trí của ký tự ch cụ thể.
//        20	int indexOf(int ch, int fromIndex)	Trả về vị trí của ký tự ch tính từ từ vị trí
// fromIndex.
//        21	int indexOf(String substring)	Trả về vị trí của chuỗi con substring.
//        22	int indexOf(String substring, int fromIndex)	Trả về chuỗi con bắt đầu từ vị trí
// substring đến vị trí fromIndex.
//        23	String toLowerCase()	Trả về chuỗi chữ thường.
//        24	String toLowerCase(Locale l)	Trả về chuỗi chữ thường bằng việc sử dụng locale cụ thể.
//        25	String toUpperCase()	Trả về chuỗi chữ hoa.
//        26	String toUpperCase(Locale l)	Trả về chuỗi chữ hoa bằng việc sử dụng locale cụ thể.
//        27	String trim()	Xóa khoảng trẳng ở đầu và cuối của chuỗi.
//        28	static String valueOf(int value)	Chuyển đổi giá trị kiểu dữ liệu đã cho thành chuỗi.

// T
//
//        Biểu thức chính quy
//
//        Mô tả
//
//        1
//
//        .
//
//        Khớp (match) với bất kỳ ký tự nào
//
//        2
//
//        ^regex
//
//        Biểu thức chính quy phải  khớp tại điểm bắt đầu
//
//        3
//
//        regex$
//
//        Biểu thức chính quy phải khớp ở cuối dòng.
//
//        4
//
//        [abc]
//
//        Thiết lập định nghĩa, có thể khớp với a hoặc b hoặc c.
//
//        5
//
//        [abc][vz]
//
//        Thiết lập định nghĩa, có thể khớp với a hoặc b hoặc c theo sau là v hay z.
//
//        6
//
//        [^abc]
//
//        Khi dấu ^ xuất hiện như là nhân vật đầu tiên trong dấu ngoặc vuông, nó phủ nhận mô hình.
// Điều này có thể khớp với bất kỳ ký tự nào ngoại trừ a hoặc b hoặc c.
//
//        7
//
//        [a-d1-7]
//
//        Phạm vi: phù hợp với một chuỗi giữa a và điểm d và con số từ 1 đến 7.
//
//        8
//
//        X|Z
//
//        Tìm X hoặc Z.
//
//        9
//
//        XZ
//
//        Tìm X và theo sau là Z.
//
//        10
//
//        $
//
//        Kiểm tra kết thúc dòng.
//
//
//
//        11
//
//        \d
//
//        Số bất kỳ, viết ngắn gọn cho [0-9]
//
//        12
//
//        \D
//
//        Ký tự không phải là số, viết ngắn gon cho [^0-9]
//
//        13
//
//        \s
//
//        Ký tự khoảng trắng, viết ngắn gọn cho [ \t\n\x0b\r\f]
//
//        14
//
//        \S
//
//        Ký tự không phải khoản trắng, viết ngắn gọn cho [^\s]
//
//        15
//
//        \w
//
//        Ký tự chữ, viết ngắn gọn cho [a-zA-Z_0-9]
//
//        16
//
//        \W
//
//        Ký tự không phải chữ, viết ngắn gọn cho [^\w]
//
//        17
//
//        \S+
//
//        Một số ký tự không phải khoảng trắng (Một hoặc nhiều)
//
//        18
//
//        \b
//
//        Ký tự thuộc a-z hoặc A-Z hoặc 0-9 hoặc _, viết ngắn gọn cho [a-zA-Z0-9_].
//
//
//
//        19
//
//        *
//
//        Xuất hiện 0 hoặc nhiều lần, viết ngắn gọn cho {0,}
//
//        20
//
//        +
//
//        Xuất hiện 1 hoặc nhiều lần, viết ngắn gọn cho {1,}
//
//        21
//
//        ?
//
//        Xuất hiện 0 hoặc 1 lần, ? viết ngắn gọn cho {0,1}.
//
//        22
//
//        {X}
//
//        Xuất hiện X lần, {}
//
//        23
//
//        {X,Y}
//
//        Xuất hiện trong khoảng X tới Y lần.
//
//        24
//
//        *?
//
//        * có nghĩa là xuất hiện 0 hoặc nhiều lần, thêm ? phía sau nghĩa là tìm kiếm khớp nhỏ nhất.
