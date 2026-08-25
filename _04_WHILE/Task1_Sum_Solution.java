void main()
{
    int sum = 0;
    int number = 1;
    while (number <= 100)
    {
        sum += number;
        IO.println("Durchlauf Nr. " + number + " => " + sum);
        number++;
    }

    IO.println("Endergebnis: " + sum);
}