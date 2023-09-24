import java.util.*

class Note() {
    private var name: String = ""
    var notes: String = ""
    val menu = Choice()
    val listArhiv = Notes()
    var flag = true
    fun readNoteslist(arhiv: Arhiv, list: MutableList<Arhiv>) {
        do {
            var listOfMenu = mutableListOf("0 - Выход", "1 - Создание новой заметки")
            for (note in arhiv.listOfNotes) {
                listOfMenu.add(note.name)
            }
            menu.createMenu(listOfMenu)
            println("Выберете заметку")
            val command = menu.choice()
            when (command) {
                "0" -> return
                "1" -> createNote(arhiv, list)
                else -> {
                    var notes = Note()
                    for (note in arhiv.listOfNotes) {
                        if (note.name == command) {
                            notes = note
                        }
                    }
                    if (notes.name.equals("")) println("Введена неверная команда")
                    println(notes.notes)
                    println("Нажмите любую кнопку для возврата в предыдущее меню")
                    menu.choice()

                }


            }
        } while (true)
    }


    fun createNote(arhiv: Arhiv, list: MutableList<Arhiv>) {
        flag = true

        while (flag == true) {
            println("Введите название заметки")
            val nameNote = menu.choice()
            if (nameNote.equals("")) println("Ошибка, вы не ввели название заметки!")
            else {

                while (flag == true) {
                    println("Введите заметку")
                    val notesName = menu.choice()
                    if (notesName.equals("")) println("Ошибка, вы не ввели текст заметки!")
                    else {
                        val newNote = Note()
                        newNote.name = nameNote
                        newNote.notes = notesName
                        arhiv.listOfNotes.add(newNote)
                        println("Вы создали новую заметку")
                        return
                    }
                }
            }
        }
    }
}