// 写法1
function addN(n){ 
	if(n == 1){
		return 1;    
	}else{
        return n + addN(n-1);
    }
}
console.log(addN(100))

// 三元表达式
function addN(n){ 
	return n == 1 ? 1 : n + addN(n-1);
}

console.log(addN(100))
