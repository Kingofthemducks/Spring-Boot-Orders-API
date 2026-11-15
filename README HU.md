# Spring Boot Orders API

## Áttekintés

Ez a RESTful API egy egyetemi tantárgy keretében készült projekt. A Java programozási nyelvet és a Spring Boot keretrendszert használja megrendelések kezelésére, valamint az alapvető CRUD (Create, Read, Update és Delete – létrehozás, lekérdezés, módosítás és törlés) műveletek végrehajtására.

Az alkalmazás különböző végpontokat biztosít a megrendelések lekérdezéséhez, létrehozásához, módosításához, törléséhez és kereséséhez. Az adatbázissal való kommunikációhoz a Spring Data JPA technológiát használja, az adatokat pedig JSON formátumban kezeli.

A projekt tartalmaz egy egyedi HTML-alapú felületet is, amely lehetővé teszi HTTP-kérések küldését és az API válaszainak megtekintését.

<img src="./screenshots/Web%20interface.png" width="800">

## Felhasznált technológiák

- Java
- Spring Boot
- Spring Data JPA
- REST API
- HTTP metódusok (GET, POST, PUT és DELETE)
- JSON
- HTML
- CSS
- JavaScript
- Relációs adatbázis-kezelés JPA segítségével

## Funkciók

### Megrendelések kezelése

Az API az alábbi műveleteket támogatja:

| HTTP metódus | Végpont | Leírás |
|---|---|---|
| GET | `/orders` | Az összes megrendelés lekérdezése |
| GET | `/orders/{id}` | Egy megrendelés lekérdezése azonosító alapján |
| GET | `/orders/giValue/{giValue}` | Megrendelések keresése GI érték alapján |
| POST | `/orders` | Új megrendelés létrehozása |
| PUT | `/orders/{id}` | Meglévő megrendelés módosítása |
| DELETE | `/orders/{id}` | Megrendelés törlése |

### Megrendelések adatai

Minden megrendelés az alábbi mezőket tartalmazza:

- `id` – Automatikusan generált megrendelés-azonosító.
- `item` – A termék vagy tétel neve, illetve leírása.
- `date` – A megrendelés dátuma.
- `cost` – A megrendelés költsége.
- `jdCode` – A megrendeléshez tartozó JD-kód.
- `giValue` – A megrendelések keresésére használt GI-érték.

### Hibakezelés

Az alkalmazás globális kivételkezelést valósít meg a `@RestControllerAdvice` annotáció segítségével.

Amennyiben a keresett megrendelés nem található, az API HTTP 404 (Not Found) választ küld vissza egy JSON formátumú hibaüzenettel.

## HTML-alapú API tesztelőfelület

A projekt egy egyedi HTML-felületet is tartalmaz, amely lehetővé teszi a REST API egyszerűbb használatát és tesztelését.

A felület segítségével a felhasználó:

- Kiválaszthatja a használni kívánt HTTP metódust.
- Megadhatja a kérés URL-címét.
- JSON formátumú kérésadatokat írhat be és formázhat.
- Betölthet egy példa-megrendelést.
- Kéréseket küldhet az API-nak.
- Megtekintheti a visszakapott JSON-választ és a HTTP-státuszkódot.
- Hibaüzenetet kaphat, ha a szerver nem érhető el.

A felület célja, hogy megkönnyítse az API tesztelését külön API-tesztelő alkalmazás használata nélkül.

## Az alkalmazás futtatása

1. Klónozd vagy töltsd le ezt a GitHub-repozitóriumot.
2. Nyisd meg a projektet egy olyan fejlesztőkörnyezetben, mint például az IntelliJ IDEA vagy az Eclipse.
3. Győződj meg róla, hogy a Java és a Maven telepítve van.
4. Szükség esetén állítsd be az adatbázis-kapcsolatot az `application.properties` fájlban.
5. Indítsd el a `RunApplication` osztályt.
6. Miután a Spring Boot alkalmazás elindult, nyisd meg az alábbi címet:

   `http://localhost:8080/`

Ekkor meg kell jelennie a HTML-felületnek, amelyen keresztül használhatod az API-t.

Az API végpontjai az alábbi címen érhetők el:

`http://localhost:8080/orders`

## Fejlesztett készségek

A projekt elkészítése során az alábbi területeken szereztem tapasztalatot:

- RESTful API-k fejlesztése Spring Boot használatával.
- Java osztályok létrehozása és objektumorientált programozás.
- Spring Data JPA és repository-k használata.
- CRUD műveletek megvalósítása.
- HTTP metódusok és JSON-adatok kezelése.
- Kivételkezelés és megfelelő HTTP-státuszkódok visszaadása.
- Frontend és backend összekapcsolása JavaScript és Fetch API segítségével.
- API-funkciók tesztelése HTTP-kéréseken keresztül.

## A projekt háttere

Az alkalmazás eredetileg egy egyetemi tantárgy keretében készült. A Spring Boot backend és a hozzá tartozó Java osztályok a tantárgyi projekt részeként készültek el.

A repozitóriumban található HTML-alapú tesztelőfelület az eredeti felület lecserélésével készült, a projekt használhatóságának és megjelenésének javítása érdekében.
