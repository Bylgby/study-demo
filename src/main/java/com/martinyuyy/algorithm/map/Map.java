package com.martinyuyy.algorithm.map;

/**
 * created date 2020/2/26 10:19
 *
 * @author maxiaowei
 */
public interface Map<K, V> {

    void add(K key, V value);

    V get(K key);

    V remove(K key);

    boolean contains(K key);

    boolean isEmpty();

    void set(K key, V value);

    int getSize();
}
