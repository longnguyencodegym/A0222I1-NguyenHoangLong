<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Product distcount calculator</h1>
<form action="/discount_calculator" method="post">
    <label for="p_name">Product Name</label>
    <input type="text" name="p_name"  id="p_name">
    <label for="p_price">Price</label>
    <input type="number" name="p_price"  id="p_price">
    <label for="p_percent">Discount Percent</label>
    <input type="number" name="p_percent"  id="p_percent">
    <button type="submit">Calculate</button>
</form>
</body>
</html>