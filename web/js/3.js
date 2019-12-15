let input = [
    { id: 1, label: '一级 1', parentId: 0 },
    { id: 3, label: '一级 3', parentId: 0 },
    { id: 4, label: '一级 1-1', parentId: 1 },
    { id: 6, label: '一级 2-2', parentId: 2 },
    { id: 7, label: '一级 3-1', parentId: 3 },
    { id: 2, label: '一级 2', parentId: 0 },
    { id: 5, label: '一级 2-1', parentId: 2 },
    { id: 8, label: '一级 3-2', parentId: 3 },
];

// 子不一定出现在的父之后的写法
// 多一次循环

function tran2tree(data) {
    let result = [];

    // 保存所有节点
    let allNodes = {};

    // 先创建所有的节点
    // 析构写法 ({id, label})， 手写的时候不要写成 (id, label)
    data.forEach(({id, label}) => {
        let node = { id, label };
        // 保存起来查询用
        allNodes[id] = node;
    })

    data.forEach(({id, parentId}) => {
        let node = allNodes[id];

        // 顶层
        if (parentId == 0) {
            result.push(node);
        } else {
            // 不是顶层，找到父节点加进去。
            let parent = allNodes[parentId];
            // 同时判空和赋值写法，不要漏掉了后面的()
            (parent.children || (parent.children = [])).push(node);
        }
    })

    return result;
}

let result = tran2tree(input);

console.log(JSON.stringify(result, null, '\t'));

