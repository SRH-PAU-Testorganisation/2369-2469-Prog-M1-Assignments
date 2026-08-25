void main()
{
    int start = 10;
    IO.println("| Zahl | mal Zwei |");
    IO.println("|------|----------|");
    while (start <= 30)
    {
        IO.println("|    " + start + " |         " + (start * 2) + " |");
        start++;
    }
}