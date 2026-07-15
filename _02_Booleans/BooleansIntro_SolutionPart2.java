void main()
{
    IO.println("===== 03 Booleans =====");
    IO.println("--- Aufgabe 1 ---");

    boolean a = 9 > 5;
    IO.println("Variable a: " + a);
    boolean b = 4 == 2;
    IO.println("Variable b: " + b);
    boolean c = 5 != 8;
    IO.println("Variable c: " + c);
    boolean d = 2 <= 2;
    IO.println("Variable d: " + d);

    // Tipp: In einem String-Literal fügt \n einen Zeilenumbruch hinzu
    IO.println("\n--- Aufgabe 2 ---");

    a = true && true; // true
    b = true || false; // true
    c = true && false || false; // false
    d = (true || false) && false; // false
    boolean e = !(false || true) || !false && true || false; // true

    IO.println("Variable a: " + a);
    IO.println("Variable b: " + b);
    IO.println("Variable c: " + c);
    IO.println("Variable d: " + d);
    IO.println("Variable e: " + e);

    IO.println("\n--- Aufgabe 3 ---");

    float   aa = 7.2f;
    int     bb = 4;
    boolean cc = true;

    boolean lightIsOn = false;

    d         = aa > 6 || cc == true && bb == 5; // true
    e         = !cc || cc;
    boolean f = cc == false || aa > 3 && bb == 3;
    boolean g = (!cc || aa < 2) && aa > 10; // false
    boolean h = (!cc && bb != 3) || aa != 8;

    IO.println(d);
    IO.println(e);
    IO.println(f);
    IO.println(g);
    IO.println(h);

    IO.println("\n--- Aufgabe 4 ---");

    int     age          = 16;
    boolean withAdult    = false;
    boolean hasVipTicket = false;

    boolean canEnter = hasVipTicket || age >= 16 || withAdult;

    IO.println("Darf rein: " + canEnter);


    IO.println("\n--- Aufgabe 5 ---");








}

