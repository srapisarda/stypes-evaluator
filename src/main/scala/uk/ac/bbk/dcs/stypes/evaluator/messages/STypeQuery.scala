package uk.ac.bbk.dcs.stypes.evaluator.messages

trait STypeQuery

case class NDLQuery[T](query:T) extends STypeQuery;
