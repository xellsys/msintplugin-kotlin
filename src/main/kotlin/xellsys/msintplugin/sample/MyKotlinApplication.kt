package xellsys.msintplugin.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class PaketAnnahmeApplication

fun main(args: Array<String>) {
    runApplication<PaketAnnahmeApplication>(*args)
}
