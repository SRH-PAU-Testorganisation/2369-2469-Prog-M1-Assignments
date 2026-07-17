void main()
{
    IO.println("=== MUSTERLÖSUNG: Bonus Salary ===");

    int sales = 101_000;

    // Einen "Standardwert" festlegen
    double bonusPercentage = 2.5;

    // Sonderfälle behandeln
    if (sales > 100_000)
    {
        bonusPercentage = 10.0;
    }
    else if (sales > 50_000)
    {
        bonusPercentage = 5.0;
    }

    // Bonus berechnen
    double bonusSalary = sales * (bonusPercentage / 100);

    // Ausgabe
    IO.println("Bonuszahlung: " + bonusSalary);
}
