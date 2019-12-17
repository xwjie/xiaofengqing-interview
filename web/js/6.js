// 排列
function printPailie(data) {
    function _print(data, result) {
        // 数据长度相同，表示是一组结果
        if (result.length == data.length) {
            console.log(result);
        }

        for (let i = 0; i < data.length; i++) {
            // 如果不包含当前节点，则尝试
            if (result.indexOf(data[i]) < 0) {
                // 入栈
                result.push(data[i]);

                // 递归
                _print(data, result);

                // 出栈
                result.pop();
            }
        }
    }
    _print(data, []);
}

// 组合
function printZuhe(data) {
    // 组合的不能重复，多了一个下标参数
    function _print(data, index, result) {
        console.log(result);

        // 注意下标不是从0开始
        for (let i = index; i < data.length; i++) {
            // 组合不会有重复数据，不需要判断重复
            // 入栈
            result.push(data[i]);

            // 下标加1，递归
            _print(data, i + 1, result);

            // 出栈
            result.pop();
        }
    }
    _print(data, 0, []);
}


let data = [1, 2, 3];

console.log('排列');
printPailie(data);

console.log('组合');
printZuhe(data);
