// src/main/scala/ForComps/for-map.sc

val states = List("Alabama", "Alaska", "Virginia", "Wyoming")

for {
  s <- states
} yield s.toUpperCase
// Results: List(ALABAMA, ALASKA, VIRGINIA, WYOMING)

states map (_.toUpperCase)
// Results: List(ALABAMA, ALASKA, VIRGINIA, WYOMING)
