<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
< <%@ include file="../include/header.jsp" %>
 <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0 text-dark">DashBoard Management</h1>
          </div><!-- /.col -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Starter Page</li>
            </ol>
          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    
     <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">멤버 검색</h3>
                </div>
                </div>
                </div>
                <div class="col-1" style="display:inline-block" >
                        <select class="form-control">
                          <option>--</option>
                        </select>
                        </div>
                        <div class="search" style="display:inline">
     <input type="text" name="search_keyword" placeholder="">
<div class="button" style="display:inline">
     <button name = "btn_search">검색</button>
</div>
<div class="button" style="display:inline">
     <button>새사용자등록</button>
     </div>
                        </div>
    
</div>
    
    
    
        <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">LIST ALL PAGE</h3>

                <div class="card-tools">
                  <div class="input-group input-group-sm" style="width: 150px;">
                    <input type="text" name="table_search" class="form-control float-right" placeholder="Search">

                    <div class="input-group-append">
                      <button type="submit" class="btn btn-default"><i class="fas fa-search"></i></button>
                    </div>
                  </div>
                </div>
              </div>
              <!-- /.card-header -->
              <div class="card-body table-responsive p-0">
                <table class="table table-hover text-nowrap">
                  <thead>
                    <tr>
                      <th>user_id</th>
                      <th>user_name[point]</th>
                      <th>email</th>
                      <th>Use</th>
                      <th>REGDATE</th>
                      <th>level</th>
                    </tr>
                  </thead>
                  <tbody>
                    
                    <c:forEach items="${memberList}" var="memberVO" varStatus="status">
                    <tr>
                      <td>${memberVO.user_id}</td>
                      <td><a href="/admin/member/view?user_id=${memberVO.user_id}">${memberVO.user_name}</a></td>
                      <td>${memberVO.email}</td>
                      <td><span class="tag tag-success">${memberVO.enabled}</span></td>
                      <td>${memberVO.reg_date}</td>
                      <td><small class="badge badge-danger">${memberVO.levels}</small></td>
                    </tr>
                    </c:forEach>
                  </tbody>
            <td> <button type="submit" class="btn btn-primary">CREATE</button>
               </td>
           <td>
              <nav aria-label="Contacts Page Navigation">
            <ul class="pagination justify-content-center m-0">
              <li class="page-item active"><a class="page-link" href="#">1</a></li>
            </ul>
          </nav>
               </td>
                </table>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
 
    
    </div>
    <!-- /.content-header -->
  <%@ include file="../include/footer.jsp" %>