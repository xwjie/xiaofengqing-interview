var input = [
    {id:1, label:'一级 1', parentId: 0},
    {id:2, label:'一级 2', parentId: 0},
    {id:3, label:'一级 3', parentId: 0},
    {id:4, label:'一级 1-1', parentId: 1},
    {id:5, label:'一级 2-1', parentId: 2},
    {id:6, label:'一级 2-2', parentId: 2},
    {id:7, label:'一级 3-1', parentId: 3},
    {id:8, label:'一级 3-2', parentId: 3},
];

// 子出现在的父之后的写法

function tran2tree(data){
    var result = [];

    // 保存父节点
    var parentNodes = {};

    data.forEach( item => {
		var node = {};

        node.id = item.id;
        node.label = item.label;

        // 顶层
        if(item.parentId == 0){
            result.push(node);
        }else{
            // 不是顶层，找到父节点加进去。
            var parent = parentNodes[item.parentId];
            
            if(!parent.children){
                parent.children = []
            }

            parent.children.push(node);
        }

        // 保存起来查询用
        parentNodes[item.id] = node;
    })

    return result;
}

var result = tran2tree(input);

console.log(JSON.stringify(result, null, '\t'));

