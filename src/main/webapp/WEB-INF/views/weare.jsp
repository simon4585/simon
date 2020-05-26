<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE HTML>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scaleable=no">
<title>WE ARE</title>
<link rel="shortcut icon" href="/images/favicon/favicon.ico">
<link rel="apple-touch-icon-precomposed"
	href="/images/favicon/home-touch-icon.png">
<link rel="stylesheet" type="text/css" href="/resources/css/reset.css">
<link rel="stylesheet" type="text/css" href="/resources/css/common.css">
<style>
/* WE ARE 페이지 영역 CSS */
.display-section {
	margin-top: 30px;
	text-align: center;
}

.display-section .sec-tit {
	margin-bottom: 30px;
}

.display-section .desc {
	font-family: "굴림";
	color: #616161;
	line-height: 1.9;
}

.slider img {
	display: block;
	width: 100%;
	max-width: 100%;
	height: auto;
}

/* We Are 내용 영역 CSS */
.promotion-section {
	margin-top: 68px;
}

.promotion-section .promo-list li {
	margin-top: 52px;
	text-align: center;
}

.promotion-section .promo-list li:first-child {
	margin-top: -30px;
}

.promotion-section .promo-list li img {
	height: 52px;
}

.promotion-section .promo-list li h3 {
	margin: 29px 0 20px 0;
	color: #3f51b5;
	font-weight: normal;
}

.promotion-section .promo-list li p {
	font-size: 14px;
	font-family: "궁서"; color : #616161;
	line-height: 1.5;
	color: #616161;
}

</style>
<script src="/resources/js/jquery.min.js"></script>
<script src="/resources/js/common.js"></script>
<!-- 사용자 스크립트 -->
<script>
	
</script>
</head>
<body>
	<!-- 더미 데이터:CSS작업전 내용 -->
	<div id="wrap">
		<header class="header cfixed">
			<h1 class="logo">
				<a href="">LOGO</a>
			</h1>
			<nav>
				<ul class="gnb">
					<li><a href="/">HOME</a></li>
					<li><a href="/weare">WE ARE</a></li>
					<li><a href="/work">WORK</a></li>
					<li><a href="/blog">BLOG</a></li>
					<li><a href="contactus">CONTACT US</a></li>
				</ul>
			</nav>
			<span class="menu-toggle-btn"> <span></span> <span></span> <span></span>
			</span>
		</header>
		<section class="content">

			<section class="display-section">
				<div class="container">
					<h2 class="sec-tit">WE ARE</h2>
					<p class="desc">
						"휴먼 교육센터 디지털 컨버전스 과정 입니다." <br> "그리고, 지금은 화면 설계 시간 입니다."
					</p>
				</div>
			</section>

			<section class="promotion-section">
				<div class="container">
					<ul class="promo-list">
						<li><a href="#"> <img src="/resources/images/asd.jpg"
								alt="">
								<h3>HOME</h3>
								<p>휴면 교육센터 디지털 컨버전스 과정 입니다.</p>
						</a></li>
						<li><a href="#"> <img src="/resources/images/asd.jpg"
								alt="">
								<h3>HOME</h3>
								<p>휴면 교육센터 디지털 컨버전스 과정 입니다.</p>
						</a></li>
						<li><a href="#"> <img src="/resources/images/asd.jpg"
								alt="">
								<h3>HOME</h3>
								<p>휴면 교육센터 디지털 컨버전스 과정 입니다.</p>
						</a></li>
						<li><a href="#"> <img src="/resources/images/asd.jpg"
								alt="">
								<h3>HOME</h3>
								<p>휴면 교육센터 디지털 컨버전스 과정 입니다.</p>
						</a></li>
					</ul>
				</div>
			</section>

		</section>
		<footer class="footer">
			<p class="copyright">LOGO</p>
		</footer>
	</div>
</body>
</html>