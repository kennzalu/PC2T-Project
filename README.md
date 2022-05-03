### Zadání projektu

#### Předpokládejme databázi studentů univerzity, kde každý student má svoje identifikační číslo, jméno, příjmení a datum narození. Každý student může dostat libovolný počet známek (standardní známkování 1 až 5), z nějž je počítán studijní průměr. Existují tři skupiny studentů:

* Studenti technického oboru, kteří dokážou říci, zda byl rok jejich narození rokem přestupným.
* Studenti kombinovaného studia, kteří dokážou obojí výše zmíněné.
* Studenti humanitního oboru, kteří dokážou říci, v jakém znamení zvěrokruhu se narodili.

Při přijetí na univerzitu, je každý student zařazen do jedné z výše uvedených skupin. V průběhu studia není možné studenta přesunout do jiné skupiny. 



**Vytvořte v programovacím jazyce JAVA ve vývojovém prostředí Eclipse databázový program, který umožní uživateli následující:**

* Přidávat nové studenty - uživatel vždy provede výběr skupiny, do které chce studenta přiřadit, zadá jeho jméno a příjmení a rok narození. Následně je studentovi přiděleno identifikační číslo odvozené dle celkového pořadí přijímaných studentů.
* Zadat studentovi novou známku – uživatel vybere studenta podle jeho ID a zadá požadovanou známku.
* Propuštění studenta z univerzity – uživatel zadá ID studenta, který je odstraněn z databáze.
* Nalezení jednotlivých studentů dle jejich ID a výpis ostatních informací (jméno, příjmení, rok narození, studijní průměr).
* Pro vybraného studenta (dle ID) spustit jeho dovednost (viz rozdělení studentů dle oborů).
* Abecedně řazený výpis všech studentů (dle příjmení) v jednotlivých skupinách (ID, jméno, příjmení, rok narození, studijní průměr).
* Výpis obecného studijního průměru v technickém a humanitním oboru (společný průměr všech studentů v daném oboru).
* Výpis celkového počtu studentů v jednotlivých skupinách.
* Načtení všech údajů ze souboru.
* Uložení všech údajů do souboru.
* Uložení informací o studentech do SQL databáze
* Načtení informací o studentech z SQL databáze

**Pozn. SQL databáze je pouze doplňková vlastnost programu, tj. program musí být schopen pracovat i bez přítomnosti SQL databáze.**


**Program musí dále obsahovat následující:**
- Efektivní využití základních vlastností OOP.
- Alespoň jednu abstraktní třídu nebo rozhraní
- Alespoň jednu dynamickou datovou strukturu
