class Pessoa {
    var nome: String = "Victor"
    var cpf: String = "105.220.516-78"

    inner class Endereco {
        var rua: String = "Rua Teste"
        private set

    }
}
fun main() {
    val victor = Pessoa()

    println(victor.nome)
    println(victor.cpf)
    println(victor.Endereco().rua)

}


