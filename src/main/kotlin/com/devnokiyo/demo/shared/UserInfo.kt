package com.devnokiyo.demo.shared

import org.springframework.stereotype.Component
import org.springframework.web.context.annotation.SessionScope
import java.io.Serializable

@Component
@SessionScope
data class UserInfo(
        var name: String?
) : Serializable