void main()
{
    IO.println("=== MUSTERLÖSUNG: Car Dealer ===");

    int soldCars = 90;
    int bonusDays = 0;

    if (soldCars >= 60)
    {
        bonusDays = soldCars / 30;
    }
    else if (soldCars >= 20)
    {
        bonusDays = 1;
    }

    IO.println("Bonustage: " + bonusDays);
}
