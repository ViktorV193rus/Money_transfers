fun main() {
    val userLiza = "Лиза"
    val userViktor = "Виктор"
    val moneyLiza = 500.0
    val moneyViktor = 50000.0
    val limitCommission = 100
    val minCommission = 35
    var amount: Double = moneyLiza

    if (moneyLiza < limitCommission) {
        amount -= minCommission
    } else {
        amount -= (moneyLiza * 0.75) / 100
    }
    val commission = moneyLiza - amount
    val check = moneyViktor + amount

    println("$userLiza перевела $userViktor ${moneyLiza.toInt()} руб., " +
            "c учетом вычета комиссии $commission руб., перевод составил $amount, " +
            "теперь у $userViktor на счету $check руб.")
    }
