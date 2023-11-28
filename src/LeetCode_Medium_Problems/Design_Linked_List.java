class Design_Linked_List {

    List<Integer> list;

    public MyLinkedList() {
        list=new ArrayList<>();
    }

    public int get(int index) {
        if(list.size()<=index)
            return -1;
        return list.get(index);
    }

    public void addAtHead(int val) {
        list.add(0,val);
    }

    public void addAtTail(int val) {
        list.add(list.size(),val);
    }

    public void addAtIndex(int index, int val) {
        if(list.size()<index)
            return;
        list.add(index,val);
    }

    public void deleteAtIndex(int index) {
        if(list.size()<=index)
            return;
        list.remove(index);
    }
}