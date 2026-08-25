# Die `while`-Schleife: mehr Übungen

Legen Sie dieses Mal die Java-Dateien selber an.
Rechts-Klicken Sie auf dem Ordner `_05_WHILE_2`, dann `New`, dann `File` **nicht Java Class**,
dann geben Sie den Namen der neuen Datei ein **mit der Endung** `.java`!
Vermeiden Sie auch Leerzeichen, Sonderzeichen oder Zahlen am Anfang des
Dateinamens.

## Aufgabe 4: Warm Up

In dieser Aufgabe machen Sie ein paar `while`-Schleifen-_Fingerübungen_. Verwenden Sie
in der Aufgabe keine `if`-Bedingungen, sondern modifizieren Sie nur die Schleife selbst.
1. Schreiben Sie eine `while`-Schleife, die die Zahlen von 0 bis 20 auf die Konsole ausgibt.
1. Schreiben Sie eine Schleife, die alle geraden Zahlen zwischen 0 und 20 (inklusiv)
ausgibt.
1. Schreiben Sie eine Schleife, die die Zahlen von 20 bis 0 absteigend ausgibt.
1. Schreiben Sie eine Schleife, die jede dritte Zahl zwischen 20 und 0 absteigend ausgibt
(also 20, 17, 14, …).

## Aufgabe 5: Fehlersuche

Betrachten Sie folgendes Code-Snippet.
```java
int number = 5;
while (number > 0)
{
    int doubled = number + number;
    IO.println(doubled);
}
```
1. Im Code befindet sich ein Fehler. Identifizieren und beheben Sie ihn.
1. Schreiben Sie nun eine Durchlauftabelle für die Werte von number und doubled,
   oder gehen Sie Ihren Code mit dem _Debugger_ durch.

## Aufgabe 6: Passwortlänge
Sie wollen eine simple kleine Passwortkontrolle schreiben, die überprüft, ob ein eingegebenes Passwort mindestens 8 Zeichen lang ist. Dazu liegt Ihnen bereits folgender Code
vor:
```java
String password    = IO.readln("Bitte geben Sie ein Passwort mit min. 8 Zeichen ein: ");
int passwordLength = password.length();
IO.println("Passwortlänge: " + passwordLength);
```
Passen Sie nun den Code mit einer `while`-Schleife an: Der Benutzer soll solange ein neues
Passwort eingeben, bis es die geforderte Mindestlänge hat.

## Aufgabe 7: Das `break` Statement
In dieser Aufgabe lernen Sie das Schlüsselwort `break` kennen, mit dem Sie eine Schleife vorzeitig abbrechen können.
Betrachten Sie dazu den folgenden Code. **Führen Sie ihn noch nicht aus:**
```java
int countdown = 10;
while (countdown > 0)
{
    IO.println(countdown);
    if (countdown == 5)
    {
        break;
    }
    countdown--; // Was passiert in dieser Zeile?
}
```
1. Beschreiben Sie in einem Satz, was der Code tut. Was bewirkt die Anweisung `break` in Zeile 7 in diesem Code?
1. Führen Sie den Code nun aus und beobachten Sie sein Verhalten. Was passiert, wenn Sie die `break`-Anweisung entfernen?
1. Verändern Sie den Code so, dass der Countdown schon bei 7 abbricht.

## Aufgabe 8: Namen raten

Schreiben Sie das Ratespiel aus dem Märchen »Rumpelstilzchen« in Java: Die Königstochter hat dort 3 Versuche, den Namen Rumpelstilzchen zu erraten.
Aus dem Unterrichtsskript liegt Ihnen bereits folgender Code vor:
```java
String myName = "Rumpelstilzchen";
String guess  = IO.readln("Rate meinen Namen: ");
if (guess.equals(myName)) // nicht: ==
{
    IO.println("Richtig!");
}
else
{
    IO.println("Leider falsch ...");
}
```
1. Aktuell hat der Benutzer nur einen Versuch, den Namen zu erraten. Verändern Sie den Code mithilfe einer `while`-Schleife nun so, dass man 3 Versuche hat.
1. Sorgen Sie mit dem Schlüsselwort break dafür, dass die Schleife vorzeitig endet, wenn der Name richtig geraten wurde.