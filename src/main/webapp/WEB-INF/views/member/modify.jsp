<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="content-box">
<h1> 정보 변경 </h1><br />
	<form id="update_member" name="update_member" >
	<input type="hidden" name="userid" value="${member.userId }" />
		<input type="password" id="password" name="password" placeholder="이전비밀번호:${user.password}"/><br /><br />
		팀(현재소속팀:${user.teamId})
			<input type="radio" name="teamid" id="teamid_0" value="none" checked="checked" /> 없음
			<input type="radio" name="teamid" id="teamid_1" value="nolja" /> 걍놀자
			<input type="radio" name="teamid" id="teamid_2" value="jienHouse" /> 지은이네
			<input type="radio" name="teamid" id="teamid_3" value="turtleKing" /> 왕거북이
			<input type="radio" name="teamid" id="teamid_4" value="coddingZzang" /> 코딩짱<br /><br />
		역할(현재 역할: ${user.roll})
		<select name="roll" id="roll">
			<option value="leader" selected="selected">팀장</option>
			<option value="front">프론트개발</option>
			<option value="back">백단개발</option>
			<option value="android">안드로이드개발</option>
			<option value="minfe">민폐</option>
		</select><br /><br /><br />
	</form>	
	<form method="POST" enctype="multipart/form-data" action="${context }/member.do?action=fileupload&page=retrieve">
	  파일업로드: <input type="file" name="upfile">
	  <input type="submit" value="파일업로드">

	</form><br />
	<div id="update_member_btn_style">
		<a id="update_member_btn"> 업데이트 </a>
	</div>
	</div>
<script>
</script>
