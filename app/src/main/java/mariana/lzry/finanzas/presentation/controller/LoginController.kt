package mariana.lzry.finanzas.presentation.controller

import javax.inject.Inject
import javax.inject.Singleton

const val password = "1234"

@Singleton
class LoginController @Inject constructor(){

    /*fun onLoginClicked(incomingPassword: String){
        if(isValidPassword(incomingPassword)){
        }
    }*/

    fun isValidPassword(incomingPassword: String): Boolean =
        incomingPassword.compareTo(password) == 0

}