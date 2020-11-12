fun main() {
    var aluno = Aluno(12345, "alex", "silva")
    var aluno1 = Aluno(65432, "bbb", "DDD")
    var aluno2 = Aluno(98765, "ccc", "FFF")

    var materia = Materia("mobile")
    var materia1 = Materia("python")
    var materia2 = Materia("java")

    var aula = Aula(materia, "09:00", "12:00")
    var aula1 = Aula(materia1, "10:00", "14:00")
    var aula2 = Aula(materia2, "11:00", "13:00")

    var professor = Docente (1234,"ffff", "hhhhh")


    var listaAula = ArrayList<Aula>()
    listaAula.add(aula)
    listaAula.add(aula1)
    listaAula.add(aula2)
    var listaAluno = ArrayList<Aluno>()
    listaAluno.add(aluno)
    listaAluno.add(aluno1)
    listaAluno.add(aluno2)

    println()

}