package com.martinyuyy.algorithm.tree;


import java.util.Stack;

/**
 *
 * 二分搜索树
 * 1. 二分搜索树是一个二叉树
 * 2. 每一个节点的值大于其左子树的所有节点的值
 * 3. 每一个节点的值小于其右子树的所有节点的值
 * 4. 每一个子树也是二分搜索树
 * 5. 不包含任何重复元素
 *
 * 前序遍历： 以根节点为基础先遍历左子树，再遍历右子树
 * 中序遍历： 先访问左子树，再访问该节点，最后访问右子树
 * 后序遍历： 先访问左子树，在访问右子树，最后访问该节点
 * created date 2020/2/3 10:30
 *
 * @author maxiaowei
 */
public class BinarySearchTree<E extends Comparable<E>> {

    class Node{
        E e;
        Node left, right;

        public Node(E e){
            this.e = e;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "e=" + e +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    private Node root;
    private int size;

    public BinarySearchTree(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(E e){
        root = add(root, e);
    }

    // 递归算法，向以node为根节点的树中插入 元素e
    // 返回添加完成之后的根节点
    private Node add(Node node, E e) {
        if ( node == null ) {
            size++;
            return new Node(e);
        }

        if ( e.compareTo(node.e) < 0 ) {
            node.left = add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }

    // 查看当前二分搜索树中是否包含该元素
    public boolean contains(E e){
        return contains(root, e);
    }

    //查看当前二分搜索树中是否包含该元素, 递归
    private boolean contains(Node node, E e) {
        if ( node == null ) {
            return false;
        }
        if ( e.compareTo(node.e) == 0 ) {
            return true;
        }
        if ( e.compareTo(node.e) < 0 ) {
            return contains(node.left, e);
        } else {
            return contains(node.right, e);
        }
    }

    // 二分搜索树的前序遍历
    public void preOrder(){
        preOrder(root);
    }

    // 前序遍历的非递归写法
    public void preOrderNR(){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println(cur.e);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
    }

    // 前序遍历以node为根节点的二分搜索树， 递归操作
    private void preOrder(Node node){
        if (node == null) {
            return;
        }

        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);
    }

    // 中序遍历
    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    // 中序遍历
    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    private void generateBSTString(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(generateDepthString(depth) + "null\n");
            return;
        }
        res.append(generateDepthString(depth) + node.e + "\n");
        generateBSTString(node.left, depth+1, res);
        generateBSTString(node.right, depth+1, res);
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }


    public static void main(String[] args) {
        BinarySearchTree<Integer> searchTree = new BinarySearchTree<>();
        for (int i = 0; i < 5; i++) {
            searchTree.add((int) (Math.random() * 100));
        }
        searchTree.preOrder();
        System.out.println("\n");
        searchTree.preOrderNR();

    }


}
