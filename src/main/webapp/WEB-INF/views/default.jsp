<%--
  Created by IntelliJ IDEA.
  User: craighu
  Date: 12/3/16
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

    <head>
        <title>Yong</title>
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />" type="text/css"/>
        <link rel="stylesheet" href="<c:url value="/resources/css/styles.css" />" type="text/css"/>
    </head>

    <body>
        <div class="container">
            <nav class="navbar navbar-inverse bg-faded">
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-left">
                        <li class="active"><a href="/">&nbsp;Home</a></li>
                        <li><a href="/blog">&nbsp;Blogs</a></li>
                        <li><a href="/project">&nbsp;Projects</a></li>
                        <li><a href="/tutorial">&nbsp;Tutorials</a></li>
                    </ul>
                </div>
            </nav>
        </div>
        <script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
        <script src="<c:url value="/resources/js/boostrap.min.js"/>"></script>
    </body>
</html>