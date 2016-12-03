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
                        <li><a>&nbsp;Blogs</a></li>
                        <li><a>&nbsp;Projects</a></li>
                        <li><a>&nbsp;Tutorials</a></li>
                    </ul>
                </div>
            </nav>

            <div class="jumbotron ">
                <h1>${name}</h1>
                <p>${intro}</p>
            </div>

            <c:forEach items="${postList}" var="post">
                <div class ="jumbotron">
                    <h1><c:out value="${post.name}"/></h1>
                    <p><c:out value="${post.intro}"/></p>
                </div>
            </c:forEach>
        </div>
        <script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
        <script src="<c:url value="/resources/js/boostrap.min.js"/>"></script>
    </body>
</html>