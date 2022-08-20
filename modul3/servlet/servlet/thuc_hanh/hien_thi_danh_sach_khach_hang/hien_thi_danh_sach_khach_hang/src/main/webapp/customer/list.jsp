<%--
  Created by IntelliJ IDEA.
  User: HoangLong
  Date: 18/08/2022
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<h1>List Customer</h1>
<table class="table table-success table-striped">
    <tr>
        <th>STT</th>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Hình ảnh</th>
    </tr>
<c:forEach var="customer" items="${customerList}" varStatus="status">
    <tr>
        <td>${status.count}</td>
        <td>${customer.ten}</td>
        <td>${customer.ngaySinh}</td>
        <td>${customer.diaChi}</td>
        <c:choose>
            <c:when test="${customer.ten=='Mai Văn Hoàn'}">
                <td><img src="https://tiemanhsky.com/wp-content/uploads/2020/03/61103071_2361422507447925_6222318223514140672_n_1.jpg" alt="Loading" width="100px"></td>
            </c:when>
            <c:when test="${customer.ten=='Nguyễn Văn Nam'}">
                <td><img src="https://hinhnen123.com/wp-content/uploads/2021/12/Top-80-hinh-anh-the-3%C3%974-dep-nhat-moi-nhat.jpg" alt="Loading" width="100px"></td>
            </c:when>
            <c:when test="${customer.ten=='Nguyễn Thái Hoà'}">
                <td><img src="https://2.bp.blogspot.com/-OvzSvVKgZ-o/WKMFGVDf2bI/AAAAAAAAGYA/6nSIGSOOAmEpbfpfKsJ393SPT_FCHKPXgCEw/s1600/anh4x6.jpg" alt="Loading" width="100px"></td>
            </c:when>
            <c:when test="${customer.ten=='Trần Đăng Khoa'}">
                <td><img src="https://toplist.vn/images/800px/tiem-chup-anh-the-334-321384.jpg" alt="Loading" width="100px"></td>
            </c:when>
            <c:when test="${customer.ten=='Nguyễn Đình Thi'}">
                <td><img src="https://toplist.vn/images/800px/tiem-chup-anh-the-lay-ngay-dep-nhat-o-hue-chu-de-da-duoc-nhan-cua-kieu-nguyen-317636.jpg" alt="Loading" width="100px"></td>
            </c:when>
            <c:otherwise>
                <td></td>
            </c:otherwise>
        </c:choose>
    </tr>

</c:forEach>

</table>
</body>
</html>
