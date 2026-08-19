void main()
{
    IO.println("=== MUSTERLÖSUNG: Theme Park A ===");

    // Daten
    int     age           = 15;
    boolean isMonday      = true;
    boolean isHandycapped = true;

    // Preisberechnung
    double price;
    if (age < 6)
    {
        price = 0;
    }
    else if (age <= 16)
    {
        price = 15;
    }
    else
    {
        price = 20;
    }

    if (isHandycapped)
    {
        price = price * 0.8;
    }

    if (isMonday)
    {
        price = price - 2;
    }

    // Der Preis sollte nie ins negative gehen
    if (price < 0)
    {
        price = 0;
    }

    // Ausgabe
    if (isMonday)
    {
        IO.println("Es ist Montag.");
    }
    if (isHandycapped)
    {
        IO.println("Vergünstigung durch Behinderung wurde angewandt.");
    }
    IO.println("Alter: " + age + " Jahre");
    IO.println("Eintrittspreis: " + price + "€");
}
