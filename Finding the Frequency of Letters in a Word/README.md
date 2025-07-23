# Letter Frequency Counter

## 🔍 Açıklama
Bu Java programı, kullanıcıdan alınan bir kelimedeki **harflerin kaç kez tekrar ettiğini** hesaplar ve sonucu ekrana yazdırır.

- Büyük/küçük harf farkı gözetilmez (`A` ve `a` aynı kabul edilir).
- Sadece **harfler** dikkate alınır. Rakamlar ve özel karakterler filtrelenir.
- Harf frekansları bir `Map` kullanılarak hesaplanır.
- Her harf, kaç kez geçtiğiyle birlikte satır satır yazdırılır.

---

## 🧠 Kullanılan Yapılar

- `Scanner` → Kullanıcıdan giriş almak için  
- `HashMap<Character, Integer>` → Harflerin frekanslarını saklamak için  
- `Character.isLetter()` → Harf olup olmadığını kontrol etmek için  
- `toLowerCase()` → Büyük/küçük harf ayrımını kaldırmak için

---

## 💡 Örnek Girdi / Çıktı

**Girdi:**
Kelimeleri giriniz: Merhaba123!!!

**Çıktı:**
m = 1
e = 1
r = 1
h = 1
a = 2
b = 1