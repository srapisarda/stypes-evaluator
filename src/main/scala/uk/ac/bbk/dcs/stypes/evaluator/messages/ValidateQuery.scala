package uk.ac.bbk.dcs.stypes.evaluator.messages

case class ValidateQuery(query: STypeQuery)

case class QueryValidated(query: STypeQuery, isValid:Boolean)