class Aluno(val ra: Int, var nome: String, var sobrenome: String) {


    fun assistirAula(aula: Aula) {
        println("Eu $nome estou assistindo ${aula.materia.nome}")
    }

    fun fazerTarefa(aula: Aula) {
       println("Eu $nome fiz a tarefa de ${aula.materia.nome}")
    }
}