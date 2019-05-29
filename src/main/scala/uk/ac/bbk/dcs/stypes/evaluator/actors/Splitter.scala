package uk.ac.bbk.dcs.stypes.evaluator.actors

import akka.actor.Actor
import uk.ac.bbk.dcs.stypes.evaluator.messages.NDLQuery

class Splitter  extends  Actor{
  override def receive: Receive = {
    case NDLQuery(q,id) =>

  }

}
