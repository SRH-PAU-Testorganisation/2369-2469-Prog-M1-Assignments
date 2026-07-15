# Kontrollstrukturen mit `if` und `else`

## Aufgabe 1: Autohaus
Arbeiten Sie in der: `Task1_CarDealer.java`

Ein Autohaus vergibt Bonus-Urlaubstage an seine Mitarbeiter in Abhängigkeit davon,
wie viele Autos sie insgesamt verkauft haben. Es gibt folgende Kriterien:
- Mitarbeiter, die weniger als 20 Autos verkauft haben, bekommen keine Bonus-Urlaubstage.
- Wer mindestens 20, aber weniger als 60 Autos verkauft hat, bekommt genau einen
Bonus-Urlaubstag.
- Ab 60 verkauften Autos gibt es einen Bonus-Urlaubstag pro 30 verkaufte Autos. Bei 65
verkauften Autos würde der Mitarbeiter also 2 Bonus-Urlaubstage bekommen. Bei 89
verkauften Autos bekommt er auch 2 Bonus-Urlaubstage, erst ab 90 bekäme er 3 Tage.

**Aufgabe:**
Schreiben Sie den Programmcode, der für eine vorgegebene Menge an verkauften Autos
`int soldCars` die Anzahl an Urlaubstagen `int bonusDays` bestimmt.

**Tipp:**
Zerlegen Sie die Aufgabe in Teilprobleme.
Arbeiten Sie Stück für Stück ein Kriterium nach dem anderen ab,
ignorieren Sie fürs Erste die nachfolgenden Kriterien.
Überlegen Sie sich für das dritte Kriterium eine arithmetsiche Rechnung,
mit der Sie immer die korrekte Anzahl an Urlaubstagen berechnen können.

## Aufgabe 2: Bonuszahlungen
Arbeiten Sie in der: `Task2_BonusSalary.java`

Ein Unternehmen vergibt am Jahresende Bonuszahlungen an seine Vertriebler,
abhängig davon, welchen Umsatz sie in dem Jahr erzielt haben.
Es gibt folgende Regeln:
- Wenn der Umsatz über 100.000€ liegt, entspricht der Bonus 10% des Umsatzes
- Wenn der Umsatz zwischen 50.000€ und einschließlich 100.000€ liegt,
  entspricht der Bonus 5% des Umsatzes
- Wenn der Umsatz bei 50.000€ oder darunter liegt, entspricht der Bonus 2,5% des
Umsatzes

Es soll nun automatisch berechnet werden, wie viel Bonusgehalt jeder Vertriebler bekommt.

**Schritt 1:** Schreiben Sie zunächst die nötige Dreisatz-Formel:
Aus den Werten von `int sales` und `double bonusPercentage` soll `double bonusSalary`
korrekt berechnet werden. Beispiel:
```java
int sales = 10_000;
double bonusPercentage = 2.5;
double bonusSalaray = ???; // 250.0 solltie errechnet werden
```

**Schritt 2:** Schreiben Sie nun die Programmlogik mit den einzelnen Regeln, sodass der Variable
`double bonusSalay` am Ende immer das korrekte Bonus-Gehalt zugewiesen ist. An welcher Stelle benötigen Sie dazu den Code aus Teilaufgabe a?

> **Wichtig:** Geben Sie die Variable `bonusSalary` nur **einmal am Ende** ihres Codes mit `IO.println(bonusSalay)` aus.
Verwenden Sie keine weiteren `println()`-Statements in Ihrem Code!

## Aufgabe 3: Freizeitpark (A)
Arbeiten Sie in der `Task3_ThemeParkA.java`

In dieser Aufgabe sollten Sie Ihre if-Statements "schachteln." Hier ein Beispiel:
```
if (Bedingung)
{
    ...
    if (Bedingung)
    {
        ...
    }
    else
    {
        ...
    }
    ...
}
```

Ein Freizeitpark hat bestimmte Eintrittspreise je nach Alter und Wochentag. Die Regeln sehenfolgendermaßen aus:
- Kinder unter 6 Jahren: Eintritt frei
- Kinder von 6 bis einschließlich 16 Jahren:
    - 10€ an Wochentagen
    - 12€ an Wochenenden
- Ab 17 Jahren:
    - 15€ an Wochentagen
    - 20€ an Wochenenden

**Aufgabe:** Schreiben Sie die Programmlogik, sodass einer Variable `int price`
am Ende der korrekte Wert zugewiesen ist.
Benutzen Sie für die Programmlogik die Variablen `int age` und `boolean isWeekend`,
denen Sie zu Testzwecken beliebige Werte zuweisen können.

> Geben Sie diese Variable am Ende Ihres Codes genau **einmal** mit `println()` aus.

## Aufgabe 4: Freizeitpark (B)
Arbeiten Sie in der `Task4_ThemeParkB.java`

Ein anderer Freizeitpark hat etwas komplexere Eintrittspreisregelungen:
- Kinder unter 6: Eintritt frei
- Kinder zwischen 6 und inklusive 16 Jahren zahlen 15€
- Gäste ab 17 Jahren zahlen den Standardpreis von 20€
- Menschen mit Behinderung bekommen 20% Rabatt auf den jeweiligen Preis ihrer Altersklasse
- Zusätzlich gilt: An Montagen gibt es noch einmal zusätzlich 2€ Rabatt auf den Endpreis

**Aufgabe:** Schreiben Sie die Programmlogik für die Regelung.
Am Ende des Codes soll der Eintrittspreis in einer Variable `double price` gespeichert sein,
deren Wert **einmal** am Ende mit `println()` ausgegeben wird.

> **Tipp:**
> Sie könnten mit vielen Verschachtelungen arbeiten.
> Übersichtlicher ist es aber vielleicht, die Variable `price` nacheinander mehrfach zu überschreiben,
> um sich schrittweise dem Endpreis zu nähern.

> **Achtung:**
> Was passiert, wenn ein Kind unter 6 Jahren an einem Montag in den Park will?