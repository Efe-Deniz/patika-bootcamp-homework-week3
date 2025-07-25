# MyList<T> - Generic Java List Implementation

📦 Bu proje, Java'da `ArrayList` benzeri çalışan kendi `Generic List` sınıfımızın (`MyList<T>`) sıfırdan geliştirilmesini amaçlamaktadır. Java'nın `Collection` sınıfları **kullanılmamıştır**. Dizi tabanlı, dinamik kapasiteye sahip, generic yapıdadır.

---

## 🚀 Özellikler

- Generic yapı: `MyList<T>` her tür veri ile çalışabilir (`Integer`, `String`, `Double`, vs).
- Dinamik kapasite: Dizi dolunca kapasite otomatik olarak 2 katına çıkar.
- Temel liste işlemleri:
  - `add()`, `get()`, `set()`, `remove()`
  - `size()`, `getCapacity()`
  - `toString()`, `toArray()`
  - `indexOf()`, `lastIndexOf()`, `contains()`
  - `sublist()`, `clear()`, `isEmpty()`

---

## 📂 Dosya Yapısı

patika_week_3/
│
├── MyList.java # Generic liste sınıfı (Tüm metotlar burada)
└── MyListTest.java # MyList sınıfını test etmek için ana sınıf

---

## 🔧 Kullanım

1. Projeyi bir Java IDE (Eclipse, IntelliJ, VS Code) içine aktar.
2. `MyList.java` dosyası içinde `MyList<T>` sınıfı tanımlıdır.
3. `MyListTest.java` dosyasındaki `main()` metodunu çalıştırarak tüm fonksiyonları test edebilirsin.

---

## ✅ Test Edilen Fonksiyonlar

- ✅ `add(T data)`
- ✅ `get(int index)`
- ✅ `set(int index, T data)`
- ✅ `remove(int index)`
- ✅ `size()` & `getCapacity()`
- ✅ `toString()`
- ✅ `indexOf(T)` & `lastIndexOf(T)`
- ✅ `isEmpty()`
- ✅ `toArray()`
- ✅ `clear()`
- ✅ `sublist(int start, int finish)`
- ✅ `contains(T data)`

---

## 🧪 Örnek Kullanım

```java
MyList<Integer> liste = new MyList<>();
liste.add(10);
liste.add(20);
liste.add(30);
System.out.println(liste);  // Çıktı: [10, 20, 30]
System.out.println("Eleman Sayısı: " + liste.size());       // 3
System.out.println("Kapasite: " + liste.getCapacity());     // 10
