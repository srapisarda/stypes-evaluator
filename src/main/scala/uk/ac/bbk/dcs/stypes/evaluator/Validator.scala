package uk.ac.bbk.dcs.stypes.evaluator

import akka.actor.Actor
import uk.ac.bbk.dcs.stypes.evaluator.messages.{NDLQuery, ValidateQuery}

class Validator extends Actor{
  override def receive: Receive = {
    case ValidateQuery(_) => {
      case NDLQuery(query: String) =>

    }

  }
}
