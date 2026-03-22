<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body style="background-image: url('img/fav.png'); background-size: cover; background-attachment: fixed;">
	<div class="container">
		<div class="row">
			<div class="col m6 offset-m3">
				<div class="card">
					<div class="card-content">
						<h3 class="-align: center" style="margin: 10px;">Register here !!</h3>
						<h5 id="msg" class="center-align"></h5>
						<div class="form center align">
							<!-- creating a form -->
							<form id="myform" action="register1" method="post" >
								<input type="text" name="user_name" placeholder="Enter name here"/>
								<input type="password" name="password" placeholder="Enter password here"/>
								<input type="email" name="email" placeholder="Enter email here"/>

								<div class="file-field input-field">
									<div class="btn">
										<span>File</span> <input type="file" name="image">
									</div>
									<div class="file-path-wrapper">
										<input class="file-path validate" type="text">
									</div>
								</div>

								<button type="submit" class="btn purple">submit</button>
							</form>
						</div>
						<div class="loader center-align" style="size: 30px; display: none;">
						<div class="preloader-wrapper big active">
					      <div class="spinner-layer spinner-blue">
					        <div class="circle-clipper left">
					          <div class="circle"></div>
					        </div><div class="gap-patch">
					          <div class="circle"></div>
					        </div><div class="circle-clipper right">
					          <div class="circle"></div>
					        </div>
					      </div>
					
					      <div class="spinner-layer spinner-red">
					        <div class="circle-clipper left">
					          <div class="circle"></div>
					        </div><div class="gap-patch">
					          <div class="circle"></div>
					        </div><div class="circle-clipper right">
					          <div class="circle"></div>
					        </div>
					      </div>
					
					      <div class="spinner-layer spinner-yellow">
					        <div class="circle-clipper left">
					          <div class="circle"></div>
					        </div><div class="gap-patch">
					          <div class="circle"></div>
					        </div><div class="circle-clipper right">
					          <div class="circle"></div>
					        </div>
					      </div>
					
					      <div class="spinner-layer spinner-green">
					        <div class="circle-clipper left">
					          <div class="circle"></div>
					        </div><div class="gap-patch">
					          <div class="circle"></div>
					        </div><div class="circle-clipper right">
					          <div class="circle"></div>
					        </div>
					      </div>
					    </div>
						<h5>please wait...</h5>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	<script
  src="https://code.jquery.com/jquery-3.7.1.min.js"
  integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
  crossorigin="anonymous"></script>
	
	<script>
		$(document).ready(function (){
			console.log("page is ready....")
			$("#myform").on('submit',function (event) {
				event.preventDefault();
				// var f=$(this).serialize(); this is only for text data
				let f=new FormData(this);
				console.log(f);
				$(".loader").show();
				$(".form").hide();
				$.ajax({
					url:"register1",
					data:f,
					type:"POST",
					success: function(data,textStatus,jqXHR){
						console.log(data);
						console.log("success.........");
						$(".loader").hide();
						$(".form").show();
						if(data.trim()==="done")
						{
							$('#msg').html("Succesfully Registered!!")
							$("#msg").addClass("green-text");
						}
						else
						{
							$('#msg').html("something wrong on server please try again!!")
							$("#msg").addClass("red-text");
						}
					},
					error: function(data,textStatus,errorThrown){
						console.log(data);
						console.log("error");
						$(".loader").hide();
						$(".form").show();
						$('.msg').html("something wrong on server please try again!!")
					},
					processData: false,
					contentType: false
				})
			})
		})
	</script>
</body>
</html>