package com.young.interaction.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "\"call\"")
data class CallModel(
    @Id
    @GeneratedValue
    val id: Long,
    var callId: String?,
    val userId: String?,
    val roomId: String?,
    var status: String?,
    var sdp: String?,
): BaseTimeEntity()
