<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="style.css">
<title>New Store</title>
</head>
<body>
<div>

<form action="add-store-data" method="post">
<div class="row">
    <div class="col-25">
     <label for="name">Store name:-</label>
    </div>
    <div class="col-75">
      <input type="text" name="storeName" value="${store.storeName }" placeholder="First name" required>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
    <label for="address">Address-</label>
    </div>
    <div class="col-75">
     <input type="text" name="address" value="${store.address }" required>
    </div>
  </div>
   <div class="row">
    <div class="col-25">
   <label for="pincode">Pin code</label>
    </div>
    <div class="col-75">
     <input type="text" name="pincode" value="${store.pincode }" required>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="state">State</label>
    </div>
    <div class="col-75">
      <select id="state" name="state">
        <option value="Assam">Assam</option>
        <option value="Sikkim">Sikkim</option>
        <option value="Bihar">Bihar</option>
         <option value="Tripura">Tripura</option>
        <option value="Mizoram">Mizoram</option>
      </select>
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="country">Country</label>
    </div>
    <div class="col-75">
     <input type="text" name="country" value="${store.country }" required>
    </div>
  </div>
  <br>
  <div class="row">
    <input type="submit" value="Submit">
  </div>

</form>

</div>
</body>
</html>