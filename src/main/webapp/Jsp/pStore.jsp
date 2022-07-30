<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search store</title>
</head>
<body>
<div>
<a href="/home">home</a>
</div>
<div>
<h2>Store details</h2>
<form action="/search" method="get">
Search by store name: <input type="text" name="keyword" value="${keyword }" placeholder="Type store name to search">
<button type="submit">Search</button>
</form><br><br>

<table style ="width: 70%">
<thead>
<tr>
<th>Id</th>
<th>Store name</th>
<th>Address</th>
<th>PIN code</th>
<th>State</th>
<th>Country</th>
<th>Action</th>

</tr>
</thead>
<tbody>
<c:forEach var="store" items="${stores}">
<tr>
<td><c:out value="${store.id }"/></td>
<td><c:out value="${store.storeName }"/></td>
<td><c:out value="${store.address }"/></td>
<td><c:out value="${store.pincode }"/></td>
<td><c:out value="${store.state }"/></td>
<td><c:out value="${store.country }"/></td>
<td>
<a href = "/delete?id=<c:out value='${store.id }'/>">Delete</a>
<a href = "/update?id=<c:out value='${store.id }'/>">Update</a>
</td>
</tr>
</c:forEach>
</tbody>
</table>

</div>
</body>
</html>