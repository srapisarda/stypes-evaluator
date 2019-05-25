package uk.ac.bbk.dcs.stypes.evaluator

import akka.actor.{Actor, ActorRef}
import uk.ac.bbk.dcs.stypes.evaluator.messages.{NDLQuery, STypeQuery, ValidateQuery}

class JobManager (validator: ActorRef)  extends Actor{
  override def receive: Receive = {
    case query:STypeQuery =>
        validator ! ValidateQuery(query)

  }


}
