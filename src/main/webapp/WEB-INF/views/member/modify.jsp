<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="content-box" class="container text-center">
<h1> 회원정보수정 </h1><br />
	<form id="update_member" name="update_member" >
	<input type="hidden" name="userid" id="userid" />
		<input type="password" id="password" name="password" placeholder="변경할 비밀번호를 입력하세요."/><br /><br />
		<input type="email" id="email" name="email" /><br /><br />
		<input type="tel" id="phone" name="phone" /><br /><br />
		팀(현재소속팀:${user.teamid})
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
		<a id="update_member_btn" class="btn btn-primary w-25"> 업데이트 </a>
	</div>
<script>
	$('#userid').attr("value", user.get('userid'));
	$('#email').attr("placeholder", "이전 이메일 : "+user.get('email'));
	$('#phone').attr("placeholder", "이전 전화번호 : "+user.get('phone'));
	var form = document.getElementById('update_member');
	var roll = document.getElementById('roll');
	var team = document.getElementsByName('teamid');
	for(var i=0;i<roll.options.length;i++){
		if(roll.options[i].value===user.get('roll')){
			roll.options[i].setAttribute("selected","selected");
		}
	};
	for(var i=0;i<team.length;i++){
		if(team[i].value===app.teamid()){
				team[i].checked=true;
		}
	};
</script>
