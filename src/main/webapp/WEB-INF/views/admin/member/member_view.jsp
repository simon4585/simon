<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script>
if('${msg}'== "success"){
	alert("수정에 성공하였습니다.!");	
}
</script>
<%@ include file="../include/header.jsp"%>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<div class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h1 class="m-0 text-dark">DashBoard Management</h1>
				</div>
				<!-- /.col -->
				<div class="col-sm-6">
					<ol class="breadcrumb float-sm-right">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item active">Starter Page</li>
					</ol>
				</div>
				<!-- /.col -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container-fluid -->
		<div class="col-md-12">
			<!-- general form elements disabled -->
			<div class="card card-warning">
				<div class="card-header">
					<h3 class="card-title">READ Member ${msg}</h3>
				</div>
				<!-- /.card-header -->
				<div class="card-body">
					<form role="form">
						<div class="row">
							<div class="col-sm-12">
								<!-- text input -->
								<div class="form-group">
									<label>user_id</label> <br> ${memberVO.user_id}
								</div>
							</div>

							<div class="col-sm-12">
								<!-- text input -->
								<div class="form-group">
									<label>user_name</label> <br> ${memberVO.user_name}
								</div>
							</div>

							<div class="col-sm-12">
								<!-- text input -->
								<div class="form-group">
									<label>email</label> <br> ${memberVO.email}
								</div>
							</div>

							<div class="col-sm-12">
								<!-- text input -->
								<div class="form-group">
									<label>point</label> <br> ${memberVO.point}
								</div>
							</div>
							<div class="col-sm-12">
								<div class="form-group">
									<label>enabled</label> <br> ${memberVO.enabled}
								</div>
							</div>
							<div class="col-sm-12">
								<!-- text input -->
								<div class="form-group">
									<label>level</label> <br> ${memberVO.levels}
								</div>
							</div>
							<div class="form-group"></div>
							<div class="buttons">
								<a href="/admin/member/update?user_id=${memberVO.user_id }"
									class="btn btn-warning">UPDATE</a>
								<button type="submit" class="btn btn-danger">DELETE</button>
								<a href="/admin/member/list" class="btn btn-primary">LIST
									ALL</a>
							</div>
						</div>

					</form>
				</div>
				<%@ include file="../include/footer.jsp"%>