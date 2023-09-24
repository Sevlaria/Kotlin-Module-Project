import java.util.*

class Choice {

    fun choice(): String {

        var choice = Scanner(System.`in`).nextLine()
        return choice
    }

    fun createMenu(listOfMenu: List<String>) {

        for (punkt in listOfMenu) {
            println("$punkt")
        }


    }


}