import kotlin.random.Random
import kotlin.test.assertEquals


fun main(args: Array<String>) {
//    println("Hello World!")
    println("1.FELADAT");
    println();
    val a = 2;
    val b = 3;
    var c = a + b;
    println("$a + $b = $c");
    println();

    println("2.FELADAT");
    println();
    val list = listOf("Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
    for(s in list){
        println(s);
    }

    println();
    println(list.filter{s -> s.first() == 'T'});

    println();
    println(list.filter{s -> s.contains('e') });

    println();
    println(list.filter{s -> s.length == 6});

    println();

    println("3.FELADAT");
    println();
    println("Prime numbers:");
    for(i in 1..50){
        if(isPrime(i)){
            print("$i,");
        }
    }

    println("3.FELADAT");
    println();


    println("5.FELADAT");
    println();
    var myList = listOf(1, 4, 8, 5, 6, 9, 12, 10, 33);
    println("Numbers: $myList");
    var myList2=isEvenNum(myList);
    println("Even numbers: $myList2");

    println("6.FELADAT");
    println();
    println("The list: $myList2");
    val map = mapOf(myList2.get(0) to myList2.get(0)*2,
                    myList2.get(1) to myList2.get(1)*2,
                    myList2.get(2) to myList2.get(2)*2,
                    myList2.get(3) to myList2.get(3)*2,
                    myList2.get(4) to myList2.get(4)*2);
    for((key,value)in map) println("$value ");

    println();
    var myList3 = listOf("monday","tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");
    val map2 = mapOf(myList3.get(0) to myList3.get(0).uppercase(),
                    myList3.get(1) to myList3.get(1).uppercase(),
                    myList3.get(2) to myList3.get(2).uppercase(),
                    myList3.get(3) to myList3.get(3).uppercase(),
                    myList3.get(4) to myList3.get(4).uppercase(),
                    myList3.get(5) to myList3.get(5).uppercase(),
                    myList3.get(6) to myList3.get(6).uppercase());
    for((key,value)in map2) println("$value");

    println();
    val map3 = mapOf(myList3.get(0) to myList3.get(0).substring(0,1).toUpperCase() + myList3.get(0).substring(1),
        myList3.get(1) to myList3.get(1).substring(0,1).toUpperCase() + myList3.get(1).substring(1),
        myList3.get(2) to myList3.get(2).substring(0,1).toUpperCase() + myList3.get(2).substring(1),
        myList3.get(3) to myList3.get(3).substring(0,1).toUpperCase() + myList3.get(3).substring(1),
        myList3.get(4) to myList3.get(4).substring(0,1).toUpperCase() + myList3.get(4).substring(1),
        myList3.get(5) to myList3.get(5).substring(0,1).toUpperCase() + myList3.get(5).substring(1),
        myList3.get(6) to myList3.get(6).substring(0,1).toUpperCase() + myList3.get(6).substring(1));
    for((key,value)in map3) println("$value");

    println();
    val map4 = mapOf(myList3.get(0) to myList3.get(0).count(),
        myList3.get(1) to myList3.get(1).count(),
        myList3.get(2) to myList3.get(2).count(),
        myList3.get(3) to myList3.get(3).count(),
        myList3.get(4) to myList3.get(4).count(),
        myList3.get(5) to myList3.get(5).count(),
        myList3.get(6) to myList3.get(6).count());
    for((key,value)in map4) println("$key = $value");

    var average = 0;
    var num = 0;
    for((key,value)in map4) {
        average = average + value;
        num++;
    };
    var avg = average/num;
    println("The average  length of days: $avg");

    println("7.FELADAT");
    println();
    val string = "Mama a legszebb";
    println(string);
    val encodedstring = encode(string);
    val decoded = decode(encodedstring);
    println("Encoded string: " + encodedstring);
    println("Decoded string: " + decode(encodedstring));
    println();

    println("8.FELADAT");
    println();
    val stringMutableList = list.toMutableList();
    val NContains = stringMutableList.filterNot{s -> s.contains('n') };
    println(NContains);
    for((index,value) in  NContains.withIndex()){
        println("Item at $index is $value");
    }
    println(NContains.sorted());

    println();
    println("8.FELADAT");
    println();
    val from = 0
    val to = 100
    val random = Random
    var amplititudes  = IntArray(10) { random.nextInt(to - from) +  from };
    amplititudes.forEach{
        println("$it");
    }
    println(amplititudes.sorted());

    if(amplititudes.anyEvenNum()){
        println("Contains any even number");
    }
    else{
        println("Not contains any even number");
    }

    if(amplititudes.allEvenNum()){
        println("All are even number");
    }
    else{
        println("Not all are even number");
    }

    var average2 = 0;
    var num2 = 0;
    for(i in amplititudes) {
        average = average + i;
        num++;
    };
    var avg2 = average/num;
    println("The average of generated numbers: ");
    amplititudes.forEach{
        println("$avg2");
    }





    // Try adding program arguments at Run/Debug configuration
//    println("Program arguments: ${args.joinToString()}")
}

fun IntArray.anyEvenNum():Boolean{
    for(i in this){
        if(i % 2 == 0) {
            return true;
        }
    }
    return false;
}

fun IntArray.allEvenNum():Boolean{
    for(i in this){
        if(i % 2 != 0) {
            return false;
        }
    }
    return true;
}

fun isPrime(number: Int): Boolean {
    if(number<2) return false;
    for (i in 2.toLong()..number/2) {
        if (number % i == 0.toLong()) {
            return false;
        }
    }
    return true;
}

fun isEvenNum(myList: List<Int>) =  myList.filter { x -> x % 2 == 0 };

fun encode(string:String): StringBuilder{
    val newstring = StringBuilder();
    for(i in string){
        var i = i+1;
        newstring.append(i);
    }
    return newstring;
}

fun decode(string:StringBuilder): StringBuilder{
    val newstring = StringBuilder();
    for(i in string){
        var i = i-1;
        newstring.append(i);
    }
    return newstring;
}
