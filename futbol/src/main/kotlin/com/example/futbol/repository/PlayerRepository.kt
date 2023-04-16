package com.example.futbol.repository

import com.example.futbol.model.Player
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface PlayerRepository:JpaRepository<Player, Long> {
}