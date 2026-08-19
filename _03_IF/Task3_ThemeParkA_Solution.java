void main()
{
    IO.println("=== MUSTERLÖSUNG: Theme Park A ===");

    // Daten
    int     age       = 14;
    boolean isWeekend = true;

    // Preisberechnung
    int price;
    if (age < 6)
    {
        price = 0;
    }
    else if (age <= 16)
    {
        price = 10; // <-- kann auch in einen else-Block
        if (isWeekend)
        {
            price = 12;
        }
    }
    else
    {
        price = 15; // <-- kann auch in einen else-Block
        if (isWeekend)
        {
            price = 20;
        }
    }

    // Ausgabe
    if (isWeekend)
    {
        IO.println("Es ist Wochenende.");
    }
    IO.println("Alter: " + age + " Jahre");
    IO.println("Eintrittspreis: " + price + "€");
}
