<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div class="sidebar">
	<!--
        Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red"
    -->
	<div class="sidebar-wrapper">
		<div class="logo">
			<a href="javascript:void(0)" class="simple-text logo-mini"> </a> <a
				href="javascript:void(0)" class="simple-text logo-normal"
				href="<c:url value='/admin/home'/>">ADMIN</a>
		</div>
		<ul class="nav">
			<li class="active "><a href="<c:url value='/admin/home'/>">
					<i class="tim-icons icon-chart-pie-36" style="size: 40px"></i>
					<p>Home</p>
			</a></li>
			<li><a href="<c:url value='/admin/icon'/>"> <i
					class="tim-icons icon-atom"></i>
					<p>Icons</p>
			</a></li>
			<li><a href="<c:url value='/admin/map'/>"> <i
					class="tim-icons icon-pin"></i>
					<p>Maps</p>
			</a></li>
			<li><a href="<c:url value='/admin/notif'/>"> <i
					class="tim-icons icon-bell-55"></i>
					<p>Notifications</p>
			</a></li>
			<li><a href="<c:url value='/admin/user'/>"> <i
					class="tim-icons icon-single-02"></i>
					<p>User Profile</p>
			</a></li>
			<li><a href="<c:url value='/admin/table'/>"> <i
					class="tim-icons icon-puzzle-10"></i>
					<p>Table List</p>
			</a></li>
			<li><a href="<c:url value='/admin/typo'/>"> <i
					class="tim-icons icon-align-center"></i>
					<p>Typography</p>
			</a></li>


		</ul>
	</div>
</div>