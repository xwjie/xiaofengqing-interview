var root = {
    val: 4,
    left: {
        val: 2,
        left: {
            val: 1
        },
        right: {
            val: 3
        }
    },
    right: {
        val: 6,
        left: {
            val: 5
        }
    }
};

function findNode(root, value) {
    var _find = function (node, value, path) {
        if (!node) {
            return;
        }

        var newPath = [...path, node.val]

        // 找到
        if (node.val === value) {
            return newPath;
        }

        // 递归查找
        return _find(node.left, value, newPath) || _find(node.right, value, newPath);
    }

    return _find(root, value, []) || [];
}


const assert = require("assert");

describe("find node test", function () {
    it("find 5", function () {
        assert.deepEqual(findNode(root, 5), [4, 6, 5]);
    });

    it("find 2", function () {
        assert.deepEqual(findNode(root, 2), [4, 2]);
    });

    it("find 7", function () {
        assert.deepEqual(findNode(root, 7), []);
    });

    it("find root", function () {
        assert.deepEqual(findNode(root, 4), [4]);
    });
});