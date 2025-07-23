# 🎬 Film Koleksiyonu ve Filtreleme Uygulaması (Java)

Bu proje, Java dilinde nesne yönelimli programlama (OOP), koleksiyonlar (List), sıralama (Comparator) ve filtreleme konularını pekiştirmek amacıyla hazırlanmıştır.

---

## 🚀 Projenin Amacı

- `Film` sınıfı oluşturarak her film için:
  - Adı
  - Yayın yılı
  - Türü
  - IMDb puanı
  özelliklerini tutmak
- 5 filmden oluşan bir koleksiyon oluşturmak
- Bu filmleri:
  - IMDb puanına göre büyükten küçüğe
  - Yayın yılına göre küçükten büyüğe sıralamak
- Belirli bir film türüne göre filtreleme yapmak

---

## 🧱 Kullanılan Yapılar

- `ArrayList`
- `Comparator` (sıralama için)
- `equalsIgnoreCase()` (filtreleme için)
- `for-each` döngüsü
- `static` yardımcı metod (`filterByGenre`)

---

## 🧪 Örnek Kullanım

```java
filterByGenre(filmList, "Drama");
