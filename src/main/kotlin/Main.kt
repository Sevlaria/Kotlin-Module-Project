import java.util.Scanner
import Choice as Choice


fun main(args: Array<String>) {
    println("Здравствуйте, вас приветствует мастер заметок! Нажмите номер нужной команды")
    val notesOfMenu: Notes = Notes()
    val listOfArhiv = mutableListOf<Arhiv>()
    val menu = Choice()
    val arhiv:Arhiv = Arhiv()
    while(true) {
        menu.createMenu(notesOfMenu.listOfMainMenu)
     var choice = menu.choice()
      when (choice) {
          "0" -> arhiv.createArhive(listOfArhiv)
          "1" -> arhiv.readArhive(listOfArhiv)
          "2" -> break
          else -> println("Введена некорректная команда")
      }
    }
    println("Вы закончили работу с заметками")
}
