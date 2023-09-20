import java.util.*

class Arhiv() {
    val listOfNotes = mutableListOf<Note>()
    var name: String = ""
    val list = Notes()
    fun createArhive(list: MutableList<Arhiv>) {
        println("Введите название архива")
        val name = Scanner(System.`in`).nextLine()
        val arhiv = Arhiv()
        arhiv.name = name
        list.add(arhiv)
        println("Вы создали новый архив записей:$name")
    }

    fun readArhive(list: MutableList<Arhiv>) {
        val listOfArhive: MutableList<String> = mutableListOf()
        for (arhiv in list) {
            listOfArhive.add(arhiv.name)
        }

        val menu = Choice()
        menu.createMenu(listOfArhive)
        println("Выберете архив для просмотра или нажмите '0' для выхода из меню")
        val command = menu.choice()
        when (command) {
            "0" -> return
            else -> {
                var arhiv = Arhiv()
                for (arh in list) {
                    if (arh.name.equals(command)) {
                        arhiv = arh
                    }
                }
                if (arhiv.name.equals("")) println("Введена неверная команда")

                val notes = Note()
                notes.readNoteslist(arhiv, list)
            }
        }


    }
}