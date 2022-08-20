<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>JSP - Hello World</title>
    <style>
        .login {
            height:350px; width:400px;
            margin:0;
            padding:10px;
            border:1px #CCC solid;
        }
    </style>
</head>
<body>
<form action="/convert" method="post">
    <div class="login">
        <h3>Currency Converter</h3>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Rate</label>
            <input name="rate" type="number" class="form-control" id="exampleInputEmail1" value="=22000">

        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">USD</label>
            <input name="usd" type="number" class="form-control" id="exampleInputPassword1" value="0">
        </div>
        <button type="submit" class="btn btn-primary">Convert</button>
    </div>

</form>
</body>
</html>