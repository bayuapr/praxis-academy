### Create Jar File
```
jar cvfe Rental.jar Rental Rental.class
```

### CRC Cards for Rental (Parent)
| Object | Variable/Attribute | Function      |
| ------ | ------------------ | ------------- |
| Mobil  | Warna              | getWarna      |
|        | BahanBakar         | getBahanBakar |


### CRC Card for Toyota (Child)
| Class Name | Responbilities | Colaborators |
| ---------- | -------------- | ------------ |
| Toyota     | Merk           | getMerk      |
|            | Kursi          | getKursi     |


### CRC Card for Avanza (Child)
| Class Name | Responbilities | Colaborators |
| ---------- | -------------- | ------------ |
| Avanza     | Tipe           | getTipe      |


### Gradle
**Building Java Aplications**
1. buat directory dan kemudian masuk ke directory tersebut
2. _grade init_ untuk initialize project
3. Pilih 2 (Application) --> 3 (Java) --> 1 (Grovy) --> 1 (JUnit 4)
4. Masukan nama projek dan package
5. Ketikan command _./gradlew build_ dan selanjutnya _./gradlew run_ untuk melihat hasilnya