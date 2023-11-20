<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/17/2023
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>
<div class="container">
    <form action="/addingUser" method="post"  enctype="multipart/form-data">

        <div class="form-outline mb-4">
            <div class="form-label"> Name</div>

            <input name="name" type="text"  class="form-control"/>
        </div>
        <div class="form-outline mb-4">
            <div class="form-label" >Email</div>

            <input name="email" type="text"  class="form-control"/>
        </div>
        <div class="form-outline mb-4">
            <div class="form-label" >Age</div>

            <input name="age" type="number" class="form-control"/>
        </div>
        <div class="form-outline mb-4">
            <div class="form-label" >Birthday</div>

            <input name="birthday" type="date"  class="form-control"/>
        </div>
        <div class="form-outline mb-4">
            <div class="form-label" >Avatar</div>

            <input name="avatar" type="file" multiple class="form-control"/>
        </div>
        <div class="form-outline mb-4">
            <div class="form-label" > Slogan</div>

            <input name="slogan" type="text"  class="form-control"/>
        </div>



        <button type="submit" class="btn btn-primary btn-block mb-4">Thêm</button>

    </form>


</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>
