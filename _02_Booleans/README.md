# Wahrheitswerte und logische Operatoren

Überlegen Sie sich für die folgenden Aufgaben die Antworten und notieren
Sie sich Ihre Antwort (auf Papier oder legen Sie eine Text- oder Markdowndatei hier an).

Übernehmen sie _anschließend_ den Code in die Datei
`BooleansIntro.java` und nutzen Sie `IO.println()` um eine Ausgabe zu erhalten.
Z. B.:
```java
boolean a = 9 > 5;

IO.println(a);
```

## Aufgabe 1
Welchen Wahrheitswert haben die Variablen `a` bis `d`?
```java
boolean a = 9 > 5;
boolean b = 4 == 2;
boolean c = 5 != 8;
boolean d = 2 <= 2;
```

## Aufgabe 2
Welchen Wahrheitswert haben die Variablen `a` bis `e`?
```java
boolean a = true && true;
boolean b = true || false;
boolean c = true && false || false;
boolean d = (true || false) && false;
boolean e = !(false || true) || !false && true || false;
```

## Aufgabe 3
Welchen Wahrheitswert haben die Variablen `d` bis `h`?
```java
float   a = 7.2f;
int     b = 4;
boolean c = true;

boolean d = a > 6 || c == true && b == 5;
boolean e = !c || c;
boolean f = c == false || a > 3 && b == 3;
boolean g = (!c || a < 2) && a > 10;
boolean h = (!c && b != 3) || a != 8;
```

## Aufgabe 4
Ein Kino möchte prüfen, ob eine Person einen Film ab 16 sehen darf. Die Regeln lauten:

- Kinder unter 16 dürfen nur in Begleitung eines Erwachsenen hinein.
- Menschen mit einem VIP-Ticket dürfen immer hinein, egal wie alt sie sind.

Hierzu wuren bereits die untenstehenden Hilfsvariablen deklariert.
```java
int age = 15;
boolean with_adult = true;
boolean has_vip_ticket = false;

boolean can_enter = ???;
```
1. Ergänzen Sie nun den logischen Ausdruck für die Variable `can_enter`,
   die `true` ist, wenn die Personden Film sehen darf, und sonst `false`.
1. Darf die Person mit den aktuell initialisierten Variablen den Film sehen?

## Aufgabe 5
Eine Universität prüft, ob eine Bewerberin für ein Stipendium infrage kommt. Die Regeln lauten:

- Sie muss mindestens 18 Jahre alt sein.
- Sie braucht einen Notendurchschnitt unter 2,0 oder mindestens 2 Jahre Berufserfahrung.
- Wer bereits ein anderes Stipendium hat, ist ausgeschlossen.

Definieren Sie eine Variable `eligible` (Typ `boolean `), die `true` ist,
wenn die oben genannten Kriterien erfüllt sind, und sonst `false`.
Orientieren Sie sich beim Vorgehen an der Aufgabe 4.
D.h. beginnen Sie mit den notwendigen Hilfsvariablen und schreiben Sie zum Schluss die Logik.
