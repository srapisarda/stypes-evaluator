package uk.ac.bbk.dcs.stypes.evaluator.actors

import akka.actor.Actor
import uk.ac.bbk.dcs.stypes.evaluator.messages.{NDLQuery, QueryValidated, ValidateQuery}
import uk.ac.bbk.dcs.stypes.evaluator.validators.QueryValidator

class Validator(queryValidator: QueryValidator) extends Actor {
  override def receive: Receive = {
    case ValidateQuery(sTypesQuery) =>
      sender() ! QueryValidated(query = sTypesQuery, isValid = queryValidator.validate(sTypesQuery))
  }
}
