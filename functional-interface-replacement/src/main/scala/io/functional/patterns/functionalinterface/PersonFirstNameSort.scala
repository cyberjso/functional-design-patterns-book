package io.functional.patterns.functionalinterface

object PersonFirstNameSorter extends App { 
  val p1 = Person("Jack", 38)
  val p2 = Person("Peter", 23);
  val p3 = Person("Anabele", 18);
  
  
  val people = Vector(p3, p1, p2)
  
  people.sortWith((p1, p2) => p1.name < p2.name)
  
}


case class Person(name: String, age: Int)