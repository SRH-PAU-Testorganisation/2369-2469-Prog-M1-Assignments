void main()
{
    int number = 1;
    while (number <= 50)
    {
        if (number % 3 == 0 && number % 5 == 0)
        {
            IO.println("FizzBuzz");
        }
        else if (number % 3 == 0)
        {
            IO.println("Fizz");
        }
        else if (number % 5 == 0)
        {
            IO.println("Buzz");
        }
        else
        {
            IO.println(number);
        }

        number++;
    }
}