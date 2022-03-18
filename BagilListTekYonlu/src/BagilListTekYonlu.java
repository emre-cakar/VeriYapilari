public class BagilListTekYonlu {
    Node head = null;
    Node tail = null;

    public void basaEkle(Node n) {
        if (head == null) {
            tail = n;
        } else {
            n.setNext(head);
        }
        head = n;
    }

    public void sonaEkle(Node n) {
        if (tail == null) {
            head = n;
        } else {
            tail.setNext(n);
        }
        tail = n;
    }

    public void arayaEkle(Node eklenecek, Node kimdenSonra) {
        if (tail==kimdenSonra){
            sonaEkle(eklenecek);
        }else {
            eklenecek.setNext(kimdenSonra.getNext());
            kimdenSonra.setNext(eklenecek);
        }
    }

    public void siraliEkle(Node n) {
        if (head == null) {
            basaEkle(n);
        } else {
            Node current = head;
            String s1 = n.getIsim() + n.getSoyIsim();
            Node before = null;
            while (current != null) {
                String s2 = current.getIsim() + current.getSoyIsim();
                if (s1.compareTo(s2) < 0) {
                    if (before != null) {
                        before.setNext(n);
                    } else {
                        head = n;
                    }
                    n.setNext(current);
                    break;
                }
                before = current;
                current = current.getNext();
            }
            if (n.getNext() == null) {
                sonaEkle(n);
            }

        }
    }

    public void ilkElamaniSil() {
        if (head != null) {
            if(head.getNext()!=null){
                head = head.getNext();
            }else{
                head=null;
                tail=null;
            }
        }
    }

    public void sonElamaniSil() {
        if (tail!=null){
            if(tail==head){
                tail=null;
                head=null;
            }else{
                Node current=head;
                Node before=null;
                while(current!=null){
                    if (current==tail) break;
                    before=current;
                    current=current.getNext();
                }
                before.setNext(null);
                tail=before;
            }
        }
    }

    public void araElemanSil(Node n){
        if(n==head){
            head=head.getNext();
        }else{
            Node current=head;
            Node before=null;
            while(current!=null){
                if (n==current) break;
                before=current;
                current=current.getNext();
            }
            before.setNext(current.getNext());
            if(current.getNext()==null) tail=before;
        }
    }

    public void yazdir() {
        if(head==null) return;
        System.out.printf("%-25s%-25s\n", "Adi", "Soyadi");
        Node current = head;
        while (current != null) {
            System.out.printf("%-25s%-25s\n", current.getIsim(), current.getSoyIsim());
            current = current.getNext();
        }

        System.out.println("\nİlk elaman : "+ head.getIsim() + " | Son Eleman : "+ tail.getIsim());
    }

}
