function Node(value){
    this.value = value
    // 左右节点
    this.left = null;
    this.right = null;
}

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

// 前序
function walk1(root){
    if(!root){
        return;
    }

    console.log(root.value);
    
    walk1(root.left);
    walk1(root.right);
}

console.log('前序遍历');
walk1(root);


// 中序
function walk2(root){
    if(!root){
        return;
    }

    walk1(root.left);
    console.log(root.value);
    walk1(root.right);
}

console.log('中序遍历');
walk2(root);

// 后序
function walk3(root){
    if(!root){
        return;
    }

    walk3(root.left);
    walk3(root.right);
    console.log(root.value);
}

console.log('后序遍历');
walk3(root);

// 层遍历
// 注意数组的 push，pop，shift，unshift 方法使用堆栈等数据结构。
// push + pop = 栈
// push + shift = 堆
function walk4(root){
    if(!root){
        return;
    }

    let nodes = [];
    nodes.push(root);

    let currentNode;
    while(currentNode = nodes.shift()){
        console.log(currentNode.value);

        if(currentNode.left){
            nodes.push(currentNode.left);
        }

        if(currentNode.right){
            nodes.push(currentNode.right);
        }
    }
}

console.log('层遍历');
walk4(root);

