# Harf Bulma Oyunu – Java Uygulaması

Bu Java uygulaması, kullanıcıya küçük bir oyun sunar:  
Kullanıcı, rastgele oluşturulan harf listesindeki harfleri tahmin etmeye çalışır. Doğru tahminler listede "found" olarak işaretlenir; yanlış tahminler listeye eklenir.

## 🎯 Uygulama Özeti

- Uygulama başlangıcında, rastgele 4 harf içeren bir liste oluşturulur.
- Kullanıcıdan 4 kez harf girişi alınır.
- Her harf girişi için:
  - Harf listede varsa, `"found"` ile değiştirilir.
  - Harf listede yoksa, listeye eklenir.
- Sonuç olarak güncellenmiş harf listesi ekrana yazdırılır.

## 🧠 Kullanılan Yapılar

- `HashSet<String>`: Benzersiz rastgele harfleri üretmek için.
- `ArrayList<String>`: Harf listesini tutmak ve üzerinde işlem yapmak için.
- `Scanner`: Kullanıcıdan giriş almak için.
- `Random`: Harfleri rastgele üretmek için.

## 💡 Önemli Kod Mantığı

```java
if (letterList.contains(userLetter)) {
    int index = letterList.indexOf(userLetter);
    letterList.set(index, "found");
} else {
    letterList.add(userLetter);
}

