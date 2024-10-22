import kotlin.math.roundToInt

interface Heal {
    fun heal(health:Double = 1.0){
    }
}

abstract class Human (var Health:Int, var Power:Int):Heal {
    open fun attack():Int {
        return Power
    }
    override open fun heal(health:Double){
        if (Health <= 0){Health = 0}
        else{Health = Health + (Health*0.1).roundToInt()}
    }
}
enum class who {
    WIZARD, KNIGHT, ROBOT
}

class Wizard(Health:Int, Power:Int, var Mana:Int, who: who):Human(Health, Power){
    val beginW = Health
    override fun heal(health:Double){
        val rnds = (0..5).random()
        if (beginW< Health + rnds){Health = 100}
        else{Health += rnds}
    }
    fun mana():Int{
        if (Mana - (Mana*0.1).roundToInt() >= 0){Mana = Mana - (Mana*0.1).roundToInt()}
        else {Mana = 0; Power = (0.5*Power).roundToInt()}
        return Mana
    }
    override fun attack():Int{
        return Power+Mana
    }
}
class Robot(Health:Int, Power:Int, var Battery:Int, who: who):Human(Health, Power){
    val beginR = Health
    override fun heal(health:Double){
        val rnds = (0..5).random()
        if (beginR< Health + rnds){Health = 100}
        else{Health += rnds}
    }
    fun battery():Int{
        return Battery
    }
    override fun attack():Int{
        if (Battery - (Battery*0.1).roundToInt() > 0){Battery = Battery - (Battery*0.1).roundToInt()}
        else {println("Заряд робота закончился!"); Battery = 0; Power = 0; Health = 0}

        return Power
    }
}
class Knight(Health:Int, Power:Int, var Defence:Int, who: who):Human(Health, Power){
    val beginK = Health
    override fun heal(health:Double){
        val rnds = (0..10).random()
        if (beginK< Health + rnds){Health = 100}
        else{Health += rnds}
    }
    fun defence():Int{
        return Defence
    }
}

fun main() {
    println("Какого персонажа хотите создать(Маг, робот, рыцарь)?")
    var who1 = '3'
    var whooo: String? = readLine()
    if (whooo == "Маг") {
        who1 = '1'
    } else if (whooo == "Робот") {
        who1 = '2'
    } else if (whooo == "Рыцарь") {
        who1 = '3'
    }
    lateinit var first: Human
    when (who1) {
        '1' -> {
            println("Создаем мага!");
            println("Введите здоровье: ");
            var a: Int = readLine()!!.toInt()
            println("Введите силу атаки: ");
            var b: Int = readLine()!!.toInt()
            println("Введите ману: ");
            var c: Int = readLine()!!.toInt()
            first = Wizard(a, b, c, who.WIZARD)
        }

        '2' -> {
            println("Создаем робота!");
            println("Введите здоровье: ");
            var a1: Int = readLine()!!.toInt()
            println("Введите силу атаки: ");
            var b1: Int = readLine()!!.toInt()
            println("Введите батарею: ");
            var c1: Int = readLine()!!.toInt()
            first = Robot(a1, b1, c1, who.ROBOT)
        }

        '3' -> {
            println("Создаем рыцаря!");
            println("Введите здоровье: ");
            var a2: Int = readLine()!!.toInt()
            println("Введите силу атаки: ");
            var b2: Int = readLine()!!.toInt()
            println("Введите защиту: ");
            var c2: Int = readLine()!!.toInt()
            first = Knight(a2, b2, c2, who.KNIGHT)
        }
    }
    println("-------------------");
    println("Какого персонажа хотите создать(Маг, робот, рыцарь)?")
    var who1_1 = '3'
    var whooo_1: String? = readLine()
    if (whooo_1 == "Маг") {
        who1_1 = '1'
    };
    else if (whooo_1 == "Робот") {
        who1_1 = '2'
    };
    else if (whooo_1 == "Рыцарь") {
        who1_1 = '3'
    };
    lateinit var second: Human
    when (who1_1) {
        '1' -> {
            println("Создаем мага!");
            println("Введите здоровье: ");
            var a: Int = readLine()!!.toInt()
            println("Введите силу атаки: ");
            var b: Int = readLine()!!.toInt()
            println("Введите ману: ");
            var c: Int = readLine()!!.toInt()
            second = Wizard(a, b, c, who.WIZARD)
        }

        '2' -> {
            println("Создаем робота!");
            println("Введите здоровье: ");
            var a1: Int = readLine()!!.toInt()
            println("Введите силу атаки: ");
            var b1: Int = readLine()!!.toInt()
            println("Введите батарею: ");
            var c1: Int = readLine()!!.toInt()
            second = Robot(a1, b1, c1, who.ROBOT)
        }

        '3' -> {
            println("Создаем рыцаря!");
            println("Введите здоровье: ");
            var a2: Int = readLine()!!.toInt()
            println("Введите силу атаки: ");
            var b2: Int = readLine()!!.toInt()
            println("Введите защиту: ");
            var c2: Int = readLine()!!.toInt()
            second = Knight(a2, b2, c2, who.KNIGHT)
        }
    }
    println("-------------------");

    println("Какого персонажа хотите создать(Маг, робот, рыцарь)?")
    var who1_2 = '3'
    var whooo_2: String? = readLine()
    if (whooo_2 == "Маг") {
        who1_2 = '1'
    } else if (whooo_2 == "Робот") {
        who1_2 = '2'
    } else if (whooo_2 == "Рыцарь") {
        who1_2 = '3'
    }
    lateinit var third: Human
    when (who1_2) {
        '1' -> {
            println("Создаем мага!");
            println("Введите здоровье: ");
            var a: Int = readLine()!!.toInt()
            println("Введите силу атаки: ");
            var b: Int = readLine()!!.toInt()
            println("Введите ману: ");
            var c: Int = readLine()!!.toInt()
            third = Wizard(a, b, c, who.WIZARD)
        }

        '2' -> {
            println("Создаем робота!");
            println("Введите здоровье: ");
            var a1: Int = readLine()!!.toInt()
            println("Введите силу атаки: ");
            var b1: Int = readLine()!!.toInt()
            println("Введите батарею: ");
            var c1: Int = readLine()!!.toInt()
            third = Robot(a1, b1, c1, who.ROBOT)
        }

        '3' -> {
            println("Создаем рыцаря!");
            println("Введите здоровье: ");
            var a2: Int = readLine()!!.toInt()
            println("Введите силу атаки: ");
            var b2: Int = readLine()!!.toInt()
            println("Введите защиту: ");
            var c2: Int = readLine()!!.toInt()
            third = Knight(a2, b2, c2, who.KNIGHT)
        }
    }
    println("-------------------");
    println("Начинаем сражение!")


    while (first.Health > 0 && second.Health > 0 && third.Health > 0) {
        second.Health -= first.attack()
        second.heal()
        if (second.Health <= 0) {
            second.Health = 0
        }
        print("Первый персонаж атакует второго! Результат - здоровье второго персонажа = ");println(second.Health)
        if (second.Health <= 0) {
            break
        }

        third.Health -= second.attack() //;if (second.Health <=0){second.Health=0;}
        third.heal()
        if (third.Health <= 0) {
            third.Health = 0
        }
        print("Второй персонаж атакует третьего! Результат - здоровье третьего персонажа = ");println(third.Health)
        if (third.Health <= 0) {
            break
        }

        first.Health -= third.attack()
        first.heal()
        if (first.Health <= 0) {
            first.Health = 0
        }
        print("Третий персонаж атакует первого! Результат - здоровье первого персонажа = ");println(first.Health)
        if (first.Health <= 0) {
            break
        }
    }
    println("-------------------");
    if (first.Health <= 0) {
        println("Первый персонаж проиграл")
    }
    if (second.Health <= 0) {
        println("Второй персонаж проиграл")
    }
    if (third.Health <= 0) {
        println("Третий персонаж проиграл")
    }
}