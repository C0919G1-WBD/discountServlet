<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/12/2019
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product discount</title>
  </head>
  <body>
    <h1>Product discount calculator</h1>
    <form action="/display-discount" method="post">
      <textarea name="txtdescription" id="description" cols="30" rows="10" placeholder="Enter product description"></textarea><br>
      <input type="number" name="txtPrice" value="0"><br>
      <input type="number" name="txtDiscountPercent" value="0"><br>
      <input type="submit" id="submit" value="Calculate discount">
    </form>
  </body>
</html>
