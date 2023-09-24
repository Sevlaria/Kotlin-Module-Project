import java.util.*

class Arhiv() {
    val listOfNotes = mutableListOf<Note>()
    var name: String = ""
    val list = Notes()
    var flag = true
    fun createArhive(list: MutableList<Arhiv>): MutableList<Arhiv> {
        flag = true

        while (flag == true) {
            println("Введите название архива")
            val nameArhiv = Scanner(System.`in`).nextLine()
            if (nameArhiv.equals("")) println("Ошибка, вы не ввели название архива!")
else{
        val arhiv = Arhiv()
        arhiv.name = nameArhiv
        list.add(arhiv)
        println("Вы создали новый архив записей:$nameArhiv")
        flag = false}}
        return list
    }

    fun readArhive(list: MutableList<Arhiv>) {

        do {
            val listOfArhive: MutableList<String> = mutableListOf()
            for (arhiv in list) {
                listOfArhive.add(arhiv.name)
            }

            val menu = Choice()
            menu.createMenu(listOfArhive)
            println("Выберете архив для просмотра или нажмите '0' для выхода из меню")
            val command = menu.choice()
            when (command) {
                "0" -> {
                    return
                }
                else -> {
                    var arhiv = Arhiv()
                    for (arh in list) {
                        if (arh.name.equals(command)) {
                            arhiv = arh
                        }
                    }

                    if (arhiv.name.equals("")) println("Введена неверная команда")
                    else {

                        val notes = Note()
                        notes.readNoteslist(arhiv, list)
                    }
                }
            }


        } while ( true)
    }
}