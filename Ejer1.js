process.stdin.on('data',function(data){
	var x=parseInt(data.toString());
	var r=x%100;
	x=parseInt(x/100);
	var d=x%10;
	x=parseInt(x/10);
	x=(d*10000+(x*100+r))*10+d;
	console.log(x);
	process.exit();
});
