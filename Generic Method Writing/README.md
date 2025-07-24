# 📌 Generic Metot ile Dizi Yazdırma

Bu projede Java'da **generic bir metot** kullanarak farklı veri tiplerinden (Integer, String, vb.) oluşan dizileri ekrana yazdıran bir uygulama geliştirilmiştir.

---

## 🎯 Amaç

- Java'da generic (jenerik) metotların kullanımını öğrenmek
- Kod tekrarını önlemek
- Farklı veri türleri için tek bir metot ile işlem yapabilmek

---

## 🔧 Kullanılan Teknolojiler

- Java 17 (veya uyumlu bir sürüm)
- Eclipse IDE (veya herhangi bir Java editörü)

---

## 🧠 Proje Yapısı

```java
public static <T> void printArray(T[] array)
Integer[] intArray = {1, 2, 3, 4, 5};
String[] strArray = {"Java", "Generics", "Ödev"};

printArray(intArray);
printArray(strArray);
1 2 3 4 5 
Java Generics Ödev 
16.03 20.16 6.1 20.23 