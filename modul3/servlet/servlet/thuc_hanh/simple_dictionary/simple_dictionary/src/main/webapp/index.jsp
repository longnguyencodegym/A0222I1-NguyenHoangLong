<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<h2>Simple Dictionary</h2>
        <form action="/dictionary" method="post">
       <input name="word" type="text" class="form-control" placeholder="Enter your word" >
            <br>


        <button type="submit"  class="btn btn-primary">Search</button>

    </form>

</body>
</html>