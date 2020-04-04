package com.devnokiyo.demo.filter

import com.devnokiyo.demo.shared.UserInfo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class SessionFilter : OncePerRequestFilter() {

    @Autowired
    private lateinit var userInfo: UserInfo

    override fun doFilterInternal(request: HttpServletRequest, response: HttpServletResponse, filterChain: FilterChain) {
        println("name: ${userInfo.name}")
        filterChain.doFilter(request, response)
    }
}