<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>XYZ Hospital</title>
<link rel="stylesheet" type="text/css" href="css/stylesh.css">
</head>
<body>

	<%@ include file="navbar.jsp"%>


	<main>

		<!-- Slideshow -->
		<div class="slideshow-container">
			<div class="mySlides fade">
				<img src="assets/img_hospital.jpg" style="width: 100%">
				<div class="text">Slide 1 Description</div>
			</div>

			<div class="mySlides fade">
				<img src="assets/img_hospital1.jpg" style="width: 100%">
				<div class="text">Slide 2 Description</div>
			</div>

			<div class="mySlides fade">
				<img src="assets/img_hospital2.jpg" style="width: 100%">
				<div class="text">Slide 3 Description</div>
			</div>
			<div class="mySlides fade">
				<img src="assets/img_hospital4.jpg" style="width: 100%">
				<div class="text">Slide 3 Description</div>
			</div>

		</div>

		<div class="programs-section">
			<div class="left-content">
				<h2>Why Choose XYZ Healthcare?</h2>
				<p>Established by Dr person_A in 1980, XYZ Healthcare has a
					robust presence across the healthcare ecosystem. From routine
					wellness & preventive health care to innovative life-saving
					treatments and diagnostic services, XYZ Hospitals has touched more
					than 100 million lives from over 100 countries.</p>
				<ul>
					<li><span class="number">70+</span> <span class="statement">Largest
							private healthcare network of Hospitals</span></li>
					<li><span class="number">200+</span> <span class="statement">Largest
							private network of clinics across India</span></li>
					<li><span class="number">2,306+</span> <span class="statement">Diagnostic
							centres across India</span></li>
					<li><span class="number">5,220+</span> <span class="statement">Pharmacies</span></li>
					<li><span class="number">9,000+</span> <span class="statement">Pin
							codes Served across India</span></li>
					<li><span class="number">10,000+</span> <span
						class="statement">Doctors</span></li>
				</ul>
			</div>
			<div class="right-content">
				<img src="assets/XYZ-healthcare.jpg" alt="XYZ Healthcare">
			</div>
		</div>


		<div class="body-content">

			<h2 class="section-head">Centres of Excellence</h2>



			<div class="home-container">


				<!-- First Card -->
				<div class="home-card">
					<img src="assets/cardiology.jpg" alt="Cardiology">
					<h2>Cardiology</h2>
					<p>Providing comprehensive cardiac care.</p>
				</div>

				<!-- Second Card -->
				<div class="home-card">
					<img src="assets/oncology.jpg" alt="Oncology">
					<h2>Oncology</h2>
					<p>Advanced cancer treatment and care.</p>
				</div>

				<!-- Third Card -->
				<div class="home-card">
					<img src="assets/nephrology.jpg" alt="Nephrology and Urology">
					<h2>Nephrology and Urology</h2>
					<p>Expert care for kidney and urinary tract diseases.</p>
				</div>

				<!-- Fourth Card -->
				<div class="home-card">
					<img src="assets/orthopaedics.jpg" alt="Orthopaedics">
					<h2>Orthopaedics</h2>
					<p>Specialized bone and joint treatment.</p>
				</div>

				<!-- Fifth Card -->
				<div class="home-card">
					<img src="assets/neurology.jpg" alt="Neurology">
					<h2>Neurology</h2>
					<p>Comprehensive neurological care.</p>
				</div>

				<!-- Sixth Card -->
				<div class="home-card">
					<img src="assets/Gastroenterology.jpg" alt="Gastroenterology">
					<h2>Gastroenterology</h2>
					<p>Expertise in digestive system health.</p>
				</div>
			</div>
		</div>
	</main>
	<%@ include file="footer.jsp"%>
	<script src="script.js"></script>
</body>
</html>
