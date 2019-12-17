function Node(value){
    // 节点的值
    this.value = value

    // 左右节点
    this.left = null;
    this.right = null;
}

// 构建树，定义根节点
let root = new Node('A');

let node1 = new Node('B');
let node2 = new Node('C');

root.left = node1;
root.right = node2;

let node3 = new Node('D');
node1.left = node3;

let node4 = new Node('G');
node3.right = node4;

let node5 = new Node('E');
node2.left = node5;

let node6 = new Node('F');
node2.right = node6;

function findFullPath(root, value){
    function _find(node, value, result){
        // 放入当前节点
        result.push(node.value);
        
        if(node.value == value){
            return result;
        }
        
        // 找左边
        if(node.left){
            let find = _find(node.left, value, result);
            
            if(find){
                return find;
            }
        }

        // 找右边
        if(node.right){
            let find = _find(node.right, value, result);
            
            if(find){
                return find;
            }
        }

        // 找不到就把当前节点弹出
        result.pop();
    }

    return _find(root, value, []) || [];
}

let paths = findFullPath(root, 'G');
console.log(paths);

paths = findFullPath(root, 'E');
console.log(paths);

paths = findFullPath(root, 'H');
console.log(paths);