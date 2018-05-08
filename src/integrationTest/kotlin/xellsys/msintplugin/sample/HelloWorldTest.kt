package xellsys.msintplugin.sample

import com.github.kittinunf.fuel.httpGet
import org.junit.Assert
import org.junit.Test
import java.io.File

class HelloWorldTest {

    val serviceUrl = resolveUrl()

    @Test
    fun callHelloWorld() {
        val (request, response, result) = serviceUrl.httpGet().responseString()

        Assert.assertEquals(response.responseMessage, "Hello World!")
    }


    private fun resolveUrl(): String {
        if (inDocker()) {
            return "http://kotlinhelloworld:8080"
        } else {
            return "http://localhost:8080"
        }
    }

    private fun inDocker(): Boolean {
        return File("/.dockerenv").exists()
    }
}