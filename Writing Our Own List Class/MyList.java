package patika_week_3;

public class MyList<T> {

    private T[] array;//Generic bir dizi tanımladık başlangıçta null olarak
    private int size; // eleman sayısını takip edecek
    private int capacity;//şuan ki kapasite

    /*
    bu sınıfa iki farklı constructor ekliyecez
    1. constructor -> parametresiz olarak oluşturacaz
    - capacity 10 olarak ayarlıcaz
    - size 0 olarak ayarlıcaz
    - array değişkene capacity uygun olarak oluşturulacak
    Not: burada özel bir durum var
    javada generic bir array oluştururken satırı derleme zamanında bir uyarı üretir
    çünkü javada tür silme diye bir kavram vardır ve bu şu anlama gelir
    java genericleri derleme zamanında deneter ama çalışma zamanında generic tipi bilmez
    bu sebeple new T[] oluşturmaz new Object[] oluşturarak cast yaparız
    buda "unchecked cast " olarak kabul edilir
    bu sebeple java bir uyarı üretmesin diye  @SuppressWarnings("unchecked") yazarız
     */

    @SuppressWarnings("unchecked")
    public MyList(){
        this.capacity = 10;
        this.array = (T[]) new Object[capacity];
        this.size=0;
    }

    @SuppressWarnings("unchecked")
    public MyList(int capacity){
        this.capacity=capacity;
        this.array=(T[]) new Object[capacity];
        this.size=0;
    }

    /*
    şimdi add(T data) methodunu yazacaz
    bu methot ne işe yatıyor
    Eğer array'de yer varsa, data değişkenini diziye ekle.
    Eğer array doluysa, kapasiteyi iki katına çıkar, eski verileri yeni diziye taşı, sonra yeni elemanı ekle.
     */

    public void add(T data){

        if(size==capacity){
            int newCapacity = 0;
            newCapacity=capacity * 2;
            T[] newArray = (T[]) new Object[newCapacity];

            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];

            }
            array = newArray;         // artık array, yeni büyük array'i gösteriyor
            capacity = newCapacity;  // capacity değerini de güncelliyoruz

        }
        array[size] = data;
        size++;
    }

    /*
     Şimdi: size() ve getCapacity() Metotları
        1. size() metodu:
        Dizideki kaç adet eleman olduğunu döndürür.

        2. getCapacity() metodu:
        Dizinin toplam kapasitesini (kaç elemanlık alanı olduğunu) döndürür.
     */

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return capacity;
    }

    /*
    Şimdi: get(int index) Metoduna Geçiyoruz
        Bu metod şunu yapmalı:
        array[index] değerini döndürmeli
        Ama geçersiz index girilirse null döndürmeli
        Peki geçersiz index nedir?
        Eğer index < 0 ise geçersizdir
        Eğer index >= size ise de geçersizdir (çünkü o konumda henüz veri yoktur)
     */

    public T get(int index){
        if(index <0 || index >=size){
            return null;
        }
        return array[index];
    }

    /*
    Sıradaki Metot: remove(int index)
    Bu metodun görevi:
    Verilen indeksteki veriyi silmek,
    Ondan sonraki tüm elemanları bir sola kaydırmak,
    size değerini 1 azaltmak,
    Eğer indeks geçersizse null döndürmek.
    Algoritma
    1. Eğer index geçersizse → return null;
    2. Silinecek değeri geçici olarak sakla
    3. index’ten başlayarak tüm elemanları sola kaydır (array[i] = array[i+1])
    4. size--
    5. return silinen değer

     */

    public T remove(int index){

        if(index<0 || index >= size){
            return null;
        }
        T removeData = array[index];
        for (int i = index; i < size-1; i++) {
            array[i]= array[i+1];

        }
        size -- ;
        return removeData;
    }
    /*
    Sıradaki Metot: set(int index, T data)
    Bu metodun görevi:
    Verilen index konumundaki veriyi yeni data ile değiştirmek
    Eğer index geçersizse → null döndür.
    Eğer geçerliyse:
        Önce eski veriyi sakla,
        Sonra yeni veriyi o konuma yaz,
        Eski veriyi döndür.

     */
    public T set(int index, T data){
        if(index<0 || index>=size){
            return null;
        }
        T oldData = array[index];//eski veriyi saklama
        array[index]=data;//yeni veriyi o konuma yaz
        return oldData;//eski veriyi döndür
    }

    /*
    Not:
    StringBuilder: birleştirme işini yapar
    append(...): sırayla parçaları ekler
    İlk append("["): metnin başına köşeli parantez koyar
    Döngüyle tüm elemanları ekleriz
    En son append("]"): kapanış parantezini ekler
    sb.toString(): birleşmiş halini döndürür
     */
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
/*
1. indexOf(T data)
Listede ilk eşleşen öğenin indeksini döndürür.
Yoksa: -1 döndürür.

2. lastIndexOf(T data)
Listede son eşleşen öğenin indeksini döndürür.
Yoksa: -1 döndürür.
 */
    public int indexOf(T data){
        for (int i = 0; i < size; i++) {
            if(array[i].equals(data)){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for (int i = size -1; i >=0 -1; i--) {
            if (array[i].equals(data)){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
/*
toArray()
Bu metot, listede bulunan verileri aynı sırayla bir Object[] dizisine çevirir.

 Mantığı:
Yeni bir Object[] dizisi oluştur (boyutu size)

for döngüsü ile array[i] → newArray[i] olarak kopyala

Yeni diziyi return et
 */
    public Object[] toArray(){// javada toArray methodu her zaman Object[] döner
        Object[] newArray = new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
/*
 Sıradaki Metot: clear()
Bu metot, listeyi tamamen temizlemeli:
Beklenen:
Tüm elemanları sil (mantıksal olarak)
size = 0 yapılmalı
 */
    public void clear(){
        array = (T[]) new Object[10];
        size=0;
        capacity=10;
    }
/*
sublist(int start, int finish) method
 Beklenen:
Belirtilen aralıktaki elemanlardan yeni bir MyList<T> oluştur ve döndür
Dahil: start → finish arası (inclusive)
Geçersiz aralık varsa → null veya boş liste dönülebilir
Algoritma:
MyList<T> subList = new MyList<>();
for (int i = start; i <= finish; i++) döngüsü
subList.add(array[i]);
return subList;
 Sınır Kontrolleri:
start < 0 veya finish >= size veya start > finish durumlarında: return null

 */

    public MyList<T> sublist(int start,int finish){
        MyList<T> subList = new MyList<>();
        if(start<0 || finish>=size || start>finish){
            return null;
        }

        for (int i = start; i <=finish ; i++) {
            subList.add(array[i]);

        }
        return subList;

    }
/*
contains(T data)
Görevi:
Liste içinde belirtilen data değeri var mı?

Varsa: true döndür

Yoksa: false döndü
 */
    public boolean contains(T data){
        for (int i = 0; i < size; i++) {
            if(array[i].equals(data)){
                return true;
            }
        }
        return false;
    }

}
