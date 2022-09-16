<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./include/header.jsp"%>

<div class="container-lg themed-container text-center">
	<div>최근 가장 많이 본영상</div>
	<c:forEach items="${videoList }" var="video">
		<div>
			<img src="https://img.youtube.com/vi/${video.youtubeId }/mqdefault.jpg">
			<br> <a href="${pageContext.request.contextPath}/main?action=detail&youtubeId=${video.youtubeId}">${video.title }</a> <br> 
			<span>${video.fitPartName }</span>
			<br>

		</div>
	</c:forEach>
</div>

<div class="container-lg themed-container text-center">
	<div>운동부위 선택</div>
	<form action="main?action=list" method="post">
		<input name="part" type="submit" class="btn btn-primary" value="전신">
		<input name="part" type="submit" class="btn btn-primary" value="상체">
		<input name="part" type="submit" class="btn btn-primary" value="하체">
		<input name="part" type="submit" class="btn btn-primary" value="복부">
	</form>


	<c:if test="${!empty partList }">
		<c:forEach items="${partList }" var="partvideo">
			<div>
				<img
					src="https://img.youtube.com/vi/${partvideo.youtubeId }/mqdefault.jpg">
				<br> <a href="detail.jsp">${partvideo.title }</a> <br> <span>${partvideo.fitPartName }</span>
				<br>

			</div>
		</c:forEach>
	</c:if>

	<c:if test="${ empty partList }">
		<div class="alert alert-primary" role="alert">버튼을 눌러주세요</div>
	</c:if>

</div>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
	crossorigin="anonymous"></script>
</body>
</html>