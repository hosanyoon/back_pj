<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./include/header.jsp"%>

<div class="container-lg themed-container text-center">
	<div>최근 가장 많이 본영상</div>
	<c:forEach items="${videoList }" var="video">
		<div>
			<span>${video.title }</span> <br>
			<span>${video.fitPartName }</span> <br> 
			<img src="https://img.youtube.com/${video.youtubeId }/mqdefault.jpg">
			<span>${video.youtubeId }</span>
			<span>${video.channelName }</span> 
			<span>${video.viewCnt }</span>
		</div>
	</c:forEach>
</div>
<div class="container-lg themed-container text-center">
	<div>운동부위 선택</div>
</div>

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
	crossorigin="anonymous"></script>
</body>
</html>