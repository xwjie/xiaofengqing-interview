const assert  = require("assert");

// 写法1
function addN(n){ 
	if(n == 1){
		return 1;    
	}else{
        return n + addN(n-1);
    }
}

describe("1加到N的递归写法1", function() {
    it("1 加 1 ", function() {
        assert.equal(addN(1), 1);
	});
	
	it("1 加 100 ", function() {
        assert.equal(addN(100), 5050);
    });
});

// 三元表达式
function addN2(n){ 
	return n == 1 ? 1 : n + addN(n-1);
}

describe("1加到N的递归写法2", function() {
    it("1 加 1 ", function() {
        assert.equal(addN2(1), 1);
	});
	
	it("1 加 100 ", function() {
        assert.equal(addN2(100), 5050);
    });
});