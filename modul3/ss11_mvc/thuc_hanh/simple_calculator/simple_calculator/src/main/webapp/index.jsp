<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<h1>Simple Calculator</h1>

<form style="width: 500px" action="/calculator" method="post">
    <fieldset>
        <legend>Calculator</legend>
        <div class="row mb-3">
            <label for="operand1" class="col-sm-2 col-form-label">First Operand</label>
            <div class="col-sm-10">
                <input type="number" name="operand1" class="form-control" id="operand1">
            </div>
        </div>
        <div class="row mb-3">
            <select class="form-select" aria-label="Default select example" name="operator">
                <option selected value="+">Addition</option>
                <option value="-">Subtraction</option>
                <option value="*">Multiplication</option>
                <option value="/">Division</option>
            </select>
        </div>
        <div class="row mb-3">
            <label for="operand2" class="col-sm-2 col-form-label">Second Operand</label>
            <div class="col-sm-10">
                <input type="number" name="operand2" class="form-control" id="operand2">
            </div>
        </div>

        <button type="submit" class="btn btn-primary">Calculate</button>
    </fieldset>



</form>
</body>
</html>