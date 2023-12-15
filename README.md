# Baigiamasis darbas

atliko: Jolita Pečiokienė

[Nuoroda į babrbora.lt svetainę](https://www.barbora.lt/)

### TC01. Prisijungimas naudojant teisingus duomenis<br>
1. Atidarau naršyklę ir el. psl. [barbora.lt](https://www.barbora.lt) _(setUp() metodas)_
2. Uždarau pranešimą apie slapukus, spaudžiu mygtuką 
"Leisti visus slapukus". _(setUp() metodas)_
3. Spaudžiu mygtuką "Prisijungti".
4. Iššokusiame lange įrašau teisingą el.pašto adresą
(peciokiene.jolita@gmail.com).
5. Įrašau teisingą slaptažodį (Oranzinis5).
6. Spaudžiu mygtuką "Prisijungti".
7. Atsinaujinusiame lape nuskaitau pirkinių krepšelo vertę.
>Gautas rezultatas: pirkinių krepšelio vertė turi būti €0,00.<br>
>Lauktas rezultatas: pirkinių krepšelio vertė - €0,00.

### TC02. Prisijungimas naudojant klaidingus duomenis<br>
1. Atidarau naršyklę ir el. psl. [barbora.lt](https://www.barbora.lt) _(setUp() metodas)_
2. Uždarau pranešimą apie slapukus, spaudžiu mygtuką
   "Leisti visus slapukus". _(setUp() metodas)_
3. Spaudžiu mygtuką "Prisijungti".
4. Iššokusiame lange įrašau klaidiną el.pašto adresą
   (jolita@gmail.co).
5. Įrašau klaidingą slaptažodį (Oran).
6. Spaudžiu mygtuką "Prisijungti".
7. Prisijungimas nepavyko, atsirado įspėjantis pranšimas: 
"Neteisingas el. pašto adresas arba slaptažodis".
>Gautas rezultatas: atsirado įspėjantis pranšimas.<br>
>Lauktas rezultatas: atsirado įspėjantis pranšimas.

### TC03. Prekės paieška<br>
1. Atidarau naršyklę ir el. psl. [barbora.lt](https://www.barbora.lt) _(setUp() metodas)_
2. Uždarau pranešimą apie slapukus, spaudžiu mygtuką
   "Leisti visus slapukus". _(setUp() metodas)_
3. Paiškos lange įvedu pavadinimą (majonezas).
4. Spaudžiu mygtuką "iškoti".
5. Nuskaitau rezultatus gautame sąraše, ieškau žodžio "majonezas".
>Gautas rezultatas: atsirado prekių sąrašas su žodžiu "majonezas".<br>
>Lauktas rezultatas: atsirado prekių sąrašas su žodžiu "majonezas".

### TC04. Noriu sudaryti pirkinių krepšelį pagal rasto recepto ingredientus.
1.  Atidarau naršyklę ir el. psl. [barbora.lt](https://www.barbora.lt) _(setUp() metodas)_
2. Uždarau pranešimą apie slapukus, spaudžiu mygtuką
   "Leisti visus slapukus". _(setUp() metodas)_
3. Prisijungiu prie paskyros. _(setUp() metodas)_
4. Palaukiu, kol puslapis "Receptai" taps matomas.
5. Paspaudžiu "Receptai" mygtuką.
6.Įvedu norimo recepto pavadinimą (varškės blynai) į receptų paieškos langelį.
5. Spaudžiu "ieškoti" mygtuką.
6. Spaudžiu ant recepto.
7. Užėjus į receptą spaudžiu mygtuką "pirkti ingredientus".
8. Iššokusiame lange dar kartą spaudžiu mygtuką "pirkti ingredientus".
9. Susiformuoja krepšelis, atsiranda mygtukas "pirkti".
>Gautas rezultatas: atsirado mygtukas "pirkti".<br>
>Lauktas rezultatas: atsirado mygtukas "pirkti".

### TC05. Pridedu Ačiū kortelės duomenis į paskyrą.
1.  Atidarau naršyklę ir el. psl. [barbora.lt](https://www.barbora.lt) _(setUp() metodas)_
2. Uždarau pranešimą apie slapukus, spaudžiu mygtuką
   "Leisti visus slapukus". _(setUp() metodas)_
3. Prisijungiu prie paskyros. _(setUp() metodas)_
4. Palaukiu, kol užsikraus elementai. _(setUp() metodas)_
5. Užeinu į puslapį [https://www.barbora.lt/mano-duomenys/mano-aciu-kortele](https://www.barbora.lt/mano-duomenys/mano-aciu-kortele) _(setUp() metodas)_
6. Įvedu AČIŪ kortelės duomenis (9440003700816017447) į nurodytą langelį.
7. Spaudžiu mygtuką pridėti.
8. Nuskaitau užrašą "Jūsų AČIŪ kortelės numeris:"
>Gautas rezultatas: atsirado užrašas "Jūsų AČIŪ kortelės numeris:".<br>
>Lauktas rezultatas: atsirado užrašas "Jūsų AČIŪ kortelės numeris:".

### TC06. Pašalinu Ačiū kortelės duomenis iš paskyros.
