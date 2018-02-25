
<jsp:include page="/static/header.jsp"/>

	<!-- Slider -->

	<div class="main_slider" style="background-image:url(${pageContext.request.contextPath}/static/images/gran-via.jpg)">
		<div class="container fill_height">
			<div class="row align-items-center fill_height">
				<div class="col">
					<div class="main_slider_content">
								<form action="/logout" method="post">
									<input value="Logout" type="submit" class="red_button shop_now_button">
								</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<h1>Spring MVC 5 + Spring Security 5 + Hibernate 5 example</h1>
	<h2>${message}</h2>
	
<jsp:include page="/static/footer.jsp"/>