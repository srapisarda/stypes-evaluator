package uk.ac.bbk.dcs.stypes.evaluator.validators

import uk.ac.bbk.dcs.stypes.evaluator.messages.{NDLQuery, STypeQuery}

import scala.language.implicitConversions

trait QueryValidator{
  def validate(query:STypeQuery):Boolean
}

object QueryValidator extends  QueryValidator {
   def validateNDL(query:String):Boolean = true

  override def validate(query: STypeQuery): Boolean = query match {
    case NDLQuery(q:String, _) => validateNDL(q)
  }
}