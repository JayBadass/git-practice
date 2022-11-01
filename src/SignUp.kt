package src

fun signUp(email: String, password: String, password2: String) {
    if (password === password2) {
        println("회원가을 한다 : $email")
    }
}