<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../includes/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">Tables</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">DataTables Advanced Tables</div>
				<!-- /.panel-heading -->
				<div class="panel-body">
					<table width="100%"
						class="table table-striped table-bordered table-hover"
						id="dataTables-example">
						<thead>
							<tr>
								<th>Bno</th>
								<th>Title</th>
								<th>Writer</th>
								<th>Regdate</th>
								<th>Updatedate</th>
							</tr>
						</thead>

						<c:forEach items="${list}" var="list">
						
							<tbody>
								<tr>
									<td>${list.bno}</td>
									<td>${list.title}</td>
									<td>${list.writer}</td>
									<td>${list.regdate}</td>
									<td>${list.updatedate}</td>
								</tr>
							</tbody>
							
						</c:forEach>
						
					</table>
					<!-- /.table-responsive -->

				</div>
				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->


</div>
<!-- /#wrapper -->

<%@ include file="../includes/footer.jsp"%>
