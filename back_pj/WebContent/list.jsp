<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./include/header.jsp"%>

<div style="text-align:center; font-size:20px; font-weight: bold;" class="m-3">최근 가장 많이 본영상</div>
<div class="album py-5 bg-light">
	<div class="container">
		<div class="row row-cols-1 row-cols-sm-2 row-cols-md-4 g-4">

			<c:forEach items="${videoList }" var="video">
				<div class="col">
					<div class="card shadow-sm">
						<img
							src="https://img.youtube.com/vi/${video.youtubeId }/mqdefault.jpg">
						<rect width="300px" height="250px" fill="#55595c"></rect>
						<div class="card-body">

							<p class="card-text">
								<a style="text-decoration: none; color:black"
									href="${pageContext.request.contextPath}/main?action=detail&youtubeId=${video.youtubeId}">${video.title }</a>
							</p>
							<div class="d-flex justify-content-between align-items-center">
								<small class="text-muted">${video.fitPartName }</small>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</div>


<div style="text-align:center; font-size:20px; font-weight: bold;" class="m-3">운동부위 선택</div>
<form class="m-3" style="text-align:center" action="main?action=list" method="post">
	<input name="part" type="submit" class="btn btn-primary" value="전신">
	<input name="part" type="submit" class="btn btn-primary" value="상체">
	<input name="part" type="submit" class="btn btn-primary" value="하체">
	<input name="part" type="submit" class="btn btn-primary" value="복부">
</form>



<c:if test="${!empty partList }">
	<div class="album py-5 bg-light">
		<div class="container">
			<div class="row row-cols-1 row-cols-sm-2 row-cols-md-4 g-3">
					<c:forEach items="${partList }" var="partvideo">
						<div class="col">
							<div class="card shadow-sm">
								<img
									src="https://img.youtube.com/vi/${partvideo.youtubeId }/mqdefault.jpg">
								<rect width="300px" height="250px" fill="#55595c"></rect>
								<div class="card-body">

									<p class="card-text">
										<a style="text-decoration: none; color:black"
											href="${pageContext.request.contextPath}/main?action=detail&youtubeId=${partvideo.youtubeId}">${partvideo.title }</a>
									</p>
									<div class="d-flex justify-content-between align-items-center">
										<small class="text-muted">${partvideo.fitPartName }</small>
									</div>
								</div>
							</div>
						</div>
						<!-- <div class="col-lg-4 themed-grid-col">
								<img
									src="https://img.youtube.com/vi/${partvideo.youtubeId }/mqdefault.jpg">
								<br> <a href="detail.jsp">${partvideo.title }</a> <br>
								<span>${partvideo.fitPartName }</span> <br>
							</div> -->

					</c:forEach>
				</div>
			</div>
		</div>
</c:if>

<c:if test="${ empty partList }">
	<div class="alert alert-primary" role="alert">버튼을 눌러주세요</div>
</c:if>




<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
	crossorigin="anonymous"></script>
</body>
</html>