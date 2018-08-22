"use strict"; /*엄격한문법적용-틀리면 에러처리하라!*/
var app = app || {};
app = {
	init : x=>{
		alert('Step 1');
		app.session.context(x);
		app.onCreate();
	},
	onCreate : ()=>{
		alert('Step 3');
		app.setContentView();
	},
	setContentView : ()=>{
		alert('Step 4 : '+app.session.path('js')); 
	} 
};
app.session={
		context : x=>{
			alert('Step 2 : '+ x);
			sessionStorage.setItem('context',x);
			sessionStorage.setItem('js',x+'/resources/js');
			sessionStorage.setItem('css',x+'/resources/css');
			sessionStorage.setItem('img',x+'/resources/img');
		},
		path : x=>{
			return sessionStorage.getItem(x);
		}
};
