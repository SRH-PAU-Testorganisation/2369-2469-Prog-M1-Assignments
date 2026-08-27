void main()
{
    int passwordLength = 0;
    String password    = "";

    while (passwordLength < 8)
    {
        password       = IO.readln("Bitte geben Sie ein Passwort mit min. 8 Zeichen ein: ");
        passwordLength = password.length();
    }

    IO.println("Passwort akzeptiert: " + password);

    // Bonus: Können Sie die Aufgabe auch ohne die Variable "passwordLenght" kürzer lösen?
}