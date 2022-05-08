package mariana.lzry.finanzas.presentation.view.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import mariana.lzry.finanzas.R
import mariana.lzry.finanzas.databinding.LoginActivityBinding
import mariana.lzry.finanzas.presentation.controller.LoginController
import mariana.lzry.finanzas.presentation.view.MainActivity
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var loginController: LoginController

    private lateinit var binding: LoginActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        binding = LoginActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickLogin()
    }

    private fun setOnClickLogin() {
        binding.loginButton.setOnClickListener {
            hideKeyboard()
            validatePasswordAndContinueFlow()
        }
    }

    private fun hideKeyboard(){
        val inputManager = getSystemService(Context.INPUT_METHOD_SERVICE)
        (inputManager as InputMethodManager).hideSoftInputFromWindow(binding.root.windowToken, 0)
    }

    private fun validatePasswordAndContinueFlow() {
        val passwordText = binding.editTextTextPassword.editableText.toString()
        if (loginController.isValidPassword(passwordText)) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this, R.string.login_invalid_password, Toast.LENGTH_SHORT).show()
        }
    }
}