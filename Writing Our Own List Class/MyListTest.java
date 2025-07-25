package patika_week_3;

public class MyListTest {
    public static void main(String[] args) {

        // 1. Yeni bir liste oluştur
        MyList<Integer> liste = new MyList<>();

        // 2. Eleman ekleme
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(50);
        System.out.println("Liste: " + liste);

        // 3. size() ve getCapacity() kontrolü
        System.out.println("Eleman Sayısı: " + liste.getSize());
        System.out.println("Kapasite: " + liste.getCapacity());

        // 4. get() ve set()
        System.out.println("2. indeksteki değer: " + liste.get(2));
        liste.set(2, 999);
        System.out.println("2. indekse 999 atandı: " + liste.get(2));
        System.out.println("Güncel Liste: " + liste);

        // 5. remove()
        System.out.println("1. indeksteki değer silindi: " + liste.remove(1));
        System.out.println("Silme sonrası Liste: " + liste);

        // 6. indexOf(), lastIndexOf(), contains()
        System.out.println("999 hangi indekste? -> " + liste.indexOf(999));
        System.out.println("50 son olarak hangi indekste? -> " + liste.lastIndexOf(50));
        System.out.println("Liste 30'u içeriyor mu? " + liste.contains(30));
        System.out.println("Liste 500'ü içeriyor mu? " + liste.contains(500));

        // 7. toArray()
        Object[] dizi = liste.toArray();
        System.out.println("Diziye çevrildi. İlk eleman: " + dizi[0]);

        // 8. sublist()
        MyList<Integer> altListe = liste.sublist(1, 2);
        System.out.println("Alt Liste (1-2): " + altListe);

        // 9. clear() ve isEmpty()
        liste.clear();
        System.out.println("Liste temizlendi.");
        System.out.println("Liste boş mu? " + liste.isEmpty());
        System.out.println("Temizlenmiş Liste: " + liste);
    }
}
