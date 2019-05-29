package uk.ac.bbk.dcs.stypes.evaluator.actors

import akka.actor.{Actor, ActorRef, Props}
import uk.ac.bbk.dcs.stypes.evaluator.messages.{QueryValidated, STypeQuery, ValidateQuery}

class JobManager (validator: ActorRef)  extends Actor{
  override def receive: Receive = {
    case query:STypeQuery =>
        validator ! ValidateQuery(query)
    case queryValidated: QueryValidated =>
      if (queryValidated.isValid){
        val splitter = context.system.actorOf(Props[Splitter], s"splitter-${queryValidated.query.id}")
        splitter ! queryValidated.query
      }



  }


}
