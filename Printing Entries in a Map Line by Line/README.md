# Map Entry Yazdırma Uygulaması (Java)

## 📌 Proje Açıklaması

Bu Java uygulaması, `HashMap<String, Integer>` veri yapısını kullanarak 5 farklı kişinin isimlerini ve notlarını saklar. Daha sonra bu verileri ekrana her satıra bir `key = value` olacak şekilde yazdırır.

---

## 🎯 Projenin Amacı

- Java'da `Map`, `HashMap`, `Map.Entry` gibi temel kavramları öğrenmek
- `put()` metodu ile Map'e veri eklemeyi pekiştirmek
- `entrySet()` ile Map'in tüm elemanlarını döngüyle gezmeyi uygulamak
- Temiz ve okunabilir bir çıktı üretmek

---

## 🧪 Kullanılan Yapılar

- `HashMap<String, Integer>`
- `put()` metodu
- `entrySet()` ve `Map.Entry`
- `for-each` döngüsü
- Konsola yazdırma

---

## 🛠️ Uygulama Adımları

1. Boş bir `HashMap` oluşturuldu.
2. 5 farklı `(isim, not)` çifti `put()` metodu ile eklendi.
3. `entrySet()` ile tüm girişler alındı.
4. Her giriş `"isim = not"` formatında ekrana yazdırıldı.

---

## 🧾 Örnek Kod

```java
HashMap<String, Integer> hashMap = new HashMap<>();

hashMap.put("Ali", 85);
hashMap.put("Zeynep", 100);
hashMap.put("Ayşe", 90);
hashMap.put("Fatma", 95);
hashMap.put("Kazim", 80);

for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
Zeynep = 100
Fatma = 95
Kazim = 80
Ali = 85
Ayşe = 90
