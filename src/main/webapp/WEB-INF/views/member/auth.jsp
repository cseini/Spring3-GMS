<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<nav class="navbar navbar-light bg-light static-top">
  <div class="container">
    <a class="navbar-brand" href="#">Yanolja!</a>
    <div class="float-right">
	    <a id="retrieve_btn" class="btn btn-primary" href="#">${user.name }님의 페이지</a>
	    <a id="logout_btn" class="btn btn-primary w-100px " href="#">로그아웃</a>
    </div>
  </div>
</nav>
<script>
	if(!'${user}'==""){
		user.session({userid:'${user.userid}',name:'${user.name}',teamid:'${user.teamid}',roll:'${user.roll}',age:'${user.age}',gender:'${user.gender}',ssn:'${user.ssn}',phone:'${user.phone}',email:'${user.email}'});
	}
</script>