package japa.com.br

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class GreetingService {

    fun greet(name: String) = "Hello $name'"
}