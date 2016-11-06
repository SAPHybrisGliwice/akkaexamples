/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package com.szymik.hackyourcareer.actors.example2

import akka.actor.{ActorSystem, Props}
import com.szymik.hackyourcareer.actors.TerminatorActor

object Start {

  def main(args: Array[String]): Unit = {
    val system = ActorSystem("PolitechnikaSlaska")

    val mainActor = system.actorOf(MainActor.props(), "mainActor")
    system.actorOf(Props(new TerminatorActor(mainActor)), "terminator")
  }
}
