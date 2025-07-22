# patika-bootcamp-homework-week3
Patika.dev Java Backend Bootcamp week3  homework submissions
# Birbirine En Yakın İki Sayıyı Bulma – Java Projesi

Bu Java uygulaması, pozitif ve benzersiz tamsayılar içeren bir sayı listesinde **birbirine en yakın iki sayıyı** bulmak için geliştirilmiştir.

## 🔍 Proje Açıklaması

Program şu işlemleri gerçekleştirir:

1. `TreeSet` kullanarak 10 adet pozitif ve benzersiz tamsayı ekler.
2. `TreeSet`, verileri otomatik olarak **küçükten büyüğe sıralı** ve **tekrarsız** tutar.
3. Listeyi `ArrayList`'e çevirerek sıralı erişim (`get(i)`) sağlanır.
4. Yan yana olan sayıların farkları karşılaştırılır.
5. En küçük farka sahip olan iki sayı ve aralarındaki fark ekrana yazdırılır.

## 💡 Kullanılan Yapılar ve Özellikler

- `TreeSet<Integer>`: Benzersizlik ve otomatik sıralama sağlamak için kullanıldı.
- `ArrayList<Integer>`: İndeksle erişim ve fark hesaplama işlemleri için kullanıldı.
- `for` döngüsü: Sıralı listedeki elemanlar arasındaki farkları karşılaştırmak için.
- `minFark`: En küçük farkı bulmak için kullanıldı.
- `System.out.println`: Sonuçları ekrana yazdırmak için.

## 🧪 Örnek Çıktı

```java
En yakın iki sayı: 5 ve 6
Aralarındaki fark: 1

