"use strict"; /*엄격한문법적용-틀리면 에러처리하라!*/
var app = app || {};
app = {
	init : x=>{
		console.log('Step 1');
		app.session.context(x);
		app.onCreate();
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
			location.href=app.x()+'/member/login';
		});
		$('#join_form_btn').click(()=>{
			location.href=app.x()+'/member/add';
		});
		$('#retrieve_btn').click(()=>{
			location.href=app.x()+'/member/retrieve';
		});
		$('#logo-btn').click(()=>{
			location.href=app.x();
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