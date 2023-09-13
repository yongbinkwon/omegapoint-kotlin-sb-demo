package no.omegapoint.kotlindemo.statistics

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MatchStatisticService(
    //private val matchStatisticRepository: MatchStatisticRepository,
    @Value("\${team}") private val teamName: String,
) {
    @Transactional(readOnly = true)
    fun wins() {
        //matchStatisticRepository.yourMethod(teamName)
    }

    @Transactional(readOnly = true)
    fun losses() {
        //matchStatisticRepository.yourMethod(teamName)
    }
}