import java.util.Scanner
import Choice as Choice


fun main(args: Array<String>) {
    var listOfArhiv = mutableListOf<Arhiv>()
    val notesOfMenu: Notes = Notes()
    val menu = Choice()
    val arhiv: Arhiv = Arhiv()
    var flag = true
    if (args.size == 0)
        println("Здравствуйте, вас приветствует мастер заметок! Нажмите номер нужной команды")

        do {

            menu.createMenu(notesOfMenu.listOfMainMenu)
            var choice = menu.choice()
            if (listOfArhiv.size != 0) {
                when (choice) {
                    "0" -> arhiv.createArhive(listOfArhiv)
                    "1" -> arhiv.readArhive(listOfArhiv)
                    "2" -> flag = false
                    else -> println("Введена некорректная команда")
                }
            } else {
                when (choice) {
                    "0" -> arhiv.createArhive(listOfArhiv)
                    "1" -> println("У вас нет созданных архивов, создайте свой первый архив")
                    "2" -> break
                    else -> println("Введена некорректная команда")
                }
            }
        }while (flag == true)

    println("Вы закончили работу с заметками")
}

