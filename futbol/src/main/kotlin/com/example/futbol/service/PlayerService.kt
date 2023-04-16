package com.example.futbol.service

import com.example.futbol.model.Player
import com.example.futbol.repository.PlayerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Service

class PlayerService {

    @Autowired
    lateinit var playerRepository: PlayerRepository

    fun list(): List<Player>{
        return playerRepository.findAll()
    }

    fun save (player: Player): Player?{
        return playerRepository.save(player)
    }
}