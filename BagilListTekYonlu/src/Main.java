public class Main {
    public static void main(String[] args) {
        Node n1=new Node("Emre","Cakar");
        Node n2=new Node("Emirhan","Cakar");
        Node n3=new Node("Aynur","Cakar");
        Node n4=new Node("Buket","Cakar");
        Node n5=new Node("Duygu","Cakar");
        Node n6=new Node("Yavuz","Cakar");

        BagilListTekYonlu liste=new BagilListTekYonlu();
        liste.basaEkle(n1);
        liste.arayaEkle(n2,n1);
        liste.sonaEkle(n3);
        liste.siraliEkle(n4);
        liste.siraliEkle(n6);

        liste.ilkElamaniSil();
        liste.sonElamaniSil();
        liste.araElemanSil(n2);




        liste.yazdir();

    }
}
