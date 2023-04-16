package com.example.futbol.controller

import com.example.futbol.model.Player
import com.example.futbol.service.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/player")

class PlayerController {

    @Autowired
    lateinit var playerService: PlayerService

    @GetMapping
    fun list ():List <Player>{
        return playerService.list()
    }

    @PostMapping
    fun save (@RequestBody player: Player): Player?{
        return playerService.save(player)
    }

}