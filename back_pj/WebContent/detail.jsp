<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./include/header.jsp"%>

<div class="container-lg themed-container text-center">
	<div style="text-align:center; font-size:20px; font-weight: bold;" class="m-3">${detailVideo.title }</div>
	<iframe class="mb-5" width="560" height="315"
		src="https://www.youtube.com/embed/${detailVideo.youtubeId }" frameborder="0"
		allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
		allowfullscreen></iframe>
	<br>
	<a href="${pageContext.request.contextPath }/article?action=list" class="btn btn-primary">게시글 리스트</a>
	
</div>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
	crossorigin="anonymous"></script>
</body>
</html>