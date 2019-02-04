package com.kino.array;

/**
 * @Author: kino
 * @Date: 2019/1/25 20:43
 */
public class Array {
    private int data[];
    private int size;

    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    /**
     * 获取元素个数
     * @return 元素个数
     */
    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addLast(int e){
        //加入length = 10，size = 5，index = 4 如果添加末尾应该是 data[5] = e
        //因此是索引size处添加元素
        add(size,e);
    }
    public void addFirst(int e){
        add(0,e);
    }

    /**
     * 在指定index处插入元素e,原数组元素从index+1处往后移动一个元素，但是保证max(size) = length - 1
     * @param index 索引
     * @param e 元素e
     */
    public void add(int index, int e){
        //看临界，index==size会怎么样，上面有一步判断也就是最大size = length - 1
        //这时候length = 10，size = 9，因此index 最大等于8 ，如果index == size = 9的话
        //那么length 最低也是10 很明显的冲突的，结论index不可等于size
        if(index < 0 || index > size){
            throw new IllegalArgumentException("error index");
        }

        //size代表个数，length也数组容量，最大索引应该是size - 1
        //如果length = 10，size=9 当add一个时候，size =10了 再add就不行，因此size最大值就是length
        //所以需要校验,注意 ArrayList:是扩容1.5倍
        if(size == data.length){
            //扩容

        }
        //索引必须在[0,size-1]中，从最后遍历，size- 1开始到
        for(int i = size - 1; i >= index; i--){
            //从index 到size - 1，每个都往后移动一个，比如size = 5  index = 2
            // 这样就从 data[5]<--data[4]<--data[3]<--data[2] 往后移：此时data[3] =data[2]
            data[i + 1] = data[i];
        }
        data[index] = e;
        size ++;
    }

    /**
     * 获取index的元素
     * @param index 索引
     * @return
     */
    public int get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("error index");
        }
        //data进行隐藏，用户只能用data[index]的值而获取不到这个数组data
        //好处，对用户传来的index进行判断
        return data[index];
    }

    /**
     * 修改index处元素
     * @param index 索引
     * @param e 元素
     */
    public void set(int index, int e){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("error index");
        }
        data[index] = e;
    }

    /**
     * 查找数组是否含有元素e
     * @param e
     * @return
     */
    public boolean contains(int e){
        for(int i = 0;i < size ; i ++){
            if(data[i] == e){
                return true;
            }
        }
        return false;

    }

    /**
     * 查找元素 e 所在的索引，如果有返回索引值，如果没有返回 -1
     * 由于数组可以存放重复的元素，所以只返回了第一个元素的索引
     * @param e 需要查找的元素 e
     * @return 索引值， -1代表没有找到
     */
    public int find(int e){
        for(int i = 0;i < size ; i ++){
            if(data[i] == e){
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除指定index的元素
     * @param index 索引
     * @return 删除的了元素，给用户所用
     */
    public int remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("error index");
        }
        //删除的元素 ret
        int ret = data[index];
        for (int i = index + 1; i <size ; i++){
            data[i - 1] = data[i];
        }
        size --;
        return ret;

    }

    /**
     * 删除第一个元素
     * @return 删除的了元素，给用户所用
     */
    public int removeFirst(){
        return remove(0);
    }

    /**
     * 删除末尾元素
     * @return 删除的了元素，给用户所用
     */
    public int removeLast(){
        return remove(size - 1);
    }

    /**
     * 从数组删除元素 e，如果有这个e 就删除，如果不是那就啥也不干，也可以返回boolean代表是否删除成功
     * 由于数组可以允许存放重复的元素，只能删除其中一个元素e
     * @param e 需要删除的元素
     */
    public void removeElement(int e){
        int index = find(e);
        if(index != -1){
            remove(index);
        }
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array : size = %d , capacity = %d \n",size,data.length));
        res.append("[");
        for(int i = 0 ; i < size; i ++){
            res.append(data[i]);
            //最后一个元素不需要,因此判断不是最后一个元素的话就加,
            if(i != size -1){
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

}
