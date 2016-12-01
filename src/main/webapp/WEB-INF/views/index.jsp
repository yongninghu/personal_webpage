<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Yong</title>
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css" />" type="text/css"/>
        <link rel="stylesheet" href="<c:url value="/resources/css/styles.css" />" type="text/css"/>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-left">
                        <li class="active"><a href="/">&nbsp;Home</a></li>
                        <li><a>&nbsp;Blog</a></li>
                        <li><a>&nbsp;Projects</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
        <script src="<c:url value="/resources/js/boostrap.min.js"/>"></script>
    </body>
</html>