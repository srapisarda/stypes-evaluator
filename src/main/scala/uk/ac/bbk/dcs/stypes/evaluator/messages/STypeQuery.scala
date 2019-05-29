package uk.ac.bbk.dcs.stypes.evaluator.messages

trait STypeQuery {
  def id:String
}

case class NDLQuery[T](query:T, id:String) extends STypeQuery;
