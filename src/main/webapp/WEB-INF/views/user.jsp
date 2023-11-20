<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/17/2023
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>
<jsp:include page="/WEB-INF/views/navbar.jsp"></jsp:include>

<div style="text-align: center">
    <h1><a  style="text-decoration: none" href="/add-user">Thêm người dùng </a></h1>

</div>
<table class="table align-middle mb-0 bg-white container" >
    <thead class="bg-light">
    <tr>
        <th>Name</th>
        <th>Slogan</th>
        <th>Age</th>
        <th>Birthday</th>
        <th>Actions</th>
        <th>Actions</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="l">
        <tr>
            <td>
                <div class="d-flex align-items-center">
                    <img
                            src="${l.avatar}"
                            alt=" ko có hình"
                            style="width: 45px; height: 45px"
                            class="rounded-circle"
                    />
                    <div class="ms-3">
                        <p class="fw-bold mb-1">${l.name}</p>
                        <p class="text-muted mb-0">${l.email}</p>
                    </div>
                </div>
            </td>
            <td>
                <p class="fw-normal mb-1"> ${l.slogan}</p>

            </td>
            <td>
                <p class="text-muted mb-0">${l.birthday}</p>
            </td>
            <td>${l.age}</td>
            <td>
                <button type="button" class="btn btn-link btn-sm btn-rounded">
                    Edit
                </button>
            </td>
            <td>
                <button type="button" class="btn btn-link btn-sm btn-rounded">
                    Delete
                </button>
            </td>
            <td>

            </td>
        </tr>
    </c:forEach>



    </tbody>
</table>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>
