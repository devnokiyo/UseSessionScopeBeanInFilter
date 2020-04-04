package com.devnokiyo.demo.controller

import com.devnokiyo.demo.shared.UserInfo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.util.*

@Controller
class RootController {

    @Autowired
    private lateinit var userInfo: UserInfo

    @GetMapping("/")
    fun index(model: Model): String {
        userInfo.name = "devnokiyo: ${Date()}"
        return "index"
    }
}