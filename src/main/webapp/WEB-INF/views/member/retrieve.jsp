<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container text-center">
<div id="content-box">
	<table id="mypage-table">
		<tr>
		<td colspan="2" rowspan="3"><img src="${img}/${profile}" alt="" height="300px"/></td> 
			<td>아이디</td>
			<td>${user.userid }</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${user.name }</td>
		</tr>
		<tr>
			<td>비번</td>
			<td>********</td>
		</tr>
		<tr>
			<td>나이</td>
			<td>${user.age }</td>
			<td>팀명</td>
			<td>${user.teamid }</td>
		</tr>
		<tr>
			<td>성별</td>
			<td>${user.gender }</td>
			<td>역할</td>
			<td>${user.roll }</td>
		</tr>
				<tr>
			<td>이메일</td>
			<td>${user.email}</td>
			<td>전화번호</td>
			<td>${user.phone }</td>
		</tr>
	</table><br />
		<a id="move_update_form" class="btn btn-primary">개인정보 수정 이동</a>
		<a id="move_delete_form" class="btn btn-primary">회원탈퇴 이동</a>
	</div>
</div>
<script>
	app.setUser({userid:'${user.userid}',name:'${user.name}',teamid:'${user.teamid}',roll:'${user.roll}',age:'${user.age}'
	,gender:'${user.gender}',ssn:'${user.ssn}',phone:'${user.phone}',email:'${user.email}'});
</script>