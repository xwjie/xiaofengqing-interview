// assert: nodejs内置断言模块
const assert  = require("assert");

console.log(assert);

const add = function(a,b){return a+b};

// describe：定义一组测试
describe("加法函数测试", function() {
    before(function() {
        // runs before all tests in this block
    });
    
    // it: 定义一个测试用例
    it("1 加 1 应该等于 2", function() {
        assert.equal(add(1, 1), 2);
    });
    
    after(function() {
        // runs after all test in this block
    });
});