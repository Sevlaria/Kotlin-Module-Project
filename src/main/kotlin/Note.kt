import java.util.*

class Note() {
    private var name:String =""
    var notes: String = ""
    val menu = Choice()
    val listArhiv = Notes()
    fun readNoteslist(arhiv: Arhiv, list: MutableList<Arhiv>) {
        var listOfMenu = mutableListOf("0 - Выход", "1 - Создание новой заметки")
        for (note in arhiv.listOfNotes) {
            listOfMenu.add(note.name)
        }
        menu.createMenu(listOfMenu)
        println("Выберете заметку")
        val command = menu.choice()
        when (command) {
            "0" -> arhiv.readArhive(list)
            "1" -> createNote(arhiv, list)
            else -> { var notes = Note()
                for(note in arhiv.listOfNotes) {
                    if (note.name == command) {
                        notes = note
                    }
                }
                if (notes.name.equals("")) println("Введена неверная команда")
                    println(notes.notes)
                    menu.choice()
                    readNoteslist(arhiv, list)
            }


            }
        }


    fun createNote(arhiv: Arhiv, list: MutableList<Arhiv>) {
        println("Введите название заметки")
        val name = menu.choice()
        println("Введите заметку")
        val notes = menu.choice()
        val newNote = Note()
        newNote.name = name
        newNote.notes = notes
        arhiv.listOfNotes.add(newNote)
        println("Вы создали новую заметку")
        readNoteslist(arhiv, list)
    }
    }