package com.martinyuyy.algorithm.tree;


import java.util.*;

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
 *
 * 层序遍历： 顾名思义，从根节点开始一层一层的往下遍历， 访问该节点的左孩子和右孩子
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

    // 后序遍历
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

    // 层序遍历
    public void levelOrder(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(! queue.isEmpty()){
            Node cur = queue.remove();

            System.out.println(cur.e);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
    }

    // 寻找二分搜索数的最小节点
    public E mininum(){
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty!");
        }
        return mininum(root).e;
    }

    // 非递归实现，寻找二分搜索树的最小节点
//    public E mininum(){
//        if (size == 0) {
//            throw new IllegalArgumentException("BST is empty!");
//        }
//        Node cur = root;
//        while (cur.left == null) {
//            cur = cur.left;
//        }
//        return cur.e;
//    }

    private Node mininum(Node node){
        if (node.left == null) {
            return node;
        }
        return mininum(node.left);
    }

    // 寻找二分搜索数的最小节点
    public E maxnum(){
        if (size == 0) {
            throw new IllegalArgumentException("BST is empty!");
        }
        return maxnum(root).e;
    }

    private Node maxnum(Node node){
        if (node.right == null) {
            return node;
        }
        return maxnum(node.right);
    }

    // 删除树的最小节点
    public E removeMini(){
        E ret =mininum();
        root = removeMini(root);
        return ret;
    }

    // 递归删除最小节点
    // 删除以node为跟节点的数中的最小节点
    // 返回删除之后的新的二分搜索树的根
    private Node removeMini(Node node) {
        if (node.left == null) {
            Node right = node.right;
            node.right = null;
            size--;
            return right;
        }
        node.left = removeMini(node.left);
        return node;
    }

    // 删除树的最大值
    public E removeMax(){
        E ret =maxnum();
        root = removeMax(root);
        return ret;
    }

    // 递归删除最大值
    // 删除以node为跟节点的数中的最大节点
    // 返回删除之后的新的二分搜索树的根
    private Node removeMax(Node node) {
        if (node.right == null) {
            Node left = node.left;
            node.left = null;
            size--;
            return left;
        }
        node.right = removeMax(node.right);
        return node;
    }

    // 删除元素为e 的节点
    public void remove(E e){
        root = remove(root, e);
    }

    // 删除元素为e的节点， 递归算法
    // 首先找到该节点的位置，然后找到该节点的右子树中的最小节点，用最小节点代替当前节点
    // 后继
//    private Node remove(Node node, E e) {
//        if ( node == null ) {
//            return null;
//        }
//
//        if ( e.compareTo(node.e) < 0 ) {
//            node.left = remove(node.left, e);
//            return node;
//        } else if ( e.compareTo(node.e) > 0 ) {
//            node.right = remove(node.right, e);
//            return node;
//        } else { // ( e.compareTo(node.e) == 0 )
//            if ( node.left == null ) {
//                Node rightNode = node.right;
//                node.right = null;
//                size--;
//                return rightNode;
//            }
//            if ( node.right == null ) {
//                Node leftNode = node.left;
//                node.left = null;
//                size--;
//                return leftNode;
//            }
//
//            // 找到后继
//            // 删除后继
//            Node successor = mininum(node.right);
//            successor.right = removeMini(node.right);
//            successor.left = node.left;
//
//            node.right = node.left = null;
//            return successor;
//        }
//    }

    // 删除元素为e的节点， 递归算法
    // 首先找到该节点的位置，然后找到该节点的右子树中的最小节点，用最小节点代替当前节点
    // 前驱
    private Node remove(Node node, E e) {
        if ( node == null ) {
            return null;
        }

        if ( e.compareTo(node.e) < 0 ) {
            node.left = remove(node.left, e);
            return node;
        } else if ( e.compareTo(node.e) > 0 ) {
            node.right = remove(node.right, e);
            return node;
        } else { // ( e.compareTo(node.e) == 0 )
            if ( node.left == null ) {
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;
            }
            if ( node.right == null ) {
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }

            // 找到前驱
            // 删除前驱
            Node precursor = maxnum(node.left);
            precursor.left = removeMax(node.left);
            precursor.right = node.right;

            node.right = node.left = null;
            return precursor;
        }
    }


    public void zhongxubianli(){
        zhongxubianli(root);
    }

    private void zhongxubianli(Node node){
        if (node == null) {
            return;
        }
        zhongxubianli(node.left);
        System.out.println(node.e);
        zhongxubianli(node.right);
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
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            searchTree.add(random.nextInt(100));
        }
        ArrayList<Integer> nums = new ArrayList<>(100);
        while (!searchTree.isEmpty()){
            nums.add(searchTree.removeMax());
        }

        System.out.println(nums);

    }


}
