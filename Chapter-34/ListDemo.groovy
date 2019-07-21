def oldList=[12, 45, 89, 32]
def newList=[]
println "Size of oldList: " + oldList.size()
def i = oldList.size() - 1
//print each value in the oldList.
println "The elements of the oldList:"
oldList.each(){ print " ${ it }"}
for( j in i..0 ) {
	newList.add( oldList.get( j ) )
}
//print each value in the newList.
println "\nThe reverse of the oldList:"
newList.each(){ print " ${ it }"}
