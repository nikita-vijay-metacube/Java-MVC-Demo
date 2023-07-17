<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Blog</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<h3 class="m-5">
		<a href="Javascript:;">Click Here to go back</a>
	</h3>
	<div class="container-fluid">
		<h2 class="text-center m-5 text-danger">Blogs</h2>
		<div class="row">
			<div class="col-12">
				<table class="table bg-dark text-light">
					<thead>
						<tr style="text-align: center">
							<th scope="col">S.No.</th>
							<th scope="col">Title</th>
							<th scope="col">Content</th>
						</tr>
					</thead>
					<thead>
						<c:forEach items="${blogs}" var="blog">
							<tr style="text-align: center">
								<td scope="row">
									<p>${blog.getId()}</p>
								</td>
								<td scope="row">
									<p>${blog.getTitle()}</p>
								</td>
								<td scope="row">
									<p>${blog.getContent()}</p>
								</td>
							</tr>
						</c:forEach>
					</thead>
				</table>
			</div>
		</div>

	</div>

</body>
</html>