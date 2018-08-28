"use strict"; /*엄격한문법적용-틀리면 에러처리하라!*/
var app = app || {};
app = {
	init : x=>{
		console.log('Step 1');
		app.session.context(x);
		app.onCreate();
	},setUser : x=>{
		sessionStorage.setItem('userid',x.userid);
		sessionStorage.setItem('name',x.name);
		sessionStorage.setItem('teamid',x.teamid);
		sessionStorage.setItem('ssn',x.ssn);
		sessionStorage.setItem('gender',x.gender);
		sessionStorage.setItem('age',x.age);
		sessionStorage.setItem('phone',x.phone);
		sessionStorage.setItem('email',x.email);
		sessionStorage.setItem('roll',x.roll);
	},
	onCreate : ()=>{
		console.log('Step 3');
		app.setContentView();
		$('#login_btn').click(()=>{
			location.href=app.x()+'/move/auth/member/login';
		});
		$('#logout_btn').click(()=>{
			location.href=app.x()+'/member/logout';
		});
		$('#add_btn').click(()=>{
			location.href=app.x()+'/move/auth/member/add';
		});
		$('#login_form_btn').click(()=>{
			$('#login_form').attr({
				action : app.x()+"/member/login",	
				method : "post"
			}).submit();
		});
		$('#join_form_btn').click(()=>{
			/*var form = document.getElementById('join_form');
			form.action = app.x()+"/member/add";
			form.method = "post";
			form.submit();*/
			$('#join_form').attr({
				action: app.x()+"/member/add",
				method: "post"
			}).submit();
		});
		$('#retrieve_btn').click(()=>{
			location.href=app.x()+'/member/retrieve/'+app.userid();
		});
		$('#logout-btn').click(()=>{
			location.href=app.x();
		});
		$('#move_update_form').click(()=>{
			location.href=app.x()+'/move/auth/member/modify';
		});
		$('#update_member_btn').click(()=>{
			$('#update_member').attr({
				action : app.x()+"/member/modify/"+app.userid(),
				method: "post"
			}).submit();
		});
		$('#move_delete_form').click(()=>{
			location.href=app.x()+'/move/auth/member/remove';
		});
		$('#delete_form_btn').click(()=>{
			$('#delete_form').attr({
				action : app.x()+"/member/remove/"+app.userid(),
				method: "post"
			}).submit();
		});
	},
	setContentView : ()=>{
		console.log('Step 4 : '+app.j());
	}
};
app.session={
	context : x=>{
		console.log('Step 2 : '+ x);
		sessionStorage.setItem('context',x);
		sessionStorage.setItem('js',x+'/resources/js');
		sessionStorage.setItem('css',x+'/resources/css');
		sessionStorage.setItem('img',x+'/resources/img');
		
	},
	path : x=>{
		return sessionStorage.getItem(x);
	}
};
app.x=()=>{
	return app.session.path('context');
};
app.j=()=>{
	return app.session.path('js');
};
app.c=()=>{
	return app.session.path('css');
};
app.i=()=>{
	return app.session.path('img');
};
app.userid=()=>{
	return sessionStorage.getItem('userid');
}
app.name=()=>{
	return sessionStorage.getItem('name');
}
app.teamid=()=>{
	return sessionStorage.getItem('teamid');
}
app.ssn=()=>{
	return sessionStorage.getItem('ssn');
}
app.gender=()=>{
	return sessionStorage.getItem('gender');
}
app.age=()=>{
	return sessionStorage.getItem('age');
}
app.phone=()=>{
	return sessionStorage.getItem('phone');
}
app.email=()=>{
	return sessionStorage.getItem('email');
}
app.roll=()=>{
	return sessionStorage.getItem('roll');
}