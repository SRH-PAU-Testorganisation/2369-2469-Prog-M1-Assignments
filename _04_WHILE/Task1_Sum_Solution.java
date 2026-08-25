void main()
{
    int sum = 0;
    int num = 1;
    while (num <= 100)
    {
        sum += num;
        IO.println("Durchlauf Nr. " + num + " => " + sum);
        num++;
    }

    IO.println("Endergebnis: " + sum);
}