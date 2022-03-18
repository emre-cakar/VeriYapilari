public class Node{
    private String isim;
    private String soyIsim;
    private Node next;


    public Node(String isim, String soyIsim, Node next) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.next = next;
    }
    public Node(String isim, String soyIsim) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.next = null;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim){this.isim = isim;}

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}