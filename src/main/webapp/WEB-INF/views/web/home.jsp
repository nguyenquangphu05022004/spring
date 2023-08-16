<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="com.laptrinhjavaweb.util.SecurityUtils"%>

<!DOCTYPE html>
<c:url var="APIurl" value="/api/new"/>
<c:url var="CommentURLAPI" value = "/api/comments"/>
<html>

<head>

<meta charset="UTF-8">
<title>Trang chủ</title>

</head>

<body>

	<!-- Page Content -->
	<div class="container">

		<!-- Heading Row -->
		<div class="row align-items-center my-5">
			<div class="col-lg-7">
				<img class="img-fluid rounded mb-4 mb-lg-0"
					src="http://placehold.it/900x400" alt="">
			</div>
			<!-- /.col-lg-8 -->
			<div class="col-lg-5">
				<h1 class="font-weight-light">Business Name or Tagline</h1>
				<p>This is a template that is great for small businesses. It
					doesn't have too much fancy flare to it, but it makes a great use
					of the standard Bootstrap core components. Feel free to use this
					template for any project you want!</p>
				<a class="btn btn-primary" href="#">Call to Action!</a>
			</div>
			<!-- /.col-md-4 -->
		</div>
		<!-- /.row -->

		<!-- Call to Action Well -->
		<div class="card text-white bg-secondary my-5 py-4 text-center">
			<div class="card-body">
				<p class="text-white m-0">This call to action card is a great
					place to showcase some important information or display a clever
					tagline!</p>
			</div>
		</div>

		<!-- Content Row -->
		<div class="row">
			<div class="col-md-4 mb-5">
				<div class="card h-100">
					<div class="card-body">
						<h2 class="card-title">Card One</h2>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipisicing elit. Rem magni quas ex numquam, maxime minus quam
							molestias corporis quod, ea minima accusamus.</p>
					</div>
					<div class="card-footer">
						<a href="#" class="btn btn-primary btn-sm">More Info</a>
					</div>
				</div>
			</div>
			<!-- /.col-md-4 -->
			<div class="col-md-4 mb-5">
				<div class="card h-100">
					<div class="card-body">
						<h2 class="card-title">Card Two</h2>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipisicing elit. Quod tenetur ex natus at dolorem enim! Nesciunt
							pariatur voluptatem sunt quam eaque, vel, non in id dolore
							voluptates quos eligendi labore.</p>
					</div>
					<div class="card-footer">
						<a href="#" class="btn btn-primary btn-sm">More Info</a>
					</div>
				</div>
			</div>
			<!-- /.col-md-4 -->
			<div class="col-md-4 mb-5">
				<div class="card h-100">
					<div class="card-body">
						<h2 class="card-title">Card Three</h2>
						<p class="card-text">Lorem ipsum dolor sit amet, consectetur
							adipisicing elit. Rem magni quas ex numquam, maxime minus quam
							molestias corporis quod, ea minima accusamus.</p>
					</div>
					<div class="card-footer">
						<a href="#" class="btn btn-primary btn-sm">More Info</a>
					</div>
				</div>
			</div>
			<!-- /.col-md-4 -->

		</div>
		<!-- /.row -->
        <div id="comments-container"></div>
	</div>
	<!-- /.container -->
	<script>
            var userName = "<%= SecurityUtils.getPrincipal().getFullName() %>"
            console.log(123)
                    $('#comments-container').comments({
                        profilePictureURL: 'https://viima-app.s3.amazonaws.com/media/public/defaults/user-icon.png',
                        getComments: function (success, error) {
							var commentsArray = [
								{
								id: 2,
								created: '2015-10-01',
								content: 'Loremssfsdfsdf ipsum dol qort sit axcvxcvxcmet',
								fullname: userName,
								upvote_count: 0,
								user_has_upvoted: false
								},
								{
								id : 1,
								created: '2015-10-01',
								content: 'xin chao',
								fullname: userName,
								upvote_count: 0,
								user_has_upvoted: false
								} ,  
								{	
								id : 3,
								parent: 2,
								created: '2015-10-01',
								content: 'xin chao',
								fullname: userName,
								upvote_count: 0,
								user_has_upvoted: false
								} ,  
								  
				
								                                    
							];
							success(commentsArray);
						},
                        youText: userName,
                        readOnly: false,
                        hideRepliesText: 'Ẩn bình luận',
                        viewAllRepliesText: 'Hiển thị tất cả bình luận',
                        postCommentOnEnter: true,
                        noCommentsText: "Không có bình luận nào",
						postComment: function(commentJSON, success, error) {
							$.ajax({
							type: 'post',
							url: 'http://localhost:8080/api/comments',
							contentType: 'application/json',
							data: JSON.stringify(commentJSON),
							success: function(comment) {
								console.log(JSON.parse(comment));
								success(JSON.parse(comment))
							},
							error: function(error) {
								console.log("Error: ", error);
							}
							});
						}
                    });
    </script>
</body>

</html>