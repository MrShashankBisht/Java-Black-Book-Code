def range1=1..5
def range2=1..<5
def charRange='a'..'j'
println "Size of Range 1..5: "+range1.size()
println "Size of Range 1..<5: "+range2.size()
println "Size of Range 'a'..'j': "+charRange.size()
println "Is 5 is contained in Range1: "+ range1.contains(5)
println "Is 5 is contained in Range2: "+ range2.contains(5)
println "Value at position 4 in Range1: "+range1[4]
println "Value at position 4 in Range2: "+range2[4]
println "Value at position 4 in charRange: "+charRange[4]
