package no.omegapoint.kotlindemo.statistics

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("statistic")
class MatchStatisticController(
    private val matchStatisticService: MatchStatisticService
) {
    @GetMapping("wins")
    fun wins() {
        return matchStatisticService.wins()
    }

    @GetMapping("losses")
    fun losses() {
        return matchStatisticService.losses()
    }
}