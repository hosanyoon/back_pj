<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./include/header.jsp"%>

<div style="text-align:center">
	<img src="https://health.chosun.com/site/data/img_dir/2018/03/07/2018030700812_2.jpg">
</div>
<form action="main" method="post">
	<div class="mt-5 container">
		<div class="row">
			<div class="col text-center">
				<input type="hidden" name="action" value="list"> <input
					type="submit" class="btn btn-primary" value="SSAFIT에 오신걸 환영합니다">
			</div>
		</div>
	</div>
</form>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
	crossorigin="anonymous"></script>
</body>
</html>