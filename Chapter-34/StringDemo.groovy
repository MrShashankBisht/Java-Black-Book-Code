def str1="This is 'Groovy'"
def str2='This is "Groovy"'
println str1
println str2
println "The number of 'o' in 'Groovy' is "+"Groovy".count('o')
def name="Kogent"
println "The size of Kogent is "+name.size()
println "The reverse of Kogent is "+name.reverse()
name=name.plus(" Solutions")
println "After plus - "+name
name=name.minus("utions")
println "After minus - "+ name
println "'Kogent' contains 'gent' - "+name.contains("gent")
def style="-/-".multiply(10)
println style
